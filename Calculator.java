public class Calculator {
    /*
    public int number1;
    public int number2;
    public String operator;
    //return返回值的作用就是给出方法执行的结果，使方法直接结束
    public Calculator(int number1,int number2,String operator){
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public int caculate(){
        switch(operator){
            case "+":return number1+number2;
            case "-":return number1-number2;
            case "*":return number1*number2;
            case "/":return number1/number2;
            default:return 0;
            //如果一个方法的返回值类型不为void，那么在选择结构中，必须为每一种情况都提供返回值
        }
    }
     */
    public int caculate(int number1,int number2,String operator){
        switch(operator){
            case "+":return number1+number2;
            case "-":return number1-number2;
            case "*":return number1*number2;
            case "/":return number1/number2;
            default:return 0;
            //如果一个方法的返回值类型不为void，那么在选择结构中，必须为每一种情况都提供返回值
        }
    }

}
