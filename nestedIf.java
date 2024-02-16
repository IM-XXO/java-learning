/**
 * 半决赛中，胜利，进入决赛，否则输出“已被淘汰”
 *如果是男子，输出“进入男子组决赛”，否则输出“进入女子组决赛”
 */

import java.util.Scanner;

public class nestedIf {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入是否获胜(Y/N): ");
        String win = sc.next();
        //比较字符串使用equals方法
        if("Y".equals(win)){
            System.out.println("请输入性别: ");
            String sex = sc.next();
            if("男".equals(sex)){
                System.out.println("进入男子组决赛");
            }else{
                System.out.println("进入女子组决赛");
            }
        }else{
            System.out.println("已被淘汰");
        }
    }
}
