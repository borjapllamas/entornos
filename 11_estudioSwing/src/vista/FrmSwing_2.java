package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmSwing_2 extends JFrame implements ActionListener {

	private JPanel panel;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel lblEventos;

	public FrmSwing_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		setContentPane(panel);
		
		definirVentana();
		definirEventos();
		setVisible(true);
	
		
	}


	private void definirEventos() {
		// TODO Auto-generated method stub
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblEventos.setText("ACEPTAR");
			}
		});
		
		btnCancelar.addActionListener(this);
		
	}


	private void definirVentana() {
		// TODO Auto-generated method stub
		
		btnAceptar = new JButton("Aceptar");
		
		btnAceptar.setBounds(86, 35, 85, 21);
		panel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(249, 35, 85, 21);
		panel.add(btnCancelar);
		
		lblEventos = new JLabel("Eventos");
		lblEventos.setBounds(86, 130, 236, 13);
		panel.add(lblEventos);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		lblEventos.setText("CANCELAR");
	}

}
