/**
 * 90~100优秀，80~90良好，60~80中等，60以下为差生
 * 从控制台输入一个分数，输出等级
 */

import java.util.Scanner;
public class chainedIf1 {

    public static void main(String args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = sc.nextInt();
        if(score > 90){
            System.out.println("优秀");
        }else if(score >= 80){
            System.out.println("良好");
        }else if(score >= 60){
            System.out.println("中等");
        }else {
            System.out.println("差生");
        }
    }
}
