package various.average;

import java.util.ArrayList;
import java.util.Collections;

public class InformationTechnology {
    public static void main(String[] args) {

        double sum = 0;

        ArrayList<Double> gradesIT = new ArrayList<>();

        gradesIT.add(5.0);
        gradesIT.add(3.0);
        gradesIT.add(4.0);
        gradesIT.add(5.0);
        gradesIT.add(5.0);
        gradesIT.add(3.0);
        gradesIT.add(5.0);
        gradesIT.add(4.0);
        gradesIT.add(5.0);

        for (int n = 0; n < gradesIT.size(); n++) {
            sum = sum + gradesIT.get(n);
        }

        System.out.println("Sum is: " + sum);

        double sumWithoutMinMax = sum - Collections.min(gradesIT) - Collections.max(gradesIT);

        System.out.println("SumWithoutMinMax is: " + sumWithoutMinMax);

        double average = sumWithoutMinMax / (gradesIT.size() - 2);

        System.out.println("Average is: " + average);

    }
}
