class Person {
    String name;
    String adress;
    final String country = "Indonesia";

    Person(String paramName, String paramAddres){
        name = paramName;
        adress = paramAddres;
    }

    void sayHello (String paramName){
        System.out.println("Hello " + paramName + " , my name is " + name);
    }
}