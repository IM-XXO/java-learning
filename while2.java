/**
 * 输出100以内能被3整除的所有整数
 */
public class while2 {
    public static void main(String[] args){
        int i = 0;
        while(i < 100){
            if(i % 3 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
