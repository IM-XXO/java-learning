public class Horse extends Animal{
    public Horse(String name, int age) {
        super(name, age);
    }//alt + enter

    @Override
    public void eat(){
        System.out.println(age + "年的" + name + "在吃草");
    }

    @Override
    public void sleep(){
        System.out.println(age + "年的" + name + "在站着睡觉");
    }
}
