public class Child extends Father{

    public void show(){
        System.out.println(name);//本类中未定义name变量，却可以使用。
        eat();
    }

}
