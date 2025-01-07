class Person {
    String name;
    String adress;
    final String country = "Indonesia";

    Person(String paramName, String paramAddres){
        name = paramName;
        adress = paramAddres;
    }

    Person(String paramName){
        this(paramName,null);
    }

    Person(){
        this(null);
    }

    void sayHello (String paramName){
        System.out.println("Hello " + paramName + " , my name is " + name);
    }
}