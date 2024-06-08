package FunnyJsonExplorerv2.src;

public class TreePokerContainerFactory implements ContainerFactory{
    public Container createContainer(){
        Component style = new TreeStyle();
        Component icon = new PokerIconFamily();
        return new Container(style, icon);
    }
}