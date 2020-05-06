package CustomMethodCalisma;

public class Car {
    /**
     * instance variable/attributes/properties/data
     * make ,model,currentSpeed,color
     *method :print car info make+model+currentSpeed+color+current seped[currentSpeed]
     * show current speed,parameter(int speed limit)
     * make is driving at current speed mph,following speed limit 55
     * make is driving at current speed mph ,over  speed limit
     */

    String make;
    String model;
    String color;
    int currentSpeed;

    public void setCarInfo(String make,String model,String color,int currentSpeed){
        this.make=make;
        this.model=model;
        this.color=color;
        this.currentSpeed=currentSpeed;

    }

    public String toString(){

        return "Make: ["+make+"],Model: ["+model+"],Color: ["+color+"],Current Speed: ["+currentSpeed+"]";




    }

    public void showCurrentSpeed(int speedLimit){

        if(currentSpeed<=speedLimit){

            System.out.println(make+" is driving at "+currentSpeed+" mph, following the speed limit- "+speedLimit);
        }else{
            System.out.println(make+" is driving at "+currentSpeed+" mph, over the speed limit- "+speedLimit);
        }

    }

    public void drive(){

        System.out.println(make+" "+model+" is driving");
    }


    public void accelerate(int mph){

        currentSpeed+=mph;

    }

}
