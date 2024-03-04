public class MenuTest {

    public static void main(String[] args){
        Menu[] menus = new Menu[3];
        menus[0] = new Menu(1,"增");
        menus[1] = new Menu(2,"删");
        menus[2] = new Menu(3,"改");

        menus[0].show();
    }
}
