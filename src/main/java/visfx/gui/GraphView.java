package visfx.gui;

import visfx.graph.VisGraph;


public class GraphView {
    private final VisGraph graph;
    
    public GraphView(VisGraph graph){
        this.graph = graph;
    }
    
    public Browser getBrowser()
    {
        return new Browser(graph);
    }
}
    

//    @Override
//    public void start(Stage stage) {
//        // create the scene
//        stage.setTitle("Network view");
//        Scene scene = new Scene(new Browser(graph), 750, 500, Color.web("#666970"));
//        stage.setScene(scene);
//        stage.show();
//    }

//    public static void main(String[] args){
//        launch(args);
//    }
//}
