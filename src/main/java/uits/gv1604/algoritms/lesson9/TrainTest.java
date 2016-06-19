package uits.gv1604.algoritms.lesson9;


import java.sql.Time;
import java.util.Random;
import java.util.Scanner;

public class TrainTest {
    final static int MAX_TIME = 165_599_000;
    final static int MIN_TIME = 79_200_000;
    final static int MAX_GENERAL_SEATS = 100;
    final static int MAX_ECONOMY_CLASS = 80;
    final static int MAX_COMPARENTMENT = 64;
    final static int MAX_LUX = 50;
    public static final String[] destinations = {"Харьков", "Киев", "Полтава", "Одесса", "Николаев", "Сумы", "Бердянск", "Ялта"};

    public static void main(String[] args) {

        System.out.println("Введите количество поездов: ");
        int quantity = enterQuantityFromConsole(0, 100);
        Train[] trains = new Train[quantity];
        generateArrayOfTrains(trains);
        printTrainsFollowingSameDestinationAfterSelectTime(trains);
        // printTrainsFollowingSameDestination(trains);
    }

    private static void printTrainsFollowingSameDestination(Train[] trains) {
        int selectOFDestination;
        String dest;
        System.out.println("Выберите пункт назначения:");
        System.out.println("1. Харков.");
        System.out.println("2. Киев.");
        System.out.println("3. Полтава.");
        System.out.println("4. Одесса.");
        System.out.println("5. Николаев.");
        System.out.println("6. Сумы.");
        System.out.println("7. Бердянск.");
        System.out.println("8. Ялта.");
        selectOFDestination = enterQuantityFromConsole(0, 9);
        switch (selectOFDestination) {
            case 1:
                dest = destinations[0];
                break;
            case 2:
                dest = destinations[1];
                break;
            case 3:
                dest = destinations[2];
                break;
            case 4:
                dest = destinations[3];
                break;
            case 5:
                dest = destinations[4];
                break;
            case 6:
                dest = destinations[5];
                break;
            case 7:
                dest = destinations[6];
                break;
            default:
                dest = destinations[7];
                break;
        }
        for (int m = 0; m < trains.length; m++) {
            if (trains[m].getDestination().equals(dest)) {
                System.out.println(trains[m]);
            }
        }
    }

    private static void printTrainsFollowingSameDestinationAfterSelectTime(Train[] trains) {
        int selectOFDestination;
        String dest;
        System.out.println("Выберите пункт назначения:");
        System.out.println("1. Харков.");
        System.out.println("2. Киев.");
        System.out.println("3. Полтава.");
        System.out.println("4. Одесса.");
        System.out.println("5. Николаев.");
        System.out.println("6. Сумы.");
        System.out.println("7. Бердянск.");
        System.out.println("8. Ялта.");
        selectOFDestination = enterQuantityFromConsole(1, 8);
        System.out.println("После которого часа(введите число от 0 до 23): ");
        int hour = enterQuantityFromConsole(0, 23);
        Time tempTime = new Time(((MAX_TIME - MIN_TIME) / 24) * hour + MIN_TIME + 1000);
        System.out.println(tempTime);
        switch (selectOFDestination) {
            case 1:
                dest = destinations[0];
                break;
            case 2:
                dest = destinations[1];
                break;
            case 3:
                dest = destinations[2];
                break;
            case 4:
                dest = destinations[3];
                break;
            case 5:
                dest = destinations[4];
                break;
            case 6:
                dest = destinations[5];
                break;
            case 7:
                dest = destinations[6];
                break;
            default:
                dest = destinations[7];
                break;
        }
        for (int m = 0; m < trains.length; m++) {
            if (trains[m].getDestination().equals(dest) &&
                    trains[m].getDepartureTime().getTime() > tempTime.getTime() &&
                    trains[m].getGeneralSeats() > 0) {
                System.out.println(trains[m]);
            }
        }
    }

    private static void generateArrayOfTrains(Train[] trains) {
        Random random = new Random();
        for (int i = 0; i < trains.length; i++) {
            long choiceOfTime = (long) random.nextInt(MAX_TIME - MIN_TIME)
                    + MIN_TIME;
            trains[i] = new Train(destinations[random.nextInt(8)], random.nextInt(100), new Time(choiceOfTime),
                    random.nextInt(MAX_GENERAL_SEATS), random.nextInt(MAX_ECONOMY_CLASS),
                    random.nextInt(MAX_COMPARENTMENT), random.nextInt(MAX_LUX));
            // System.out.println(trains[i]);
        }
    }

    private static int enterQuantityFromConsole(int from, int to) {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        while (true) {
            try {
                result = Integer.parseInt(scanner.nextLine());
                if (result < from || result > to) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Неверное значение. Попробуйте снова:");
                continue;
            }
        }
        return result;
    }
}
