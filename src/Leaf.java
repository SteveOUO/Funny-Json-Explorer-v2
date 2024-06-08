package FunnyJsonExplorerv2.src;

import java.util.ArrayList;
import java.util.List;

public class Leaf extends Node{
    public String key;
    public String value;
    public List<Node> childNodes = null;
    // 构造函数
    Leaf(String key, String value) {
        super(key);
        this.value = value;
        this.childNodes = new ArrayList<Node>();
    }
}
