
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author laur1290
 */
public class TaskManager extends javax.swing.JFrame {

    /**
     * Creates new form TaskManager
     */
    ArrayList list;
    ListIterator li;
    int curtask, tottask;
    Task t;

    public TaskManager(String n, String d) {
        initComponents();
        list = new ArrayList();
        li = list.listIterator();
        curtask = 0;
        tottask = 0;

        li.add(new Task("Homework", "Math, pages 12-19"));
        li.add(new Task("Groceries", "Bread, Milk, Eggs"));
        li.add(new Task("Chores", "Laundry, Clean Driveway"));
        while (li.hasPrevious()) {
            t = (Task) li.previous();
        }

        curtask = 1;
        tottask = 3;
        txtcurrent.setText("" + curtask);
        txttotal.setText("" + tottask);
        txtname.setText(t.getName());
        txtdescription.setText(t.getDescription());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescription = new javax.swing.JTextArea();
        txtname = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtcurrent = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnfirst = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnend = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnushowall = new javax.swing.JMenuItem();
        mnuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnureplace = new javax.swing.JMenuItem();
        mnuremove = new javax.swing.JMenuItem();
        mnurestore = new javax.swing.JMenuItem();
        mnuclear = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnubefore = new javax.swing.JMenuItem();
        mnuafter = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("Description:");

        txtdescription.setColumns(20);
        txtdescription.setRows(5);
        jScrollPane1.setViewportView(txtdescription);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("Current Task");

        txtcurrent.setText("                   ");
        txtcurrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcurrentActionPerformed(evt);
            }
        });

        jLabel4.setText("Total Tasks");

        txttotal.setText("                   ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtcurrent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnfirst.setText("|<");
        btnfirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirstActionPerformed(evt);
            }
        });

        btnprev.setText("<");
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnend.setText(">|");
        btnend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnendActionPerformed(evt);
            }
        });

        btnnext.setText(">");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnfirst)
                .addGap(45, 45, 45)
                .addComponent(btnprev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnnext)
                .addGap(44, 44, 44)
                .addComponent(btnend)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnfirst)
                    .addComponent(btnprev)
                    .addComponent(btnend)
                    .addComponent(btnnext))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Program");

        mnushowall.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnushowall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all-2.png"))); // NOI18N
        mnushowall.setText("Show All Tasks");
        mnushowall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnushowallActionPerformed(evt);
            }
        });
        jMenu1.add(mnushowall);

        mnuexit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        mnuexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnureplace.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_MASK));
        mnureplace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/replace-3.png"))); // NOI18N
        mnureplace.setText("Replace This as Current Task");
        mnureplace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnureplaceActionPerformed(evt);
            }
        });
        jMenu2.add(mnureplace);

        mnuremove.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        mnuremove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        mnuremove.setText("Remove Current Task");
        mnuremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuremoveActionPerformed(evt);
            }
        });
        jMenu2.add(mnuremove);

        mnurestore.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        mnurestore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/restore.png"))); // NOI18N
        mnurestore.setText("Restore Current Task to Screen");
        mnurestore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnurestoreActionPerformed(evt);
            }
        });
        jMenu2.add(mnurestore);

        mnuclear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        mnuclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eraser.png"))); // NOI18N
        mnuclear.setText("Clear Screen");
        mnuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuclear);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Insert");

        mnubefore.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK));
        mnubefore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/before.png"))); // NOI18N
        mnubefore.setText("Before Current Task");
        mnubefore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnubeforeActionPerformed(evt);
            }
        });
        jMenu3.add(mnubefore);

        mnuafter.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        mnuafter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/after.png"))); // NOI18N
        mnuafter.setText("After Current Task");
        mnuafter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuafterActionPerformed(evt);
            }
        });
        jMenu3.add(mnuafter);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtname))
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuafterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuafterActionPerformed
        // TODO add your handling code here:
        String nm = txtname.getText();//read in for from screen
        String d = txtdescription.getText();
        Task t = new Task(nm, d);
        if (t.validate() == false) {
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
            return;
        }
        if (tottask > 0) {
            li.next();
        }

        li.add(t);
        li.previous();
        curtask++;
        tottask++;
        txttotal.setText("" + tottask);
        txtcurrent.setText("" + curtask);
        JOptionPane.showMessageDialog(this, "Task Added");
    }//GEN-LAST:event_mnuafterActionPerformed

    private void txtcurrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcurrentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcurrentActionPerformed

    private void btnendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnendActionPerformed
        // TODO add your handling code here:
        if (curtask == tottask) {
            return;
        }
        while (li.hasNext()) {
            li.next();
        }
        t = (Task) li.previous();
        curtask = tottask;

        txtcurrent.setText("" + curtask);
        txtname.setText(t.getName());
        txtdescription.setText(t.getDescription());
    }//GEN-LAST:event_btnendActionPerformed

    private void mnushowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnushowallActionPerformed
        // TODO add your handling code here:
        String result = "";
        for (int x = 0; x < list.size(); x++) {
            t = (Task) list.get(x);
            result += "TASK " + (x + 1) + ":\n" + t.toString() + "\n";
        }
        JOptionPane.showMessageDialog(this, result);
    }//GEN-LAST:event_mnushowallActionPerformed

    private void mnurestoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnurestoreActionPerformed
        // TODO add your handling code here:
        li.next();
        t = (Task) li.previous();
        txtcurrent.setText("" + curtask);
        txtname.setText(t.getName());
        txtdescription.setText(t.getDescription());

    }//GEN-LAST:event_mnurestoreActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        if (curtask == tottask) {
            return;
        }
        li.next();
        li.next();
        t = (Task) li.previous();
        curtask++;
        txtcurrent.setText("" + curtask);
        txtname.setText(t.getName());
        txtdescription.setText(t.getDescription());
    }//GEN-LAST:event_btnnextActionPerformed

    private void mnureplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnureplaceActionPerformed
        // TODO add your handling code here:       
        String nm = txtname.getText();//read in for from screen
        String d = txtdescription.getText();
        Task t = new Task(nm, d);
        if (t.validate() == false) {
            JOptionPane.showMessageDialog(this, "Error - Must have information to replace");
            return;
        }
        if (t.validate()) {
            li.next();
            li.set(t);
            t = (Task) li.previous();
        }

    }//GEN-LAST:event_mnureplaceActionPerformed

    private void mnuremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuremoveActionPerformed
        // TODO add your handling code here:
        if (tottask == 0) {
            return;
        }

        li.next();
        li.remove();
        tottask--;

        if (tottask == 0) {
            curtask = 0;
            txtcurrent.setText("" + curtask);
            txtname.setText("");
            txtdescription.setText("");
        } else if (tottask == 1) {
            if (li.hasNext()) {
                li.next();
                t = (Task) li.previous();
            } else if (li.hasPrevious()) {
                li.previous();
                t = (Task) li.next();
            }
        } else {
            if (curtask > 1) {
                curtask--;
                t = (Task) li.previous();
            } else {
                t = (Task) li.next();
                li.previous();
            }
        }
        txtcurrent.setText("" + curtask);
        txtname.setText(t.getName());
        txtdescription.setText(t.getDescription());
        txttotal.setText("" + tottask);


    }//GEN-LAST:event_mnuremoveActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        // TODO add your handling code here:
        //li.previous();    
        if (curtask == 1) {
            return;
        }
        t = (Task) li.previous();
        curtask--;
        txtcurrent.setText("" + curtask);
        txtname.setText(t.getName());
        txtdescription.setText(t.getDescription());
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnfirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirstActionPerformed
        // TODO add your handling code here:
        if (curtask == 1) {
            return;
        }
        while (li.hasPrevious()) {
            t = (Task) li.previous();
        }
        curtask = 1;

        txtcurrent.setText("" + curtask);
        txtname.setText(t.getName());
        txtdescription.setText(t.getDescription());
    }//GEN-LAST:event_btnfirstActionPerformed

    private void mnubeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnubeforeActionPerformed
        // TODO add your handling code here:
        String nm = txtname.getText();//read in for from screen
        String d = txtdescription.getText();
        Task t = new Task(nm, d);
        if (t.validate() == false) {
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
            return;
        }

        li.add(t);
        t = (Task) li.previous();
        tottask++;
        txttotal.setText("" + tottask);
        txtcurrent.setText("" + curtask);
        JOptionPane.showMessageDialog(this, "Task Added");
    }//GEN-LAST:event_mnubeforeActionPerformed

    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        // TODO add your handling code here:
        txtname.setText("");
        txtdescription.setText("");
    }//GEN-LAST:event_mnuclearActionPerformed

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

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
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskManager("", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnend;
    private javax.swing.JButton btnfirst;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnuafter;
    private javax.swing.JMenuItem mnubefore;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnuremove;
    private javax.swing.JMenuItem mnureplace;
    private javax.swing.JMenuItem mnurestore;
    private javax.swing.JMenuItem mnushowall;
    private javax.swing.JTextField txtcurrent;
    private javax.swing.JTextArea txtdescription;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}