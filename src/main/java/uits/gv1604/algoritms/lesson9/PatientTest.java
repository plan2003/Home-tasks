package uits.gv1604.algoritms.lesson9;

import com.kaplan.library.CorrectEntry;

import java.util.Random;
import java.util.Scanner;

public class PatientTest {
    public static final int MIN_NUMBER_MEDICAL_CARD = 111111;
    public static final int MAX_NUMBER_MEDICAL_CARD = 999999;
    public static final String[] lastNames = {"Smith", "Bond", "McDuck", "Stone", "Ward", "Bush", "Rock", "Kelly"};
    public static final String[] names = {"John", "Klara", "Antony", "Robert", "Gregor", "Nataly", "Sofia", "Sara"};

    public static void main(String[] args) {

        System.out.println("Enter number of patients:");
        int quantity = enterQuantityFromConsole(0,100);
        Patient[] patients = new Patient[quantity];
        generateArrayOfPatients(patients);
        printAllOfPatients(patients);
        Diagnosis diagnos;
        System.out.println();
        menuOfSelectDiagnosis();
        int numberOfDiagnosis = enterQuantityFromConsole(0, 8);
        switch (numberOfDiagnosis) {
            case 1:
                diagnos = Diagnosis.Cancer;
                break;
            case 2:
                diagnos = Diagnosis.Colds;
                break;
            case 3:
                diagnos = Diagnosis.Chickenpox;
                break;
            case 4:
                diagnos = Diagnosis.Diarrhea;
                break;
            case 5:
                diagnos = Diagnosis.Enuresis;
                break;
            case 6:
                diagnos = Diagnosis.Flat;
                break;
            case 7:
                diagnos = Diagnosis.Hemorrhoids;
                break;
            default:
                diagnos = Diagnosis.Schizophrenia;
                break;
        }
        printPatientsByDiagnosis(patients, diagnos);
        printPatientByMedicalCardRange(patients);
    }

    static void printPatientByMedicalCardRange(Patient[] patients) {
        long firstNumber, secondNumber;
        while (true) {
            System.out.println("To display the medical card within the specified range," +
                    "\n" + "enter the first value: ");
            firstNumber = enterQuantityFromConsole(111110,1000000);
            System.out.println("And enter the second value: ");
            secondNumber = enterQuantityFromConsole(111110, 1000000);
            if (secondNumber < firstNumber) {
                System.out.println("The first value can't be more than the second one! Please try again.");
            } else {
                break;
            }
        }
        for (int index = 0; index < patients.length; index++) {
            if (firstNumber <= patients[index].getNumberOfCard() &&
                    patients[index].getNumberOfCard() <= secondNumber) {
                System.out.println(patients[index]);
            }
        }
    }

    public static void menuOfSelectDiagnosis() {
        System.out.println("Select the desired diagnosis");
        System.out.println("1. Cancer");
        System.out.println("2. Colds");
        System.out.println("3. Chickenpox");
        System.out.println("4. Diarrhea");
        System.out.println("5. Enuresis");
        System.out.println("6. Flat");
        System.out.println("7. Hemorrhoids");
        System.out.println("8. Schizophrenia");
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
                System.out.println("Input mismatch. Please try again:");
                continue;
            }
        }
        return result;
    }

    private static void printPatientsByDiagnosis(Patient[] patients, Diagnosis diagnosis) {
        for (int i = 0; i < patients.length; i++) {
            if (patients[i].getDiagnosis() == diagnosis)
                System.out.println(patients[i]);
        }

    }

    private static void generateArrayOfPatients(Patient[] patients) {
        Random random = new Random();
        for (int i = 0; i < patients.length; i++) {
            int choice = random.nextInt(8);
            int choiceOfNumberCard = random.nextInt(MAX_NUMBER_MEDICAL_CARD - MIN_NUMBER_MEDICAL_CARD)
                    + MIN_NUMBER_MEDICAL_CARD;
            int lastNameIndex = (choice + i) % 8;

            switch (choice) {
                case 0:
                    patients[i] = new Patient(i, lastNames[lastNameIndex] + i, names[choice],
                            "J", "New York," + i + "Avenue, " + ((i * choice) + 1),
                            (choiceOfNumberCard * choice + 111111), choiceOfNumberCard, Diagnosis.Enuresis);
                    break;
                case 1:
                    patients[i] = new Patient(i, lastNames[lastNameIndex] + i, names[(choice + i + 3) % 8],
                            "Q", "Chicago," + i + "Street, " + ((i * choice) + 1),
                            (choiceOfNumberCard * choice + 111111), choiceOfNumberCard, Diagnosis.Cancer);
                    break;
                case 2:
                    patients[i] = new Patient(i, lastNames[lastNameIndex] + i, names[(choice + i + 6) % 8],
                            "F", "Philadelphia," + i + "Street, " + ((i * choice) + 1),
                            (choiceOfNumberCard * choice + 111111), choiceOfNumberCard, Diagnosis.Colds);
                    break;
                case 3:
                    patients[i] = new Patient(i, lastNames[lastNameIndex] + i, names[(choice + i + 4) % 8],
                            "O", "Los Angeles," + i + "Street, " + ((i * choice) + 1),
                            (choiceOfNumberCard * choice + 111111), choiceOfNumberCard, Diagnosis.Schizophrenia);
                    break;
                case 4:
                    patients[i] = new Patient(i, lastNames[lastNameIndex] + i, names[(choice + i + 7) % 8],
                            "P", "Las Vegas," + i + "Bulvar, " + ((i * choice) + 1),
                            (choiceOfNumberCard * choice + 111111), choiceOfNumberCard, Diagnosis.Flat);
                    break;
                case 5:
                    patients[i] = new Patient(i, lastNames[lastNameIndex] + i, names[(choice + i + 5) % 8],
                            "C", "Ciatle," + i + "Alley, " + ((i * choice) + 1),
                            (choiceOfNumberCard * choice + 111111), choiceOfNumberCard, Diagnosis.Hemorrhoids);
                    break;
                case 6:
                    patients[i] = new Patient(i, lastNames[lastNameIndex] + i, names[(choice + i + 2) % 8],
                            "R", "New Jersey," + i + "Lane, " + ((i * choice) + 1),
                            (choiceOfNumberCard * choice + 111111), choiceOfNumberCard, Diagnosis.Diarrhea);
                    break;
                default:
                    patients[i] = new Patient(i, lastNames[lastNameIndex] + i, names[(choice + i + 1) % 8],
                            "M", "Orlando," + i + "Str, " + ((i * choice) + 1),
                            (choiceOfNumberCard * choice + 111111), choiceOfNumberCard, Diagnosis.Chickenpox);
                    break;
            }
        }
    }


    static void printAllOfPatients(Patient[] patients) {

        for (int i = 0; i < patients.length; i++) {
            System.out.println(patients[i]);
        }
    }


}
