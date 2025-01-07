class Person {
    String name;
    String adress;
    final String country = "Indonesia";

    Person(String name, String adress){
        name = name;
        adress = adress;
    }

    Person(String paramName){
        this(paramName,null);
    }

    Person(){
        this(null);
    }

    void sayHello (String name){
        System.out.println("Hello " + name + " , my name is " + name);
    }
}