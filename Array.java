/**
 * 从控制台录入5个名字，用随机数来获取一个下标，并根据下标输出名字
 */
import java.util.Scanner;
public class Array {

    public  static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];
        for(int i = 0;i<5;i++){
            System.out.println("请输入一个名字：");
            names[i] = sc.next();
        }
        int index = (int)(Math.random()*5);
        System.out.println(names[index]);
    }
}
