public class Object {

    public static class Person{
        public String name;
        public String sex;
        public int age;
    }
    public static class Car{
        public String brand;
        public String type;
        public double price;
        public void start(){
            System.out.println("汽车启动");
        }
        public void speedUp(){
            System.out.println("汽车加速");
        }
        public void stop(){
            System.out.println("汽车停止");
        }
        public void show(){
            System.out.println(brand+"\t"+type+"\t"+price);
        }
    }
    public static void main(String[] args){
        //人

        Person p = new Person();
        p.name = "刘德华";
        p.sex = "男";
        p.age = 53;
        //车

        Car c = new Car();
            c.brand = "奥迪";
            c.type = "A8";
            c.price = 1000000;
            c.stop();
            c.show();
    }
}
