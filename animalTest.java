public class animalTest {

    public static void main(String[] args){
        Animal_ a1 = new Panda();
        a1.eat();//类型是Animal_,但是执行的时候执行的是Panda,因为堆内存中放的是Panda
        Animal_ a2 = new Tiger();
        a2.eat();
    }
}
