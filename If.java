
/**
 * 从控制台输入一个整数，如果小于18，输出10与它的差
 */

import java.util.Scanner;
public class If {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        if(number < 18){
            int diff = 10 - number;
            System.out.println("10与该数字差值为"+ diff);
        }
    }
}
