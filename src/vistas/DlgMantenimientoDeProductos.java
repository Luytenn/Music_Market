package vistas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class DlgMantenimientoDeProductos extends JDialog {
	private JTextField txtCodigo;
	private JTextField txtDescripcion;
	private JTextField txtPrecio;
	private JTextField txtEstado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgMantenimientoDeProductos dialog = new DlgMantenimientoDeProductos();
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
	public DlgMantenimientoDeProductos() {
		setTitle("Mantenimiento de Productos");
		setBounds(100, 100, 560, 379);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("C\u00F3digo :");
			lblNewLabel.setBounds(41, 72, 92, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Descripci\u00F3n");
			lblNewLabel_1.setBounds(41, 97, 92, 14);
			getContentPane().add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Categor\u00EDa");
			lblNewLabel_2.setBounds(41, 122, 92, 14);
			getContentPane().add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Precio : ");
			lblNewLabel_3.setBounds(41, 147, 78, 14);
			getContentPane().add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Estado : ");
			lblNewLabel_4.setBounds(41, 172, 46, 14);
			getContentPane().add(lblNewLabel_4);
		}
		{
			txtCodigo = new JTextField();
			txtCodigo.setBounds(117, 69, 111, 20);
			getContentPane().add(txtCodigo);
			txtCodigo.setColumns(10);
		}
		{
			txtDescripcion = new JTextField();
			txtDescripcion.setBounds(117, 97, 111, 20);
			getContentPane().add(txtDescripcion);
			txtDescripcion.setColumns(10);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setBounds(117, 147, 86, 20);
			getContentPane().add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			txtEstado = new JTextField();
			txtEstado.setBounds(117, 172, 86, 20);
			getContentPane().add(txtEstado);
			txtEstado.setColumns(10);
		}
		{
			JButton btnBuscar = new JButton("");
			btnBuscar.setBounds(256, 72, 46, 23);
			getContentPane().add(btnBuscar);
		}
		{
			JButton btnActualizar = new JButton("Actualizar");
			btnActualizar.setBounds(344, 58, 92, 43);
			getContentPane().add(btnActualizar);
		}
		{
			JButton btnLimpiar = new JButton("Limpiar");
			btnLimpiar.setBounds(344, 122, 92, 39);
			getContentPane().add(btnLimpiar);
		}
		{
			JComboBox cboCategoria = new JComboBox();
			cboCategoria.setBounds(117, 122, 111, 20);
			getContentPane().add(cboCategoria);
		}
	}

}
