import java.util.Scanner;

public class DogWalkCompany {
    private int[] schedule;

    public DogWalkCompany(String dogs) {
        schedule = new int[24];

        try (Scanner s = new Scanner(dogs)) {
            for (int i = 0; i < 24; i++) {
                schedule[i] = s.nextInt();
            }
        }
    }

    public int numAvailableDogs(int hour) {
        return schedule[hour];
    }

    public void updateDogs(int hour, int numberDogsWalked) {
        schedule[hour] = schedule[hour] - numberDogsWalked;
    }
}
