/**
 * 打印1~10间所有偶数
 */
public class Continue {
    public static void main(String[] args){
        for(int i = 1;i <= 10;i++){
            if(i % 2 == 1){
                continue;//当i是奇数，直接跳过本次循环
            }
            System.out.println(i);
        }
    }
}
