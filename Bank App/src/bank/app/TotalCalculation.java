/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.app;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Orlan
 */
public class TotalCalculation {

    private int total;
    
    private int deposit;
    
    private int withdrawal;
    
    
    private List<Integer> transactionHistory = new ArrayList<>();
    
    public TotalCalculation()
    {
  
    }
    
    
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.total = this.total + deposit;
    }

    public int getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(int withdrawal) {
        
        this.total = this.total - withdrawal;
        this.withdrawal = withdrawal;
    }

    public List<Integer> getTransactionHistory()
    {
        return transactionHistory;
    }
  
    public void setTransactionHistory(int transaction)
    {
        this.transactionHistory.add(transaction);
    }

    @Override
    public String toString() {
        return "TotalCalculation{" + "transactionHistory=" + transactionHistory + '}';
    }

    
      
    
    
    
}
