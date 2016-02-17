package ph.edu.dlsu;

import ph.edu.dlsu.olives.Olive;
import ph.edu.dlsu.ph.edu.dlsu.press.OlivePress;

public class Main {

    public static void main(String[] args) {

//        Olive olive = new Olive();
//        olive.crush();

        Olive[] olives = {new Olive(), new Olive(), new Olive()};
        OlivePress press = new OlivePress();
        press.getOil(olives);

    }
}
