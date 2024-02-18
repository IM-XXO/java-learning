/**
 * 打印三角形
 */
public class nestedLoops4 {

    public static void main(String[] args){
        int totalLines = 5;//如果要做不同规格的三角形，改这一行就够了
        for(int i = 1;i <= totalLines;i++){
            int whiteSpaceCount = totalLines - i;
            for(int j = 0;j < whiteSpaceCount;j++){
                System.out.print(" ");
            }
            int starCount = i * 2 -1;
            for(int k = 0;k < starCount;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
