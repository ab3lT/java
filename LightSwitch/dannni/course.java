import java.util.Scanner;
import java.util.Array;
public class course{
    public String name;
    public String students[];
    public int numberOfStudents;

    public static void main(String args[]){
        addCourse();
    }


    public static void addCourse(){
        Scanner course = new Scanner(Sysetem.in);
        String ch = course.next();
        course += ch;
        System.out.println(ch);

    }
    String getName(){
        return name;
    }
    void  addStudent(){
        Scanner st = new Scanner(Sysetem.in);

        students[]  + = st ;
    }

}