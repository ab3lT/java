public class GradebookOO{
    double grades[];
    public static void main (String[] args){
        gradesbook gradebookObject = new gradebook();
        gradebookObject.GradebookOO();
       
    }

    GradebookOO( double[] grades){
        this.grades = grades;
    }
    void printGrades () {
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
    }
    double averageGrade () {
        double total = 0;
        for (int i = 0; i < grades.length; i++) {
            total += grades[i];
        }
        return total / grades.length;
    }

}