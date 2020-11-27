package various.bankomat;

public class Application {
    public static void main(String[] args) {

        ATMImpl obiekt = new ATMImpl();
        obiekt.wplata();
        obiekt.wyplata();
        obiekt.poloczenieZBankiem();
        ATM.zakonczeniePolaczenia();
        }
    }
