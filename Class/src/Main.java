import ClassPackage.Person;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java Welcome to Class");
        Person p1 = new Person();
        p1.setName("Okoro");
        p1.setAge(20);
        p1.setNationality("Nigeria");

        System.out.println(p1.toString());


    }
}