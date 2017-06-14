/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import javax.swing.JOptionPane;

/**
 *
 * @author Leo
 */
public class TelaLogado extends javax.swing.JFrame {

    private TelaLogin parent;
    private int idC;
    private Banco banco;

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public TelaLogin getParent() {
        return parent;
    }

    public void setParent(TelaLogin parent) {
        this.parent = parent;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    /**
     * Creates new form TelaLogado
     */
    public TelaLogado() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        transferirBtn = new javax.swing.JButton();
        depositoBtn = new javax.swing.JButton();
        sacarBtn = new javax.swing.JButton();
        saldoBtn = new javax.swing.JButton();
        saqueValor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        depositoValor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        transferenciaId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        transferenciaValor = new javax.swing.JTextField();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Aplicação Banco - LOGADO");
        setResizable(false);

        jLabel1.setText("Opcoes");

        jLabel2.setText("Saque:");

        jLabel3.setText("Deposito:");

        jLabel4.setText("Transferencia:");

        jLabel5.setText("Saldo:");

        transferirBtn.setText("Transferir");
        transferirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferirBtnActionPerformed(evt);
            }
        });

        depositoBtn.setText("Depositar");
        depositoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositoBtnActionPerformed(evt);
            }
        });

        sacarBtn.setText("Sacar");
        sacarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sacarBtnActionPerformed(evt);
            }
        });

        saldoBtn.setText("Verificar");
        saldoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoBtnActionPerformed(evt);
            }
        });

        saqueValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saqueValorActionPerformed(evt);
            }
        });

        jLabel7.setText("Valor:");

        jLabel9.setText("Valor:");

        depositoValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositoValorActionPerformed(evt);
            }
        });

        jLabel10.setText("IdConta Destino:");

        transferenciaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferenciaIdActionPerformed(evt);
            }
        });

        jLabel11.setText("Valor:");

        transferenciaValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferenciaValorActionPerformed(evt);
            }
        });

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depositoValor, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(saqueValor))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(depositoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(sacarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(transferenciaId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transferenciaValor, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(transferirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saldoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logout)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(saqueValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sacarBtn))
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(depositoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depositoBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(transferenciaValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(transferirBtn)
                            .addComponent(transferenciaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saldoBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sacarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sacarBtnActionPerformed
        int i=0;
        int valor;
        valor=Integer.parseInt(this.saqueValor.getText());
        if(valor<=0){
            JOptionPane.showMessageDialog(null, "Não pode ser realizado saques negativos!", "InfoBox: " + "Erro", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(this.banco.saque(this.idC,valor)){
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!", "InfoBox: " + "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para realizar o saque", "InfoBox: " + "Falha", JOptionPane.INFORMATION_MESSAGE);
        }
    }

  
    private void depositoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositoBtnActionPerformed
        int i=0;
        while(i<1000){
            try{
                int valor;
                valor=Integer.parseInt(this.depositoValor.getText());
                if(valor<=0){
                    JOptionPane.showMessageDialog(null, "Não pode ser realizado deposito negativo!", "InfoBox: " + "Erro", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                if(this.banco.depositar(this.idC,valor)){
                    JOptionPane.showMessageDialog(null, "Deposito realizado com sucesso!", "InfoBox: " + "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null, "Conta inexistente", "InfoBox: " + "Falha", JOptionPane.INFORMATION_MESSAGE);
                }
                return;
            }
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "O deve conter somente numeros!", "InfoBox: " + "Erro tipos", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
        }
    }//GEN-LAST:event_depositoBtnActionPerformed

    private void transferirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferirBtnActionPerformed
        int i=0;
            int valor,destino;
             destino=Integer.parseInt(this.transferenciaId.getText());
             valor=Integer.parseInt(this.transferenciaValor.getText());
             if(valor<=0 || destino<=0){
                 JOptionPane.showMessageDialog(null, "Não pode conter valores negativos!", "InfoBox: " + "Erro", JOptionPane.INFORMATION_MESSAGE);
                 return;
             }
             if(this.banco.transferencia(this.idC,destino,valor)){
                 JOptionPane.showMessageDialog(null, "Transferencia realizada com sucesso!", "InfoBox: " + "Sucesso", JOptionPane.INFORMATION_MESSAGE);
             }else{
                 JOptionPane.showMessageDialog(null, "A transferencia nao pode ser realizada", "InfoBox: " + "Falha", JOptionPane.INFORMATION_MESSAGE);
             }
             return;
    }
    
    private void saldoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoBtnActionPerformed
        int i=0;
            int valor,destino;
            String saldo;
            saldo=this.banco.saldo(this.idC);
            JOptionPane.showMessageDialog(null, "Seu saldo: R$"+saldo, "InfoBox: " + "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
        
    private void transferenciaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferenciaIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transferenciaIdActionPerformed

    private void transferenciaValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferenciaValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_transferenciaValorActionPerformed

    private void depositoValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositoValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depositoValorActionPerformed

    private void saqueValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saqueValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saqueValorActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        this.saqueValor.setText("");
        this.depositoValor.setText("");
        this.transferenciaValor.setText("");
        this.transferenciaId.setText("");
        this.parent.setIdC(-1);
        this.parent.setSenha(-1);
        this.parent.setIdContaText("");
        this.parent.setSenhaText("");
        this.parent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositoBtn;
    private javax.swing.JTextField depositoValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton logout;
    private javax.swing.JButton sacarBtn;
    private javax.swing.JButton saldoBtn;
    private javax.swing.JTextField saqueValor;
    private javax.swing.JTextField transferenciaId;
    private javax.swing.JTextField transferenciaValor;
    private javax.swing.JButton transferirBtn;
    // End of variables declaration//GEN-END:variables
}
