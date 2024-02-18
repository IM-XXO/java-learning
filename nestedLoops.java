/**
 * 打印乘法表
 */
public class nestedLoops {

    public static void main(String[] args){
        for(int i = 1;i<=9;i++){
            for(int j = 1;j <= i;j++){
                System.out.print(j+"x"+i+"="+i*j+"\t");//print表示同一行中打印
            }//\t制表符
            System.out.println();
        }
    }
}
