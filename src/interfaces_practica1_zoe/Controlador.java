package interfaces_practica1_zoe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;
import javax.swing.border.EtchedBorder;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

import interfaces_practica1_zoe.dialogoBanquete;
import interfaces_practica1_zoe.dialogoCongreso;

public class Controlador extends JFrame {

	private JPanel contentPane;
	private JTextField tfNombre;
	private JTextField tfTelefono;
	//private dialogoCongreso dialog;
	//private dialogoBanquete dialog1;
	private JLabel lbNombre;
	private JComboBox comboBoxDia;
	private JComboBox comboBoxMes; 
	private JComboBox comboBoxAno;
	private JLabel lbTelefono;
	private JRadioButton rbtnBanquete;
	private JRadioButton rbtnJornada;
	private JRadioButton rbtnCongreso;
	private JRadioButton rbtnBufe;
	private JRadioButton rbtnCarta;
	private JRadioButton rbtnCitaChef;
	private JRadioButton rbtnNoPrecisa;
	private JButton btnAceptar;
	private Final ventanafinal;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Controlador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 610);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 192, 203));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbNombre = new JLabel("Nombre:");
		lbNombre.setFont(new Font("Blackadder ITC", Font.PLAIN, 18));
		lbNombre.setBounds(5, 5, 166, 14);
		contentPane.add(lbNombre);
		
		tfNombre = new JTextField();
		tfNombre.setToolTipText("Name");
		tfNombre.setBounds(181, 5, 476, 20);
		contentPane.add(tfNombre);
		tfNombre.setColumns(10);
		
		lbTelefono = new JLabel("Tel\u00E9fono:");
		lbTelefono.setFont(new Font("Blackadder ITC", Font.PLAIN, 18));
		lbTelefono.setBounds(5, 30, 166, 14);
		contentPane.add(lbTelefono);
		
		tfTelefono = new JTextField();
		tfTelefono.setToolTipText("Phone number");
		tfTelefono.setBounds(181, 30, 476, 20);
		contentPane.add(tfTelefono);
		tfTelefono.setColumns(10);
		
		comboBoxDia = new JComboBox();
		comboBoxDia.setToolTipText("Day");
		comboBoxDia.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "25", "25", "26", "27", "28", "29", "30", "31"}));
		comboBoxDia.setSelectedIndex(0);
		comboBoxDia.setBounds(181, 75, 53, 22);
		contentPane.add(comboBoxDia);
		
		JLabel lbFecha = new JLabel("Fecha:");
		lbFecha.setFont(new Font("Blackadder ITC", Font.PLAIN, 18));
		lbFecha.setBounds(5, 55, 166, 14);
		contentPane.add(lbFecha);
		
		JLabel lbDia = new JLabel("D\u00EDa");
		lbDia.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
		lbDia.setBounds(181, 58, 53, 14);
		contentPane.add(lbDia);
		
		JLabel lblNewLabel = new JLabel("Mes");
		lblNewLabel.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
		lblNewLabel.setBounds(249, 58, 48, 14);
		contentPane.add(lblNewLabel);
		
		comboBoxMes = new JComboBox();
		comboBoxMes.setToolTipText("Month");
		comboBoxMes.setModel(new DefaultComboBoxModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
		comboBoxMes.setSelectedIndex(0);
		comboBoxMes.setBounds(244, 75, 53, 22);
		contentPane.add(comboBoxMes);
		
		JLabel lblAo = new JLabel("A\u00F1o");
		lblAo.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
		lblAo.setBounds(307, 58, 46, 14);
		contentPane.add(lblAo);
		
		comboBoxAno = new JComboBox();
		comboBoxAno.setToolTipText("Year");
		comboBoxAno.setModel(new DefaultComboBoxModel(new String[] {"2022", "2023"}));
		comboBoxAno.setSelectedIndex(0);
		comboBoxAno.setBounds(307, 75, 53, 22);
		contentPane.add(comboBoxAno);
		
		JLabel lbTipoEvento = new JLabel("Tipo de evento:");
		lbTipoEvento.setFont(new Font("Blackadder ITC", Font.PLAIN, 18));
		lbTipoEvento.setBounds(5, 107, 172, 14);
		contentPane.add(lbTipoEvento);
		
		rbtnBanquete = new JRadioButton("Banquete");
		rbtnBanquete.setBackground(new Color(255, 192, 203));
		rbtnBanquete.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
		rbtnBanquete.setBounds(181, 104, 159, 23);
		contentPane.add(rbtnBanquete);
		
		rbtnJornada = new JRadioButton("Jornada");
		rbtnJornada.setBackground(new Color(255, 192, 203));
		rbtnJornada.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
		rbtnJornada.setBounds(350, 103, 159, 23);
		contentPane.add(rbtnJornada);
		
		rbtnCongreso = new JRadioButton("Congreso");
		rbtnCongreso.setBackground(new Color(255, 192, 203));
		rbtnCongreso.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
		rbtnCongreso.setBounds(511, 103, 169, 23);
		contentPane.add(rbtnCongreso);
		
		JLabel lblTipoDeCocina = new JLabel("Tipo de cocina:");
		lblTipoDeCocina.setFont(new Font("Blackadder ITC", Font.PLAIN, 18));
		lblTipoDeCocina.setBounds(5, 133, 166, 14);
		contentPane.add(lblTipoDeCocina);
		
		rbtnBufe = new JRadioButton("Buf\u00E9");
		rbtnBufe.setBackground(new Color(255, 192, 203));
		rbtnBufe.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
		rbtnBufe.setBounds(181, 130, 116, 23);
		contentPane.add(rbtnBufe);
		
		rbtnCarta = new JRadioButton("Carta");
		rbtnCarta.setBackground(new Color(255, 192, 203));
		rbtnCarta.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
		rbtnCarta.setBounds(299, 129, 99, 23);
		contentPane.add(rbtnCarta);
		
		rbtnCitaChef = new JRadioButton("Pedir cita con el chef");
		rbtnCitaChef.setBackground(new Color(255, 192, 203));
		rbtnCitaChef.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
		rbtnCitaChef.setBounds(400, 129, 162, 23);
		contentPane.add(rbtnCitaChef);
		
		rbtnNoPrecisa = new JRadioButton("No se precisa");
		rbtnNoPrecisa.setBackground(new Color(255, 192, 203));
		rbtnNoPrecisa.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
		rbtnNoPrecisa.setBounds(564, 128, 142, 23);
		contentPane.add(rbtnNoPrecisa);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setToolTipText("Accept");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// si selecciona congreso se debe preguntar el número de jornadas del congreso y si se requerirán habitaciones para los asistentes al evento.
				if(rbtnCongreso.isSelected()) {
					dialogoCongreso dialog3 = new dialogoCongreso();
					dialog3 = new dialogoCongreso();
					dialog3.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog3.setVisible(true);
				} 
				
				// si selecciona banquete se pedirá mesa rectangular o redonda y nº comensales por mesa
				else if(rbtnBanquete.isSelected()) {
					dialogoBanquete dialog2 = new dialogoBanquete();
					dialog2 = new dialogoBanquete();
					dialog2.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog2.setVisible(true);
				} else {
					ventanafinal = new Final();
					Final frame = new Final();
					frame.setVisible(true);
				}
				
				
			}
			
		});
		
		btnAceptar.setBounds(572, 530, 85, 21);
		contentPane.add(btnAceptar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Controlador.class.getResource("/img/backgroundControlador.jpeg")));
		lblNewLabel_1.setBounds(0, 170, 686, 332);
		contentPane.add(lblNewLabel_1);
		
	}
	
	public String obtenerFecha() {
		String fecha;
		fecha=((String) comboBoxDia.getSelectedItem()).concat("/").concat((String) comboBoxMes.getSelectedItem()).concat("/").concat((String) comboBoxAno.getSelectedItem());
		return fecha;
	}
	
	public String obtenerTipoDeEvento() {
		String evento;
		if(rbtnBanquete.isSelected()) {
			evento=rbtnBanquete.getText();
		} else if(rbtnJornada.isSelected()) {
			evento=rbtnJornada.getText();
		} else {
			evento=rbtnCongreso.getText();
		}
		return evento;
	}
	public String obtenerTipoCocina() {
		String evento;
		if(rbtnBufe.isSelected()) {
			evento=rbtnBufe.getText();
		} else if(rbtnCitaChef.isSelected()) {
			evento=rbtnCitaChef.getText();
		} else if(rbtnCarta.isSelected()){
			evento=rbtnCarta.getText();
		} else {
			evento=rbtnNoPrecisa.getText();
		}
		return evento;
	}
}
