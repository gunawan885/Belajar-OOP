class Person {
    String name;
    String adress;
    final String country = "Indonesia";

    void sayHello (String paramName){
        System.out.println("Hello " + paramName + " , my name is " + name);
    }
}
