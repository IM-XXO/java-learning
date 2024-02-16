/**
 * 控制台输入一个数，如果不能被7整除，则重新输入，直到数字能被7整除为止。
 */
import java.util.Scanner;
public class doWhile2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number;
        do{
            System.out.println("请输入一个数：");
            number = sc.nextInt();
        }while(number % 7 != 0);
        System.out.println(number);
    }
}
