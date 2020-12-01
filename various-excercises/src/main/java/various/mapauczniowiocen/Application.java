package various.mapauczniowiocen;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {

        Uczen uczen1 = new Uczen("Alojzy", "Potocki");
        Uczen uczen2 = new Uczen("Alojz", "Porski");
        Uczen uczen3 = new Uczen("Adam", "Potowiecki");
        Uczen uczen4 = new Uczen("Ananiasz", "Pozorski");

        Oceny oceny1 = new Oceny(4.0, 3.0, 5.0);
        Oceny oceny2 = new Oceny(4.0, 3.0, 5.0);
        Oceny oceny3 = new Oceny(4.0, 3.0, 5.0);
        Oceny oceny4 = new Oceny(4.0, 3.0, 5.0);

        Map<Uczen, Oceny> dziennik = new HashMap<>();

        dziennik.put(uczen1, oceny1);
        dziennik.put(uczen2, oceny2);
        dziennik.put(uczen3, oceny3);
        dziennik.put(uczen4, oceny4);




    }
}

