package Students;

public class Student {
	protected String name;
	protected int year;
	
	Student(String name, int year)
	{
		this.name=name;
		this.year=year;
	}
	String getName()
	{
		return name;
	}
	int getyear()
	{
		return year;
		
	}
	public static void main(String[] args)
	{
		 Undergrad ug = new Undergrad("Michael", 2006);
	        Grad gd = new Grad("Jennifer");
	        Intern in = new Intern("Elizabeth", 2005, 10.32, 20);
	        ResearchAssistant ra = new ResearchAssistant("Greg", 2000.0);
	        
	        System.out.println(ug.description());
	        System.out.println(gd.description());
	        System.out.println(in.description());
	        System.out.println(ra.description());	
	}
}
class Undergrad extends Student
{
	Undergrad(String name, int year)
	{
		super(name, year);
	}
	String description() {
		return name + " u " + year;
	}
	
}
class Grad extends Student{
	Grad(String name)
	{
		super(name,5);
	}
	String description() {
		return name + " " + 'G';
	}
	
}
class Intern extends Undergrad
{
	protected double wage,hrs;
	Intern(String name, int year, double wage, double hrs)
	{
		super(name,year);
		this.hrs=hrs;
		this.wage=wage;
	}
	double getpay()
	{
		return wage*hrs;
	}
	String description() {
		
		return super.description() + " "+  getpay();
	}	
}

class ResearchAssistant extends Grad{
    protected double salary;
    
    ResearchAssistant(String name, double salary){
        super(name);
        this.salary = salary;
    }
    
    double getPay(){
        return salary;
    }
    
    String description(){
        return super.description() +" " + getPay();
    }
}


