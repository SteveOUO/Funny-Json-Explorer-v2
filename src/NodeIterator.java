package FunnyJsonExplorerv2.src;

public class NodeIterator {
    private int index;
    private Node root;
    NodeIterator(Node root){
        this.root = root;
        index = 0;
    }
    public Node getNextNode(){
        if(root.childNodes==null) return null;
        if(index<root.childNodes.size()){
            return root.childNodes.get(index++);
        }
        return null;
    }
    public Boolean isEnd(){
        return index == root.childNodes.size();
    }
}
