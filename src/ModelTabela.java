

import aulas.interfacegrafica.ModelCliente;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Wallyson M. Lima
 */
public class ModelTabela extends AbstractTableModel{
    private static final String[] colunas = {"ID", "CPF/CNPJ", "Nome", "Email", "Telefone", "Endereço"};
    private ArrayList<ModelCliente> clientes;

    @Override
    public int getRowCount() {
        return clientes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModelCliente cliente = clientes.get(rowIndex);
        switch(columnIndex){
            case 0: return cliente.getId();
            case 1: return cliente.getCPFCNPJ();
            case 2: return cliente.getNome();
            case 3: return cliente.getEmail();
            case 4: return cliente.getTelefone();
            case 5: return cliente.getEndereco();
            default: return null;
            
            
        }
    }

    /*public String getColumnName(int column){
        return colunas[column];
    }
    */

}
