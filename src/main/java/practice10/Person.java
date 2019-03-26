package practice10;

public class Person {
    private String name;
    private int age,id;

    public Person(int id,String name,int age){
        this.name=name;
        this.age=age;
        this.id = id;
    }
    public String  getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getId(){
        return id;
    }
    public String introduce(){
        return "My name is "+ name +". I am "+ age + " years old.";
    }

    @Override
    public boolean equals(Object obj) {
        Person s =  (Person) obj;
        return this.id==s.getId();
    }
}