package com.kasir.form;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.util.UIScale;
import com.kasir.dao.KaryawanDAO;
import com.kasir.main.FormMenuUtama;
import com.kasir.menu.LightDarkMode;
import com.kasir.model.ModelKaryawan;
import com.kasir.service.ServiceKaryawan;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class FormLogin extends javax.swing.JPanel {

    private LightDarkMode lightDarkMode;
    public static boolean tutup = false;
    private ServiceKaryawan servis = new KaryawanDAO();
    
    public FormLogin() {
        initComponents();
        setLayoutForm();
        lightDarkMode = new LightDarkMode();
        add(lightDarkMode);
    }

    private void resetForm(){
        txtUser.setText("");
        txtPass.setText("");
    }
    
    private void prosesLogin(){
        if(validasiInput()==true){
            String user = txtUser.getText();
            String pass = txtPass.getText();
            
            ModelKaryawan model = new ModelKaryawan();
            model.setUsername(user);
            model.setPassword(pass);
            
            ModelKaryawan modelKar = servis.prosesLogin(model);
            if (modelKar != null) {
                FormMenuUtama.login(modelKar);
                resetForm();
            } else {
                JOptionPane.showMessageDialog(null, "Username dan Password salah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private boolean validasiInput() {
        boolean valid = false;
        if(txtUser.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Username tidak boleh kosong");
        }else if(txtPass.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong");
        }else{
            valid = true;
        }
        return valid;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnLogin = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lbPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/kasir/icon/logo.png"))); // NOI18N

        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Login");

        lbUser.setText("Username");

        lbPass.setText("Password");

        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnLoginLayout = new javax.swing.GroupLayout(pnLogin);
        pnLogin.setLayout(pnLoginLayout);
        pnLoginLayout.setHorizontalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUser)
                    .addComponent(lbPass)
                    .addComponent(lbLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(txtUser, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnLoginLayout.setVerticalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbLogo)
                .addGap(18, 18, 18)
                .addComponent(lbTitle)
                .addGap(18, 18, 18)
                .addComponent(lbUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        prosesLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            prosesLogin();
        }
    }//GEN-LAST:event_txtPassKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbPass;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void setLayoutForm(){
        setLayout(new FormLoginLayout());
        pnLogin.setLayout(new LoginLayout());
        lbTitle.putClientProperty(FlatClientProperties.STYLE, "font:$h1.font");
        pnLogin.putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Login.background;"
                + "arc:20;"
                + "border:30,40,50,30");
        lbUser.putClientProperty(FlatClientProperties.STYLE, "font:16;");
        lbPass.putClientProperty(FlatClientProperties.STYLE, "font:16;");
        txtUser.putClientProperty(FlatClientProperties.STYLE, "font:$h3.font;");
        //txtUser.setMargin(new Insets(3,15,3,7));
        txtPass.putClientProperty(FlatClientProperties.STYLE, ""
                + "showRevealButton:true;"
                + "showCapsLock:true;"
                + "font:$h3.font");
        btnLogin.putClientProperty(FlatClientProperties.STYLE, ""
                + "borderWidth:0;"
                + "focusWidth:0;"
                + "font:$h2.font");
        
        txtUser.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan username");
        txtPass.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Masukkan password");
    }
    
    private class FormLoginLayout implements LayoutManager{

        @Override
        public void addLayoutComponent(String name, Component comp) {
            
        }

        @Override
        public void removeLayoutComponent(Component comp) {
            
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()) {
                return new Dimension(0,0);
            }
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()) {
                return new Dimension(0,0);
            }
        }

        @Override
        public void layoutContainer(Container parent) {
            synchronized (parent.getTreeLock()) {
                int width = parent.getWidth();
                int height = parent.getHeight();
                int loginWidth = UIScale.scale(420);
                int loginHeight = pnLogin.getPreferredSize().height;
                int x = (width - loginWidth) / 2;
                int y = (height - loginHeight) / 2;
                pnLogin.setBounds(x, y, loginWidth, loginHeight);
                
                int xx = 50;
                int yy = 20;
                int zz = 200;
                lightDarkMode.setBounds(xx, yy, zz, lightDarkMode.getPreferredSize().height);
            }
        }
    }
    
    private class LoginLayout implements LayoutManager{

        private final int titleGap = 10;
        private final int textGap = 10;
        private final int labelGap = 10;
        private final int buttonGap = 30;
        
        @Override
        public void addLayoutComponent(String name, Component comp) {
            
        }

        @Override
        public void removeLayoutComponent(Component comp) {
            
        }

        @Override
        public Dimension preferredLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()) {
                Insets insets = parent.getInsets();
                int height = insets.top + insets.bottom;

                height += lbLogo.getPreferredSize().height;
                height += UIScale.scale(titleGap);
                height += lbTitle.getPreferredSize().height;
                height += UIScale.scale(titleGap);
                height += lbUser.getPreferredSize().height;
                height += UIScale.scale(labelGap);
                height += txtUser.getPreferredSize().height;
                height += UIScale.scale(textGap);

                height += lbPass.getPreferredSize().height;
                height += UIScale.scale(labelGap);
                height += txtPass.getPreferredSize().height;
                height += UIScale.scale(buttonGap);
                height += btnLogin.getPreferredSize().height;
                
                return new Dimension(0, height);
            }
        }

        @Override
        public Dimension minimumLayoutSize(Container parent) {
            synchronized (parent.getTreeLock()) {
                return new Dimension(0,0);
            }
        }

        @Override
        public void layoutContainer(Container parent) {
            synchronized (parent.getTreeLock()) {
                Insets insets = parent.getInsets();
                int x = insets.left;
                int y = insets.top;
                int width = parent.getWidth() - (insets.left + insets.right);

                lbLogo.setBounds(x, y, width, lbLogo.getPreferredSize().height);
                y += lbLogo.getPreferredSize().height + UIScale.scale(titleGap);
                
                lbTitle.setBounds(x, y, width, lbTitle.getPreferredSize().height);
                y += lbTitle.getPreferredSize().height + UIScale.scale(titleGap);

                lbUser.setBounds(x, y, width, lbUser.getPreferredSize().height);
                y += lbUser.getPreferredSize().height + UIScale.scale(labelGap);
                txtUser.setBounds(x, y, width, txtUser.getPreferredSize().height);
                y += txtUser.getPreferredSize().height + UIScale.scale(textGap);

                lbPass.setBounds(x, y, width, lbPass.getPreferredSize().height);
                y += lbPass.getPreferredSize().height + UIScale.scale(labelGap);
                txtPass.setBounds(x, y, width, txtPass.getPreferredSize().height);
                y += txtPass.getPreferredSize().height + UIScale.scale(buttonGap);

                btnLogin.setBounds(x, y, width, btnLogin.getPreferredSize().height);
            }
        }
    }
}
