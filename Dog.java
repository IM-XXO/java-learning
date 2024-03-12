public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);//父类有带参构造方法，子类必须有
    }

    @Override
    public void eat(){
        System.out.println(age + "年的" + name + "在吃骨头");
    }

    @Override
    public void sleep(){
        System.out.println(age + "年的" + name + "在趴着睡觉");
    }
}
