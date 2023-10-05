package classes;

public class FatorialSwingFrame extends javax.swing.JFrame {

    public FatorialSwingFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spinnerValue = new javax.swing.JSpinner();
        btnCalcFatorial = new javax.swing.JButton();
        lblFormula = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fatorial");
        setResizable(false);

        spinnerValue.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        spinnerValue.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        btnCalcFatorial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCalcFatorial.setText("!");
        btnCalcFatorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcFatorialActionPerformed(evt);
            }
        });

        lblFormula.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFormula.setForeground(new java.awt.Color(0, 51, 255));
        lblFormula.setText("Formula");

        lblResult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblResult.setForeground(new java.awt.Color(255, 0, 0));
        lblResult.setText("Resultado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFormula)
                        .addGap(18, 18, 18)
                        .addComponent(lblResult))
                    .addComponent(btnCalcFatorial, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerValue, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(422, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(spinnerValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCalcFatorial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFormula)
                    .addComponent(lblResult))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcFatorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcFatorialActionPerformed
        int valueSpinner = Integer.parseInt(spinnerValue.getValue().toString());
        Fatorial fat = new Fatorial();
        
        fat.setValor(valueSpinner);
        
        lblFormula.setText(fat.getFormula());
        lblResult.setText(Integer.toString(fat.getFatorial()));
    }//GEN-LAST:event_btnCalcFatorialActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FatorialSwingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcFatorial;
    private javax.swing.JLabel lblFormula;
    private javax.swing.JLabel lblResult;
    private javax.swing.JSpinner spinnerValue;
    // End of variables declaration//GEN-END:variables
}