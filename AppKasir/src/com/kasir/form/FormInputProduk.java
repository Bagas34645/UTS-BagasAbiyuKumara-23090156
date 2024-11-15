package com.kasir.form;

import com.formdev.flatlaf.FlatClientProperties;
import com.kasir.dao.KategoriDAO;
import com.kasir.dao.ProdukDAO;
import com.kasir.dao.SupplierDAO;
import com.kasir.model.ModelKategori;
import com.kasir.model.ModelProduk;
import com.kasir.model.ModelSupplier;
import com.kasir.service.ServiceKategori;
import com.kasir.service.ServiceProduk;
import com.kasir.service.ServiceSupplier;
import com.kasir.tablemodel.TableModelProduk;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class FormInputProduk extends javax.swing.JDialog {
    
    private TableModelProduk tblModel = new TableModelProduk();
    private ServiceProduk servis = new ProdukDAO();
    private ModelProduk produk;
    private int idProduk;
    private int row;
    private FormProduk formProduk;
    
    private ServiceKategori servis_ktg = new KategoriDAO();
    private ServiceSupplier servis_sup = new SupplierDAO();
    private int idKategori;
    private int idSupplier;
    private final Map<String, Integer> kategoriMap;
    
    public FormInputProduk(java.awt.Frame parent, boolean modal, int row, ModelProduk produk, FormProduk formProduk) {
        super(parent, modal);
        this.produk = produk;
        this.row = row;
        this.formProduk = formProduk;
        initComponents();
        kategoriMap = new HashMap<>();
        if(produk != null){
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
        
        txtNama.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan nama produk");
        txtHarga.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan harga");
        txtStok.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan stok");
        txtBarcode.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan kode barcode");
        
        cbxKategori.putClientProperty("JComponent.placeholderText", "Masukkan kode barcode");
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSimpan = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtBarcode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbxKategori = new javax.swing.JComboBox<>();
        cbxSupplier = new javax.swing.JComboBox<>();
        btnBatal = new javax.swing.JButton();
        txtStok = new javax.swing.JTextField();
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
        jLabel3.setText("Nama Produk");

        txtNama.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Kategori");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Harga");

        txtHarga.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Stok");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Supplier");

        txtBarcode.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Barcode");

        cbxKategori.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Kategori", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        cbxSupplier.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Supplier", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        btnBatal.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        txtStok.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(155, 36, 117));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MASTER > Produk > Tambah");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tambah Data Produk");

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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxSupplier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBarcode)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtStok))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(txtHarga))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(cbxKategori, 0, 322, Short.MAX_VALUE))
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
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(0, 0, Short.MAX_VALUE)
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
                FormProduk formProduk = new FormProduk();
                FormInputProduk dialog = new FormInputProduk(new javax.swing.JFrame(), true, 1, null, formProduk);
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
    private javax.swing.JComboBox<String> cbxKategori;
    private javax.swing.JComboBox<String> cbxSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBarcode;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        txtNama.setText("");
        txtHarga.setText("");
        txtStok.setText("");
        txtBarcode.setText("");
    }
    
    private void loadData() {
        ambilKategori();
        ambilSupplier();
        List<ModelProduk> list = servis.tampilData();
        tblModel.setData(list);
    }
    
    private void ambilKategori(){
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("Pilih Kategori");
        
        List<ModelKategori> list = servis_ktg.ambilKategori();
        for(ModelKategori kategori : list){
            model.addElement(kategori.getNamaKategori());
            kategoriMap.put(kategori.getNamaKategori(), kategori.getIdKategori());
        } 
        
        cbxKategori.setModel(model);
        cbxKategori.addActionListener(e -> {
            String namaKategori = cbxKategori.getSelectedItem().toString();
            if(!"Pilih Kategori".equals(namaKategori)){
                idKategori = kategoriMap.get(namaKategori);
            }
        });
    }
      
    private void ambilSupplier(){
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("Pilih Supplier");
        
        List<ModelSupplier> list = servis_sup.ambilSupplier();
        for(ModelSupplier supplier : list){
            model.addElement(supplier.getNamaSupplier());
            kategoriMap.put(supplier.getNamaSupplier(), supplier.getIdSupplier());
        } 
        
        cbxSupplier.setModel(model);
        cbxSupplier.addActionListener(e -> {
            String namaSupplier = cbxSupplier.getSelectedItem().toString();
            if(!"Pilih Kategori".equals(namaSupplier)){
                idSupplier = kategoriMap.get(namaSupplier);
            }
        });
    }
    
    private boolean validasiInput() {
        boolean valid = false;
        if (txtNama.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Nama Produk tidak boleh kosong");
        }else if (cbxKategori.getSelectedItem().equals("Pilih Kategori")){
            JOptionPane.showMessageDialog(null, "Harap pilih kategori");
        }else if (txtHarga.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Harga tidak boleh kosong");
        }else if (txtStok.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Stok tidak boleh kosong");
        }else if (cbxSupplier.getSelectedItem().equals("Pilih Supplier")){
            JOptionPane.showMessageDialog(null, "Harap pilih supplier");
        }else if (txtBarcode.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Barcode tidak boleh kosong");
        }else{
            valid = true;
        }
        return valid;
    }
    
    private void simpanData(){
        if(validasiInput()== true){
            String namaProduk   = txtNama.getText();
            Long harga          = Long.valueOf(txtHarga.getText());
            int stok            = Integer.parseInt(txtStok.getText());
            String barcode      = txtBarcode.getText();
            
            ModelProduk produk = new ModelProduk();
            produk.setNamaProduk(namaProduk);
            produk.setIdKategori(idKategori);
            produk.setHarga(harga);
            produk.setStok(stok);
            produk.setIdSupplier(idSupplier);
            produk.setBarcode(barcode);
            
            servis.tambahData(produk);
            tblModel.insertData(produk);
            formProduk.refreshTable();
            resetForm();
            loadData();
        }
    }

    private void dataTable() {
        btnSimpan.setText("PERBARUI");
        
        idProduk = produk.getIdProduk();
        
        txtNama.setText(produk.getNamaProduk());
        txtHarga.setText(String.valueOf(produk.getHarga()));
        txtStok.setText(String.valueOf(produk.getStok()));
        txtBarcode.setText(produk.getBarcode());
        
        idKategori = produk.getIdKategori();
        idSupplier = produk.getIdSupplier();
        ambilKategoriID(idKategori);
        ambilSupplierID(idSupplier);
                
        jLabel1.setText("MASTER > Produk > Perbarui");
        jLabel2.setText("Perbarui Data Produk");
    }
    
    private void ambilKategoriID(int id){
        String namaKategori = servis_ktg.ambilKategoriID(id);
        SwingUtilities.invokeLater(()->{
            cbxKategori.setSelectedItem(namaKategori);
        });
    }
    
    private void ambilSupplierID(int id){
        String namaSupplier = servis_sup.ambilSupplierID(id);
        SwingUtilities.invokeLater(()->{
            cbxKategori.setSelectedItem(namaSupplier);
        });
    }
    
    private void perbaruiData(){
        if(validasiInput()== true){
            String namaProduk   = txtNama.getText();
            Long harga          = Long.valueOf(txtHarga.getText());
            int stok            = Integer.parseInt(txtStok.getText());
            String barcode      = txtBarcode.getText();
            
            ModelProduk produk = new ModelProduk();
            produk.setIdProduk(idProduk);
            produk.setNamaProduk(namaProduk);
            produk.setIdKategori(idKategori);
            produk.setHarga(harga);
            produk.setStok(stok);
            produk.setIdSupplier(idSupplier);
            produk.setBarcode(barcode);
            
            servis.perbaruiData(produk);
            tblModel.updateData(row, produk);
            resetForm();
            dispose();
        }
    }
}
