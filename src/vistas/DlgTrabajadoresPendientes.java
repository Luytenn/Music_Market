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

public class DlgTrabajadoresPendientes extends JDialog {
	private JScrollPane scrollPane;
	private JTable tblSalida;
	
	DefaultTableModel modelo = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgTrabajadoresPendientes dialog = new DlgTrabajadoresPendientes();
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
	public DlgTrabajadoresPendientes() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 251, 434, 10);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
		}
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 239);
		getContentPane().add(scrollPane);
		
		tblSalida = new JTable();
		scrollPane.setViewportView(tblSalida);
	
		modelo.addColumn("Codigo");
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellido");
		modelo.addColumn("Tipo");
		modelo.addColumn("Distrito");
		
		tblSalida.setModel(modelo);
		
	
	
	}
}
