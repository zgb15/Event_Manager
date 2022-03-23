package interfaces_practica1_zoe;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class dialogoCongreso extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tfNumJornadas;
	private JTextField tfNumHabitaciones;
	private Controlador controlador1;
	private Final ventanafinal=new Final();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the dialog.
	 */
	public dialogoCongreso() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(178, 34, 34));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel_1 = new JLabel("N\u00BA Jornadas:");
			lblNewLabel_1.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
			lblNewLabel_1.setForeground(new Color(255, 255, 240));
			lblNewLabel_1.setBounds(85, 13, 126, 13);
			contentPanel.add(lblNewLabel_1);
		}
		{
			tfNumJornadas = new JTextField();
			tfNumJornadas.setToolTipText("Number of days");
			tfNumJornadas.setBounds(216, 10, 158, 19);
			tfNumJornadas.setColumns(10);
			contentPanel.add(tfNumJornadas);
		}
		{
			JLabel lbHabitacionesoComensales = new JLabel("N\u00BA Habitaciones:");
			lbHabitacionesoComensales.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
			lbHabitacionesoComensales.setForeground(new Color(255, 250, 250));
			lbHabitacionesoComensales.setBounds(85, 65, 126, 13);
			contentPanel.add(lbHabitacionesoComensales);
		}
		{
			JLabel lbHabitacionesMesa = new JLabel("Habitaciones:");
			lbHabitacionesMesa.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
			lbHabitacionesMesa.setForeground(new Color(255, 250, 250));
			lbHabitacionesMesa.setBounds(83, 39, 118, 13);
			contentPanel.add(lbHabitacionesMesa);
		}
		{
			JRadioButton rbtnSioRectangular = new JRadioButton("S\u00ED");
			rbtnSioRectangular.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
			rbtnSioRectangular.setBackground(new Color(178, 34, 34));
			rbtnSioRectangular.setForeground(new Color(255, 250, 250));
			rbtnSioRectangular.setBounds(215, 35, 66, 21);
			contentPanel.add(rbtnSioRectangular);
		}
		{
			JRadioButton rbtnNooRedonda = new JRadioButton("No");
			rbtnNooRedonda.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
			rbtnNooRedonda.setBackground(new Color(178, 34, 34));
			rbtnNooRedonda.setForeground(new Color(255, 250, 250));
			rbtnNooRedonda.setBounds(292, 35, 82, 21);
			contentPanel.add(rbtnNooRedonda);
		}
		{
			tfNumHabitaciones = new JTextField();
			tfNumHabitaciones.setToolTipText("Rooms");
			tfNumHabitaciones.setBounds(216, 62, 96, 19);
			tfNumHabitaciones.setColumns(10);
			contentPanel.add(tfNumHabitaciones);
		}
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(dialogoCongreso.class.getResource("/img/backgroundCongreso.jpg")));
			lblNewLabel.setBounds(0, 94, 436, 138);
			contentPanel.add(lblNewLabel);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(165, 42, 42));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Aceptar");
				okButton.setToolTipText("Accept");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Final frame = new Final();
						frame.setVisible(true);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			
		}
	}

}
