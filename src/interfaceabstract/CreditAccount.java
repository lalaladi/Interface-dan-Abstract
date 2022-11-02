/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceabstract;

/**
 *
 * @author USER
 */

public class CreditAccount extends AbstractBankAccount {
    private static int creditLimit;
    private static int calculateCreditLimit(int amt){
        if (amt>1 && amt<=2000)
            return 200;
        else if(amt<=4000)
            return 300;
        else
            return 600;
   }
    public CreditAccount(String name, String num, int amt){
        super(name, num, amt);
        this.creditLimit = calculateCreditLimit(amt);
    }
    
    public void print(){
        System.out.println("Bank Name: " + this.getBankName()
                            + "\nAccount Name: " + this.accountName
                            + "\nAccount Number: " + this. accountNum
                            + "\nBalance: " + this.balance
                            + "\nCredit Limit: " + this.creditLimit);
    }
    
    @Override
    public void deposit(int amt) {
        balance = balance+amt;
    }

    @Override
    public int getBalance() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getBankName() {
        return this.bank;
    } 
   
}