package classes;

import javax.swing.DefaultListModel;

public class FrameContadorSwing extends javax.swing.JFrame {
    
    public FrameContadorSwing() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTextStart = new javax.swing.JLabel();
        lblTextEnd = new javax.swing.JLabel();
        lblTextPass = new javax.swing.JLabel();
        sliderStart = new javax.swing.JSlider();
        sliderEnd = new javax.swing.JSlider();
        sliderPass = new javax.swing.JSlider();
        lblStart = new javax.swing.JLabel();
        lblEnd = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listItens = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contador");
        setResizable(false);

        lblTextStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTextStart.setText("Inicio");

        lblTextEnd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTextEnd.setText("Fim");

        lblTextPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTextPass.setText("Passo");

        sliderStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sliderStart.setValue(0);
        sliderStart.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStartStateChanged(evt);
            }
        });

        sliderEnd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sliderEnd.setMaximum(1000);
        sliderEnd.setValue(0);
        sliderEnd.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderEndStateChanged(evt);
            }
        });

        sliderPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sliderPass.setValue(0);
        sliderPass.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderPassStateChanged(evt);
            }
        });

        lblStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblStart.setText("0");

        lblEnd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEnd.setText("100");

        lblPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPass.setText("1");

        btnStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnStart.setText("Começar Contagem");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        listItens.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listItens.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "0" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listItens);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTextPass)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTextStart)
                                    .addComponent(lblTextEnd))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sliderStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sliderEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sliderPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStart)
                    .addComponent(lblEnd)
                    .addComponent(lblPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTextStart)
                    .addComponent(sliderStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStart))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTextEnd)
                    .addComponent(sliderEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTextPass)
                    .addComponent(sliderPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPass))
                .addGap(31, 31, 31)
                .addComponent(btnStart)
                .addGap(147, 147, 147))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliderStartStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderStartStateChanged
        int valueSliderStart = sliderStart.getValue();
        lblStart.setText(Integer.toString(valueSliderStart));
    }//GEN-LAST:event_sliderStartStateChanged

    private void sliderEndStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderEndStateChanged
        int valueSliderEnd = sliderEnd.getValue();
        lblEnd.setText(Integer.toString(valueSliderEnd));
    }//GEN-LAST:event_sliderEndStateChanged

    private void sliderPassStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderPassStateChanged
        int valueSliderPass = sliderPass.getValue();
        lblPass.setText(Integer.toString(valueSliderPass));
    }//GEN-LAST:event_sliderPassStateChanged

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        int start = sliderStart.getValue();
        int end = sliderEnd.getValue();
        int pass = sliderPass.getValue();
        
        DefaultListModel list = new DefaultListModel();
        
        for (int c = start; c <= end; c += pass){
            list.addElement(c);
        }
        
        listItens.setModel(list);
    }//GEN-LAST:event_btnStartActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameContadorSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblStart;
    private javax.swing.JLabel lblTextEnd;
    private javax.swing.JLabel lblTextPass;
    private javax.swing.JLabel lblTextStart;
    private javax.swing.JList<String> listItens;
    private javax.swing.JSlider sliderEnd;
    private javax.swing.JSlider sliderPass;
    private javax.swing.JSlider sliderStart;
    // End of variables declaration//GEN-END:variables
}
