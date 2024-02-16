/**
 * 当需要用户输入整数，但用户输入了一个字符
 */
import java.util.Scanner;
public class scanner {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        if(sc.hasNextInt()){//校验Scanner存储的数据是否有下一个整数，如果无数据则让用户输入后判断
            int number = sc.nextInt();//将scanner中存储的整数取出来
            System.out.println(number);
        }else{
            System.out.println("不要瞎搞");
        }
    }
}
