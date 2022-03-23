package interfaces_practica1_zoe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

public class Final extends JFrame {

	private JPanel contentPane;
	private Controlador controlador1;
	private JTextField tfFecha1;
	private JTextField lbEvento1;
	private JTextField lbCocina1;
	private JButton btnFormulario;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Final() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(216, 191, 216));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbFecha = new JLabel("Fecha:");
		lbFecha.setFont(new Font("Blackadder ITC", Font.PLAIN, 14));
		lbFecha.setBounds(176, 70, 46, 14);
		contentPane.add(lbFecha);
		
		JLabel lbTipoEvento = new JLabel("Tipo de evento:");
		lbTipoEvento.setFont(new Font("Blackadder ITC", Font.PLAIN, 14));
		lbTipoEvento.setBounds(158, 124, 144, 14);
		contentPane.add(lbTipoEvento);
		
		JLabel lblTipoDeCocina = new JLabel("Tipo de cocina:");
		lblTipoDeCocina.setFont(new Font("Blackadder ITC", Font.PLAIN, 14));
		lblTipoDeCocina.setBounds(158, 178, 160, 14);
		contentPane.add(lblTipoDeCocina);
		
		tfFecha1 = new JTextField();
		tfFecha1.setColumns(10);
		tfFecha1.setBounds(122, 94, 191, 20);
		contentPane.add(tfFecha1);
		
		lbEvento1 = new JTextField();
		lbEvento1.setColumns(10);
		lbEvento1.setBounds(122, 148, 191, 20);
		contentPane.add(lbEvento1);
		
		lbCocina1 = new JTextField();
		lbCocina1.setColumns(10);
		lbCocina1.setBounds(122, 202, 191, 20);
		contentPane.add(lbCocina1);
		
		controlador1=new Controlador();;
		tfFecha1.setText(controlador1.obtenerFecha());
		lbEvento1.setText(controlador1.obtenerTipoDeEvento());
		lbCocina1.setText(controlador1.obtenerTipoCocina());
		
		lblNewLabel = new JLabel("DATOS DE SU RESERVA");
		lblNewLabel.setFont(new Font("Bell MT", Font.ITALIC, 10));
		lblNewLabel.setBounds(148, 40, 170, 29);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Final.class.getResource("/img/pngfind.com-marcos-para-fotos-png-3319863.png")));
		lblNewLabel_1.setBackground(new Color(46, 139, 87));
		lblNewLabel_1.setBounds(0, 0, 436, 263);
		contentPane.add(lblNewLabel_1);
	}
}
