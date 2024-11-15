package com.kasir.form;

import com.formdev.flatlaf.FlatClientProperties;
import com.kasir.dao.KategoriDAO;
import com.kasir.model.ModelKategori;
import com.kasir.service.ServiceKategori;
import com.kasir.tablemodel.TableModelKategori;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;

public class FormKategori extends javax.swing.JPanel {

    private final TableModelKategori tblModel = new TableModelKategori();
    private final ServiceKategori servis = new KategoriDAO();
    
    public FormKategori() {
        initComponents();
        tblData.setModel(tblModel);
        loadData();
        setLebarKolom();
        setLayoutForm();
    }
    
    private void setLebarKolom(){
        TableColumnModel kolom = tblData.getColumnModel();
        kolom.getColumn(0).setPreferredWidth(50);
        kolom.getColumn(0).setMaxWidth(50);
        kolom.getColumn(0).setMinWidth(50);
    }
    
    private void setLayoutForm(){
        jPanel1.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Produk.background");
        txtPencarian.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Pencarian");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnTambah = new javax.swing.JButton();
        btnPerbarui = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtPencarian = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("MASTER > Kategori");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("Data Kategori");

        btnTambah.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnPerbarui.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnPerbarui.setText("PERBARUI");
        btnPerbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerbaruiActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        txtPencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPencarianKeyReleased(evt);
            }
        });

        tblData.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblData.setRowHeight(30);
        jScrollPane2.setViewportView(tblData);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addGap(18, 18, 18)
                        .addComponent(btnPerbarui)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPerbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPencarianKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPencarianKeyReleased
        pencarianData();
    }//GEN-LAST:event_txtPencarianKeyReleased

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        tambahData();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnPerbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerbaruiActionPerformed
        perbaruiData();
    }//GEN-LAST:event_btnPerbaruiActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        hapusData();
    }//GEN-LAST:event_btnHapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnPerbarui;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtPencarian;
    // End of variables declaration//GEN-END:variables

    private void loadData() {
        List<ModelKategori> list = servis.tampilData();
        tblModel.setData(list);
    }
    
    private void pencarianData(){
        List<ModelKategori> list = servis.pencarianData(txtPencarian.getText());
        tblModel.setData(list);
    }

    private void tambahData() {
        FormInputKategori formInput = new FormInputKategori(null, true, 1, null, this);
        formInput.setVisible(true);
        loadData();
    }

    private void perbaruiData() {
        int row = tblData.getSelectedRow();
        if(row != -1){
            ModelKategori model = tblModel.getData(row);
            FormInputKategori formInput = new FormInputKategori(null, true, row, model, this);
            formInput.setVisible(true);
            loadData();
        }else{
            JOptionPane.showMessageDialog(null, "Pilih dahulu data yang akan diperbarui");
        }
    }

    private void hapusData() {
        int row = tblData.getSelectedRow();
        if(row != -1){
            ModelKategori model = tblModel.getData(row);
            if(JOptionPane.showConfirmDialog(null, "Yakin data akan dihapus ?", 
                    "Konfirmasi", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION)
            {
                servis.hapusData(model);
                tblModel.deleteData(row);
                loadData();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Pilih dahulu data yang akan dihapus");
        }
    }
    
    public void refreshTable(){
        loadData();
    }

    
}
