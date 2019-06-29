package vistas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DlgTrabajadoresPagados extends JDialog {
	private JTable tblSalida;
	
	DefaultTableModel modelo = new DefaultTableModel();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgTrabajadoresPagados dialog = new DlgTrabajadoresPagados();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgTrabajadoresPagados() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 11, 414, 239);
			getContentPane().add(scrollPane);
			
			tblSalida = new JTable();
			scrollPane.setViewportView(tblSalida);
		}
		
		tblSalida.setModel(modelo);
		modelo.addColumn("Codigo");
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellido");
		modelo.addColumn("Tipo");
		modelo.addColumn("Distrito");
		
	}
}
