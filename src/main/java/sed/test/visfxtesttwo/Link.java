/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sed.test.visfxtesttwo;

/**
 *
 * @author blj0011
 */
public class Link
{
    private int source_node_id;
    private int target_node_id;

    public Link(int source_node_id, int target_node_id)
    {
        this.source_node_id = source_node_id;
        this.target_node_id = target_node_id;
    }

    public int getTarget_node_id()
    {
        return target_node_id;
    }

    public void setTarget_node_id(int target_node_id)
    {
        this.target_node_id = target_node_id;
    }

    public int getSource_node_id()
    {
        return source_node_id;
    }

    public void setSource_node_id(int source_node_id)
    {
        this.source_node_id = source_node_id;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Link{");
        sb.append("source_node_id=").append(source_node_id);
        sb.append(", target_node_id=").append(target_node_id);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode()
    {
        int hash = 7;
        hash = 37 * hash + this.source_node_id;
        hash = 37 * hash + this.target_node_id;
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
        final Link other = (Link) obj;
        if (this.source_node_id != other.source_node_id) {
            return false;
        }
        return this.target_node_id == other.target_node_id;
    }    
}
