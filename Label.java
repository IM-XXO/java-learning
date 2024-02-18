/**
 * 实现返回主菜单
 */
import java.util.Scanner;
public class Label {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("=================");
            System.out.println("1.学生成绩管理");
            System.out.println("2.学生选课管理");
            System.out.println("3.退出系统");
            System.out.println("=================");
            System.out.println("请选择菜单编号：");
            int menuNo = sc.nextInt();
            if (menuNo==1){
                childMenu:while(true){
                    System.out.println("=================");
                    System.out.println("1添加");
                    System.out.println("2删除");
                    System.out.println("3修改");
                    System.out.println("4查看");
                    System.out.println("5退出");
                    System.out.println("=================");
                    System.out.println("请选择菜单编号：");
                    int number = sc.nextInt();
                    switch(number){
                        case 1:
                            System.out.println("你选择添加");
                            break;
                        case 2:
                            System.out.println("你选择删除");
                            break;
                        case 3:
                            System.out.println("你选择修改");
                            break;
                        case 4:
                            System.out.println("你选择查看");
                            break;
                        case 5:
                            System.out.println("你选择返回主菜单");
                            break childMenu;//标号
                    }
                }
            }else if(menuNo==2){

            }else{
                System.out.println("感谢使用");
                break;
            }
        }
    }
}
