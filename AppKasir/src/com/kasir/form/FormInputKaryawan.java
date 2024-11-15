package com.kasir.form;

import com.formdev.flatlaf.FlatClientProperties;
import com.kasir.dao.KaryawanDAO;
import com.kasir.model.ModelKaryawan;
import com.kasir.service.ServiceKaryawan;
import com.kasir.tablemodel.TableModelKaryawan;
import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;

public class FormInputKaryawan extends javax.swing.JDialog {
    
    private TableModelKaryawan tblModel = new TableModelKaryawan();
    private ServiceKaryawan servis = new KaryawanDAO();
    private ModelKaryawan karyawan;
    private int idKaryawan;
    private int row;
    private FormKaryawan formKaryawan;
    
    public FormInputKaryawan(java.awt.Frame parent, boolean modal, int row, ModelKaryawan karyawan, FormKaryawan formKaryawan) {
        super(parent, modal);
        this.karyawan = karyawan;
        this.row = row;
        this.formKaryawan = formKaryawan;
        initComponents();
        if(karyawan != null){
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
        
        txtPassword.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true;"
                + "showCapsLock:true");
        
        txtNama.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan nama");
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan username");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan password");
        txtTelepon.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan nomor telepon");
        
        txtAlamat.setText("Masukan alamat");
        txtAlamat.setForeground(new Color(153,153,153));
        txtAlamat.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (txtAlamat.getText().equals("Masukan alamat")) {
                    txtAlamat.setText("");
                    txtAlamat.setForeground(new Color(0,0,0));
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (txtAlamat.getText().isEmpty()) {
                    txtAlamat.setText("Masukan alamat");
                    txtAlamat.setForeground(new Color(153,153,153));
                }
            }
        });
        
        cbxRole.setForeground(new Color(153, 153, 153)); // Set initial color
        cbxRole.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    if (cbxRole.getSelectedItem().equals("Pilih Role")) {
                        cbxRole.setForeground(new Color(153, 153, 153)); // Set to grey if "Pilih Role" is selected
                    } else {
                        cbxRole.setForeground(new Color(0, 0, 0)); // Set to black if other item is selected
                    }
                }
            }
        });

        cbxRole.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                if (cbxRole.getSelectedItem().equals("Pilih Role")) {
                    cbxRole.setForeground(new Color(153, 153, 153)); // Set to grey if "Pilih Role" is selected
                } else {
                    cbxRole.setForeground(new Color(0, 0, 0)); // Set to black if other item is selected
                }
            }
        });

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
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbxRole = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

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
        jLabel3.setText("Nama Karyawan");

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
        jLabel1.setText("MASTER > Karyawan > Tambah");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tambah Data Karyawan");

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

        txtAlamat.setColumns(20);
        txtAlamat.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Username");

        txtUsername.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Password");

        cbxRole.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Role", "Admin", "Kasir", "Reporting" }));

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Role");

        txtPassword.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(btnBatal)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNama)
                                    .addComponent(txtUsername)
                                    .addComponent(txtPassword))))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelepon)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                            .addComponent(cbxRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(cbxRole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
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
                FormKaryawan formKaryawan = new FormKaryawan();
                FormInputKaryawan dialog = new FormInputKaryawan(new javax.swing.JFrame(), true, 1, null, formKaryawan);
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
    private javax.swing.JComboBox<String> cbxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelepon;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        txtNama.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
        txtTelepon.setText("");
        txtAlamat.setText("");
        cbxRole.setSelectedIndex(0);
    }
    
    private void loadData() {
        List<ModelKaryawan> list = servis.tampilData();
        tblModel.setData(list);
    }
    
    private boolean validasiInput() {
        boolean valid = false;
        if (txtNama.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Nama karyawan tidak boleh kosong");
        }else if (txtUsername.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
        }else if (txtPassword.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong");
        }else if (txtTelepon.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Nomor Telepon tidak boleh kosong");
        }else if (txtAlamat.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Alamat tidak boleh kosong");
        }else if (cbxRole.getSelectedItem().equals("Pilih Role")){
            JOptionPane.showMessageDialog(null, "Silahkan pilih role");
        }else{
            valid = true;
        }
        return valid;
    }
    
    private void simpanData(){
        if(validasiInput()== true){
            String nama     = txtNama.getText();
            String username = txtUsername.getText();
            String password = txtPassword.getText();
            String telepon  = txtTelepon.getText();
            String alamat   = txtAlamat.getText();
            String role     = cbxRole.getSelectedItem().toString();
            
            ModelKaryawan model = new ModelKaryawan();
            model.setNamaKaryawan(nama);
            model.setUsername(username);
            model.setPassword(password);
            model.setTelepon(telepon);
            model.setAlamat(alamat);
            model.setRole(role);
            
            servis.tambahData(model);
            tblModel.insertData(model);
            formKaryawan.refreshTable();
            resetForm();
        }
    }

    private void dataTable() {
        btnSimpan.setText("PERBARUI");
        
        idKaryawan = karyawan.getIdKaryawan();
        jLabel7.setVisible(false);
        txtPassword.setVisible(false);
        
        txtNama.setText(karyawan.getNamaKaryawan());
        txtUsername.setText(karyawan.getUsername());
        txtTelepon.setText(karyawan.getTelepon());
        txtAlamat.setText(karyawan.getAlamat());
        cbxRole.setSelectedItem(karyawan.getRole());
                
        jLabel1.setText("MASTER > karyawan > Perbarui");
        jLabel2.setText("Perbarui Data karyawan");
    }
    
    private void perbaruiData(){
        String nama     = txtNama.getText();
        String username = txtUsername.getText();
        String telepon  = txtTelepon.getText();
        String alamat   = txtAlamat.getText();
        String role     = cbxRole.getSelectedItem().toString();

        ModelKaryawan model = new ModelKaryawan();
        model.setIdKaryawan(idKaryawan);
        model.setNamaKaryawan(nama);
        model.setUsername(username);
        model.setTelepon(telepon);
        model.setAlamat(alamat);
        model.setRole(role);

        servis.perbaruiData(model);
        tblModel.updateData(row, model);
        resetForm();
        dispose();
    }
    
}
