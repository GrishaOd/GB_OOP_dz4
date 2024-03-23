package task3;

public class Program {

    public static void main(String[] args) {

        Person person1 = new Person("FIO #1", "100000012");
        Entity entity1 = new Entity("GeekBrains", "100000013");
        DebitAccount<Entity> debitAccount1 = new DebitAccount<>(entity1, 40000000);
        CreditAccount<Person> creditAccount1 = new CreditAccount<>(person1, 100);
        Transaction<Account<?>> transaction1 = new Transaction<>(debitAccount1, creditAccount1, 30000);
        transaction1.execute();
        transaction1.execute();

    }

}
