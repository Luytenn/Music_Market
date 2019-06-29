package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenu mnNewMenu_2;
	private JMenu mnNewMenu_3;
	private JMenu mnNewMenu_4;
	private JMenu mnNewMenu_5;
	private JMenuItem mntmSalir;
	private JMenuItem mntmRealizarVentas;
	private JMenuItem mntmProductos;
	private JMenuItem mntmTrabajadores;
	private JMenuItem mntmTrabajador;
	private JMenuItem mntmProducto;
	private JMenuItem mntmTrabajadores_1;
	private JMenuItem mntmFactura;
	private JMenuItem mntmTrabajadoresPagados;
	private JMenuItem mntmTrabajadoresPendientes;
	private JMenuItem mntmReporteDeVentas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FrmPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 764, 569);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		mntmSalir = new JMenuItem("Salir");
		mnNewMenu.add(mntmSalir);
		
		mnNewMenu_1 = new JMenu("Ventas");
		menuBar.add(mnNewMenu_1);
		
		mntmRealizarVentas = new JMenuItem("Realizar Ventas");
		mnNewMenu_1.add(mntmRealizarVentas);
		
		mnNewMenu_2 = new JMenu("Mantenimientos");
		menuBar.add(mnNewMenu_2);
		
		mntmProductos = new JMenuItem("Productos");
		mnNewMenu_2.add(mntmProductos);
		
		mntmTrabajadores = new JMenuItem("Trabajadores");
		mnNewMenu_2.add(mntmTrabajadores);
		
		mnNewMenu_3 = new JMenu("Registro");
		menuBar.add(mnNewMenu_3);
		
		mntmTrabajador = new JMenuItem("Trabajador");
		mnNewMenu_3.add(mntmTrabajador);
		
		mntmProducto = new JMenuItem("Producto");
		mnNewMenu_3.add(mntmProducto);
		
		mnNewMenu_4 = new JMenu("Pagos");
		menuBar.add(mnNewMenu_4);
		
		mntmTrabajadores_1 = new JMenuItem("Trabajadores");
		mnNewMenu_4.add(mntmTrabajadores_1);
		
		mntmFactura = new JMenuItem("Factura");
		mnNewMenu_4.add(mntmFactura);
		
		mnNewMenu_5 = new JMenu("Reportes");
		menuBar.add(mnNewMenu_5);
		
		mntmTrabajadoresPagados = new JMenuItem("Trabajadores Pagados");
		mnNewMenu_5.add(mntmTrabajadoresPagados);
		
		mntmTrabajadoresPendientes = new JMenuItem("Trabajadores Pendientes");
		mnNewMenu_5.add(mntmTrabajadoresPendientes);
		
		mntmReporteDeVentas = new JMenuItem("Reporte de Ventas");
		mnNewMenu_5.add(mntmReporteDeVentas);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
