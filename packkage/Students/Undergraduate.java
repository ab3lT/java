class Undergraduate extends Student{
    
    Undergraduate(String name, int year){
        super(name, year);
    }
    
    String Description(){
        return name + " U " + year;
    }
}
