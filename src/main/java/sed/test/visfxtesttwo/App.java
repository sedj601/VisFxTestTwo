package sed.test.visfxtesttwo;

import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import visfx.graph.VisGraph;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import visfx.api.VisFx;
import visfx.graph.VisEdge;
import visfx.graph.VisNode;


public class App extends Application {    
    private VisGraph getDummyGraph()
    {
        VisGraph graph = new VisGraph();        
        
        try 
        {            
            System.out.println("Loading Nodes!");
            Map<Integer, VisNode> map = new HashMap();
            Gson gsonMyNodesArray = new Gson();
            File treeoflifeNodesFile = new File("treeoflife_nodes.json");
            String jsonStringMyNodes = Files.readString(treeoflifeNodesFile.toPath());
            MyNode[] myNodeArray = gsonMyNodesArray.fromJson(jsonStringMyNodes, MyNode[].class);
            for(MyNode myNode : myNodeArray)
            {
                map.put(myNode.getNode_id(), new VisNode(myNode.getNode_id(), myNode.getNode_name()));
            }
            
            System.out.println("Loading Edges!");
            List<VisEdge> edgeList = new ArrayList();
            Gson gsonMyEdgeArray = new Gson();
            File treeoflifelinksFile = new File("treeoflife_links.json");
            String jsonStringEdges = Files.readString(treeoflifelinksFile.toPath());
            Link[] myLinkArray = gsonMyEdgeArray.fromJson(jsonStringEdges, Link[].class);
            for(Link link : myLinkArray)
            {
                //System.out.println(link);
                edgeList.add(new VisEdge(map.get(link.getSource_node_id()), map.get(link.getTarget_node_id()), "to", "to"));
            }
            
            graph.addNodes(map.values().toArray(VisNode[]::new));
            graph.addEdges(edgeList.toArray(VisEdge[]::new));
           
        }
        catch (IOException ex) {
            System.out.println(ex.toString());
        }
        
        return graph;
    }
    

    @Override
    public void start(Stage stage) {
        VisGraph graph = getDummyGraph();
        VisFx visFx = new VisFx(graph);
        // create the scene
        stage.setTitle("Network view");
        Scene scene = new Scene(visFx.getBrowser(), 750, 500, Color.web("#666970"));
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
