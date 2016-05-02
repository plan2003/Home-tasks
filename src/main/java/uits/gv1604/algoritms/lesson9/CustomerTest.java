package uits.gv1604.algoritms.lesson9;

import com.kaplan.library.CorrectEntry;

public class CustomerTest {
    public static void main(String[] args) {
        Customer[] customers = new Customer[9];
        customers[0] = new Customer(0, "Smith", "John", "Tom", "New York, 5Avenue, 46", 188111111, 123123123);
        customers[1] = new Customer(1, "Smith", "Mery", "Tom", "New York, 5Avenue, 46", 444333222, 5551681);
        customers[2] = new Customer(2, "Stone", "Nick", "Jey", "New York, 6Avenue, 12", 333000456, 5341651);
        customers[3] = new Customer(3, "Klein", "Kelvin", "Armando", "Buenos Ires, 79Street, 2", 666555222, 5327057);
        customers[4] = new Customer(4, "Krivulya", "Gerasim", "Matveevich", "Merefa, Skripnik, 4a", 999888777, 5438050);
        customers[5] = new Customer(5, "Donovan", "Robert", "George", "Los-Angeles, Beverly Hills, 90210", 222333666, 5233375);
        customers[6] = new Customer(6, "Coen", "Nikolas", "Billy", "Los-Angeles, Beverly Hills, 3", 111222345, 5239147);
        customers[7] = new Customer(7, "Mcdonald", "Sasha", "Gregor", "New York, Times Square, 87", 111345678, 77777654);
        customers[8] = new Customer(8, "Iwillbebekov", "Terminat", "John", "Alma Ati, Pravda, 49", 111345678, 77777654);
        sortCustomersByAlphabetAndPrint(customers);
        printCustomersByCreditCardRange(customers);
    }

    private static void sortCustomersByAlphabetAndPrint(Customer[] customers) {
        for (int index = 0; index < customers.length; index++) {
            for (int curIndex = index + 1; curIndex < customers.length; curIndex++) {
                if (customers[index].getSurname().compareTo(customers[curIndex].getSurname()) > 0) {
                    Customer temp = customers[index];
                    customers[index] = customers[curIndex];
                    customers[curIndex] = temp;
                }
            }
        }
        for (int j = 0; j < customers.length; j++) {
            System.out.println(customers[j]);
        }
    }

    static void printCustomersByCreditCardRange(Customer[] customers) {
        long firstNumber, secondNumber;
        while (true) {
            System.out.println("To display the credit card within the specified range," +
                    "\n" + "enter the first value: ");
            firstNumber = CorrectEntry.enterLongFromConsole();
            System.out.println("And enter the second value: ");
            secondNumber = CorrectEntry.enterLongFromConsole();
            if (secondNumber < firstNumber) {
                System.out.println("The first value can't be more than the second one! Please try again.");
            } else {
                break;
            }
        }
        for (int index = 0; index < customers.length; index++) {
            if (firstNumber <= customers[index].getNumberCreditCard() &&
                    customers[index].getNumberCreditCard() <= secondNumber) {
                System.out.println(customers[index]);
            }
        }
    }

    static void printAllOfCustomers(Customer[] customers) {

        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }
    }
}
