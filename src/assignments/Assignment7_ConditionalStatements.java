package assignments;

public class Assignment7_ConditionalStatements {

	public static void main(String[] args) {
		
		        String customerName = "John Doe";
		        int creditScore = 720;
		        double income = 55000.0;
		        boolean isEmployed = true;
		        double debtToIncomeRatio = 35.0;

		        if (creditScore > 750) {
		            System.out.println(customerName + " is eligible for the loan.");
		           } else if (creditScore >= 650 && creditScore <= 750) {
		            
		        	   if (income >= 50000) {
		                if (isEmployed) {
		                    if (debtToIncomeRatio < 40) {
		                        System.out.println(customerName + " is eligible for the loan.");
		                    } else {
		                        System.out.println(customerName + " is not eligible for the loan (High DTI).");
		                    }
		                } else {
		                    System.out.println(customerName + " is not eligible for the loan (Unemployed).");
		                }
		            } else {
		                System.out.println(customerName + " is not eligible for the loan (Low Income).");
		            }
		        } else {
		            System.out.println(customerName + " is not eligible for the loan (Low Credit Score).");
		        }
		    }
		}
