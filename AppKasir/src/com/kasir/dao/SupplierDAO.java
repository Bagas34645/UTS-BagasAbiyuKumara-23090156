package com.kasir.dao;

import com.kasir.config.Koneksi;
import com.kasir.model.ModelSupplier;
import com.kasir.service.ServiceSupplier;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class SupplierDAO implements ServiceSupplier{

    private Connection conn;
    
    public SupplierDAO() {
        conn = Koneksi.getConnection();
    }
    
    @Override
    public void tambahData(ModelSupplier model) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO supplier(nama_supplier, telepon, alamat) VALUES (?,?,?)";
            
            st = conn.prepareStatement(sql);
            st.setString    (1, model.getNamaSupplier());
            st.setString    (2, model.getTeleponSupplier());
            st.setString    (3, model.getAlamatSupplier());
                        
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void perbaruiData(ModelSupplier model) {
        PreparedStatement st = null;
        try {
            String sql = "UPDATE supplier SET nama_supplier=?, telepon=?, alamat=? WHERE id_supplier=?";
            
            st = conn.prepareStatement(sql);
            st.setString    (1, model.getNamaSupplier());
            st.setString    (2, model.getTeleponSupplier());
            st.setString    (3, model.getAlamatSupplier());
            st.setInt       (4, model.getIdSupplier());
            
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void hapusData(ModelSupplier model) {
        PreparedStatement st = null;
        String sql = "DELETE FROM supplier WHERE id_supplier=?";
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, model.getIdSupplier());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ModelSupplier> tampilData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql ="SELECT * FROM supplier";
        
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelSupplier model = new ModelSupplier();
                model.setIdSupplier   (rs.getInt("id_supplier"));
                model.setNamaSupplier (rs.getString("nama_supplier"));
                model.setTeleponSupplier (rs.getString("telepon"));
                model.setAlamatSupplier (rs.getString("alamat"));
                
                list.add(model);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    @Override
    public List<ModelSupplier> pencarianData(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql ="SELECT * FROM supplier WHERE id_supplier LIKE '%"+id+"%' "
                + "OR nama_supplier LIKE '%"+id+"%' "
                + "OR telepon LIKE '%"+id+"%' "
                + "OR alamat LIKE '%"+id+"%' ";
        
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelSupplier model = new ModelSupplier();
                model.setIdSupplier   (rs.getInt("id_supplier"));
                model.setNamaSupplier (rs.getString("nama_supplier"));
                model.setTeleponSupplier (rs.getString("telepon"));
                model.setAlamatSupplier (rs.getString("alamat"));
                                
                list.add(model);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean validasiNamaSupplier(ModelSupplier model) {
        PreparedStatement st = null;
        ResultSet rs = null;
        boolean valid = false;
        
        String sql = "SELECT nama_supplier FROM supplier "
                + "WHERE nama_supplier LIKE BINARY ? AND id_supplier !=?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, model.getNamaSupplier());
            st.setInt(2, model.getIdSupplier());
            rs = st.executeQuery();
            
            if(rs.next()){
                valid =  false;
            }else{
                valid = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try{
                if(rs != null){
                    rs.close();
                }
                if(st != null){
                    st.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        return valid;
    }

    @Override
    public List<ModelSupplier> ambilSupplier() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql ="SELECT id_supplier, nama_supplier FROM supplier";
        
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelSupplier model = new ModelSupplier();
                model.setIdSupplier   (rs.getInt("id_supplier"));
                model.setNamaSupplier (rs.getString("nama_supplier"));
                
                list.add(model);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public String ambilSupplierID(int id) {
        String namaSupplier = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql ="SELECT nama_supplier FROM supplier WHERE id_supplier=?";
        
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            if(rs.next()){
                namaSupplier = rs.getString("nama_supplier");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return namaSupplier;
    }
}
