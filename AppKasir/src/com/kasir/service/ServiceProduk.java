package com.kasir.service;

import com.kasir.model.ModelProduk;
import java.util.List;

public interface ServiceProduk {
    void tambahData     (ModelProduk model);
    void perbaruiData   (ModelProduk model);
    void hapusData      (ModelProduk model);
    
    List<ModelProduk>   tampilData();
    List<ModelProduk>   pencarianData(String id);
}
