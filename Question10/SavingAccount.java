package Question10;

public class SavingAccount extends BankAccount{
    int withdrawlimit=300;
    @Override
    public void withdraw(int amount){
        if(amount<=withdrawlimit){

        }else{
            System.out.println("withdrawal limit exceed");
        }
    }

    public static void main(String[] args) {
        SavingAccount savingAccount=new SavingAccount();
        savingAccount.withdraw(500);
    }
}
