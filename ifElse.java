import java.util.Scanner;

/**
 * 控制台输入一个整数，是偶数，输出“是偶数”，否则“是奇数”
 */
public class ifElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
 //       if(number % 2 == 0){
 //           System.out.println("是偶数");
 //       }else{
 //           System.out.println("是奇数");
 //   }
        System.out.println((number % 2 == 0)?"是偶数":"是奇数");
}

}
