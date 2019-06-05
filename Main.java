import java.util.ArrayList;
import java.util.List;

/**Created by Parul on 03-06-19
 * 
 */
public class Main{
    public static void main(String[] args){
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<Teacher>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        Student hannah = new Student(1, "Hannah", 9);
        Student parul = new Student(2, "Parul", 12);
        Student justin = new Student(3, "Justin", 6);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(hannah);
        studentList.add(parul);
        studentList.add(justin);

        School dav = new School(teacherList, studentList);

        Teacher megan = new Teacher(6, "Megan",900);
        dav.addTeacher(megan);
        
        justin.payFees(5000);
        parul.payFees(6000);
        System.out.println("DAV has earned $ " + dav.getTotalMoneyEarned());

        System.out.println("-----MAKING SCHOOL PAY SALARY-----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("DAV has spent for salary to " + lizzy.getName()
         + " and now has $ " + dav.getTotalMoneyEarned());
         
        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("DAV has spent for salary to " + vanderhorn.getName()
         + " and now has $ " + dav.getTotalMoneyEarned());

        System.out.println(parul);
        mellisa.receiveSalary(mellisa.getSalary());
        System.out.println(mellisa);
        
    }

}