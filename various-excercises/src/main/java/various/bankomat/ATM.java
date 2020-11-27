package various.bankomat;

public interface ATM {

    void wplata();

    void wyplata();

    default void poloczenieZBankiem(){
        System.out.println("lacze z bankiem");
    }

    static void zakonczeniePolaczenia(){
        System.out.println("koniec polaczenia");
    }
}
