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

public class DlgMantenimientoListarTrabajador extends JDialog {
	private JTable tblSalida;
	DefaultTableModel modelo = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgMantenimientoListarTrabajador dialog = new DlgMantenimientoListarTrabajador();
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
	public DlgMantenimientoListarTrabajador() {
		setTitle("Trabajadores");
		setBounds(100, 100, 834, 340);
		getContentPane().setLayout(null);
		{
			JButton btnAceptar = new JButton("OK");
			btnAceptar.setBounds(276, 267, 89, 23);
			getContentPane().add(btnAceptar);
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(392, 267, 89, 23);
			getContentPane().add(btnCancelar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 11, 782, 228);
			getContentPane().add(scrollPane);
			{
				tblSalida = new JTable();
				scrollPane.setViewportView(tblSalida);
			}
		}
		
		tblSalida.setModel(modelo);
		modelo.addColumn("Codigo");
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellido");
		modelo.addColumn("Fecha");
		modelo.addColumn("Tipo");
		modelo.addColumn("Sueldo");
		modelo.addColumn("Carnet");
		modelo.addColumn("Documento");
		modelo.addColumn("Nro Documento");
		modelo.addColumn("Estado");
		modelo.addColumn("Distrito");
		modelo.addColumn("Direccion");
		
	}

}
