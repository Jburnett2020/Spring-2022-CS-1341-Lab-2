import java.util.*;
import java.io.*;
public class SavingInvest401K{

   public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
         //Prints out questions for the user to plug in input
       System.out.print("Enter Starting salary :");
       //Declare a double variable put take in an integer format
       double startingSalary = sc.nextInt();

       System.out.print("Enter Annual Raise Percentage :");
       double annualRaisePercent = sc.nextDouble();

       System.out.print("Enter 401K Deposit (% of salary) :" );
       double depositRate = sc.nextDouble();

       System.out.print("Enter Company Matching % :");
       double companyMatchPercent = sc.nextDouble();

       System.out.print("Enter Investment annual Return :");
       double investmentAnnualReturn = sc.nextDouble();
      
       printSavingInvest401K(startingSalary,annualRaisePercent,depositRate,companyMatchPercent,investmentAnnualReturn, 0);
   }

   private static void printSavingInvest401K(double startingSalary, double annualRaisePercent, double depositRate, double companyMatchPercent,
           double investmentAnnualReturn, double total401KDeposit) {
  
       System.out.println("Year\t  Salary\t     401K Deposit\tCompany Match\t401K Earnings\t401k Balance");
       for(int i=2022;i<2032;i++) {
           //We have a temporary variable that holds amount that we started, which then
            //will be added on to the previous years accumalated401k savings
           double current401Kdeposit = total401KDeposit;
            //We calculate the account balance by multiplying the percentage of 401k given in the input with
           //the starting salary given. The product of this will be divided by 100 to give a percentage.
           double depositBalance = (depositRate*startingSalary)/100;
            //Company match is divided by 2 because it is half of the 401kDeposit
           double companyMatchBalance = depositBalance/2;
           //We add the account balance, company match, and accumulated 401k. The sum of these
           //3 variables will be multiplied by the annual raise percentage given by the user.
           double earnings401K = (depositBalance+companyMatchBalance+total401KDeposit)*(investmentAnnualReturn)/100;
           //The 401k that has been earned, the company match, and the current account balance
           //are assigned to the accumulated 401k.
           total401KDeposit = depositBalance+companyMatchBalance+earnings401K;
           total401KDeposit+=current401Kdeposit;
           System.out.printf("%d %13.2f\t %13.2f\t %13.2f\t %13.2f\t %13.2f\t\n", i, startingSalary, depositBalance, companyMatchBalance, earnings401K, total401KDeposit);
           startingSalary = startingSalary + (annualRaisePercent*startingSalary)/100;
       }
      
   }

}