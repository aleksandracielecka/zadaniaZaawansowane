package org.example.Excercise2;

public class Staff extends Person{
    private String specialization;
    private double salary;

    public Staff(String name, String adress, String specialization, double salary) {
        super(name, adress);
        this.specialization = specialization;
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "specialization='" + specialization + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
