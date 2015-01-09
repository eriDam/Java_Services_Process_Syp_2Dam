package com.ejoser.MarioHilos;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import java.awt.SystemColor;

import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
 

public class vista extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vista frame = new vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 743, 596);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMario = new JLabel("");
		lblMario.setToolTipText("Puedes moverme!");
		lblMario.setIcon(new ImageIcon(vista.class.getResource("/com/ejoser/MarioHilos/super.png")));
		lblMario.setBounds(605, 211, 106, 142);
		contentPane.add(lblMario);
		
		JLabel label = new JLabel(" ");
		label.setIcon(new ImageIcon(vista.class.getResource("/com/ejoser/MarioHilos/MaFGalaxjpg.jpg")));
		label.setBounds(10, 45, 541, 538);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("Sonar sin hilo");
		btnNewButton.setBounds(578, 65, 133, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblBienvenidosALos = new JLabel("Bienvenidos a los hilos con Mario");
		lblBienvenidosALos.setFont(new Font("Tekton Pro Cond", Font.BOLD, 34));
		lblBienvenidosALos.setBounds(10, 19, 368, 32);
		contentPane.add(lblBienvenidosALos);
		
		JButton btnNewButton_1 = new JButton("Focus mover Mario");
		btnNewButton_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed( java.awt.event.KeyEvent  evt) {
				//Evento de teclado, creo un método para mover la imagen
				moverImagen(evt); 
			}
		});
		btnNewButton_1.setBounds(578, 125, 133, 32);
		contentPane.add(btnNewButton_1);
		
	 
		 
	}
	//Creo método mover imagen, le paso como parametro un KeyEvent evento
	
	private void moverImagen(java.awt.event.KeyEvent evento) {
		// Voy a capturar esos eventos
		
	}
	
	//Creo unos metodos para poder mover la imagen segun la tecla q se
	//pulse realice el movimiento
	private void moverArriba() {
		Window lblMario = null;
		// Voy a capturar esos eventos
		lblMario.setLocation(0,1);
	}
	private void moverAbajo() {
		// Voy a capturar esos eventos
		
	}
	private void moverDcha() {
		// Voy a capturar esos eventos
		
	}
	private void moverIzqda() {
		// Voy a capturar esos eventos
		
	}
}
