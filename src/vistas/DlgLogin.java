package vistas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DlgLogin extends JDialog {
	private JTextField txtUsuario;
	private JTextField txtContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgLogin dialog = new DlgLogin();
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
	public DlgLogin() {
		setTitle("Login");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Usuario");
			lblNewLabel.setBounds(72, 74, 46, 14);
			getContentPane().add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
			lblNewLabel_1.setBounds(72, 112, 66, 14);
			getContentPane().add(lblNewLabel_1);
		}
		{
			txtUsuario = new JTextField();
			txtUsuario.setBounds(142, 71, 125, 20);
			getContentPane().add(txtUsuario);
			txtUsuario.setColumns(10);
		}
		{
			txtContraseña = new JTextField();
			txtContraseña.setBounds(142, 109, 125, 20);
			getContentPane().add(txtContraseña);
			txtContraseña.setColumns(10);
		}
		{
			JButton btnIngresar = new JButton("Ingresar");
			btnIngresar.setBounds(142, 171, 89, 23);
			getContentPane().add(btnIngresar);
		}
	}

}
