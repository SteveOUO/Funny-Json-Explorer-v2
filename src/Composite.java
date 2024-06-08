package FunnyJsonExplorerv2.src;

import java.util.ArrayList;

public class Composite extends Node{
    public String key;
    public ArrayList<Node> childNodes;
    Composite(String s){
        super(s);
        this.childNodes = new ArrayList<Node>();
    }
}
