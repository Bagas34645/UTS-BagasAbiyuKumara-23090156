package com.kasir.form;

import com.formdev.flatlaf.FlatClientProperties;
import com.kasir.dao.KategoriDAO;
import com.kasir.model.ModelKategori;
import com.kasir.service.ServiceKategori;
import com.kasir.tablemodel.TableModelKategori;
import java.util.List;
import javax.swing.JOptionPane;

public class FormInputKategori extends javax.swing.JDialog {
    
    private TableModelKategori tblModel = new TableModelKategori();
    private ServiceKategori servis = new KategoriDAO();
    private ModelKategori model;
    private int idKategori;
    private int row;
    private FormKategori formKategori;
    
    public FormInputKategori(java.awt.Frame parent, boolean modal, int row, ModelKategori model, FormKategori formKategori) {
        super(parent, modal);
        this.model = model;
        this.row = row;
        this.formKategori = formKategori;
        initComponents();
        
        if(model != null){
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
        
        txtNama.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan nama kategori");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSimpan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        btnBatal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        jLabel3.setText("Nama Kategori");

        txtNama.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

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
        jLabel1.setText("MASTER > Kategori > Tambah");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tambah Data Kategori");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)))
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
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
                FormKategori formKategori = new FormKategori();
                FormInputKategori dialog = new FormInputKategori(new javax.swing.JFrame(), true, 1, null, formKategori);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables

    private boolean validasiInput() {
        boolean valid = false;
        String namaKategori   = txtNama.getText();
        ModelKategori model = new ModelKategori();
        model.setNamaKategori(namaKategori);
        
        if (txtNama.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Nama kategori tidak boleh kosong");
        }else{
            if(servis.validasiNamaKategori(model)){
                valid = true;
            }else{
                JOptionPane.showMessageDialog(null, "Nama kategori sudah ada\nSilahkan masukkan nama kategori yang berbeda","Peringatan",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
        return valid;
    }
    
    private void simpanData(){
        if(validasiInput()== true){
            String namaKategori   = txtNama.getText();
                        
            ModelKategori model = new ModelKategori();
            model.setNamaKategori(namaKategori);
                        
            servis.tambahData(model);
            tblModel.insertData(model);
            formKategori.refreshTable();
            resetForm();
        }
    }

    private void resetForm() {
        txtNama.setText("");
    }

    private void dataTable() {
        btnSimpan.setText("PERBARUI");
        
        idKategori = model.getIdKategori();
        
        txtNama.setText(model.getNamaKategori());
        
        jLabel1.setText("MASTER > Kategori > Perbarui");
        jLabel2.setText("Perbarui Data Kategori");
    }

    private void loadData() {
        List<ModelKategori> list = servis.tampilData();
        tblModel.setData(list);
    }
    
    private void perbaruiData(){
        if(validasiInput()== true){
            String namaKategori   = txtNama.getText();
                        
            ModelKategori model = new ModelKategori();
            model.setIdKategori(idKategori);
            model.setNamaKategori(namaKategori);
            
            servis.perbaruiData(model);
            tblModel.updateData(row, model);
            resetForm();
            dispose();
        }
    }
}
