public apple{
    String color;
    double price;

    Apple(String color, double price){
        this.color = color;
        this.price = price;
    }

    Aple(double price){
        this("green", price)
    }

    String getcolor(){
        return color;
    }
    double getprice(){
        return price;
    }
    void setprice(double p ){
        price = p;
    }
}