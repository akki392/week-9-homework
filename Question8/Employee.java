package Question8;

public class Employee {
  String name;
  String role;
  int basesalary;


    public double calculatesalary(String name,String role,int basesalary){
        this.name=name;
        this.role=role;
        this.basesalary=basesalary;
        return basesalary;

    }

    public static void main(String[] args) {
       Employee employee=new Employee();
        System.out.println(employee.calculatesalary("akash","programmer",4000));
        System.out.println(employee.calculatesalary("parth","manager",5000));
    }
}
