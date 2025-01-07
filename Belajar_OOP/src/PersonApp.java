public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        person1.name = "Eko";
        person1.adress = "Bandung";

        System.out.println(person1.name);
        System.out.println(person1.adress);
        System.out.println(person1.country);

        person1.sayHello("Budi");

        Person person2 = new Person();
        Person person3 = new Person();
    }
}