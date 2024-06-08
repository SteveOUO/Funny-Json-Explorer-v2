package FunnyJsonExplorerv2.src;

import java.util.Map;

public class PokerIconFamily extends IconFamily{
    public String getType(){
        return "IconFamily";
    }
    public String getLeafIcon() {
        return "♢ "; // Poker face icon for intermediate nodes
    }
    public String getMiddleIcon() {
        return "♤ "; // Poker face icon for intermediate nodes
    }
    public void draw(Node n, Component iconFamily){
        System.err.println("Could not call this Function From Style!");
    }
}
