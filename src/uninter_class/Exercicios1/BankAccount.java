package uninter_class.Exercicios1;

public class BankAccount {
    int number;
    String account_holder;
    double balance;
    float account_limit;

    BankAccount(int number, String account_holder, double balance, float account_limit){
        this.number = number;
        this.account_holder = account_holder;
        this.balance = balance;
        this.account_limit = account_limit;
    }


    void deposite_money(double money){
        this.balance+= money;
        System.out.println("Deposite was succefull!!");
    };

    void whitdraw_money(double money) {
        if (money > this.account_limit) {
            System.out.println("You does not have account limit");
            return;
        } else if (money > this.balance) {
            System.out.println("You does not have balance for this operation");
        }

        this.balance -= money;
        System.out.println("Whitdraw was succefull!");

    };

        void invoice(){
            System.out.println(this.number);
            System.out.println(this.account_limit);
            System.out.println(this.balance);
        };

}
