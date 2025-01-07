public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("eko","Bandung");

        System.out.println(person1.name);
        System.out.println(person1.adress);
        System.out.println(person1.country);

        person1.sayHello("Budi");

        Person person2 = new Person("Budi");
        Person person3 = new Person();
    }
}