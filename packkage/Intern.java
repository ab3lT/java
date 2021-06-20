class Intern extends Undergraduate{
    protected double wage, hours;
    
    Intern(String name,int year,double wage,double hours){
        super(name, year);
        this.wage = wage;
        this.hours = hours;
    }
    
    double getPay(){
        return wage * hours;
    }
    
    String Description(){
        return this.Description() + getPay();
    }
}
