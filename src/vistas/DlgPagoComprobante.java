package vistas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.beans.FeatureDescriptor;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DlgPagoComprobante extends JDialog {
	private JTable tblSalida;

	DefaultTableModel modelo = new DefaultTableModel();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgPagoComprobante dialog = new DlgPagoComprobante();
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
	public DlgPagoComprobante() {
		setTitle("Pago Comprobante");
		setBounds(100, 100, 538, 387);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Comprobante");
			lblNewLabel.setBounds(23, 26, 100, 19);
			getContentPane().add(lblNewLabel);
		}
		{
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(110, 25, 170, 20);
			getContentPane().add(comboBox);
		}
		{
			JButton btnPagar = new JButton("Pagar");
			btnPagar.setBounds(352, 24, 89, 23);
			getContentPane().add(btnPagar);
		}
		{
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(23, 73, 474, 264);
			getContentPane().add(scrollPane);
			{
				tblSalida = new JTable();
				scrollPane.setViewportView(tblSalida);
			}
		}
		
		tblSalida.setModel(modelo);
		modelo.addColumn("Fecha Factura");
		modelo.addColumn("Cliente");
		modelo.addColumn("Trabajador");
		modelo.addColumn("Total");
		
	}

}
