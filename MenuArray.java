public class MenuArray {

    public static void main(String[] args){
        Menu[] mainMenus = {
          new Menu(1,"学生成绩管理"),
          new Menu(2,"学生选课管理"),
          new Menu(3,"退出系统"),
        };

        Menu[] secondMenu = {
                new Menu(1,"增加成绩"),
                new Menu(2,"删除成绩"),
                new Menu(3,"修改成绩"),
                new Menu(4,"查找成绩"),
                new Menu(5,"返回主菜单"),
        };

        showMenus(mainMenus);

        showMenus(secondMenu);
    }
    public static void showMenus(Menu[] menus){
        for(int i=0; i<menus.length; i++){
            menus[i].show();
        }
    }
}
