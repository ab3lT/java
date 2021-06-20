import java.util.all;


public class GradebookOO {

    double[] grades;
   
   double addGrade();
    
    public double[] addGrade(){
    	 arrayGrade = new gradebook[];
    	 

    }


    public GradebookOO() {
        grades = new double[0];
    }

    public GradebookOO(double[] g) {
        this.grades = g;
    }

    public void printGrades() {
        for(int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
    }

    public double averageGrade() {
        double sum = 0.0;
        double average;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        average = sum/grades.length;

        return average;

    }
    public static double[] inputFromUser(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many grades do you want to enter to the system? ->");
        int ln = sc.nextInt();

        double[] gradebook = new double[ln];
        
        System.out.println("Please enter each grade and press enter ");

        for(int i = 0; i < ln; i++){
            gradebook[i] = sc.nextDouble();
        }
        return gradebook;

}

public static double[] argsToDouble(String[] args){
    double[] gradebook = new double[args.length];
        
        for (int i= 0 ; i < args.length; i++) {
            gradebook[i] = Double.parseDouble(args[i]);
        }
    return gradebook;
}

public void menu() {
    System.out.println("what do you want to do ? \n enter 1 to print grades, \n enter 2 to print average, \n enter 3 to print everything");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1){
            printGrades();
        
        }else if (choice == 2){
            System.out.println("your average grade is "+averageGrade());
        
        }
        else if (choice == 3){
            System.out.println("=========================================");
            printGrades();
            System.out.println("=========================================");
            System.out.println("your average grade is "+averageGrade());
            System.out.println("*****************************************");
            System.out.println();
        }
}
}
