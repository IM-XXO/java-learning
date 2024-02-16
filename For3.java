/**
 * 求100以内既能被2整除又能被9整除的所有整数和
 */
public class For3 {

    public static void main(String[] args){
        int sum = 0;
        for(int i = 0;i < 100;i++){
            if((i % 2 == 0)&&(i % 9 == 0)){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
