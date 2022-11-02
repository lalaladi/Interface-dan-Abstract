/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaceabstract;

/**
 *
 * @author USER
 */
abstract class AbstractBankAccount {
    
    public final String bank = "JAVABANK INDONESIA";
    
    protected String accountName;
    protected String accountNum;
    protected int balance;
    
    public AbstractBankAccount(String name, String num, int balance){
        this.accountName = name;
        this.accountNum = num;
        this.balance = balance;
    }

    abstract public void deposit(int amt);
    abstract public int getBalance();
    abstract public String getBankName();
    
    public void withdraw(int amt){}
    
    public void setAccountName(String name){
        this.accountName = name;
    }
    
     public void setAccountBalance(int balance){
        this.balance = balance;
    }
}