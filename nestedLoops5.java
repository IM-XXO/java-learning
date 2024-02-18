/**
 * 打印倒三角
 */
public class nestedLoops5 {

    public static void main(String[] args){
        int totalLines = 5;//如果要做不同规格的三角形，改这一行就够了
        for(int i = 1;i <= totalLines;i++){
            int whiteSpaceCount = i - 1;
            for(int j = 0;j < whiteSpaceCount;j++){
                System.out.print(" ");
            }
            int starCount = 11 - 2*i;
            for(int k = 0;k < starCount;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

