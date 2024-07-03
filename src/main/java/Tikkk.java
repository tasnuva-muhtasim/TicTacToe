
import javax.swing.JOptionPane;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class Tikkk extends javax.swing.JFrame {

    int clicked = 0;
    boolean j1b = true;
    boolean j2b = true;
    boolean j3b = true;
    boolean j4b = true;
    boolean j5b = true;
    boolean j6b = true;
    boolean j7b = true;
    boolean j8b = true;
    boolean j9b = true;

    public Tikkk() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        j2 = new javax.swing.JButton();
        j1 = new javax.swing.JButton();
        j3 = new javax.swing.JButton();
        j4 = new javax.swing.JButton();
        j5 = new javax.swing.JButton();
        j6 = new javax.swing.JButton();
        j7 = new javax.swing.JButton();
        j8 = new javax.swing.JButton();
        j9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        j2.setFont(new java.awt.Font("SansSerif", 3, 48)); // NOI18N
        j2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j2MouseClicked(evt);
            }
        });
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });
        getContentPane().add(j2);
        j2.setBounds(117, 72, 101, 101);

        j1.setFont(new java.awt.Font("SansSerif", 3, 48)); // NOI18N
        j1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j1MouseClicked(evt);
            }
        });
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });
        getContentPane().add(j1);
        j1.setBounds(6, 72, 105, 101);

        j3.setFont(new java.awt.Font("SansSerif", 3, 48)); // NOI18N
        j3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j3MouseClicked(evt);
            }
        });
        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });
        getContentPane().add(j3);
        j3.setBounds(224, 72, 106, 101);

        j4.setFont(new java.awt.Font("SansSerif", 3, 48)); // NOI18N
        j4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j4MouseClicked(evt);
            }
        });
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });
        getContentPane().add(j4);
        j4.setBounds(6, 179, 105, 101);

        j5.setFont(new java.awt.Font("SansSerif", 3, 48)); // NOI18N
        j5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j5MouseClicked(evt);
            }
        });
        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });
        getContentPane().add(j5);
        j5.setBounds(117, 179, 101, 101);

        j6.setFont(new java.awt.Font("SansSerif", 3, 48)); // NOI18N
        j6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j6MouseClicked(evt);
            }
        });
        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });
        getContentPane().add(j6);
        j6.setBounds(224, 179, 106, 101);

        j7.setFont(new java.awt.Font("SansSerif", 3, 48)); // NOI18N
        j7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j7MouseClicked(evt);
            }
        });
        getContentPane().add(j7);
        j7.setBounds(6, 286, 105, 101);

        j8.setFont(new java.awt.Font("SansSerif", 3, 48)); // NOI18N
        j8.setToolTipText("");
        j8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j8MouseClicked(evt);
            }
        });
        j8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j8ActionPerformed(evt);
            }
        });
        getContentPane().add(j8);
        j8.setBounds(117, 286, 101, 101);

        j9.setFont(new java.awt.Font("SansSerif", 3, 48)); // NOI18N
        j9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j9MouseClicked(evt);
            }
        });
        j9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9ActionPerformed(evt);
            }
        });
        getContentPane().add(j9);
        j9.setBounds(224, 286, 106, 101);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 0));
        jLabel2.setText("Tic-Tac-Toe");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 20, 206, 33);

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        setBounds(0, 0, 352, 458);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j1ActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j2ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j3ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j4ActionPerformed

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j5ActionPerformed

    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j6ActionPerformed

    private void j9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j9ActionPerformed

    private void j1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j1MouseClicked
        if (j1b) {
            clicked++;
            if (clicked % 2 == 0) {
                j1.setLabel("O");
                j1.setEnabled(false);
                j1b = false;
            } else {
                j1.setLabel("X");
                j1.setEnabled(false);
                j1b = false;
            }
        }
        checkwinner();
    }//GEN-LAST:event_j1MouseClicked

    private void j2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2MouseClicked
        if (j2b) {
            clicked++;
            if (clicked % 2 == 0) {
                j2.setLabel("O");
                j2.setEnabled(false);
                j2b = false;
            } else {
                j2.setLabel("X");
                j2.setEnabled(false);
                j2b = false;
            }
        }
        checkwinner();
    }//GEN-LAST:event_j2MouseClicked

    private void j3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j3MouseClicked
        if (j3b) {
            clicked++;
            if (clicked % 2 == 0) {
                j3.setLabel("O");
                j3.setEnabled(false);
                j3b = false;
            } else {
                j3.setLabel("X");
                j3.setEnabled(false);
                j3b = false;
            }
        }
        checkwinner();
    }//GEN-LAST:event_j3MouseClicked

    private void j4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j4MouseClicked
        if (j4b) {
            clicked++;
            if (clicked % 2 == 0) {
                j4.setLabel("O");
                j4.setEnabled(false);
                j4b = false;
            } else {
                j4.setLabel("X");
                j4.setEnabled(false);
                j4b = false;
            }
        }
        checkwinner();
    }//GEN-LAST:event_j4MouseClicked

    private void j5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j5MouseClicked
        if (j5b) {
            clicked++;
            if (clicked % 2 == 0) {
                j5.setLabel("O");
                j5.setEnabled(false);
                j5b = false;
            } else {
                j5.setLabel("X");
                j5.setEnabled(false);
                j5b = false;
            }
        }
        checkwinner();
    }//GEN-LAST:event_j5MouseClicked

    private void j6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j6MouseClicked
        if (j6b) {
            clicked++;
            if (clicked % 2 == 0) {
                j6.setLabel("O");
                j6.setEnabled(false);
                j6b = false;
            } else {
                j6.setLabel("X");
                j6.setEnabled(false);
                j6b = false;
            }
        }
        checkwinner();
    }//GEN-LAST:event_j6MouseClicked

    private void j7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j7MouseClicked
        if (j7b) {
            clicked++;
            if (clicked % 2 == 0) {
                j7.setLabel("O");
                j7.setEnabled(false);
                j7b = false;
            } else {
                j7.setLabel("X");
                j7.setEnabled(false);
                j7b = false;
            }
        }
        checkwinner();
    }//GEN-LAST:event_j7MouseClicked

    private void j8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j8MouseClicked
        if (j8b) {
            clicked++;
            if (clicked % 2 == 0) {
                j8.setLabel("O");
                j8.setEnabled(false);
                j8b = false;
            } else {
                j8.setLabel("X");
                j8.setEnabled(false);
                j8b = false;
            }

        }
        checkwinner();
    }//GEN-LAST:event_j8MouseClicked

    private void j9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j9MouseClicked
        if (j9b) {
            clicked++;
            if (clicked % 2 == 0) {
                j9.setLabel("O");
                j9.setEnabled(false);
                j9b = false;
            } else {
                j9.setLabel("X");
                j9.setEnabled(false);
                j9b = false;
            }
        }
        checkwinner();
    }//GEN-LAST:event_j9MouseClicked
    void checkwinner() {
        if ((j1b == false) && (j1.getText().equals(j2.getText())) && (j2.getText().equals(j3.getText()))) {
            String value = j1.getText();
            JOptionPane.showMessageDialog(null, value + " is the winner!");
            
        } else if ((j4b == false) && (j4.getText().equals(j5.getText())) && (j5.getText().equals(j6.getText()))) {
            String value = j4.getText();
            JOptionPane.showMessageDialog(null, value + " is the winner!");
        } else if ((j7b == false) && (j7.getText().equals(j8.getText())) && (j8.getText().equals(j9.getText()))) {
            String value = j7.getText();
            JOptionPane.showMessageDialog(null, value + " is the winner!");
        } else if ((j1b == false) && (j1.getText().equals(j5.getText())) && (j5.getText().equals(j9.getText()))) {
            String value = j1.getText();
            JOptionPane.showMessageDialog(null, value + " is the winner!");
        } else if ((j2b == false) && (j2.getText().equals(j5.getText())) && (j5.getText().equals(j8.getText()))) {
            String value = j2.getText();
            JOptionPane.showMessageDialog(null, value + " is the winner!");
        } else if ((j1b == false) && (j1.getText().equals(j4.getText())) && (j4.getText().equals(j7.getText()))) {
            String value = j1.getText();
            JOptionPane.showMessageDialog(null, value + " is the winner!");
        } else if ((j3b == false) && (j3.getText().equals(j6.getText())) && (j6.getText().equals(j9.getText()))) {
            String value = j3.getText();
            JOptionPane.showMessageDialog(null, value + " is the winner!");
        } else if ((j3b == false) && (j3.getText().equals(j5.getText())) && (j5.getText().equals(j7.getText()))) {
            String value = j3.getText();
            JOptionPane.showMessageDialog(null, value + " is the winner!");
        } else if (j1b == false && j2b == false && j3b == false && j4b == false && j5b == false && j6b == false
                && j7b == false && j8b == false && j9b == false) {

            JOptionPane.showMessageDialog(null, "It is Draw!");

        }

    }
    private void j8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j8ActionPerformed

    }//GEN-LAST:event_j8ActionPerformed

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
            java.util.logging.Logger.getLogger(Tikkk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tikkk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tikkk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tikkk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tikkk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton j1;
    private javax.swing.JButton j2;
    private javax.swing.JButton j3;
    private javax.swing.JButton j4;
    private javax.swing.JButton j5;
    private javax.swing.JButton j6;
    private javax.swing.JButton j7;
    private javax.swing.JButton j8;
    private javax.swing.JButton j9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
