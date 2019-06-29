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

public class DlgMantenimientoListadoProductos extends JDialog {
	private JTable tblSalida;

	DefaultTableModel modelo = new DefaultTableModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgMantenimientoListadoProductos dialog = new DlgMantenimientoListadoProductos();
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
	public DlgMantenimientoListadoProductos() {
		setBounds(100, 100, 698, 377);
		getContentPane().setLayout(null);
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(221, 304, 89, 23);
			getContentPane().add(btnAceptar);
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(320, 304, 89, 23);
			getContentPane().add(btnCancelar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 23, 662, 266);
			getContentPane().add(scrollPane);
			{
				tblSalida = new JTable();
				scrollPane.setViewportView(tblSalida);
			}
		}
		
		
		tblSalida.setModel(modelo);
		modelo.addColumn("Codigo");
		modelo.addColumn("Descripcion");
		modelo.addColumn("Cateoria");
		modelo.addColumn("Precio");
		modelo.addColumn("Estado");
	}

}
