package uits.gv1604.algoritms.lesson9;

public class CustomerTest {
    public static void main(String[] args) {
        Customer[] customers = new Customer[8];
        customers[0] = new Customer(0, "Smith", "John", "Tom", "5Avenue, 46", 188111111, 123123123);
        customers[1] = new Customer(1, "Smith", "Mery", "Tom", "5Avenue, 46", 444333222, 5551681);
        customers[2] = new Customer(2, "Stone", "Nick", "Jey", "6Avenue, 12", 333000456, 5341651);
        customers[3] = new Customer(3, "Klein", "Kelvin", "Armando", "79Street, 2", 666555222, 5327057);
        customers[4] = new Customer(4, "Krivulya", "Gerasim", "Matveevich", "Skripnik, 4a", 999888777, 5438050);
        customers[5] = new Customer(5, "Donovan", "Robert", "George", "Beverly Hills, 90210", 222333666, 5233375);
        customers[6] = new Customer(6, "Coen", "Nikolas", "Billy", "Beverly Hills, 3", 111222345, 5239147);
        customers[7] = new Customer(7, "Mcdonald", "Sasha", "Gregor", "Times Square, 87", 111345678, 77777654);
        sortCustomersByAlphabetAndPrint(customers);
       /* System.out.println();
        printAllOfCustomers(customers);*/
    }

    private static void sortCustomersByAlphabetAndPrint(Customer[] customers) {
        for (int i = 0; i < customers.length; i++) {
            for (int j = i+1; j < customers.length; j++) {
                if (customers[i].getSurname().compareTo(customers[j].getSurname()) > 0) {
                    Customer temp = customers[i];
                    customers[i] = customers[j];
                    customers[j] = temp;
                }
            }
        }
        for (int j = 0; j < customers.length; j++) {
            System.out.println(customers[j]);
        }
    }

    static void printAllOfCustomers(Customer[] customers) {

        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }
    }
}
