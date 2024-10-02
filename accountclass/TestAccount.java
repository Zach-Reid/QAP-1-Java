public class TestAccount {
        
        public static void main(String[] args) {

            //Here are the two accounts, acc1 and acc2
            Account Acc1 = new Account("001", "Acc1", 5000);
            Account Acc2 = new Account("002", "Acc2", 4000);


            //Just to show that the entire account details work:
            System.out.println("");
            System.out.println("Account Details:");
            System.out.println(Acc1.toString());
            System.out.println(Acc2.toString());

            //Display balance of both accounts
            System.out.println("");
            System.out.println("Initial Balances:");
            System.out.println(Acc1.getName() + ": " + Acc1.getBalance());
            System.out.println(Acc1.getName() + ": " + Acc2.getBalance());

            //Transfer the money from Acc1 to Acc2
            int transferAmount = 1000;
            if (Acc1.getBalance() >= transferAmount) {
                System.out.println("");
                System.out.println("Transferring " + transferAmount + " dollars from " + Acc1.getName() + " to " + Acc2.getName() + "...");
                Acc1.debit(transferAmount);
                Acc2.credit(transferAmount);
                
                //Debiting takes it away from the sum with the amount being the 1000 specified, while crediting is basically addition
                //In the event that the amounts are ever changed this will catch an impossible transfer:
            } else {
                System.out.println("Invalid funds to transfer to the specified account.");
            }


            //Display the updated balance to see if everything worked out correctly
            System.out.println("");
            System.out.println("Updated Balances:");
            System.out.println(Acc1.getName() + ": " + Acc1.getBalance());
            System.out.println(Acc1.getName() + ": " + Acc2.getBalance());




        }
}  
