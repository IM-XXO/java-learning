/**
 * 写一个方法，求任何数的阶乘
 * 写一个方法，判断是否素数
 */
public class NumberUtil {
    public int factorial(int number){
        int result = 1;
        if(number == 0){
            return 1;
        }else{
            for(int i=1; i<=number; i++){
                result*=i;
            }
        }
        return result;
    }

    public boolean isPrime(int number){
        if(number == 2){
            return true;
        }else{
            for(int i=2; i<number; i++){
                if(number%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
