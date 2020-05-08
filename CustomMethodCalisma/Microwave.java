package CustomMethodCalisma;

public class Microwave {
    String brand;
    boolean isOn;//default value for boolean false
    public void turnOn() {
        if (isOn == true) {
            System.out.println(brand + " is already ON");
        } else {
            System.out.println("Turning on " + brand +" microwave");
            isOn = true;
        }
    }
    public void turnOff() {

        if (isOn == false) {//already OFF
            System.out.println(brand + " is already OFF");
        }else {
            System.out.println("Turning off " + brand +" microwave");
        }
        isOn=false;
    }
    public void heat(String food){

        if(isOn){
            System.out.println("Heating food");

        }else{
            System.out.println("Microwave of off cannot heat"+food);
        }
    }
}
