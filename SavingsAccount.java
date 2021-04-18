/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package savingsaccount;



/** /This program is going to calculate the new savings account balances for savers 1 and 2.
 *
 * @author James Kamin
 */
public class SavingsAccount {
    

    private double savingsBalance; //instance variable
    

    

    private static double annualInterestRate; //instance variable
    

    public SavingsAccount(double savingsBalance)
    {
        this.savingsBalance = savingsBalance;
    }
    

    public double getSavingsBal() //This is the getter for savings balance 
    {
        return this.savingsBalance;
    }
       

    public static void setInterestRate(double interestRate) //This is the static method that sets annualInterestRate to a new value
    {
        annualInterestRate = interestRate;
    }
    

    public double getInterestRate() //This is the getter for interest rate
    {
        return annualInterestRate;
    }
    

    public void calculateMonthlyInterest()
    {
        double monthlyinterest;
        monthlyinterest = (savingsBalance * annualInterestRate)/12;
        savingsBalance += monthlyinterest;
    }    //This is the method for calculating monthly interest rate
    

    


    

      public static void main(String[] args) {
      

        

        SavingsAccount saver1 = new SavingsAccount(2000.00); //This is the instantiation for saver1
        

        SavingsAccount saver2 = new SavingsAccount(3000.00); //This is the instantiation for saver2
        

        SavingsAccount.setInterestRate(0.04); //Here, the interest rate is set to 4%
        

        System.out.println("\nSavings Account Balances"); 
        
        System.out.printf("Month\t Saver1\t\t Saver2\n");  
        

     

      for( int month=1;month<13;month ++) 
       {
            

        saver1.calculateMonthlyInterest();
        
        saver2.calculateMonthlyInterest();
        

        System.out.printf("%d\t%4.2f\t\t%4.2f\n",month,saver1.getSavingsBal(),saver2.getSavingsBal());
        

        

        

        }   
       

       SavingsAccount.setInterestRate(0.05); //Here, the interest rate is set to 5%
      

       saver1.calculateMonthlyInterest();
       
       saver2.calculateMonthlyInterest();
       

       System.out.printf("13\t%4.2f\t\t%4.2f\n",saver1.getSavingsBal(),saver2.getSavingsBal());
       

    }
    

 }   

