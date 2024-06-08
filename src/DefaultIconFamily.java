package FunnyJsonExplorerv2.src;

import java.util.Map;

public class DefaultIconFamily extends IconFamily {
    public String getType(){
        return "IconFamily";
    }
    public String getLeafIcon() {
        return "✩ "; // Default icon
    }
    public String getMiddleIcon() {
        return "▶ "; // Default icon
    }
    public void draw(Node n, Component iconFamily){
        System.err.println("Could not call this Function From Style!");
    }
}

