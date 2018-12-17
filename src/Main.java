import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
import sun.security.jca.GetInstance;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Kvinde kvinde = new Kvinde();
//
//        Mand mand = new Mand();
//
//        System.out.println(kvinde.aktivitet());
//
//        System.out.println(mand.aktivitet());
//
//        System.out.println("her fra leger vi lidt med cast \n\n ");
//
//        Menneske menneskeMand = new Mand();
//
//        Mand mand1 = new Mand();
//
//        System.out.println(((Menneske) mand1).aktivitet());
//
//
//        Menneske menneske = new Mand();
//
//        System.out.println(((Menneske) mand).aktivitet());

        // System.out.println(menneskeMand.aktivitet());

        //Menneske menneske = (Menneske) menneskeMand;




        // nedcast som fejler når man oversætter.
       // Menneske menneske1 = new Menneske();
       // Mand mand1 = (Mand) menneske1;


//        Kvinde kvinde = new Kvinde();
//
//        kvinde.egenskab = new Flittiglise();
//
//        System.out.println(kvinde.egenskab.aktivitet());
//        System.out.println(kvinde.exclusiveKvinder());
//
//        kvinde.egenskab = new Dovenlas();
//
//        System.out.println("\n\n");
//
//        System.out.println(kvinde.egenskab.aktivitet());
//        System.out.println(kvinde.exclusiveKvinder());
//


        Mand mand = new Mand();
        Mand mand1 = new Mand();
        Mand mand2 = new Mand();
        Mand mand3 = new Mand();

        Kvinde kvinde = new Kvinde();
        Kvinde kvinde1 = new Kvinde();
        Kvinde kvinde2 = new Kvinde();
        Kvinde kvinde3 = new Kvinde();

        ArrayList<Menneske> menneskeArrayList = new ArrayList<>();

        menneskeArrayList.add(mand);
        menneskeArrayList.add(mand1);
        menneskeArrayList.add(mand2);
        menneskeArrayList.add(mand3);
        menneskeArrayList.add(kvinde);
        menneskeArrayList.add(kvinde1);
        menneskeArrayList.add(kvinde2);
        menneskeArrayList.add(kvinde3);

        mand.egenskab = new Flittiglise();

        // Køn er en simpel nedarvet egenskab, som vi kan behandle generalt.
        for (Menneske m:
                menneskeArrayList
             ) {
            System.out.println(m.køn);
        }


        System.out.println("\n\n");

        // det ekslusive for mand og kvinde er specefikt. Det betyder at vi
        //vi ikke kan behandle det generalt. Derfor bliver vi nødt til at finde
        //ud af om det er en mand eller en kvinde. Efter
        //vi har konstateret hvilke type de er,
        // bliver vi nødt til at caste dem inden vi kalder de
        // specefikke metoder.

        for (Menneske m: menneskeArrayList
             ) {
            if (m instanceof Mand) {
                System.out.println(((Mand) m).exclusiveMand());
            }
            else {
                System.out.println(((Kvinde) m).exclusiveKvinder());
            }
        }


        System.out.println("\n\n");

        for (Menneske m: menneskeArrayList
             ) {
            System.out.println(m.egenskab.aktivitet());
        }


        System.out.println("\n\n");
        System.out.println("\n\n");
        System.out.println("\n\n");

        Menneske menneske = new Menneske();
        System.out.println(menneske.laver());

        Mand mand4 = new Mand();
        System.out.println(mand4.laver());


    }
}
