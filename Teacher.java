import java.util.Arrays;

public class Teacher {
    public Student[] stus = {};//不知道学生数量
    public void addStu(Student stu){
        stus = Arrays.copyOf(stus,stus.length+1);//数组扩容
        stus[stus.length-1]=stu;
    }
}
