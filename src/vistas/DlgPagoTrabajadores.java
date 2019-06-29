package vistas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DlgPagoTrabajadores extends JDialog {
	private JTable tblTrabajador;
	
	DefaultTableModel modelo = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgPagoTrabajadores dialog = new DlgPagoTrabajadores();
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
	public DlgPagoTrabajadores() {
		setTitle("Pago Trabajadores");
		setBounds(100, 100, 490, 358);
		getContentPane().setLayout(null);
		{
			JLabel lblTrabajador = new JLabel("Trabajador");
			lblTrabajador.setBounds(23, 28, 80, 14);
			getContentPane().add(lblTrabajador);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(99, 25, 183, 20);
			getContentPane().add(comboBox);
		}
		{
			JButton btnPagar = new JButton("Pagar");
			btnPagar.setBounds(331, 24, 89, 23);
			getContentPane().add(btnPagar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 68, 454, 240);
			getContentPane().add(scrollPane);
			{
				tblTrabajador = new JTable();
				scrollPane.setViewportView(tblTrabajador);
			}
		}
		
		tblTrabajador.setModel(modelo);
		modelo.addColumn("Nombre");
		modelo.addColumn("Apellido");
		modelo.addColumn("Fecha de Ingreso");
		modelo.addColumn("Sueldo");
		modelo.addColumn("Nro de Documento");
		
	}

}
