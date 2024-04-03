/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sed.test.visfxtesttwo;

import java.util.Objects;

/**
 *
 * @author blj0011
 */
public class MyNode
{
    private int node_id;
    private String node_name;
    private int child_nodes;
    private int leaf_node;
    private int tolorg_link;
    private int extinct;
    private int confidence;
    private int phylesis;

    public MyNode(int node_id, String node_name, int child_nodes, int leaf_node, int tolorg_link, int extinct, int confidence, int phylesis)
    {
        this.node_id = node_id;
        this.node_name = node_name;
        this.child_nodes = child_nodes;
        this.leaf_node = leaf_node;
        this.tolorg_link = tolorg_link;
        this.extinct = extinct;
        this.confidence = confidence;
        this.phylesis = phylesis;
    }

    public int getPhylesis()
    {
        return phylesis;
    }

    public void setPhylesis(int phylesis)
    {
        this.phylesis = phylesis;
    }

    public int getNode_id()
    {
        return node_id;
    }

    public void setNode_id(int node_id)
    {
        this.node_id = node_id;
    }

    public String getNode_name()
    {
        return node_name;
    }

    public void setNode_name(String node_name)
    {
        this.node_name = node_name;
    }

    public int getChild_nodes()
    {
        return child_nodes;
    }

    public void setChild_nodes(int child_nodes)
    {
        this.child_nodes = child_nodes;
    }

    public int getLeaf_node()
    {
        return leaf_node;
    }

    public void setLeaf_node(int leaf_node)
    {
        this.leaf_node = leaf_node;
    }

    public int getTolorg_link()
    {
        return tolorg_link;
    }

    public void setTolorg_link(int tolorg_link)
    {
        this.tolorg_link = tolorg_link;
    }

    public int getExtinct()
    {
        return extinct;
    }

    public void setExtinct(int extinct)
    {
        this.extinct = extinct;
    }

    public int getConfidence()
    {
        return confidence;
    }

    public void setConfidence(int confidence)
    {
        this.confidence = confidence;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("MyNode{");
        sb.append("node_id=").append(node_id);
        sb.append(", node_name=").append(node_name);
        sb.append(", child_nodes=").append(child_nodes);
        sb.append(", leaf_node=").append(leaf_node);
        sb.append(", tolorg_link=").append(tolorg_link);
        sb.append(", extinct=").append(extinct);
        sb.append(", confidence=").append(confidence);
        sb.append(", phylesis=").append(phylesis);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 19 * hash + this.node_id;
        hash = 19 * hash + Objects.hashCode(this.node_name);
        hash = 19 * hash + this.child_nodes;
        hash = 19 * hash + this.leaf_node;
        hash = 19 * hash + this.tolorg_link;
        hash = 19 * hash + this.extinct;
        hash = 19 * hash + this.confidence;
        hash = 19 * hash + this.phylesis;
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MyNode other = (MyNode) obj;
        if (this.node_id != other.node_id) {
            return false;
        }
        if (this.child_nodes != other.child_nodes) {
            return false;
        }
        if (this.leaf_node != other.leaf_node) {
            return false;
        }
        if (this.tolorg_link != other.tolorg_link) {
            return false;
        }
        if (this.extinct != other.extinct) {
            return false;
        }
        if (this.confidence != other.confidence) {
            return false;
        }
        if (this.phylesis != other.phylesis) {
            return false;
        }
        return Objects.equals(this.node_name, other.node_name);
    }    
}
