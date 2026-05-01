package empmanagementsystem;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class EmployeeUI extends JFrame {
	 JTextField nameField, deptField, salaryField;
	    JTable table;
	    DefaultTableModel model;

	    public EmployeeUI() {
	        setTitle("Employee Management System");
	        setSize(700,500);
	        setLayout(null);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);

	        JLabel l1 = new JLabel("Name:");
	        l1.setBounds(20,20,80,25);
	        add(l1);

	        nameField = new JTextField();
	        nameField.setBounds(100,20,150,25);
	        add(nameField);

	        JLabel l2 = new JLabel("Dept:");
	        l2.setBounds(20,60,80,25);
	        add(l2);

	        deptField = new JTextField();
	        deptField.setBounds(100,60,150,25);
	        add(deptField);

	        JLabel l3 = new JLabel("Salary:");
	        l3.setBounds(20,100,80,25);
	        add(l3);

	        salaryField = new JTextField();
	        salaryField.setBounds(100,100,150,25);
	        add(salaryField);

	        JButton addBtn = new JButton("Add");
	        addBtn.setBounds(20,140,80,30);
	        add(addBtn);

	        JButton deleteBtn = new JButton("Delete");
	        deleteBtn.setBounds(120,140,80,30);
	        add(deleteBtn);

	        JButton refreshBtn = new JButton("Refresh");
	        refreshBtn.setBounds(220,140,100,30);
	        add(refreshBtn);

	        model = new DefaultTableModel();
	        model.setColumnIdentifiers(new String[]{"ID","Name","Dept","Salary"});
	        table = new JTable(model);

	        JScrollPane sp = new JScrollPane(table);
	        sp.setBounds(300,20,350,300);
	        add(sp);

	        // Add action
	        addBtn.addActionListener(e -> {
	            String name = nameField.getText();
	            String dept = deptField.getText();
	            double sal = Double.parseDouble(salaryField.getText());
	            EmployeeDAO.addEmployee(name,dept,sal);
	            loadTable();
	        });

	        // Delete action
	        deleteBtn.addActionListener(e -> {
	            int row = table.getSelectedRow();
	            if(row != -1){
	                int id = Integer.parseInt(model.getValueAt(row,0).toString());
	                EmployeeDAO.deleteEmployee(id);
	                loadTable();
	            }
	        });

	        // Refresh
	        refreshBtn.addActionListener(e -> loadTable());

	        loadTable();
	        setVisible(true);
	    }

	    void loadTable(){
	        model.setRowCount(0);
	        List<String[]> list = EmployeeDAO.getAllEmployees();
	        for(String[] row : list){
	            model.addRow(row);
	        }
	    }

	public static void main(String[] args) {
		new EmployeeUI();

	}

}
