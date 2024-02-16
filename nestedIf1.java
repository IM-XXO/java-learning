/**
 * 从控制台输入一个整数，如果小于10，则将它乘3再加5，输出得到了奇数还是偶数
 * 否则直接输出它是奇数还是偶数
 */

import java.util.Scanner;

public class nestedIf1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int m = sc.nextInt();
        if(m < 10){
            int n = m*3+5;
            System.out.println((n % 2 == 0)?"是偶数1":"是奇数1");
        }else{
            System.out.println((m % 2 == 0)?"是偶数2":"是奇数2");
        }
    }
}
