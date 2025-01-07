public class managerAPP {
    public static void main(String[] args) {

        var manager = new Manager();
        manager.name = "Eko";
        manager.sayHello("Budi");

        var vp = new vicePresident();
        vp.name = "Joko";
        vp.sayHello("Budi");
    }
}
