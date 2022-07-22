package com.ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SIGMainsDisplay {

    private JPanel panelMain;
    private JTable InvoiceTable;
    private JButton creatNewInvoiceButton;
    private JButton deleteInvoiceButton;
    private JTextPane customerNameTextPane;
    private JTextPane invoiceNumberTextPane1;
    private JTextPane a23TextPane1;
    private JTextPane invoiceDateTextPane;
    private JTextField textField1;
    private JTextField textField2;
    private JTextPane totalTextPane;
    private JTextPane a516TextPane;
    private JTable table1;
    private JButton saveButton;
    private JButton cancelButton;
    private String [] cols = {"No.","Date","Customer","Total"};
    private String [] cols2 = {"No.","Item Name","Item Price","Count","Total"};
    private String [][] data2 = {
            {"No.","Item Name","Item Price","Count","Total"},
            {"0.","Tomato","50","2","100"},
            {"1.","Potato","20","3","60"},
            {"2.","Carrot","30","1","30"}

    } ;
    private String [][] data = {
            {"No.","Date","Customer","Total"},
            {"0.","22-7-2022","Mark","500"},
            {"1.","23-7-2022","Saif","600"},
            {"2.","24-7-2022","Khalil","700"}

    } ;
    public SIGMainsDisplay() {

        createTable(InvoiceTable,cols,data);
        createTable(table1,cols,data2);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("APP");
        frame.setContentPane(new SIGMainsDisplay().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
    private void createTable(JTable table,String[] cols, String [][] data) {

        table.setModel(new DefaultTableModel(
                data, cols

        ));
     }}