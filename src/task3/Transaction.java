package task3;

public class Transaction<T extends Account<? extends PersonalData>> {

    private T from;
    private T to;

    private double amount;

    public Transaction(T from, T to, double amount){
        this.from = from;
        this.to = to;
        this.amount = amount;
    }


    public void execute(){
        if (from.getAmount() >= amount){
            System.out.printf("Осуществлён успешный перевод средств на сумму %.2f руб.\n", amount);
            System.out.printf("Счёт списания: #%s; %.2f руб.\nСчёт зачисления: #%s; %.2f руб.\n",
                    from.getData(), from.getAmount(), to.getData(), to.getAmount());
            from.setAmount(from.getAmount() - amount);
            to.setAmount(to.getAmount() + amount);

            System.out.println("Текущее состояние счетов: ");
            System.out.println(from);
            System.out.println(to);
        }
        else{
            System.out.println("Операция невозможна, недостаточно средств на счёте.");
        }
    }


}
