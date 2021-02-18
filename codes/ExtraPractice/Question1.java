public class Question1 {
    public static void main(String[] args) {
        AddAmount a = new AddAmount();
        AddAmount b = new AddAmount(100);
        System.out.println(a.amt);
        System.out.println(b.amt);
    }
}

public class BankAcc {
    public int amt = 50;

}

public class AddAmount extends BankAcc {
    public int amount = 50;

    AddAmount(int amount) {
        super();
        this.amount = amount;
        super.amt = super.amt + this.amount;
    }

    AddAmount() {

        super();
    }
}