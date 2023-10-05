package classes;

import java.util.Calendar;
import java.util.Date;

public class Main extends javax.swing.JFrame {
    public Main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtYearOfBirth = new javax.swing.JTextField();
        btnCalc = new javax.swing.JButton();
        lblAge = new javax.swing.JLabel();
        lblSituation = new javax.swing.JLabel();
        btnClean = new javax.swing.JButton();
        jPanelColor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ano de Nascimento:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 37, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Idade:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 179, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Situação:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, -1, -1));

        txtYearOfBirth.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(txtYearOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 34, 100, -1));

        btnCalc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCalc.setForeground(new java.awt.Color(51, 51, 255));
        btnCalc.setText("Calcular Idade");
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, -1, -1));

        lblAge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(255, 255, 255));
        lblAge.setText("0");
        getContentPane().add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 179, 150, -1));

        lblSituation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSituation.setForeground(new java.awt.Color(255, 255, 255));
        lblSituation.setText("<Vazio>");
        getContentPane().add(lblSituation, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 219, 150, -1));

        btnClean.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnClean.setForeground(new java.awt.Color(255, 51, 51));
        btnClean.setText("Limpar");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });
        getContentPane().add(btnClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 102, 101, -1));

        jPanelColor.setBackground(new java.awt.Color(0, 206, 89));
        jPanelColor.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanelColorLayout = new javax.swing.GroupLayout(jPanelColor);
        jPanelColor.setLayout(jPanelColorLayout);
        jPanelColorLayout.setHorizontalGroup(
            jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanelColorLayout.setVerticalGroup(
            jPanelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        Date date = new Date();
        Calendar today = Calendar.getInstance();
        
        int currentYear = today.get(Calendar.YEAR);
        int yearOfBirth = Integer.parseInt(txtYearOfBirth.getText());
       
        int age = currentYear - yearOfBirth;
        String situation;
        
        if(age >= 16 && age <= 17 || age >= 70){
            situation = "Voto Opcional";
        }else if(age < 16){
            situation = "Voto Proibido";
        }else{
            situation = "Voto Obrigatorio";
        }
        
        lblAge.setText(Integer.toString(age) + " Anos");
        lblSituation.setText(situation);
    }//GEN-LAST:event_btnCalcActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        txtYearOfBirth.setText("");
        
        lblAge.setText("0");
        lblSituation.setText("<Vazio>");
    }//GEN-LAST:event_btnCleanActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JButton btnClean;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelColor;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblSituation;
    private javax.swing.JTextField txtYearOfBirth;
    // End of variables declaration//GEN-END:variables
}
