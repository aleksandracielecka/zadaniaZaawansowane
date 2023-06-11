package org.example.zadanie2;

public class main2 {
    public static void main(String[] args) {
        Person person = new Person("Wojtek", "Sienkiewicza 5");
        System.out.println(person);

        Student student = new Student("Karol", "Dębowa", "dzienne", 2, 5000);
        System.out.println(student);

        Staff staff = new Staff("Franek","TCCV","IT",56068);


    }

}
