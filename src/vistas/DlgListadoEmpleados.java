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

public class DlgListadoEmpleados extends JDialog {
	private JTable tblEmpleado;
	DefaultTableModel modelo = new DefaultTableModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgListadoEmpleados dialog = new DlgListadoEmpleados();
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
	public DlgListadoEmpleados() {
		setBounds(100, 100, 676, 477);
		getContentPane().setLayout(null);
		{
			JButton btnAceptar = new JButton("OK");
			btnAceptar.setBounds(209, 404, 89, 23);
			getContentPane().add(btnAceptar);
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(338, 404, 89, 23);
			getContentPane().add(btnCancelar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(25, 22, 606, 356);
			getContentPane().add(scrollPane);
			{
				tblEmpleado = new JTable();
				scrollPane.setViewportView(tblEmpleado);
			}
		}
		
		
		modelo.addColumn("Codigo");
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellido");
		tblEmpleado.setModel(modelo);
		
	}

}
