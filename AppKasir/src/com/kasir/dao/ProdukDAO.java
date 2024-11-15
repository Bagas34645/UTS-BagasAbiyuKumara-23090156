package com.kasir.dao;

import com.kasir.config.Koneksi;
import com.kasir.model.ModelProduk;
import com.kasir.service.ServiceProduk;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

public class ProdukDAO implements ServiceProduk{

    private Connection conn;
    
    public ProdukDAO() {
        conn = Koneksi.getConnection();
    }
    
    @Override
    public void tambahData(ModelProduk model) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO produk(nama_produk, id_kategori,harga,stok,id_supplier,barcode) "
                    + "VALUES (?,?,?,?,?,?)";
            
            st = conn.prepareStatement(sql);
            st.setString    (1, model.getNamaProduk());
            st.setInt    (2, model.getIdKategori());
            st.setLong      (3, model.getHarga());
            st.setInt       (4, model.getStok());
            st.setInt    (5, model.getIdSupplier());
            st.setString    (6, model.getBarcode());
            
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void perbaruiData(ModelProduk model) {
        PreparedStatement st = null;
        try {
            String sql = "UPDATE produk SET nama_produk=?,id_kategori=?,"
                    + "harga=?,stok=?,id_supplier=?,barcode=? WHERE id_produk=?";
            
            st = conn.prepareStatement(sql);
            st.setString    (1, model.getNamaProduk());
            st.setInt    (2, model.getIdKategori());
            st.setLong      (3, model.getHarga());
            st.setInt       (4, model.getStok());
            st.setInt    (5, model.getIdSupplier());
            st.setString    (6, model.getBarcode());
            st.setInt       (7, model.getIdProduk());
            
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void hapusData(ModelProduk model) {
        PreparedStatement st = null;
        String sql = "DELETE FROM produk WHERE id_produk=?";
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, model.getIdProduk());
            st.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<ModelProduk> tampilData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql ="SELECT * FROM produk";
        
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelProduk produk = new ModelProduk();
                produk.setIdProduk   (rs.getInt("id_produk"));
                produk.setNamaProduk (rs.getString("nama_produk"));
                produk.setIdKategori (rs.getInt("id_kategori"));
                produk.setHarga      (rs.getLong("harga"));
                produk.setStok       (rs.getInt("stok"));
                produk.setIdSupplier (rs.getInt("id_supplier"));
                produk.setBarcode    (rs.getString("barcode"));
                
                list.add(produk);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ModelProduk> pencarianData(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql ="SELECT * FROM produk WHERE nama_produk LIKE '%"+id+"%' "
                + "OR id_kategori LIKE '%"+id+"%' "
                + "OR id_supplier LIKE '%"+id+"%' "
                + "OR barcode LIKE '%"+id+"%'";
        
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelProduk produk = new ModelProduk();
                produk.setIdProduk   (rs.getInt("id_produk"));
                produk.setNamaProduk (rs.getString("nama_produk"));
                produk.setIdKategori (rs.getInt("id_kategori"));
                produk.setHarga      (rs.getLong("harga"));
                produk.setStok       (rs.getInt("stok"));
                produk.setIdSupplier (rs.getInt("id_supplier"));
                produk.setBarcode    (rs.getString("barcode"));
                
                list.add(produk);
            }
            rs.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
