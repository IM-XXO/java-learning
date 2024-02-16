/**
 * 控制台录入学生成绩，输入0时退出
 */
import java.util.Scanner;
public class doWhile {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int score;//定义循环变量，未赋初值
        int sum = 0;
        do{
            System.out.println("请输入成绩：");
            score = sc.nextInt();
            sum += score;
        }while(score != 0);
        System.out.println("总成绩为：" + sum);
    }
}
