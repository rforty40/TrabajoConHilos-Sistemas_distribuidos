package principal;

import clases.Cliente;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author FORTY
 */
public class frmPrincipal extends javax.swing.JFrame {

    // Objetos cliente   
    Cliente cliente1 = new Cliente("Rodrigo Paz", "contra123", "09755");
    Cliente cliente2 = new Cliente("Gabriela Cedeño", "contraseña", "02545");
    Cliente cliente3 = new Cliente("Mario Moreno", "seguraContra", "22478");

    public frmPrincipal() {
        initComponents();
        editarComponentes();
        mostrarBotones(false);

    }

    public void editarComponentes() {
        this.setTitle("Ejemplo de Threads");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        btnFinal1.setText("<html><p>Finalizar Sesión</p><p>Cliente 1</p></html>");
        btnFinal2.setText("<html><p>Finalizar Sesión</p><p>Cliente 2</p></html>");
        btnFinal3.setText("<html><p>Finalizar Sesión</p><p>Cliente 3</p></html>");
        btnIniciarMulti.setText("<html><p>Iniciar Sesiones</p><p>con Multitarea</p></html>");
        btnIniciarSinMulti.setText("<html><p>Iniciar Sesiones</p><p>sin Multitarea</p></html>");
        cliente1.setArea(txtArea1);
        cliente2.setArea(txtArea2);
        cliente3.setArea(txtArea3);
    }

    public void mostrarBotones(boolean estado) {
        btnFinal1.setVisible(estado);
        btnFinal2.setVisible(estado);
        btnFinal3.setVisible(estado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea1 = new javax.swing.JTextArea();
        btnFinal1 = new javax.swing.JButton();
        btnFinal2 = new javax.swing.JButton();
        btnFinal3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArea3 = new javax.swing.JTextArea();
        btnIniciarMulti = new javax.swing.JButton();
        btnIniciarSinMulti = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtArea1.setColumns(20);
        txtArea1.setLineWrap(true);
        txtArea1.setRows(5);
        txtArea1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtArea1);

        btnFinal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinal1ActionPerformed(evt);
            }
        });

        btnFinal2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinal2ActionPerformed(evt);
            }
        });

        btnFinal3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinal3ActionPerformed(evt);
            }
        });

        txtArea2.setColumns(20);
        txtArea2.setLineWrap(true);
        txtArea2.setRows(5);
        txtArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtArea2);

        txtArea3.setColumns(20);
        txtArea3.setLineWrap(true);
        txtArea3.setRows(5);
        txtArea3.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtArea3);

        btnIniciarMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarMultiActionPerformed(evt);
            }
        });

        btnIniciarSinMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSinMultiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnFinal1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinal2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166)
                .addComponent(btnFinal3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(btnIniciarMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(btnIniciarSinMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFinal3, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnFinal2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFinal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIniciarSinMulti, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnIniciarMulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinal1ActionPerformed
        cliente1.interrupt();
        btnFinal2.setVisible(true);
    }//GEN-LAST:event_btnFinal1ActionPerformed

    private void btnFinal2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinal2ActionPerformed
        cliente2.interrupt();
        btnFinal3.setVisible(true);
    }//GEN-LAST:event_btnFinal2ActionPerformed

    private void btnFinal3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinal3ActionPerformed
        cliente3.interrupt();
    }//GEN-LAST:event_btnFinal3ActionPerformed

    private void btnIniciarMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarMultiActionPerformed
        //System.out.println("Inicio Hilo Actual --> " + Thread.currentThread().getName());
        mostrarBotones(true);
        btnIniciarSinMulti.setEnabled(false);
        final SwingWorker worker = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                //System.out.println("Hilo en el proceso SwingWorker --> " + Thread.currentThread().getName());
                cliente1.start();
                cliente2.start();
                cliente3.start();
                return null;
            }
        };
        worker.execute();
       


    }//GEN-LAST:event_btnIniciarMultiActionPerformed

    private void btnIniciarSinMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSinMultiActionPerformed
        //System.out.println("Inicio Hilo Actual --> " + Thread.currentThread().getName());
        btnIniciarMulti.setEnabled(false);
        btnFinal1.setVisible(true);
        final SwingWorker worker = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                //System.out.println("Hilo en el proceso SwingWorker --> " + Thread.currentThread().getName());
                try {
                    cliente1.start();
                    cliente1.join();
                    cliente2.start();
                    cliente2.join();
                    cliente3.start();
                    cliente3.join();
                } catch (InterruptedException ex) {
                    JOptionPane.showMessageDialog(null, "Error en la ejecucion de los hilos --> " + "\n" + ex);
                }
                return null;
            }
        };
        //System.out.println("Final Hilo Actual --> " + Thread.currentThread().getName());
        worker.execute();
    }//GEN-LAST:event_btnIniciarSinMultiActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFinal1;
    private javax.swing.JButton btnFinal2;
    private javax.swing.JButton btnFinal3;
    private javax.swing.JButton btnIniciarMulti;
    private javax.swing.JButton btnIniciarSinMulti;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtArea1;
    private javax.swing.JTextArea txtArea2;
    private javax.swing.JTextArea txtArea3;
    // End of variables declaration//GEN-END:variables
}
