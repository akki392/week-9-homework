package Question11;

public class Person {
    private String name;
    private int age;
    private String country;

    public String getname(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country=country;
    }

    public static void main(String[] args) {
        Person person=new Person();
        person.setName("akash");
        person.setAge(31);
        person.setCountry("uk");
        String name=person.getname();
        int age= person.getAge();
        String country= person.getCountry();
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("country : "+country);
    }
}
