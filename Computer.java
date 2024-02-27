/**
 * 定义一个计算机类
 */
public class Computer {
    public String brand;
    public String name;
    public double price;
    //没有定义任何构造方法，编译器会自动为这个类添加默认的无参构造方法
    public Computer(String brand,String name,double price){//形参
        this.brand = brand;
        this.name = name;
        this.price = price;
    }
}
