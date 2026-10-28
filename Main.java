import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        DogWalkCompany[] companies = new DogWalkCompany[100];

        try (Scanner s = new Scanner(new File("companies.txt"))) {
            for (int i = 0; i < 100; i++) {
                companies[i] = new DogWalkCompany(s.nextLine());
            }
        }

        int[] paychecks = new int[100];
        int walkerNumber = 0;
        try (Scanner s = new Scanner(new File("walkers.txt"))) {
            while (s.hasNextInt()) {
                int company = s.nextInt();
                int maxDogs = s.nextInt();
                DogWalker walker = new DogWalker(maxDogs, companies[company]);

                int startHour = s.nextInt();
                int endHour = s.nextInt();
                paychecks[walkerNumber] = walker.dogWalkShift(startHour, endHour);
                walkerNumber++;
            }
        }

        for (int i = 0; i < walkerNumber; i++) {
            System.out.println(paychecks[i]);
        }
    }
}
