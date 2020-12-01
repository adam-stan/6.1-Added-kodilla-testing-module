package various.mapauczniowiocen;

import java.util.Objects;

public class Uczen {
    private String name;
    private String nazwisko;

    public Uczen(String name, String nazwisko) {
        this.name = name;
        this.nazwisko = nazwisko;
    }

    public String getName() {
        return name;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczen uczen = (Uczen) o;
        return name.equals(uczen.name) &&
                nazwisko.equals(uczen.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nazwisko);
    }
}


