public class Animal {

    protected String name;

    protected int age;

    public Animal(String name,int age) {
        this.name = name;
        this.age = age;
    }
    protected void eat(){
        System.out.println("动物吃东西");
    }

    protected void sleep(){
        System.out.println("动物要睡觉");
    }
}
