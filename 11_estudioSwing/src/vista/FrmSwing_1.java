package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmSwing_1 extends JFrame {

	private JPanel panel;
	private JLabel lblNombre;
	private JTextField textNombre;
	private JButton btnAceptar;
	private JLabel lblSaludo;
	
	public FrmSwing_1() {
		setTitle("Hola Mundo desde Swing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		definirVentana();
		definirEventos();
		this.setVisible(true);
	}
	
	private void definirEventos() {
		// TODO Auto-generated method stub
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre=textNombre.getText();
				lblSaludo.setText("Bienvenido "+nombre);
			}
		});
	}

	private void definirVentana() {
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(77, 72, 45, 13);
		panel.add(lblNombre);
		textNombre = new JTextField();
		textNombre.setBounds(121, 69, 96, 19);
		panel.add(textNombre);
		textNombre.setColumns(10);
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(241, 68, 83, 21);
		panel.add(btnAceptar);
		lblSaludo = new JLabel("");
		lblSaludo.setBounds(135, 118, 152, 13);
		panel.add(lblSaludo);
		
	}
}
