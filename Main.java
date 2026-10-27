import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("companies.txt");
            Scanner fileScanner = new Scanner(file);
            StringBuilder input = new StringBuilder();

            while (fileScanner.hasNextInt()) {
                input.append(fileScanner.nextInt()).append(" ");
            }

            fileScanner.close();

            DogWalkCompany company = new DogWalkCompany(input.toString());
            company.printSchedule();
        } catch (FileNotFoundException e) {
            System.out.println("Could not open companies.txt.");
        }
    }
}
