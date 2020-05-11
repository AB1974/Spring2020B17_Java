package OfficeHours2.day_2StringandLoops;

public class BestBuyStores {

    public static void main(String[] args) {
        BestBuy store1 = new BestBuy();//we have one object
        store1.numberOfComputer = 10;

        store1.numberOfComputer--;
        System.out.println(store1.numberOfComputer);
        store1.close();//called from object name
        BestBuy.closeAll();//called from class name

    }
}
