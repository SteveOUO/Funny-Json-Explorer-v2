package FunnyJsonExplorerv2.src;
import java.util.Map;

public abstract class Style implements Component{
    public String getType(){
        return "Style";
    }
    public String ComponentType = "Style";
    public abstract void draw(Node n, Component iconFamily);
}


