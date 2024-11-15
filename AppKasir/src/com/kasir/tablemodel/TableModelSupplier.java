package com.kasir.tablemodel;

import com.kasir.model.ModelSupplier;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class TableModelSupplier extends AbstractTableModel{

    private List<ModelSupplier> list = new ArrayList<>();

    public ModelSupplier getData(int index){
        return list.get(index);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<ModelSupplier> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void insertData(ModelSupplier model){
        list.add(model);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, ModelSupplier model){
        list.set(row, model);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diperbarui");
    }
    
    public void deleteData(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    private final String[] columnNames = {"ID","Nama Supplier","Telepon","Alamat"};
    
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
    ModelSupplier model = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return "     " + model.getIdSupplier();
            case 1:
                return model.getNamaSupplier();
            case 2:
                return model.getTeleponSupplier();
            case 3:
                return model.getAlamatSupplier();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
}
