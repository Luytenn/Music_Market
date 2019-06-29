package vistas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;

public class DlgVentas extends JDialog {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JTextField txtnumero;
	private JTextField txtempleado;
	private JTextField txtcliente;
	private JTextField txtcategoria;
	private JTextField txtcodigoproducto;
	private JTextField txtproducto;
	private JTextField txtcosto;
	private JTextField txtTotal;
	private JButton btnAñadirCarrito;
	private JButton btnLimpiar;
	private JButton btnGenerarComprobante;
	private JButton btnBuscarEmpleado;
	private JButton btnBuscarProducto;
	private JScrollPane JScrollPaneSalida;
	private JSpinner txtcantidad;
	private JDateChooser txtFecha;
	private JTable tblSalida;
	DefaultTableModel modelo = new DefaultTableModel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgVentas dialog = new DlgVentas();
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
	public DlgVentas() {
		setBounds(100, 100, 576, 490);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("N\u00FAmero");
		lblNewLabel.setBounds(22, 28, 57, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Fecha");
		lblNewLabel_1.setBounds(22, 53, 57, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Empleado");
		lblNewLabel_2.setBounds(22, 78, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Cliente");
		lblNewLabel_3.setBounds(22, 103, 46, 14);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Categor\u00EDa");
		lblNewLabel_4.setBounds(22, 128, 57, 14);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("C\u00F3digo Producto");
		lblNewLabel_5.setBounds(22, 153, 79, 14);
		getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Producto");
		lblNewLabel_6.setBounds(22, 178, 46, 14);
		getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Cantidad");
		lblNewLabel_7.setBounds(22, 203, 46, 14);
		getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Costo");
		lblNewLabel_8.setBounds(22, 228, 46, 14);
		getContentPane().add(lblNewLabel_8);
		
		txtnumero = new JTextField();
		txtnumero.setBounds(89, 25, 86, 20);
		getContentPane().add(txtnumero);
		txtnumero.setColumns(10);
		
		txtempleado = new JTextField();
		txtempleado.setBounds(89, 75, 86, 20);
		getContentPane().add(txtempleado);
		txtempleado.setColumns(10);
		
		txtcliente = new JTextField();
		txtcliente.setBounds(89, 100, 86, 20);
		getContentPane().add(txtcliente);
		txtcliente.setColumns(10);
		
		txtcategoria = new JTextField();
		txtcategoria.setBounds(89, 125, 86, 20);
		getContentPane().add(txtcategoria);
		txtcategoria.setColumns(10);
		
		txtcodigoproducto = new JTextField();
		txtcodigoproducto.setBounds(113, 153, 86, 17);
		getContentPane().add(txtcodigoproducto);
		txtcodigoproducto.setColumns(10);
		
		txtproducto = new JTextField();
		txtproducto.setBounds(89, 178, 86, 14);
		getContentPane().add(txtproducto);
		txtproducto.setColumns(10);
		
		txtcosto = new JTextField();
		txtcosto.setBounds(89, 228, 86, 17);
		getContentPane().add(txtcosto);
		txtcosto.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(265, 25, 207, 67);
		getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		btnAñadirCarrito = new JButton("A\u00F1adir el Carrito");
		btnAñadirCarrito.setBounds(300, 99, 143, 23);
		getContentPane().add(btnAñadirCarrito);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(300, 149, 143, 23);
		getContentPane().add(btnLimpiar);
		
		btnGenerarComprobante = new JButton("Generar Comprobante");
		btnGenerarComprobante.setBounds(300, 199, 143, 23);
		getContentPane().add(btnGenerarComprobante);
		
		btnBuscarEmpleado = new JButton("");
		btnBuscarEmpleado.setBounds(185, 74, 46, 23);
		getContentPane().add(btnBuscarEmpleado);
		
		btnBuscarProducto = new JButton("");
		btnBuscarProducto.setBounds(209, 149, 46, 23);
		getContentPane().add(btnBuscarProducto);
		
		JScrollPaneSalida = new JScrollPane();
		JScrollPaneSalida.setBounds(22, 253, 515, 187);
		getContentPane().add(JScrollPaneSalida);
		
		tblSalida = new JTable();
		JScrollPaneSalida.setViewportView(tblSalida);
	
		
		modelo.addColumn("Numero Factura");
		modelo.addColumn("Codigo del Producto");
		modelo.addColumn("Nombre del Producto");
		modelo.addColumn("Cantidad Vendida");
		modelo.addColumn("Precio Unitario");
		modelo.addColumn("Subtotal");
		
		tblSalida.setModel(modelo);
	
		
		txtcantidad = new JSpinner();
		txtcantidad.setBounds(89, 200, 86, 20);
		getContentPane().add(txtcantidad);
		
		txtFecha = new JDateChooser();
		txtFecha.setBounds(88, 53, 87, 20);
		getContentPane().add(txtFecha);
		
		
		
		
	}
}
