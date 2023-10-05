package classes;

import java.util.Arrays;
import javax.swing.DefaultListModel;

public class VetorSwingFrame extends javax.swing.JFrame {

    int vetor[] = new int[5];
    DefaultListModel list = new DefaultListModel();
    int selected = 0;
    
    public VetorSwingFrame() {
        initComponents();
        showVetor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spinnerNum = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        lblVetor = new javax.swing.JLabel();
        lblSelected = new javax.swing.JLabel();
        scroolPanel = new javax.swing.JScrollPane();
        listVetor = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vetor Swing");
        setResizable(false);

        spinnerNum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnOrder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOrder.setText("Ordenar");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        lblVetor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblVetor.setText("Vetor");

        lblSelected.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSelected.setText("[0]");

        listVetor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        listVetor.setModel(list);
        listVetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listVetorMouseClicked(evt);
            }
        });
        scroolPanel.setViewportView(listVetor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spinnerNum, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(lblVetor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSelected))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addComponent(btnRemove, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(scroolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spinnerNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd)
                            .addComponent(lblVetor)
                            .addComponent(lblSelected))
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove)
                        .addGap(18, 18, 18)
                        .addComponent(btnOrder)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scroolPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void showVetor(){
        list.removeAllElements();
        
        for(int i = 0; i < vetor.length; i++){
            list.addElement(vetor[i]);
        }
    }
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        vetor[selected] = Integer.parseInt(spinnerNum.getValue().toString());
        
        showVetor();
    }//GEN-LAST:event_btnAddActionPerformed

    private void listVetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listVetorMouseClicked
        selected = listVetor.getSelectedIndex();
        lblSelected.setText("[" + selected + "]");
    }//GEN-LAST:event_listVetorMouseClicked

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        vetor[selected] = 0;
        showVetor();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        Arrays.sort(vetor);
        showVetor();
    }//GEN-LAST:event_btnOrderActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VetorSwingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel lblSelected;
    private javax.swing.JLabel lblVetor;
    private javax.swing.JList<String> listVetor;
    private javax.swing.JScrollPane scroolPanel;
    private javax.swing.JSpinner spinnerNum;
    // End of variables declaration//GEN-END:variables
}