/**
 * 打印4x10的空心矩阵
 */
public class nestedLoops3 {

    public static void main(String[] args){
        for(int i = 0;i < 4;i++){//外层循环控制行数
            for(int j = 0;j < 10;j++){//内层循环控制列数
                if(i==0||i==3||j==0||j==9){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();//换行
        }
    }
}
