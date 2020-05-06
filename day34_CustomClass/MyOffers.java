package day34_CustomClass;

import javax.jnlp.ClipboardService;
import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offers offer1 = new Offers();
        offer1.setOfferInfo("Virginia", "Amazon", 150000, true);


        Offers offer2 = new Offers();
        offer2.setOfferInfo("Los Angeles", "Geico", 200000, true);

        Offers offer3 = new Offers();
        offer3.setOfferInfo("Maryland", "Finra", 120000, true);

        Offers offer4 = new Offers();
        offer4.setOfferInfo("Virginia", "FredieMac", 90000, false);

        Offers offer5 = new Offers();
        offer5.setOfferInfo("Virginia", "Leidos", 100000, true);

        ArrayList<Offers> ListOfOffers = new ArrayList<>(Arrays.asList(offer1, offer2, offer3, offer4, offer5));
        System.out.println(ListOfOffers);

        ListOfOffers.removeIf(p -> !p.isFullTime);
        System.out.println(ListOfOffers.size());
        ListOfOffers.removeIf(p -> p.salary <= 100.000);
        System.out.println(ListOfOffers.size());
        ListOfOffers.removeIf(p -> !p.location.equalsIgnoreCase("Maryland"));
        System.out.println(ListOfOffers);

    }
}
