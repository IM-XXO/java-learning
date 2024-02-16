/**
 * 获取一个10以内的随机整数，然后从控制台输入一个整数
 * 如果输入的整数与随机整数不相等，就重新输入，直到相等为止。
 */
import java.util.Scanner;
public class Break {
    public static void main(String[] args){

        double random = Math.random();//随机获取一个（0~1】之间的浮点数
        int number = (int)(random * 10);//强制类型转换（0~10】 (random * 10)一定要加括号！！
        Scanner sc = new Scanner(System.in);
        while(true){//死循环
            System.out.println("请输入1个0~10之间的整数:");
            int inputnumber = sc.nextInt();
            if(number == inputnumber){
                break;
            }
        }
    }
}
