/**
 * 定义一个计算器，能对两个数字加减乘除
*/
public class classDefination{

    public static class Caculator{
        public double number1;
        public double number2;
        public String operator;
        public void caculate(){
            switch(operator){
                case "+":
                    System.out.println(number1+"+"+number2+"="+number1+number2);
                    break;
                case "-":
                    System.out.println(number1-number2);
                    break;
                case "*":
                    System.out.println(number1+"*"+number2+"="+number1*number2);
                    break;
                case "/":
                    System.out.println(number1/number2);
                    break;
            }
        }

    }

    public static void main(String[] args){

        Caculator c = new Caculator();
        c.number1 = 10;
        c.number2 = 5;
        c.operator = "*";
        c.caculate();
    }
}
