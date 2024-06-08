package FunnyJsonExplorerv2.src;

import java.util.ArrayList;

public abstract class Node {
    public String key;
    public ArrayList<Node> childNodes;
    Node(String s){
        this.key = s;
        this.childNodes = new ArrayList<Node>();
    }
}
