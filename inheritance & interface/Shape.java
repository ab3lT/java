public class Shape {  
    Shape(){
          System.out.println("I am shape"); 
          }
 }
 
 public class RoundShape extends Shape {
     RoundShape(){  
          System.out.println("I am a round shape"); 
         }
 }
 
 public class Circle extends RoundShape {
     Circle() {
           System.out.println();
         }
     public static void main(String[] args) {
          Circle x = new Circle();
     }
 }
    
 