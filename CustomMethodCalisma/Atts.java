package CustomMethodCalisma;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

public class Atts {


     //Access Modifier,                     Specifier,           ReturnType,             methodName (parameter)
     //     public (entire proje)    ,    static or instance,    void(String..)   ,      main  (String [] arg..)
    //      default(package)
    //      private(class)
    // protected (package!)


   static String type="pp";
    String name;//default, instance variable
    String color;
    int amount;
// static belongs to class but instance variable belongs to object
    public String asString(){

        String result="name: "+name+" color: "+color+" amount: "+amount;
        return result;
    }


    public static void main(String[] args) {
        Atts obj1 = new Atts();
        obj1.name="Aylin";
        obj1.color="blue";


        Atts obj2 = new Atts();
        obj2.name="Arin";


        Atts obj3 = new Atts();




    }
}

