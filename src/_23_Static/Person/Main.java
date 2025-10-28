package _23_Static.Person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person.showPopulation();
        Person person2 = new Person();
        Person.showPopulation();

        System.out.println(person1.COUNTRY1 == person2.COUNTRY1);

        System.out.println(person1.student == person2.student);
        System.out.println(person1.student.hashCode());
        System.out.println(person2.student.hashCode());
    }
}
