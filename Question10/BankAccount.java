package Question10;

public class BankAccount {
    int balance;

    public void deposit(int amount){

    }
    public void withdraw(int amount){
        if(amount<=balance){

        }else {
            System.out.println("insufficient balance");
        }
    }

    public static void main(String[] args) {
          BankAccount bankAccount=new BankAccount();
          bankAccount.deposit(1000);
          bankAccount.withdraw(500);



    }

}
