public class Main {
    public static void main(String[] args) {
        BankAccount object = new BankAccount("2210676126", 100.0);
        object.setUserName("Shahidul Islam");

        try {

            object.deposit(50.0);
            System.out.println("Your current Balance "+object.getBalance()+'\n');

            try {
                System.out.println("Trying to withdraw 200.0");
                object.withdraw(200.0);
                System.out.println("Your current Balance "+object.getBalance());
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());

            }


            try {
                System.out.println("Attempting to withdraw 50.0");
                object.withdraw(50.0);
                System.out.println("Your current Balance "+object.getBalance());
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());

            }


             try {
                System.out.println("Attempting to deposit -10.0");
                object.deposit(-10.0);
                 System.out.println("Your current Balance "+object.getBalance());
            } catch (InvalidAmountException e) {
                System.out.println(e.getMessage());

            }


        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
            System.out.println();
        }

        finally {
            System.out.println("Final balance: " + object.getBalance());
            System.out.println("End of transaction.......\nThank You "+object.getUserName()+" for transition...");
        }
    }
}
