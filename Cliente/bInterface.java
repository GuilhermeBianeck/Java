package Cliente;

import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eu
 */
public class bInterface extends javax.swing.JFrame {

    private  String idC="",senha="";
    private ClienteGUI parent;
    private int controle=4;
    private Timer timer;
    private Conta conta=null;
    
    Banco banco;

    public int getIdC() {
        return Integer.parseInt(this.idC);
    }

    public void setIdC(String idC) {
        this.idC = idC;
    }

    public int getSenha() {
        return Integer.parseInt(this.senha);
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    @Override
    public ClienteGUI getParent() {
        return parent;
    }

    public void setParent(ClienteGUI parent) {
        this.parent = parent;
    }
 
    
    /**
     * Creates new form bInterface
     */
    public bInterface() {
        initComponents();
    }
    

    public void reiniciaJanela(){
        this.jLabel3.setText("Bem Vindo!");
        this.jLabel4.setText("Porfavor entre com o numero da conta: ");
        this.jLabel5.setText("Porfavor entre com a senha: ");
        this.jLabel6.setText("");
        this.jLabel7.setText("");
        this.jLabel8.setText("");
        this.jLabel9.setText("");
        this.jLabel10.setText("");
        this.idC="";
        this.senha="";
        this.controle=4;
        this.conta=null;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonEnter = new javax.swing.JButton();
        depositMoney = new javax.swing.JButton();
        withdrawMoney = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jButton1.setText("1");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setText("2");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jButton2, gridBagConstraints);

        jButton3.setText("3");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jButton3, gridBagConstraints);

