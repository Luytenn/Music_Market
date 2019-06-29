package vistas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class DlgReporteVentas extends JDialog {
	private JDateChooser txtFecha1;
	private JDateChooser txtFecha2;
	private JButton btnConsultar;
	private JScrollPane scrollPane;
	private JTable tblVentas;
	
	DefaultTableModel modelo = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgReporteVentas dialog = new DlgReporteVentas();
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
	public DlgReporteVentas() {
		setBounds(100, 100, 593, 391);
		getContentPane().setLayout(null);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 342, 577, 10);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane);
		}
		{
			JLabel lblDesde = new JLabel("Desde :");
			lblDesde.setBounds(20, 25, 46, 14);
			getContentPane().add(lblDesde);
		}
		{
			JLabel lblHasta = new JLabel("Hasta :");
			lblHasta.setBounds(255, 25, 46, 14);
			getContentPane().add(lblHasta);
		}
		
		txtFecha1 = new JDateChooser();
		txtFecha1.setBounds(59, 19, 186, 20);
		getContentPane().add(txtFecha1);
		
		txtFecha2 = new JDateChooser();
		txtFecha2.setBounds(294, 19, 170, 20);
		getContentPane().add(txtFecha2);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(478, 21, 89, 23);
		getContentPane().add(btnConsultar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 60, 536, 271);
		getContentPane().add(scrollPane);
		
		tblVentas = new JTable();
		scrollPane.setViewportView(tblVentas);
		
		
		modelo.addColumn("Numero Factura");
		modelo.addColumn("Codigo del Producto");
		modelo.addColumn("Cantidad Vendida");
		modelo.addColumn("Subtotal");
		tblVentas.setModel(modelo);
		
	}
}
