public class managerAPP {
    public static void main(String[] args) {

        var manager = new Manager("Eko");
        manager.name = "Eko";
        manager.sayHello("Budi");

        var vp = new vicePresident("joko");
        vp.name = "Joko";
        vp.sayHello("Budi");
    }
}
