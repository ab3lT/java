import java.util.Arrays;
import java.util.Scanner;

class GbProgram {
    public static void main(String[] args) {
        GradebookOO i = new GradebookOO();
        double[] gradebook;
        if(args.length == 0){
            gradebook = i.inputFromUser();
        }
        else {
            gradebook = i.argsToDouble(args);
        }
        GradebookOO g = new GradebookOO(gradebook);
        System.out.println("###########################");
        g.menu();
        g.addGrade();
        g.menu();

}
}



