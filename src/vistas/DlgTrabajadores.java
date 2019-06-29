package vistas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;

public class DlgTrabajadores extends JDialog {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JDateChooser dateChooser;
	private JComboBox comboBox;
	private JTextField textField_3;
	private JTextField textField_4;
	private JComboBox comboBox_1;
	private JTextField textField_5;
	private JComboBox comboBox_2;
	private JTextField textField_6;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgTrabajadores dialog = new DlgTrabajadores();
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
	public DlgTrabajadores() {
		setTitle("Registro de Trabajador");
		setBounds(100, 100, 479, 427);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("C\u00F3digo");
		lblNewLabel.setBounds(21, 45, 69, 14);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Nombres");
		lblNewLabel_1.setBounds(21, 70, 69, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Apellidos");
		lblNewLabel_2.setBounds(21, 95, 69, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Fecha de Registro");
		lblNewLabel_3.setBounds(21, 120, 96, 14);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Tipo de Trabajo");
		lblNewLabel_4.setBounds(21, 145, 81, 14);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Sueldo");
		lblNewLabel_5.setBounds(21, 170, 69, 14);
		getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Carnet de Sanidad");
		lblNewLabel_6.setBounds(21, 195, 96, 14);
		getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Tipo de documento");
		lblNewLabel_7.setBounds(21, 220, 96, 14);
		getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Nro Documento");
		lblNewLabel_8.setBounds(21, 245, 81, 14);
		getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Distrito");
		lblNewLabel_9.setBounds(21, 272, 69, 14);
		getContentPane().add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Direcci\u00F3n");
		lblNewLabel_10.setBounds(21, 297, 69, 14);
		getContentPane().add(lblNewLabel_10);
		
		textField = new JTextField();
		textField.setBounds(79, 42, 155, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(79, 67, 155, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(79, 92, 155, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(122, 120, 155, 20);
		getContentPane().add(dateChooser);
		
		comboBox = new JComboBox();
		comboBox.setBounds(122, 142, 112, 20);
		getContentPane().add(comboBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(122, 167, 112, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(122, 192, 112, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setBounds(122, 217, 112, 20);
		getContentPane().add(comboBox_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(120, 242, 114, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setBounds(122, 269, 112, 20);
		getContentPane().add(comboBox_2);
		
		textField_6 = new JTextField();
		textField_6.setBounds(81, 294, 153, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		btnNewButton = new JButton("Registrar");
		btnNewButton.setBounds(302, 66, 89, 23);
		getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("Limpiar");
		btnNewButton_1.setBounds(302, 116, 89, 23);
		getContentPane().add(btnNewButton_1);
	}
}
