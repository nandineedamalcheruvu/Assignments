package assignments;

import java.util.ArrayList;
import java.util.List;

public class Assignment8_ConditionalStatementsAndLoops {

	public static void main(String[] args) {
	
        // Store transactions in a Collection (ArrayList)
        List<Integer> transactions = new ArrayList<>();
        transactions.add(50000);
        transactions.add(-2000);
        transactions.add(3000);
        transactions.add(-15000);
        transactions.add(-200);
        transactions.add(-300);
        transactions.add(4000);
        transactions.add(-3000);

        int creditCount = 0;
        int debitCount = 0;
        int totalCredit = 0;
        int totalDebit = 0;
        int suspiciousCount = 0;

        for (int amount : transactions) {
            if (amount > 0) { // Credit
                creditCount++;
                totalCredit += amount;
                if (amount > 10000) {
                    System.out.println("Suspicious credit transaction with Amount: " + amount);
                    suspiciousCount++;
                }
            } else { // Debit
                debitCount++;
                totalDebit += -amount; // convert to positive
                if (amount < -10000) {
                    System.out.println("Suspicious debit transaction with Amount: " + amount);
                    suspiciousCount++;
                }
            }
        }

        //Remaining balance
        int balance = totalCredit - totalDebit;

        //Print results
        System.out.println("Total number of credit transactions: " + creditCount);
        System.out.println("Total number of debit transactions: " + debitCount);
        System.out.println("Total credited amount: " + totalCredit);
        System.out.println("Total debited amount: " + totalDebit);
        System.out.println("Remaining balance: " + balance);
        System.out.println("Total suspicious transactions: " + suspiciousCount);



	}

}
