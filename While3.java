/**
 * 100~1000的水仙花数
 */
public class While3 {

    public static void main(String[] args){
        int i = 100;
        while(i < 1000){
            int g = i % 10;//这三个变量一定要在循环内部定义！！！随着i改变而改变
            int s = i / 10 % 10;
            int b = i / 100;
            if(g*g*g + s*s*s +b*b*b == i){
                System.out.println(i);
            }
            i++;
        }
    }
}
