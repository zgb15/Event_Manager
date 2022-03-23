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

public class dialogoBanquete extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private Final ventanafinal = new Final();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public dialogoBanquete() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(143, 188, 143));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("People per table");
		textField.setColumns(10);
		textField.setBounds(191, 30, 190, 19);
		contentPanel.add(textField);
		
		JLabel lblNpersonasPorMesa = new JLabel("N\u00BApersonas por mesa:");
		lblNpersonasPorMesa.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
		lblNpersonasPorMesa.setBounds(42, 33, 179, 13);
		contentPanel.add(lblNpersonasPorMesa);
		
		JLabel lblTipoDeMesa = new JLabel("Tipo de mesa:");
		lblTipoDeMesa.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
		lblTipoDeMesa.setBounds(10, 10, 99, 13);
		contentPanel.add(lblTipoDeMesa);
		
		JRadioButton rdbtnRectangular = new JRadioButton("Rectangular");
		rdbtnRectangular.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
		rdbtnRectangular.setBackground(new Color(143, 188, 143));
		rdbtnRectangular.setBounds(118, 6, 126, 21);
		contentPanel.add(rdbtnRectangular);
		
		JRadioButton rdbtnRedonda = new JRadioButton("Redonda");
		rdbtnRedonda.setFont(new Font("Blackadder ITC", Font.PLAIN, 16));
		rdbtnRedonda.setBackground(new Color(143, 188, 143));
		rdbtnRedonda.setBounds(270, 6, 118, 21);
		contentPanel.add(rdbtnRedonda);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(dialogoBanquete.class.getResource("/img/backgroundBanquete.jpg")));
		lblNewLabel.setBounds(0, 66, 436, 166);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(143, 188, 143));
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
