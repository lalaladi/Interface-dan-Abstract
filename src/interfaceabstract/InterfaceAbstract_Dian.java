/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaceabstract;

/**
 *
 * @author USER
 */
public class InterfaceAbstract_Dian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account acc1 = new Account("trilily", "12345", 1000);
//        System.out.println(acc1.getBankName());
        acc1.deposit(1000);
        acc1.deposit(1000);
        acc1.setAccountName("Truly");
        acc1.print();
        
        
        CreditAccount acc2 = new CreditAccount("Normaly", "54545", 1000);
//        System.out.println(acc1.getBankName());
        acc2.setAccountBalance(1500);
        acc2.print();
        
        //polymorphism with instanceof
        System.out.println("\n");
        AbstractBankAccount[] listAll = new AbstractBankAccount[3];
        listAll[0] = acc1;
        listAll[1] = acc2;
        listAll[2] = acc2;
        
        for(AbstractBankAccount acc : listAll)
            if(acc instanceof Account)
                System.out.println("akun tabungan");
            else
                System.out.println("akun kredit");
    }
    
}
