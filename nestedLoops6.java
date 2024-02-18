/**
 * 打印菱形
 */
public class nestedLoops6 {

    public static void main(String[] args){
        int totalLines = 7;//如果要做不同规格的三角形，改这一行就够了
        //先打印上三角形，再打印下三角形
        int topLines = (totalLines + 1)/2;
        int downLines = totalLines - topLines;
        for(int i = 1;i <= topLines;i++){
            int whiteSpaceCount = topLines - i;
            for(int j = 0;j < whiteSpaceCount;j++){
                System.out.print(" ");
            }
            int starCount = i * 2 -1;
            for(int k = 0;k < starCount;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i <= downLines;i++){
            int whiteSpaceCount = i;
            for(int j = 0;j < whiteSpaceCount;j++){
                System.out.print(" ");
            }
            int starCount = totalLines  - 2*i;
            for(int k = 0;k < starCount;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


