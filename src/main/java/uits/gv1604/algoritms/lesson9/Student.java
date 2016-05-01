package uits.gv1604.algoritms.lesson9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Student extends Person {
   SimpleDateFormat birthday;
    private int telephone;
    private String faculty;
    private int course;
    private String group;

    public Student() {
        this(1000,"Petrov", "Ivan", "Sidorovich", "Uganda, Jungle", new SimpleDateFormat("1991"), 55500000, "AP", 5, "JV1604");
    }

    public Student(int id, String surname, String name, String middleName, String address, SimpleDateFormat birthday,
                   int telephone, String faculty, int course, String group) {
        super(id,surname, name, middleName, address);
        this.birthday = birthday;
        this.telephone = telephone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public Student(int id, String surname, String name, String middleName, String address, SimpleDateFormat day) {
        super(id,surname, name, middleName, address);
        this.birthday = day;

    }

    @Override
    public String toString() {
        return "Student{ Id:" + getId() +
                ", surname='" + getSurname() + "\'" +
                ", name='" + getName() + "\'" +
                ", middleName='" + getMiddleName() + "\'" +
                ", address='" + getAddress() + "\'" + ", birthday: " + birthday.toPattern() +
                ", telephone: " + getTelephone() + "\n" + ", faculty: " + getFaculty() +
                ", course:" + getCourse() + ", group: " + getGroup() +
                "}";
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
