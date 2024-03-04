public class NumberUtilTest {

    public static void main(String[] args){
        NumberUtil util = new NumberUtil();
        int result = util.factorial(3);
        System.out.println(result);

        boolean prime = util.isPrime(17);
        System.out.println(prime);
    }
}
