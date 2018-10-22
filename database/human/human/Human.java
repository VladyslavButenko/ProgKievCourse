package human.human;

import java.util.Date;

public class Human {
    private String name;
    private String surname;
    private Date birthday;
    private String position;
    private double salary;


    public Human(String name, String surname, Date birthday, String position, double salary) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.position = position;
        this.salary = salary;
    }

    public Human() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
