class Manager {
    String name;

    String company;

    Manager (String name){
    this.name = name;
    }

    Manager (String name, String company){
        this.name = name;
        this.company = company;
        }

    void sayHello(String name){
        System.out.println("Hello " + name + " , my name is Manger " + this.name);
    }
}