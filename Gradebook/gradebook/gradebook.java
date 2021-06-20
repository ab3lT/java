
import java.util.All;
import java.util.Scanner;

public class gradebook {
    public static void main(String[] args) {

        double[] gradebook;

        if(args.length == 0){
            gradebook = inputFromUser();
        }else {
            gradebook = argsToDouble(args);
        }
        
        System.out.println("what do you want to do ? \n enter 1 to print grades, \n enter 2 to print average, \n enter 3 to print latter grade, \n enter 4 to print everything");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1){
            printGrades(gradebook);
        }else if (choice == 2){
            System.out.println("average grade is "+averageGrade(gradebook));
        
        }else if (choice == 3){

            calculate_Grade(averageGrade(gradebook));

        }else if (choice == 4){
            printGrades(gradebook);
            System.out.println("average grade is "+averageGrade(gradebook));
            calculate_Grade(averageGrade(gradebook));
            System.out.println();


        }
        
        




}

public static double[] inputFromUser(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("how many grades do you want to enter to the system? ->");
        int ln = sc.nextInt();

        double[] gradebook = new double[ln];
        
        System.out.println("Please enter each grade and press enter");

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

public static void printGrades(double[] grades){

    for (int i= 0;i<grades.length;i++){

        System.out.println(grades[i]);

    }

}

public static double averageGrade(double[] grades){
    
    double sum =0.0;
    double average;

    for (int i= 0;i<grades.length;i++){
        sum=sum+grades[i];
    }
    average = sum/grades.length;

    return average;
}

public static void calculate_Grade(double average){


    if (average >= 90){
        System.out.print("your grade is A");
        }
        else if ( average >=80){
        System.out.print("your grade is B");
        }
        else if (average >=70){
        System.out.print("your grade is C");}
        else if(average >=60){
        System.out.print("your grade is D");}
        else if (average > 50){
        System.out.print("your grade is F");
        
        }
}
}
