package aspectj.trace.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by syc on 4/3/16.
 */
public class NodeUtil {
    /*节点被调用位置*/
    private String callLocation;
    private NodeUtil parentNode;
    private List<NodeUtil> childNodes;
    private String name;

    public NodeUtil(String name, NodeUtil parentNode, String callLocation){
        this.name = name;
        this.parentNode = parentNode;
        this.callLocation = callLocation;
        this.childNodes = new ArrayList<NodeUtil>();
        if(parentNode!=null){
            parentNode.addChild(this);
        }
    }

    public void addChild(NodeUtil child){
        childNodes.add(child);
    }

    public String getName() {
        return name;
    }

    public List<NodeUtil> getChildNodes() {
        return childNodes;
    }

    public NodeUtil getParentNode() {
        return parentNode;
    }

    public String getCallLocation() {
        return callLocation;
    }
}
