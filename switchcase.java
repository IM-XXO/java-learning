/**
 * 根据职位级别调薪
 * 1级 +500
 * 2级 +800
 * 3级 +1200
 * 4级 +2000
 */

import java.util.Scanner;

public class switchcase {

    public  static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入当前薪资");
        int salary = sc.nextInt();
        System.out.println("请输入职位级别");
        int level = sc.nextInt();
        switch(level){
            case 1:
                salary += 500;
                break;
            case 2:
                salary += 800;
                break;
            case 3:
                salary += 1200;
                break;
            case 4:
                salary += 2000;
                break;
        }
        System.out.println("调薪后薪资为："+salary);
    }


}
