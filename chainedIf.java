/**
 * 买彩票，一等奖500万，二等奖100万，三等奖1000，四等奖10元，五等奖5元。
 */
import java.util.Scanner;
public class chainedIf {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入中将等级:");
        int level = sc.nextInt();
        if(level == 1){
            System.out.println("领取500万");
        }else if(level == 2){
            System.out.println("领取100万");
        }else if(level == 3){
            System.out.println("领取1000元");
        }else if(level == 4){
            System.out.println("领取10元");
        }else if(level == 5){
            System.out.println("领取5元");
        }else{
            System.out.println("没有奖励");
        }
    }
}
