package uits.gv1604.algoritms.lesson9;

public class Customer extends Person {
    private long numberCreditCard;
    private int bankAccountNumber;

    public Customer(int id, String surname, String name, String middleName, String address,
                    long numberCreditCard, int bankAccountNumber) {
        super(id, surname, name, middleName, address);
        this.numberCreditCard = numberCreditCard;
        this.bankAccountNumber = bankAccountNumber;
    }

    public long getNumberCreditCard() {
        return numberCreditCard;
    }

    public void setNumberCreditCard(long numberCreditCard) {
        this.numberCreditCard = numberCreditCard;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }
    @Override
    public String toString() {
        return "Customer { Id:" + getId() +
                ", surname='" + getSurname() + "\'" +
                ", name='" + getName() + "\'" +
                ", middleName='" + getMiddleName() + "\'" +
                ", address='" + getAddress() + "\'" +
                ", number of credit card: " + getNumberCreditCard() + //"\n" +
                ", bank account number:" + getBankAccountNumber()  +
                "}";
    }
}
