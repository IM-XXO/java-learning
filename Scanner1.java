/**
 * Scanner基本使用
 */
import java.util.Scanner;
public class Scanner1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//固定写法，背下即可
        System.out.println("请输入你的名字：");
        String name = sc.next();//将用户输入的姓名获取到，并使用变量name储存
        System.out.println(name);
    }
}
