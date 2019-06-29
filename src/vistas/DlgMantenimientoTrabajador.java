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

public class DlgMantenimientoTrabajador extends JDialog {
	private JLabel C;
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
	private JTextField txtCodigoTrabajador;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JDateChooser txtFecha;
	private JComboBox cboTipoTrabajador;
	private JTextField txtSueldo;
	private JTextField txtCarnetSanidad;
	private JComboBox cboTipoDocumento;
	private JTextField txtNumeroDocumento;
	private JTextField txtDireccion;
	private JComboBox cboDistrito;
	private JButton btnActualizar;
	private JButton btnLimpiar;
	private JButton btnEliminar;
	private JButton btnBuscarCodigo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgMantenimientoTrabajador dialog = new DlgMantenimientoTrabajador();
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
	public DlgMantenimientoTrabajador() {
		setTitle("Mantenimiento de Trabajadores");
		setBounds(100, 100, 564, 435);
		getContentPane().setLayout(null);
		
		C = new JLabel("C\u00F3digo :");
		C.setBounds(35, 35, 72, 14);
		getContentPane().add(C);
		
		lblNewLabel_1 = new JLabel("Nombre :");
		lblNewLabel_1.setBounds(35, 60, 72, 14);
		getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Apellidos :");
		lblNewLabel_2.setBounds(35, 88, 72, 14);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Fecha Registro :");
		lblNewLabel_3.setBounds(35, 113, 91, 14);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Tipo Trabajador :");
		lblNewLabel_4.setBounds(35, 138, 91, 14);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Sueldo");
		lblNewLabel_5.setBounds(35, 163, 46, 14);
		getContentPane().add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Carnet de Sanidad");
		lblNewLabel_6.setBounds(35, 188, 91, 14);
		getContentPane().add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Tipo Documento");
		lblNewLabel_7.setBounds(35, 213, 91, 14);
		getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Nro Documento");
		lblNewLabel_8.setBounds(35, 243, 91, 14);
		getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Distrito");
		lblNewLabel_9.setBounds(35, 268, 46, 14);
		getContentPane().add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Direcci\u00F3n");
		lblNewLabel_10.setBounds(35, 293, 46, 14);
		getContentPane().add(lblNewLabel_10);
		
		txtCodigoTrabajador = new JTextField();
		txtCodigoTrabajador.setBounds(100, 32, 126, 20);
		getContentPane().add(txtCodigoTrabajador);
		txtCodigoTrabajador.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(99, 57, 127, 20);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(100, 85, 126, 20);
		getContentPane().add(txtApellido);
		txtApellido.setColumns(10);
		
		txtFecha = new JDateChooser();
		txtFecha.setBounds(140, 107, 126, 20);
		getContentPane().add(txtFecha);
		
		cboTipoTrabajador = new JComboBox();
		cboTipoTrabajador.setBounds(136, 135, 127, 20);
		getContentPane().add(cboTipoTrabajador);
		
		txtSueldo = new JTextField();
		txtSueldo.setBounds(140, 160, 123, 20);
		getContentPane().add(txtSueldo);
		txtSueldo.setColumns(10);
		
		txtCarnetSanidad = new JTextField();
		txtCarnetSanidad.setBounds(140, 185, 126, 20);
		getContentPane().add(txtCarnetSanidad);
		txtCarnetSanidad.setColumns(10);
		
		cboTipoDocumento = new JComboBox();
		cboTipoDocumento.setBounds(136, 210, 130, 20);
		getContentPane().add(cboTipoDocumento);
		
		txtNumeroDocumento = new JTextField();
		txtNumeroDocumento.setBounds(136, 240, 127, 20);
		getContentPane().add(txtNumeroDocumento);
		txtNumeroDocumento.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(140, 290, 126, 20);
		getContentPane().add(txtDireccion);
		txtDireccion.setColumns(10);
		
		cboDistrito = new JComboBox();
		cboDistrito.setBounds(134, 265, 132, 20);
		getContentPane().add(cboDistrito);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(352, 60, 89, 23);
		getContentPane().add(btnActualizar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(352, 104, 89, 23);
		getContentPane().add(btnLimpiar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(352, 154, 89, 23);
		getContentPane().add(btnEliminar);
		
		btnBuscarCodigo = new JButton("");
		btnBuscarCodigo.setBounds(237, 31, 39, 23);
		getContentPane().add(btnBuscarCodigo);
	}
}
