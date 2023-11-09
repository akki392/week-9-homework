package Question8;

public class Programmer extends Employee{
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
        Programmer programmer=new Programmer();
        System.out.println(programmer.calculatesalary("akash","programmer",4000));


    }
}
