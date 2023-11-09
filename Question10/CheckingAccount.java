package Question10;

public class CheckingAccount extends BankAccount {
    int fees=10;
    @Override
    public void withdraw(int amount){
     if(amount<=fees){

     }else{
         System.out.println("fees applied");
     }
    }

    public static void main(String[] args) {
     CheckingAccount checkingAccount=new CheckingAccount();
     checkingAccount.withdraw(1000);
    }
}
