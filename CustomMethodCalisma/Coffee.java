package CustomMethodCalisma;

public class Coffee {

    String name;
    String size;
    double price;
    int calories;

    public String toString(){

        return name.toUpperCase()+" "+size.toUpperCase()+" $"+price+" "+calories+"CAL";

    }

    public void setInfo(String name,String size,double price,int calories){

        this.name=name;
        this.size=size;
        this.price=price;
        this.calories=calories;
    }



}
