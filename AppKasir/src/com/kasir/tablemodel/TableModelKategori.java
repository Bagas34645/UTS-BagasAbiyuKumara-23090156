package com.kasir.tablemodel;

import com.kasir.model.ModelKategori;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class TableModelKategori extends AbstractTableModel{

    private List<ModelKategori> list = new ArrayList<>();

    public ModelKategori getData(int index){
        return list.get(index);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<ModelKategori> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void insertData(ModelKategori model){
        list.add(model);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, ModelKategori model){
        list.set(row, model);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
    }
    
    public void deleteData(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    private final String[] columnNames = {"ID","Nama Kategori"};
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    ModelKategori model = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return "     " + model.getIdKategori();
            case 1:
                return model.getNamaKategori();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
}
