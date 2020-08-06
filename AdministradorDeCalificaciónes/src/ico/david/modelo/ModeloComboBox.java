/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.david.modelo;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author Ariok David
 */
public class ModeloComboBox implements ComboBoxModel<String>{
    private ArrayList<String> lista;
    private String seleccionado;

    public ModeloComboBox() {
    }

    public ModeloComboBox(ArrayList<String> lista, String seleccionado) {
        this.lista = lista;
        this.seleccionado = seleccionado;
    }

    @Override
    public void setSelectedItem(Object anItem) {
       seleccionado = (String)anItem; 
    }

    @Override
    public Object getSelectedItem() {
        return seleccionado;
    }

    @Override
    public int getSize() {
        return lista.size();
    }

    @Override
    public String getElementAt(int index) {
        return lista.get(index);
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        //Puede que me sirva.
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        
    }
    
}
