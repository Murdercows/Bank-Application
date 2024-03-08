package bank.app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JframeScreen extends JFrame {

    private TotalCalculation calculator = new TotalCalculation();

    public JframeScreen() {
        // Set the layout manager
        setLayout(new FlowLayout());

        // Create buttons
        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");
        JButton viewBalanceButton = new JButton("View Total Balance");
        JButton viewHistoryButton = new JButton("View Transaction History");

        // Add buttons to the frame
        add(depositButton);
        add(withdrawButton);
        add(viewBalanceButton);
        add(viewHistoryButton);

        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String depositAmountStr = JOptionPane.showInputDialog("Enter deposit amount:");
                if (depositAmountStr != null && !depositAmountStr.isEmpty()) {
                    int depositAmount = Integer.parseInt(depositAmountStr);
                    calculator.setDeposit(depositAmount);
                    calculator.setTransactionHistory(depositAmount);
                    JOptionPane.showMessageDialog(null, "Deposit Processed");
                }
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String withdrawAmountStr = JOptionPane.showInputDialog("Enter withdrawal amount:");
                if (withdrawAmountStr != null && !withdrawAmountStr.isEmpty()) {
                    int withdrawAmount = Integer.parseInt(withdrawAmountStr);
                    calculator.setWithdrawal(withdrawAmount);
                    calculator.setSubtransactionHistory(withdrawAmount);
                    JOptionPane.showMessageDialog(null, "Withdrawal Processed");
                }
            }
        });

        viewBalanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Current Balance: $" + calculator.getTotal());
            }
        });

        viewHistoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder historyMessage = new StringBuilder("Transaction History:\n");
                historyMessage.append("Deposits: +").append(calculator.getTransactionHistory()).append("\n");
                historyMessage.append("Withdrawals: -").append(calculator.getSubtransactionHistory()).append("\n");
                historyMessage.append("Current Balance: $").append(calculator.getTotal());
                JOptionPane.showMessageDialog(null, historyMessage.toString());
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
