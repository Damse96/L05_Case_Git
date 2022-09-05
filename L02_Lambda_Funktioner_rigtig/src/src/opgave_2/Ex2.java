package src.opgave_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Ex2 {

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)
        ));
        System.out.println(runners);
        System.out.println();

        // Print all runners
        System.out.println("All runners:");
        runners.forEach(runner -> System.out.println(runner));
        System.out.println();

        // Print all runners with lapTime < 30
        System.out.println("Runners with lap time < 30 sec:");
        runners.forEach(runner -> {
            if (runner.getLapTime() < 30) {
                System.out.println(runner);
            }
        });

        System.out.println();

        // Sort the runners ascending according to lap time
        // using List.sort() and a Comparator lambda
        System.out.println("Runners after sorting on lap time:");
        runners.sort((runner1, runner2) -> {
            return Integer.compare(runner1.getLapTime(), runner2.getLapTime());
        });
        System.out.println(runners);
        System.out.println();

        // EXTRA:
        // Calculate sum of lap times for all runners
        // using forEach() and a Consumer lambda.
        // Variable defineret udenfor lambda og brugt inde i lambda, 
        // SKAL være effektivt final.
        final int[] sum = new int[1]; // variablen sum er final, men værdien på indeks 0 kan ændres!
        runners.forEach(runner -> sum[0] += runner.getLapTime());
        System.out.println("Sum of lap times for all runners: " + sum[0] + " sec");
        System.out.println();
    }
}