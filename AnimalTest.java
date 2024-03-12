public class AnimalTest {

    public static void main(String[] args){
        Animal a1 = new Dog("哈巴狗",10);
        a1.eat();
        a1.sleep();

        Animal a2 = new Horse("赤兔",5);
        a2.eat();
        a2.sleep();
    }
}
