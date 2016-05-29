package uits.gv1604.algoritms.lesson9;

import com.kaplan.library.CorrectEntry;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {
        Student[] students = new Student[10];
        students[0] = new Student(0,"Smith", "John", "Tom", "5Avenue, 46", new SimpleDateFormat("1990"),
                5551111, "MT", 2, "JV1702");
        students[1] = new Student(1,"Smith", "Mery", "Tom", "5Avenue, 46", new SimpleDateFormat("1995"),
                5551681, "EMS", 4, "JV1704");
        students[2] = new Student(2, "Stone", "Nick", "Jey", "6Avenue, 12", new SimpleDateFormat("1990"),
                5341651, "AP", 1, "JV1701");
        students[3] = new Student(3, "Klein", "Kelvin", "Armando", "79Street, 2", new SimpleDateFormat("1991"),
                5327057, "AP", 2, "JV1702");
        students[4] = new Student(4,"Krivulya", "Gerasim", "Matveevich", "Skripnik, 4a", new SimpleDateFormat("1992"),
                5438050, "E", 1, "JV1701");
        students[5] = new Student(5, "Donovan", "Robert", "George", "Beverly Hills, 90210", new SimpleDateFormat("1992"),
                5233375, "E", 1, "JV1701");
        students[6] = new Student(6, "Coen", "Nikolas", "Billy", "Beverly Hills, 3", new SimpleDateFormat("1993"),
                5239147, "INFIZ", 1, "JV1701");
        students[7] = new Student(7, "Mcdonald", "Sasha", "Gregor", "Times Square, 87", new SimpleDateFormat("1992"),
                5232975, "E", 4, "JV1704");
        students[8] = new Student(8, "Kelly", "Kiron", "Vinny", "Melrose, 38", new SimpleDateFormat("1991"),
                5551443, "EMS", 2, "JV1702");
        students[9] = new Student();
        String[] faculty = doStringArrayFromFaculty(students);
        parseAndPrintUniqueFaculty(faculty);
        String choiceOfFaculty = enterOfChoise(faculty);
        printListOfStudentsGivenFaculty(students, choiceOfFaculty);
        int year = getYear();
        printListOfStudentsBornAfterSpecifiedYear(students, year);
        String[] group = doStringArrayFromGroup(students);
        parseAndPrintUniqueGroup(group);
        String choiceOfGroup = enterOfChoise(group);
        printListOfStudentsGivenGroup(students, choiceOfGroup);
        //printAllOfStudents(students);
    }

    private static void printListOfStudentsGivenGroup(Student[] students, String choiseOfGroup) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGroup().equals(choiseOfGroup)) {
                System.out.println(students[i]);
            }
        }
    }

    private static void parseAndPrintUniqueGroup(String[] group) {
        Arrays.sort(group);
        int count = 1;
        System.out.println("Select from the list. Enter the requared group:");
        System.out.println("1. " + group[0]);
        for (int i = 1; i < group.length; i++) {
            if (group[i - 1].equals(group[i])) {
                continue;
            } else {
                count++;
                System.out.println(count + ". " + group[i]);
            }
        }
    }

    private static void printListOfStudentsGivenFaculty(Student[] students, String choiseOfFaculty) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFaculty().equals(choiseOfFaculty)) {
                System.out.println(students[i]);
            }
        }
    }

    public static int getYear() {
        System.out.println("Enter year:");
        return CorrectEntry.enterYearFromConsole();
    }

    private static void printListOfStudentsBornAfterSpecifiedYear(Student[] students, int year) {
        for (Student student : students) {
            if (Integer.parseInt(student.birthday.toPattern()) > year) {
                System.out.println(student);
            }
        }
    }

    private static String[] doStringArrayFromFaculty(Student[] students) {
        String[] strings = new String[students.length];
        for (int i = 0; i < students.length; i++) {
            strings[i] = students[i].getFaculty();
        }
        return strings;
    }

    private static String[] doStringArrayFromGroup(Student[] students) {
        String[] strings = new String[students.length];
        for (int i = 0; i < students.length; i++) {
            strings[i] = students[i].getGroup();
        }
        return strings;
    }

    private static void parseAndPrintUniqueFaculty(String[] strings) {
        Arrays.sort(strings);
        int count = 1;
        System.out.println("Select from the list. Enter the requared faculty:");
        System.out.println("1. " + strings[0]);
        for (int i = 1; i < strings.length; i++) {
            if (strings[i - 1].equals(strings[i])) {
                continue;
            } else {
                count++;
                System.out.println(count + ". " + strings[i]);
            }
        }
    }

    private static String enterOfChoise(String[] strings) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        while (true) {
            try {
                result = scanner.nextLine();
                int count = 0;
                for (int i = 0; i < strings.length; i++) {
                    if (result.equals(strings[i])) {
                        count++;
                    }
                }
                if (count == 0) {
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

    static void printAllOfStudents(Student[] students) {

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }


}
