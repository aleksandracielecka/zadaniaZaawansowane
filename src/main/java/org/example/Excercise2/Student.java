package org.example.Excercise2;

public class Student extends Person{
    private String typeofStudies;
    private int yearOfStudies;
    private double costOfStudies;


    public Student(String name, String adress, String typeofStudies, int yearOfStudies, double costOfStudies) {
        super(name, adress);
        this.typeofStudies = typeofStudies;
        this.yearOfStudies = yearOfStudies;
        this.costOfStudies = costOfStudies;
    }

    public String getTypeofStudies() {
        return typeofStudies;
    }

    public void setTypeofStudies(String typeofStudies) {
        this.typeofStudies = typeofStudies;
    }

    public int getYearOfStudies() {
        return yearOfStudies;
    }

    public void setYearOfStudies(int yearOfStudies) {
        this.yearOfStudies = yearOfStudies;
    }

    public double getCostOfStudies() {
        return costOfStudies;
    }

    public void setCostOfStudies(double costOfStudies) {
        this.costOfStudies = costOfStudies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "typeofStudies='" + typeofStudies + '\'' +
                ", yeatOfStudies=" + yearOfStudies +
                ", costOfStudies=" + costOfStudies +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
