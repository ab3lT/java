
package student;

public class StudentTester {
    public static void main(String[] args){
        Undergraduate ug = new Undergraduate("Michael", 2006);
        Grad gd = new Grad("Jennifer");
        Intern in = new Intern("Elizabeth", 2005, 10.32, 20);
        ResearchAssistant ra = new ResearchAssistant("Greg", 2000.0);
        
        System.out.println(ug.Description());
        System.out.println(gd.Description());
        System.out.println(in.Description());
        System.out.println(ra.Description());
    }
}

