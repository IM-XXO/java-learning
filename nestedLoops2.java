/**
 * 打印4x10的实心矩阵
 */
public class nestedLoops2 {

    public static void main(String[] args){
        for(int i = 0;i < 4;i++){//外层循环控制行数
            for(int j = 0;j < 9;j++){//内层循环控制列数
                System.out.print("*");
            }
            System.out.println();//换行
        }
    }
}
