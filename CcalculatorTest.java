/**
 * 3天卖30件啤酒，每件72元，平均每天卖多少钱
 */
public class CcalculatorTest {

    public static void main(String[] args){
       /*
        Calculator c = new Calculator(30,72,"*");
        int total = c.caculate();
        Calculator c1 = new Calculator(total,3,"/");
        int avg = c1.caculate();
        System.out.println("每天卖了："+avg);
        */
        Calculator c = new Calculator();
        int total = c.caculate(30,72,"*");
        int avg = c.caculate(total,3,"/");
        System.out.println("每天卖了："+avg);
    }
}
