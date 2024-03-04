/**
 * 使用对象数组存储5个菜单信息
 */
public class Menu {
    public int order;
    public String name;
    public Menu(int order,String name){
        this.order = order;
        this.name = name;
    }
    public void show(){
        System.out.println(order + "." + name);
    }
}
