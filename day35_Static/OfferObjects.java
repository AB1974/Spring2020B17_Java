package day35_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObjects {

    public static void main(String[] args) {

        Offer offer1 = new Offer();//Offer is a custom class!
        offer1.setOfferInfo("VA", "BOA", 100000, true);

        Offer offer2 = new Offer();
        offer2.setOfferInfo("Kentucky", "CapitalOne", 120000, false);

        Offer offer3 = new Offer();
        offer3.setOfferInfo("MD", "Chase", 95000, true);

        Offer offer4 = new Offer();
        offer4.setOfferInfo("BayArea", "Google", 115_000, false);

        Offer[] offers = {offer1, offer2, offer3, offer4};

        String myLocation="VA";

        ArrayList<Offer> Accept = new ArrayList<>(Arrays.asList(offers));

        Accept.removeIf(p->p.salary<100000 || !p.isFullTime|!p.location.equals(myLocation));


        for (Offer each : Accept) {

                System.out.println(each);
            }
        }


    }

