class ResearchAssistant extends Grad{
    protected double salary;
    
    ResearchAssistant(String name, double salary){
        super(name);
        this.salary = salary;
    }
    
    double getPay(){
        return salary;
    }
    
    String Description(){
        return this.Description() + getPay();
    }
}
//