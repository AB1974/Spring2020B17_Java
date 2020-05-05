package day34_CustomClass;

public class Dog {

    String breed;
    String size;
    int age;
    String color;
    String name;


    //below one custom method no need to return anything therefore it has to be void
    public void setDogInfo(String DogBreed, String DogSize, int DogAge, String DogColor, String DogName) {
        breed = DogBreed;
        size = DogSize;
        age = DogAge;
        color = DogColor;
        name = DogName;

/**
 * this.breed=breed;
 * this.size=size;
 * this.age=age;
 * this.color=color;
 * this.name=name;
 */
        //this.breed//if you can call directly same name with the instance variable call

    }

    public void eating(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drinking(String drink) {
        System.out.println(name + " is drinking " + drink);

    }

    public void playing(String toy){
        System.out.println(name + " is playing "+toy);
    }
    public void studying(String subject){
        System.out.println(name + " is studying "+subject);
    }

    public String toString() {

        return "Dog Name: " + name + ", breed: " + breed + ", size: " + size + ", color: " + color + ", age: " + age;
    }
}
