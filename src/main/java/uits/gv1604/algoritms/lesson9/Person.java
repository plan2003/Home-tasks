package uits.gv1604.algoritms.lesson9;

public class Person {
    private  String surname;
    private  String name;
    private  String middleName;
    private  String address;

    public Person(String surname, String name, String middleName, String address) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
    }

    public Person(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String toString() {
        return "Student{" +
                "surname='" + getSurname() + "\'" +
                ", name='" + getName() + "\'" +
                ", middleName='" + getMiddleName() + "\'" +
                ", address='" + getAddress() + "\'" + "}";
    }
}
