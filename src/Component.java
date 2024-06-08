package FunnyJsonExplorerv2.src;

public interface Component {
    public String getType();
    public abstract void draw(Node n, Component iconFamily);
    public abstract String getLeafIcon();
    public abstract String getMiddleIcon();
}
