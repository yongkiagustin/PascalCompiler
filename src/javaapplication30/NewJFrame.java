/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication30;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;

/**
 *
 * @author Young
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt_scan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_outputTextVar = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_inputText = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_outputOp = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        bt_clear = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta_outputidentifier = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_scan.setText("SCAN");
        bt_scan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_scanActionPerformed(evt);
            }
        });

        ta_outputTextVar.setEditable(false);
        ta_outputTextVar.setColumns(20);
        ta_outputTextVar.setRows(5);
        jScrollPane1.setViewportView(ta_outputTextVar);

        ta_inputText.setColumns(20);
        ta_inputText.setRows(5);
        jScrollPane2.setViewportView(ta_inputText);

        jLabel1.setText("Source Code Pascal");

        jLabel2.setText("Variable");

        ta_outputOp.setEditable(false);
        ta_outputOp.setColumns(20);
        ta_outputOp.setRows(5);
        jScrollPane3.setViewportView(ta_outputOp);

        jLabel3.setText("Operator");

        bt_clear.setText("CLEAR ALL");
        bt_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clearActionPerformed(evt);
            }
        });

        ta_outputidentifier.setEditable(false);
        ta_outputidentifier.setColumns(20);
        ta_outputidentifier.setRows(5);
        jScrollPane4.setViewportView(ta_outputidentifier);

        jLabel4.setText("Operator");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_scan, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(jLabel1)
                            .addGap(181, 181, 181))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addGap(248, 248, 248)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane4))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_clear, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(bt_scan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(515, 515, 515))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 807, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public String penampungTextOperator = "";
    public String penampungTextIdentifier = "";
//variable = diluar identifier & operator

    private void CountOperator() {
        String inputText = ta_inputText.getText();
        StringTokenizer st = new StringTokenizer(";,:=,+,-,*,/, div , mod , =,<>,>,<,<=,>=, and , or , xor , not ,shl,shr,<<,>>,include,exclude,in,@,^", ",");
        int c = st.countTokens();

        for (int i = 1; i <= c; i++) {
            while (st.hasMoreTokens()) {
                String s = st.nextToken();
                int count1 = 0, fromIndex1 = 0;
                while ((fromIndex1 = inputText.indexOf(s, fromIndex1)) != -1) {
                    count1++;
                    fromIndex1++;
                }

                if (count1 > 0) {
                    penampungTextOperator += "Operator " + s + " berjumlah: " + count1 + "\n";
                }
            }

        }

        //hitung operator
//        final String op = ";,:=,+,-,*,/,div,mod,=,<>,>,<,<=,>=,and,or,xor,not,shl,shr,<<,>>,include,exclude,in,@,^";
//        String[] tokens = op.split("[,\\ ]");
//        for (String token : tokens) {
//            int count1 = 0, fromIndex1 = 0;
//            while ((fromIndex1 = inputText.indexOf(token, fromIndex1)) != -1) {
//                count1++;
//                fromIndex1++;
//            }
//
//            if (count1 > 0) {
//                penampungTextOperator += "Operator " + token + " berjumlah: " + count1 + "\n";
//            }
//
//        }
    }

    private void CountIdentifier() {
        String inputText = ta_inputText.getText();
        //hitung dientifier
        final String op = "and,array,asm,begin,break,case,const,constructor,continue,destructor,div,do,downto,else,end,false,file,for,function,goto,if,implementation,in,inline,interface,label,mod,nil,not,object,of,on,operator,or,packed,procedure,program,record,repeat,set,shl,shr,string,then,to,true,type,unit,until,uses,var,while,with,xor";
        String[] tokens = op.split("[,\\ ]");
        for (String token : tokens) {
            int count1 = 0, fromIndex1 = 0;
            while ((fromIndex1 = inputText.indexOf(token, fromIndex1)) != -1) {
                count1++;
                fromIndex1++;
            }

            if (count1 > 0) {
                penampungTextIdentifier += "Identifier " + token + " berjumlah: " + count1 + "\n";
            }

        }
    }
    private void bt_scanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_scanActionPerformed
        CountOperator();
        CountIdentifier();
        ta_outputOp.setText(penampungTextOperator);
        ta_outputidentifier.setText(penampungTextIdentifier);
//            int jumlah = 0;
//            int indeks;
//            indeks = teks.indexOf(inputText);
//            while (indeks >= 0) {
//                ++jumlah;
//                indeks += inputText.length();
//                indeks = teks.indexOf(inputText, indeks);
//            }
//            System.out.println("Teks berisi kata " + teks + " sebanyak " + jumlah + ".");
//        StringTokenizer st = new StringTokenizer(inputText);
//        while (st.hasMoreTokens()) {
//            penampung += st.nextToken();
//            penampung += "\n";
//        }
//        ta_outputTextVar.setText(penampung);
//        //fungsi menghitung baris
//        Matcher m = Pattern.compile("\r\n|\r|\n").matcher(inputText);
//        int lines = 1;
//        while (m.find()) {
//            lines++;
//        }
//        ta_outputTextVar.setText(Integer.toString(lines));
    }//GEN-LAST:event_bt_scanActionPerformed

    private void bt_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clearActionPerformed
        penampungTextOperator = "";
        ta_outputOp.setText(null);
        ta_inputText.setText(null);
        ta_outputTextVar.setText(null);

    }//GEN-LAST:event_bt_clearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_clear;
    private javax.swing.JButton bt_scan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea ta_inputText;
    private javax.swing.JTextArea ta_outputOp;
    private javax.swing.JTextArea ta_outputTextVar;
    private javax.swing.JTextArea ta_outputidentifier;
    // End of variables declaration//GEN-END:variables
}
