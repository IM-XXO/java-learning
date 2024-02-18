/**
 * 求2~100内所有质数
 */
public class nestedLoops7 {

    public static void main(String[]  args){
        for(int i=2; i<100; i++){
            boolean isPrime = true;
            for(int j=2;j<i;j++){
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                System.out.println(i);
            }
        }
    }
}
