package various.streamExcercises;

import java.util.List;

public class Vegetables {
    private String name;
    private String taste;

    private List<String> whatever;

    public Vegetables(String name, String taste, List<String> whatever) {
        this.name = name;
        this.taste = taste;
        this.whatever = whatever;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public List<String> getWhatever() {
        return whatever;
    }

    public void setWhatever(List<String> whatever) {
        this.whatever = whatever;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                ", whatever=" + whatever +
                '}';
    }
}