package visfx.api;

import visfx.graph.VisGraph;
import visfx.gui.GraphView;
import visfx.gui.Browser;

public class VisFx{

     GraphView graphView;
     
    /**
     * Plots the given graph to the mainStage.
     * @param graph the network graph to be plotted.
     * @param mainStage the main Stage.
     */
    public VisFx(VisGraph graph){
       graphView = new GraphView(graph);        
    }

    
    public Browser getBrowser()
    {
        return graphView.getBrowser();
    }
}