        jButton4.setText("4");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jButton4, gridBagConstraints);

        jButton5.setText("5");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jButton5, gridBagConstraints);

        jButton6.setText("6");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jButton6, gridBagConstraints);

        jButton7.setText("7");
        jButton7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jButton7, gridBagConstraints);

        jButton8.setText("8");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jButton8, gridBagConstraints);

        jButton9.setText("9");
        jButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jButton9, gridBagConstraints);

        jButton0.setText("0");
        jButton0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jButton0, gridBagConstraints);

        jButtonEnter.setText("ENTER");
        jButtonEnter.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButtonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jButtonEnter, gridBagConstraints);

        depositMoney.setText("---------------");
        depositMoney.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "DEPOSITE O ENVELOPE AQUI"));
        depositMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositMoneyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(depositMoney, gridBagConstraints);

        withdrawMoney.setText("---------------");
        withdrawMoney.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "RETIRE SEU DINHEIRO AQUI"));
        withdrawMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawMoneyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(withdrawMoney, gridBagConstraints);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CAIXA ELETRÔNICO");
        jLabel2.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jLabel2, gridBagConstraints);

        jButton10.setText("CANCELAR");
        jButton10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.weightx = 0.4;
        gridBagConstraints.weighty = 0.2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        getContentPane().add(jButton10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel3, gridBagConstraints);
        jLabel3.getAccessibleContext().setAccessibleName("Texto1");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel4, gridBagConstraints);
        jLabel4.getAccessibleContext().setAccessibleName("Texto2");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel5, gridBagConstraints);
        jLabel5.getAccessibleContext().setAccessibleName("Texto3");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel6, gridBagConstraints);
        jLabel6.getAccessibleContext().setAccessibleName("Texto4");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel7, gridBagConstraints);
        jLabel7.getAccessibleContext().setAccessibleName("Texto5");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel8, gridBagConstraints);
        jLabel8.getAccessibleContext().setAccessibleName("Texto6");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel9, gridBagConstraints);
        jLabel9.getAccessibleContext().setAccessibleName("Texto7");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        getContentPane().add(jLabel10, gridBagConstraints);
        jLabel10.getAccessibleContext().setAccessibleName("Texto8");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jScrollPane2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void withdrawMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawMoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_withdrawMoneyActionPerformed

    private void depositMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositMoneyActionPerformed
        // TODO add your handling code here:
        this.timer.stop();
        if(controle==80){
            controle=-1;
            this.jLabel3.setText("");
            this.jLabel4.setText("Depósito realizado com sucesso !!!");
            this.jLabel5.setText("");
            this.jLabel6.setText("Pressione enter para continuar:");
            try {
                this.banco.depositar(Integer.parseInt(this.idC), Double.parseDouble(this.jLabel4.getText()));

            } catch (FileNotFoundException ex) {
                Logger.getLogger(bInterface.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedEncodingException ex) {
             Logger.getLogger(bInterface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_depositMoneyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(controle==4){
            String captura=this.jLabel4.getText();
            captura+="1";
            this.idC+="1";
            this.jLabel4.setText(captura);
        }else if(controle==5){
            String captura=this.jLabel5.getText();
            captura+="*";
            this.senha+="1";
            this.jLabel5.setText(captura);
        }else if(controle==8){
            //VER SALDO (this.banco.verificaSenha(Integer.parseInt(this.idC),Integer.parseInt(this.senha)))
            this.jLabel3.setText("Consulta de saldo.");
            this.jLabel4.setText("");
            
            String texto="Seu saldo é de: "+Double.parseDouble(this.banco.saldo(Integer.parseInt(this.idC)));
            this.jLabel5.setText(texto);
            this.jLabel6.setText("");
            this.jLabel7.setText("");
            this.jLabel8.setText("");
            controle=-1;
            
        }else if(controle==80){
            String captura=this.jLabel4.getText();
            captura+="1";
            this.jLabel4.setText(captura);
        }else if(controle==82){
            String captura=this.jLabel4.getText();
            captura+="1";
            this.jLabel4.setText(captura);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(controle==4){
            String captura=this.jLabel4.getText();
            captura+="2";
            this.idC+="2";
            this.jLabel4.setText(captura);
        }else if(controle==5){
            String captura=this.jLabel5.getText();
            captura+="*";
            this.senha+="2";
            this.jLabel5.setText(captura);
        }else if(controle==8){
            //Depositar dinheiro
            
            this.jLabel4.setText("");
            this.jLabel5.setText("");
            this.jLabel6.setText("");
            this.jLabel7.setText("");
            this.jLabel3.setText("Valor a ser depositado: ");
            this.controle=80;
        }else if(controle==80){
            String captura=this.jLabel4.getText();
            captura+="2";
            this.jLabel4.setText(captura);
        }else if(controle==82){
            String captura=this.jLabel4.getText();
            captura+="2";
            this.jLabel4.setText(captura);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    ActionListener suaActionListener = new ActionListener() {  
        public void actionPerformed(java.awt.event.ActionEvent e) {    
               System.out.println("Comi gostoso a professora");
///Aqui dentro vai o codigo que trocara as imagens que voce quiser de acordo com o tempo passado pelo timer que neste caso e de 1 segundo
    }};
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(controle==4){
            String captura=this.jLabel4.getText();
            captura+="3";
            this.idC+="3";
            this.jLabel4.setText(captura);
        }else if(controle==5){
            String captura=this.jLabel5.getText();
            captura+="*";
            this.senha+="3";
            this.jLabel5.setText(captura);
        }else if(controle==8){
            //Sacar dinheiro
            this.jLabel4.setText("");
            this.jLabel5.setText("");
            this.jLabel6.setText("");
            this.jLabel7.setText("");
            this.jLabel3.setText("Valor a ser sacado: ");
            this.controle=82;
            
        }else if(controle==82){
            String captura=this.jLabel4.getText();
            captura+="3";
            this.jLabel4.setText(captura);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       if(controle==4){
            String captura=this.jLabel4.getText();
            captura+="4";
            this.idC+="4";
            this.jLabel4.setText(captura);
        }else if(controle==5){
            String captura=this.jLabel5.getText();
            captura+="*";
            this.senha+="4";
            this.jLabel5.setText(captura);
        }else if(controle==80){
            String captura=this.jLabel4.getText();
            captura+="4";
            this.jLabel4.setText(captura);
        }else if(controle==82){
            String captura=this.jLabel4.getText();
            captura+="4";
            this.jLabel4.setText(captura);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       if(controle==4){
            String captura=this.jLabel4.getText();
            captura+="5";
            this.idC+="5";
            this.jLabel4.setText(captura);
        }else if(controle==5){
            String captura=this.jLabel5.getText();
            captura+="*";
            this.senha+="5";
            this.jLabel5.setText(captura);
        }else if(controle==80){
            String captura=this.jLabel4.getText();
            captura+="5";
            this.jLabel4.setText(captura);
        }else if(controle==82){
            String captura=this.jLabel4.getText();
            captura+="5";
            this.jLabel4.setText(captura);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(controle==4){
            String captura=this.jLabel4.getText();
            captura+="6";
            this.idC+="6";
            this.jLabel4.setText(captura);
        }else if(controle==5){
            String captura=this.jLabel5.getText();
            captura+="*";
            this.senha+="6";
            this.jLabel5.setText(captura);
        }else if(controle==80){
            String captura=this.jLabel4.getText();
            captura+="6";
            this.jLabel4.setText(captura);
        }else if(controle==82){
            String captura=this.jLabel4.getText();
            captura+="6";
            this.jLabel4.setText(captura);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       if(controle==4){
            String captura=this.jLabel4.getText();
            captura+="7";
            this.idC+="7";
            this.jLabel4.setText(captura);
        }else if(controle==5){
            String captura=this.jLabel5.getText();
            captura+="*";
            this.senha+="7";
            this.jLabel5.setText(captura);
        }else if(controle==80){
            String captura=this.jLabel4.getText();
            captura+="7";
            this.jLabel4.setText(captura);
        }else if(controle==82){
            String captura=this.jLabel4.getText();
            captura+="7";
            this.jLabel4.setText(captura);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       if(controle==4){
            String captura=this.jLabel4.getText();
            captura+="8";
            this.idC+="8";
            this.jLabel4.setText(captura);
        }else if(controle==5){
            String captura=this.jLabel5.getText();
            captura+="*";
            this.senha+="8";
            this.jLabel5.setText(captura);
        }else if(controle==80){
            String captura=this.jLabel4.getText();
            captura+="8";
            this.jLabel4.setText(captura);
        }else if(controle==82){
            String captura=this.jLabel4.getText();
            captura+="8";
            this.jLabel4.setText(captura);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(controle==4){
            String captura=this.jLabel4.getText();
            captura+="9";
            this.idC+="9";
            this.jLabel4.setText(captura);
        }else if(controle==5){
            String captura=this.jLabel5.getText();
            captura+="*";
            this.senha+="9";
            this.jLabel5.setText(captura);
        }else if(controle==80){
            String captura=this.jLabel4.getText();
            captura+="9";
            this.jLabel4.setText(captura);
        }else if(controle==82){
            String captura=this.jLabel4.getText();
            captura+="9";
            this.jLabel4.setText(captura);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
       if(controle==4){
            String captura=this.jLabel4.getText();
            captura+="0";
            this.idC+="0";
            this.jLabel4.setText(captura);
        }else if(controle==5){
            String captura=this.jLabel5.getText();
            captura+="*";
            this.senha+="0";
            this.jLabel5.setText(captura);
        }else if(controle==80){
            String captura=this.jLabel4.getText();
            captura+="0";
            this.jLabel4.setText(captura);
        }else if(controle==82){
            String captura=this.jLabel4.getText();
            captura+="0";
            this.jLabel4.setText(captura);
        }
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterActionPerformed
        if(controle==-1){
            reiniciaJanela();
        }else if(controle==4){
            controle=5;
        }else if(controle==5){
            this.jLabel3.setText("");
            this.jLabel4.setText("");
            this.jLabel5.setText("");
            if(this.banco.verificaSenha(Integer.parseInt(this.idC),Integer.parseInt(this.senha))){    
                //MONTAR INTERFACE LOGIN SUCESSO
                controle=6;
                conta=new Conta(Integer.parseInt(this.idC),Integer.parseInt(this.senha));
            }else{
                controle=7;
            }
        }
        if(controle==6){
          
            this.jLabel3.setText("Login concedido");
            this.jLabel4.setText("Pressione Enter para continuar");
            controle = 8;
            
        }else if(controle==7){

            this.jLabel3.setText("Login não concedido");
            this.jLabel4.setText("Pressione Enter para continuar");
            //CHAMAR A INTERFACE DENOVO   
            controle=-1;
            
            
        }
        if(controle==8){
            
            this.jLabel3.setText("Escolha a opção desejada:");
            this.jLabel4.setText("1: Ver Saldo.");
            this.jLabel5.setText("2: Depositar dinheiro.");
            this.jLabel6.setText("3: Sacar dinheiro.");
            this.jLabel7.setText("Cancelar para sair.");
            
        }else if(controle==80){        
            this.jLabel3.setText("");
            this.jLabel4.setText("Deposite o dinheiro no local indicado.");
            this.jLabel5.setText("A operacao sera cancelada em 2 minutos por inatividade");
            this.timer = new Timer(120000, suaActionListener);  //2minutos de espera
            //Inicia o timer
            this.timer.start();
                  
        }else if(controle==81){
            controle=-1;
            
        }else if(controle==82){
            controle=-1;
            this.jLabel3.setText("");
            this.jLabel4.setText("Saque realizado com sucesso !");
            this.jLabel5.setText("Retire seu dinheiro.");
            this.jLabel6.setText("Pressione enter para continuar:");
            this.banco.saque(Integer.parseInt(this.idC), Double.parseDouble(this.jLabel4.getText()));

        
        }
    }//GEN-LAST:event_jButtonEnterActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //this.idContaText.setText("");
        //this.senhaText.setText("");
        this.parent.setVisible(true);
        try{
        }catch(NullPointerException e){
            System.out.println("erro: " + e);
        } 
        this.dispose();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(bInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bInterface().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton depositMoney;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton withdrawMoney;
    // End of variables declaration//GEN-END:variables

}
