package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;

/**
 *
 * @author joice
 */
public class DeadlineColumnCellRenderer extends DefaultTableCellRenderer {
   
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int col){
        
        JLabel label;
        label = (JLabel)super.getTableCellRendererComponent(table, value, 
                isSelected, hasFocus, row, col);
        
        label.setHorizontalAlignment(CENTER);
        
        TaskTableModel taskModel = (TaskTableModel) table.getModel();
        Task task = taskModel.getTasks().get(row);
        
        if(task.getDeadline().after(new Date())){
            label.setBackground(Color.cyan.darker());
        } else {
            label.setBackground(Color.MAGENTA.darker());
        }
        
        return label;
    }
    
}
