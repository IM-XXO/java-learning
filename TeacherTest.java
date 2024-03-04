import java.util.Scanner;
public class TeacherTest {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Teacher t = new Teacher();
        for(int i=0; i<3; i++){
            System.out.println("请输入学生姓名:");
            String name = sc.next();
            System.out.println("请输入学生性别:");
            String sex = sc.next();
            System.out.println("请输入学生年龄:");
            int age = sc.nextInt();
            System.out.println("请输入学生成绩:");
            double score = sc.nextDouble();
            Student stu = new Student(name,sex,age,score);

            t.addStu(stu);
        }
    }
}

