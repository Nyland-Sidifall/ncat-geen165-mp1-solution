/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp1_solution;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author CCannon
 */
public class ATM_UI extends javax.swing.JFrame {

    private CyberBank bank;
    private String saveFilePath;
    private Customer activeCustomer;
    
    /**
     * Creates new form ATM_UI
     */
    public ATM_UI(CyberBank bank, String inputFilePath) {
        initComponents();
        this.bank = bank;
        bank.loadBankData(inputFilePath);
        saveFilePath = inputFilePath;
    }
    
    public ATM_UI(CyberBank bank, String inputFilePath, String saveFilePath){
        initComponents();
        this.bank = bank;
        bank.loadBankData(inputFilePath);
        this.saveFilePath = saveFilePath;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bankName_JLabel = new javax.swing.JLabel();
        logon_JPanel = new javax.swing.JPanel();
        customerId_JTextField = new javax.swing.JTextField();
        pin_JPasswordField = new javax.swing.JPasswordField();
        logOn_JButton = new javax.swing.JButton();
        customerId_JLabel = new javax.swing.JLabel();
        pin_JLabel = new javax.swing.JLabel();
        account_JPanel = new javax.swing.JPanel();
        withdrawal_JButton = new javax.swing.JButton();
        deposit_JButton = new javax.swing.JButton();
        transfer_JButton = new javax.swing.JButton();
        balance_JButton = new javax.swing.JButton();
        save_JButton = new javax.swing.JButton();
        logOff_JButton = new javax.swing.JButton();
        exit_JButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bankName_JLabel.setText("Bank Name");

        logon_JPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        customerId_JTextField.setText(" ");
        customerId_JTextField.setToolTipText("");

        pin_JPasswordField.setText("aaaa");

        logOn_JButton.setText("Log On");
        logOn_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOn_JButtonActionPerformed(evt);
            }
        });

        customerId_JLabel.setText("Customer ID");

        pin_JLabel.setText("PIN");

        javax.swing.GroupLayout logon_JPanelLayout = new javax.swing.GroupLayout(logon_JPanel);
        logon_JPanel.setLayout(logon_JPanelLayout);
        logon_JPanelLayout.setHorizontalGroup(
            logon_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logon_JPanelLayout.createSequentialGroup()
                .addGroup(logon_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(logon_JPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(logon_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(customerId_JLabel)
                            .addComponent(pin_JLabel))
                        .addGap(18, 18, 18)
                        .addGroup(logon_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(customerId_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(logon_JPanelLayout.createSequentialGroup()
                                .addComponent(pin_JPasswordField)
                                .addGap(97, 97, 97))))
                    .addGroup(logon_JPanelLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(logOn_JButton)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        logon_JPanelLayout.setVerticalGroup(
            logon_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logon_JPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(logon_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerId_JTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerId_JLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(logon_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pin_JPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pin_JLabel))
                .addGap(18, 18, 18)
                .addComponent(logOn_JButton)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        account_JPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        withdrawal_JButton.setText("Withdraw");
        withdrawal_JButton.setEnabled(false);
        withdrawal_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawal_JButtonActionPerformed(evt);
            }
        });

        deposit_JButton.setText("Deposit");
        deposit_JButton.setEnabled(false);

        transfer_JButton.setText("Transfer");
        transfer_JButton.setEnabled(false);

        balance_JButton.setText("Balance");
        balance_JButton.setEnabled(false);

        javax.swing.GroupLayout account_JPanelLayout = new javax.swing.GroupLayout(account_JPanel);
        account_JPanel.setLayout(account_JPanelLayout);
        account_JPanelLayout.setHorizontalGroup(
            account_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(account_JPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(account_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(withdrawal_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deposit_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(transfer_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balance_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        account_JPanelLayout.setVerticalGroup(
            account_JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(account_JPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(withdrawal_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deposit_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transfer_JButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balance_JButton)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        save_JButton.setText("Save");
        save_JButton.setEnabled(false);
        save_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_JButtonActionPerformed(evt);
            }
        });

        logOff_JButton.setText("Log Off");
        logOff_JButton.setToolTipText("");
        logOff_JButton.setEnabled(false);
        logOff_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOff_JButtonActionPerformed(evt);
            }
        });

        exit_JButton.setText("Exit");
        exit_JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logon_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(account_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logOff_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(save_JButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(exit_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bankName_JLabel)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(bankName_JLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(account_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logon_JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(save_JButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logOff_JButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit_JButton)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOn_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOn_JButtonActionPerformed
        activeCustomer = bank.authenticateCustomer(Integer.parseInt(customerId_JTextField.getText().trim()), Integer.parseInt(String.valueOf(pin_JPasswordField.getPassword()).trim()));
        if(activeCustomer != null){
            deposit_JButton.setEnabled(true);
            withdrawal_JButton.setEnabled(true);
            transfer_JButton.setEnabled(true);
            balance_JButton.setEnabled(true);
            save_JButton.setEnabled(true);
            logOff_JButton.setEnabled(true);
            
            customerId_JTextField.setEnabled(false);
            pin_JPasswordField.setEnabled(false);
        }
    }//GEN-LAST:event_logOn_JButtonActionPerformed

    private void exit_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_JButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_JButtonActionPerformed

    private void logOff_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOff_JButtonActionPerformed
        deposit_JButton.setEnabled(false);
        withdrawal_JButton.setEnabled(false);
        transfer_JButton.setEnabled(false);
        balance_JButton.setEnabled(false);
        save_JButton.setEnabled(false);
        logOff_JButton.setEnabled(false);
        
        customerId_JTextField.setEnabled(true);
        pin_JPasswordField.setEnabled(true);
        
        customerId_JTextField.setText("");
        pin_JPasswordField.setText("aaaa");
        
        activeCustomer = null;
    }//GEN-LAST:event_logOff_JButtonActionPerformed

    private void save_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_JButtonActionPerformed
        bank.saveBankData(saveFilePath);
    }//GEN-LAST:event_save_JButtonActionPerformed

    private void withdrawal_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawal_JButtonActionPerformed
        String selectedAccountNumber = (String)JOptionPane.showInputDialog(null, "Select the account to withdraw from:", bank.getBankName() + " Withdrawal", JOptionPane.PLAIN_MESSAGE, null, getAccountOptions(), getAccountOptions()[0]);
        
        selectedAccountNumber = selectedAccountNumber.split(" ")[2];
        
        String withdrawalAmountString = (String)JOptionPane.showInputDialog(null, "Enter an amount to withdraw", bank.getBankName() + " Withdrawal", JOptionPane.PLAIN_MESSAGE);
        
        Transaction withdrawal = new Transaction();
        withdrawal.setAmount(Double.parseDouble(withdrawalAmountString.trim()));
        withdrawal.setDescription("ATM Withdrawal");
        withdrawal.setTransactionType(TransactionType.debit);
        withdrawal.setDate(getTodaysDate());
        
        for(int i = 0; i < activeCustomer.getNumAccounts(); i++){
            if(activeCustomer.getAccount(i).getAccountNumber().equals(selectedAccountNumber.trim()))
                activeCustomer.getAccount(i).addTransaction(withdrawal);
        }
    }//GEN-LAST:event_withdrawal_JButtonActionPerformed

    private Object[] getAccountOptions(){
        Object[] accountArray = new Object[activeCustomer.getNumAccounts()];
        for(int i = 0; i < activeCustomer.getNumAccounts(); i++){
            accountArray[i] = activeCustomer.getAccount(i).getAccountType() + " - " + activeCustomer.getAccount(i).getAccountNumber();
        }
        return accountArray;
    }
    
    private String getTodaysDate(){
        Date today = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        
        return format.format(today);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel account_JPanel;
    private javax.swing.JButton balance_JButton;
    private javax.swing.JLabel bankName_JLabel;
    private javax.swing.JLabel customerId_JLabel;
    private javax.swing.JTextField customerId_JTextField;
    private javax.swing.JButton deposit_JButton;
    private javax.swing.JButton exit_JButton;
    private javax.swing.JButton logOff_JButton;
    private javax.swing.JButton logOn_JButton;
    private javax.swing.JPanel logon_JPanel;
    private javax.swing.JLabel pin_JLabel;
    private javax.swing.JPasswordField pin_JPasswordField;
    private javax.swing.JButton save_JButton;
    private javax.swing.JButton transfer_JButton;
    private javax.swing.JButton withdrawal_JButton;
    // End of variables declaration//GEN-END:variables
}
