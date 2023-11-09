package Question3;

public class BankAccount {

    public void deposit(){

    }
    public void withdraw(){
        int amount = 50;
        if(amount>=100)
        {
            System.out.println("withdraw successfully");
        }else{
            System.out.println("insuffiecient balance");
        }
    }

    public static void main(String[] args) {
        BankAccount w = new BankAccount();
        w.deposit();
        w.withdraw();

    }
}
