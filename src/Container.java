package FunnyJsonExplorerv2.src;

import java.util.ArrayList;
import java.util.Map;

import javax.swing.tree.TreeNode;

public class Container {
    private Component style;
    private Component Icon;
    public Node rootNode;
    public Container(){}
    public Container(Component style, Component icon){
        this.add(style);
        this.add(icon);
    }

    public void construct(Map<String, Object> json, Node root) {
        if(root == null){
            root = new Composite(""); // Root node doesn't need a key
        }
    
        for (Map.Entry<String, Object> entry : json.entrySet()) {
            if (entry.getValue() instanceof Map) {
                Node childNode = new Composite(entry.getKey());
                // childNode.childNodes = new ArrayList<Node>();
                construct((Map<String, Object>) entry.getValue(), childNode);
                root.childNodes.add(childNode);
            } else {
                Node leafNode = new Leaf(entry.getKey(), (String)entry.getValue());
                root.childNodes.add(leafNode);
            }
        }

        this.rootNode = root;
    }
    
    public void add(Component component){
        if(component.getType() == "Style"){
            this.style = component;
        }
        else if(component.getType() == "IconFamily"){
            this.Icon = component;
        }
        else{
            System.out.println(11111);
        }
    }
    public void draw(){
        if(style==null||Icon==null){
            throw new IllegalStateException("Missing style or icon component");
        }
        this.style.draw(this.rootNode, this.Icon);
    }
}
