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

public class DlgListadoProducto extends JDialog {
	private JTable tblProducto;
	DefaultTableModel modelo = new DefaultTableModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgListadoProducto dialog = new DlgListadoProducto();
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
	public DlgListadoProducto() {
		setBounds(100, 100, 642, 450);
		getContentPane().setLayout(null);
		{
			JButton btnAceptar = new JButton("Aceptar");
			btnAceptar.setBounds(202, 359, 89, 23);
			getContentPane().add(btnAceptar);
		}
		{
			JButton btnCancelar = new JButton("Cancelar");
			btnCancelar.setBounds(301, 359, 89, 23);
			getContentPane().add(btnCancelar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 22, 595, 325);
			getContentPane().add(scrollPane);
			{
				tblProducto = new JTable();
				scrollPane.setViewportView(tblProducto);
			}
		}
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Codigo del producto");
		modelo.addColumn("Descripcion");
		modelo.addColumn("Categoria");
		modelo.addColumn("Precio");
		modelo.addColumn("Estado");
		tblProducto.setModel(modelo);
		
		
	}

}
