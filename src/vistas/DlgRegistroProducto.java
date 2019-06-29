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

public class DlgRegistroProducto extends JDialog {
	private JTextField txtCodigo;
	private JTextField txtDescripcion;
	private JTextField txtPrecio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgRegistroProducto dialog = new DlgRegistroProducto();
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
	public DlgRegistroProducto() {
		setTitle("Registrar Producto");
		setBounds(100, 100, 492, 340);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("C\u00F3digo :");
			lblNewLabel.setBounds(28, 58, 46, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Descripci\u00F3n");
			lblNewLabel_1.setBounds(28, 83, 67, 14);
			getContentPane().add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Categor\u00EDa");
			lblNewLabel_2.setBounds(28, 108, 67, 14);
			getContentPane().add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Precio :");
			lblNewLabel_3.setBounds(28, 133, 46, 14);
			getContentPane().add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Estado :");
			lblNewLabel_4.setBounds(28, 158, 46, 14);
			getContentPane().add(lblNewLabel_4);
		}
		{
			txtCodigo = new JTextField();
			txtCodigo.setBounds(114, 55, 86, 20);
			getContentPane().add(txtCodigo);
			txtCodigo.setColumns(10);
		}
		{
			txtDescripcion = new JTextField();
			txtDescripcion.setBounds(114, 80, 133, 20);
			getContentPane().add(txtDescripcion);
			txtDescripcion.setColumns(10);
		}
		{
			JComboBox cboCategoria = new JComboBox();
			cboCategoria.setBounds(114, 105, 133, 20);
			getContentPane().add(cboCategoria);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setBounds(114, 130, 86, 20);
			getContentPane().add(txtPrecio);
			txtPrecio.setColumns(10);
		}
		{
			JComboBox cboEstado = new JComboBox();
			cboEstado.setBounds(114, 155, 86, 20);
			getContentPane().add(cboEstado);
		}
		{
			JButton btnRegistrar = new JButton("Registrar");
			btnRegistrar.setBounds(284, 54, 89, 23);
			getContentPane().add(btnRegistrar);
		}
		{
			JButton btnLimpiar = new JButton("Limpiar");
			btnLimpiar.setBounds(284, 104, 89, 23);
			getContentPane().add(btnLimpiar);
		}
	}

}
