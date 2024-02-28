/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.app;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
/**
 *
 * @author Orlan
 */
public class JframeScreen extends JFrame {
    public void TwoButtonsFrame() {
        Scanner scan = new Scanner(System.in);
        TotalCalculation Calculator = new TotalCalculation();
        
        
        // Set the layout manager
        setLayout(new FlowLayout());

        // Create buttons
        
        JButton button1 = new JButton("Deposit");
        JButton button2 = new JButton("WithDraw");
        JButton button3 = new JButton("View Total Balance");
        JButton button4 = new JButton("View Transaction History");
        
        // Add buttons to the frame
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        
        System.out.println("Please Enter the Starting amount you would like: ");
        int addition = scan.nextInt();
        Calculator.setDeposit(addition);
        Calculator.setTransactionHistory(addition);
                
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {       
                System.out.println("How much would you like to deposit");
                int sum1 = scan.nextInt();
                Calculator.setDeposit(sum1);
                Calculator.setTransactionHistory(sum1);
                
            }
        });
         

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("How much would you like to withdraw");
                int sum2 = scan.nextInt();
                Calculator.setWithdrawal(sum2);
                Calculator.setSubtransactionHistory(sum2);
                
            }
        });
        
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Here is your Current Balance:");
                System.out.println("$" + Calculator.getTotal());
                
                
                
            }
        });
        
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Here is your transaction History: ");
                System.out.println("Deposits: " + "+" + Calculator.getTransactionHistory());
                System.out.println("Withdrawals: " + "-" + Calculator.getSubtransactionHistory());
                System.out.println("Your current balance is: $" + Calculator.getTotal());
            }
        });

        // Set frame properties
        setTitle("Mobile Banking App");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }
}
