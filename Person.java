public class Person {
    private String name;//封装
    private int age;
    public String secret;

    public Person(String name,int age,String secret){
        this.name = name;
        this.age = age;
        this.secret = secret;
    }

    public String getName(){
        return name;
    }//通过公开的getter方法用于读取属性

    public void setName(String name){
        this.name = name;
    }//通过公开的setter方法用于修改属性

    public void setAge(int age){
        if(age < 0){
            System.out.println("你输入的年龄不正确");//加入控制语句用于对属性的合法性校验
        }else{
            this.age = age;
        }
    }
}
