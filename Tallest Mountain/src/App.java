import java.text.Format;
import java.util.ArrayList;

import co.grandcircus.geology.Formation;
import co.grandcircus.geology.Mesa;
import co.grandcircus.geology.Mountain;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Tallest Mountain");
        ArrayList<Formation> formations = new ArrayList<>();
        formations.add(new Mountain("Everest", 8848));
        formations.add(new Mesa("Grand Mesa", 2500, 500));
        formations.add(new Mountain("K2", 8611));
        formations.add(new Mesa("Kaiparowits Plateau", 2000, 620));
        showInfo(formations);
        Formation tallest = findTallest(formations);
        if(tallest != null){
            System.out.println("Here is the tallest formation:"+tallest.getInfo());
        }
        Formation tallestMesa = highestMesa(formations);
        System.out.println("The tallest Mesa "+tallestMesa.getInfo());

    }

    public static void showInfo(ArrayList<Formation> formation) {
        for (Formation f : formation) {
            System.out.println(f.getInfo());

        }

    }

    public static Formation findTallest(ArrayList<Formation> formation) {
        if (formation.isEmpty()) {
            return null;
        } else {
            Formation tallest = formation.get(0);
            for (Formation f : formation) {
                if (f.getHeight() > tallest.getHeight()) {
                    tallest = f;
                }

            }
            return tallest;
        }

    }
    public static Formation highestMesa(ArrayList<Formation> formation){
        Mesa tallestMesa = null;
        for(Formation f:formation){
            if(f instanceof Mesa){
                Mesa mesa = (Mesa)f;
                if(tallestMesa== null || mesa.getHeight()>tallestMesa.getHeight()){
                    tallestMesa= mesa;
                }

            }
        }
        return tallestMesa;

    }
}
