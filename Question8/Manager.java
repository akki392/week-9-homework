package Question8;

public class Manager extends Employee{

    String name;
    String role;
    int basesalary;

@Override
    public double calculatesalary(String name,String role,int basesalary){
       this.name=name;
       this.role=role;
       this.basesalary=basesalary;
       return basesalary;
    }

    public static void main(String[] args) {
        Manager manager=new Manager();
        System.out.println(manager.calculatesalary("parth","manager",5000));


    }

}
