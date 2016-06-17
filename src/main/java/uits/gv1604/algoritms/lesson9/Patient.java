package uits.gv1604.algoritms.lesson9;

public class Patient extends Person {
    private int phone;
    private int numberOfCard;
    private Diagnosis diagnosis;

    public Patient(int id, String surname, String name, String middleName, String address,
                   int phone, int numberOfCard, Diagnosis diagnosis) {
        super(id, surname, name, middleName, address);
        this.phone = phone;
        this.numberOfCard = numberOfCard;
        this.diagnosis = diagnosis;
    }

    public int getPhone() {
        return phone;
    }

    public int getNumberOfCard() {
        return numberOfCard;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    @Override
    public String toString() {
        return "Patient { Id:" + getId() +
                ", surname='" + getSurname() + "\'" +
                ", name='" + getName() + "\'" +
                ", middleName='" + getMiddleName() + "\'" +
                ", address='" + getAddress() + "\'" +
                ", phone=" + getPhone() +
                ", number of medical card: " + getNumberOfCard() + //"\n" +
                ", diagnosis:" + getDiagnosis()  +
                "}";
    }
}
