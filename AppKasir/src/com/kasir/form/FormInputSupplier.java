package com.kasir.form;

import com.formdev.flatlaf.FlatClientProperties;
import com.kasir.dao.SupplierDAO;
import com.kasir.model.ModelSupplier;
import com.kasir.service.ServiceSupplier;
import com.kasir.tablemodel.TableModelSupplier;
import java.util.HashMap;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class FormInputSupplier extends javax.swing.JDialog {
    
    private TableModelSupplier tblModel = new TableModelSupplier();
    private ServiceSupplier servis = new SupplierDAO();
    private ModelSupplier supplier;
    private int idSupplier;
    private int row;
    private FormSupplier formSupplier;
    
    public FormInputSupplier(java.awt.Frame parent, boolean modal, int row, ModelSupplier supplier, FormSupplier formSupplier) {
        super(parent, modal);
        this.supplier = supplier;
        this.row = row;
        this.formSupplier = formSupplier;
        initComponents();
        if(supplier != null){
            dataTable();
        }
        loadData();
        setLayoutForm();
    }

    private void setLayoutForm(){
        jPanel1.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Produk.background");
        jPanel2.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Panel.Form.background");
        btnSimpan.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Button.background");
        btnBatal.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Button.background");
        
        txtNama.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan nama supplier");
        txtTelepon.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan nomor telepon");
        txtAlamat.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan alamat");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSimpan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTelepon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnSimpan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nama Supplier");

        txtNama.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Telepon");

        txtTelepon.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Alamat");

        btnBatal.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(155, 36, 117));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MASTER > Supplier > Tambah");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tambah Data Supplier");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        txtAlamat.setColumns(20);
        txtAlamat.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSimpan)
                .addGap(18, 18, 18)
                .addComponent(btnBatal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(txtTelepon))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNama)))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        if(btnSimpan.getText().equals("SIMPAN")){
            simpanData();
        }else if(btnSimpan.getText().equals("PERBARUI")){
            perbaruiData();
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        if(btnSimpan.getText().equals("SIMPAN")){
            resetForm();
        }else if(btnSimpan.getText().equals("PERBARUI")){
            dispose();
        }
    }//GEN-LAST:event_btnBatalActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormSupplier formSupplier = new FormSupplier();
                FormInputSupplier dialog = new FormInputSupplier(new javax.swing.JFrame(), true, 1, null, formSupplier);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTelepon;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        txtNama.setText("");
        txtTelepon.setText("");
        txtAlamat.setText("");
    }
    
    private void loadData() {
        List<ModelSupplier> list = servis.tampilData();
        tblModel.setData(list);
    }
    
    private boolean validasiInput() {
        boolean valid = false;
        String namaSupplier   = txtNama.getText();
        ModelSupplier model = new ModelSupplier();
        model.setNamaSupplier(namaSupplier);
        model.setIdSupplier(idSupplier);
        
        if (txtNama.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Nama Supplier tidak boleh kosong");
        }else if (txtTelepon.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Nomor Telepon tidak boleh kosong");
        }else if (txtAlamat.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Alamat tidak boleh kosong");
        }else{
            if(servis.validasiNamaSupplier(model)){
                valid = true;
            }else{
                JOptionPane.showMessageDialog(null, "Nama Supplier sudah ada\nSilahkan masukkan nama supplier yang berbeda","Peringatan",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
        return valid;
    }
    
    private void simpanData(){
        if(validasiInput()== true){
            String namaSupplier   = txtNama.getText();
            String teleponSupplier   = txtTelepon.getText();
            String alamatSupplier   = txtAlamat.getText();
            
            ModelSupplier model = new ModelSupplier();
            model.setNamaSupplier(namaSupplier);
            model.setTeleponSupplier(teleponSupplier);
            model.setAlamatSupplier(alamatSupplier);
            
            servis.tambahData(model);
            tblModel.insertData(model);
            formSupplier.refreshTable();
            resetForm();
        }
    }

    private void dataTable() {
        btnSimpan.setText("PERBARUI");
        
        idSupplier = supplier.getIdSupplier();
        
        txtNama.setText(supplier.getNamaSupplier());
        txtTelepon.setText(supplier.getTeleponSupplier());
        txtAlamat.setText(supplier.getAlamatSupplier());
                
        jLabel1.setText("MASTER > Supplier > Perbarui");
        jLabel2.setText("Perbarui Data Supplier");
    }
    
    private void perbaruiData(){
        if(validasiInput()== true){
            String namaSupplier   = txtNama.getText();
            String teleponSupplier   = txtTelepon.getText();
            String alamatSupplier   = txtAlamat.getText();
            
            ModelSupplier model = new ModelSupplier();
            model.setIdSupplier(idSupplier);
            model.setNamaSupplier(namaSupplier);
            model.setTeleponSupplier(teleponSupplier);
            model.setAlamatSupplier(alamatSupplier);
            
            servis.perbaruiData(model);
            tblModel.updateData(row, model);
            resetForm();
            dispose();
        }
    }
}
