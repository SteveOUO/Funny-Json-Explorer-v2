package FunnyJsonExplorerv2.src;

public abstract class IconFamily implements Component{
    public String getType(){
        return "IconFamily";
    }
    public abstract String getLeafIcon();
    public abstract String getMiddleIcon();
}
