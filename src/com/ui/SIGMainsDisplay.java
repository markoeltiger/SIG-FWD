package com.ui;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Vector;

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

            {"0.","22-7-2022","Mark","500"},
            {"1.","23-7-2022","Saif","600"},
            {"2.","24-7-2022","Khalil","700"}

    } ;
    public SIGMainsDisplay() {
        File csvfile =new File("Invoice.csv");
        DefaultTableModel csv_data =new DefaultTableModel();
        FileReader reader = null;
        try {
            reader = new FileReader(csvfile);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        try {
            int start= 0 ;
            InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream(csvfile));
            CSVParser csvParser= CSVFormat.DEFAULT.parse(inputStreamReader);
            for(CSVRecord csvRecord:csvParser){
                if(start==0){
                    start=1;
                    csv_data.addColumn(csvRecord.get(0));
                    csv_data.addColumn(csvRecord.get(1));
                    csv_data.addColumn(csvRecord.get(2));
                    csv_data.addColumn(csvRecord.get(3));
                }
                else{
                    Vector row=new Vector();
                    row.add(csvRecord.get(0));
                    row.add(csvRecord.get(1));
                    row.add(csvRecord.get(2));
                    row.add(csvRecord.get(3));
                    csv_data.addRow(row);
                }
            }
        }catch (Exception e){
            System.out.println(e.getCause()+"e"+e);
        }


        createTable(InvoiceTable,cols,data);
        InvoiceTable.setModel(csv_data);
        createTable(table1,cols,data2);
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
            }
        });
        InvoiceTable.getModel().addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent tableModelEvent) {
//                System.out.println("Row : "+InvoiceTable.getSelectedRow()+" | Column : "+InvoiceTable.getSelectedColumn()+" | Current Value : "+InvoiceTable.getValueAt(InvoiceTable.getSelectedRow(),InvoiceTable.getSelectedColumn()).toString());
            }
        });
        deleteInvoiceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) InvoiceTable.getModel();

                int[] rows = InvoiceTable.getSelectedRows();
                for(int i=0;i<rows.length;i++){
                    model.removeRow(rows[i]-i);
                }
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