package various.mapauczniowiocen;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Oceny {
    private List<Double> grades = new ArrayList<>();

    public Oceny(double... grades) { // o co z tym dwukropkiem chodzi?
        for (double grade : grades) {
            this.grades.add(grade);
        }
    }

}