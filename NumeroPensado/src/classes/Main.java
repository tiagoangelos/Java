package classes;

import java.awt.Color;

public class Main extends javax.swing.JFrame {
    public Main() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        lblPhrase.setText("<html>Estou pensando em um numero de <strong>1 a 5</strong>, tente advinhar!</html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jComboBox1 = new javax.swing.JComboBox<>();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jFormattedTextField2 = new javax.swing.JFormattedTextField();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jFormattedTextField4 = new javax.swing.JFormattedTextField();
        geniusIcon = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jNumberGuess = new javax.swing.JSpinner();
        btnGuess = new javax.swing.JButton();
        lblPhrase = new javax.swing.JLabel();
        balloonIcon = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jFormattedTextField1.setText("jFormattedTextField1");

        jFormattedTextField2.setText("jFormattedTextField2");

        jFormattedTextField3.setText("jFormattedTextField3");

        jFormattedTextField4.setText("jFormattedTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        geniusIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/genius-icon.png"))); // NOI18N
        getContentPane().add(geniusIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Valor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 30));

        jNumberGuess.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jNumberGuess.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(jNumberGuess, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 60, -1));

        btnGuess.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuess.setForeground(new java.awt.Color(51, 102, 255));
        btnGuess.setText("Palpite");
        btnGuess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuessActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuess, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, 40));

        lblPhrase.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPhrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPhrase.setText("Frase");
        lblPhrase.setToolTipText("");
        getContentPane().add(lblPhrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 140, 90));

        balloonIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balloonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/balloon-icon.png"))); // NOI18N
        balloonIcon.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(balloonIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 220, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuessActionPerformed
        int thoughtNumber = (int) Math.round(1 + Math.random() * (5 - 1));
        int numberGuess = (int) jNumberGuess.getValue();
        
        if(thoughtNumber == numberGuess){
            lblPhrase.setText("<html><strong>Parabéns</strong> você acertou o numero que pensei!</html>");
        }else{
            lblPhrase.setText("<html>Voçê <strong>errou</strong> eu pensei em: " + thoughtNumber + "</html>");
        }
    }//GEN-LAST:event_btnGuessActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balloonIcon;
    private javax.swing.JButton btnGuess;
    private javax.swing.JLabel geniusIcon;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextField2;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JFormattedTextField jFormattedTextField4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JSpinner jNumberGuess;
    private javax.swing.JLabel lblPhrase;
    // End of variables declaration//GEN-END:variables
}
