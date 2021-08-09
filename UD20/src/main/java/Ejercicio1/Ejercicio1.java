package Ejercicio1;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JLabel etiqueta;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setTitle("Ventana");
		setBounds(100, 100, 550, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		etiqueta = new JLabel("Cambie de tamaño los bordes");
		etiqueta.setBounds(10, 11, 350, 20);
		contentPane.add(etiqueta);
	}

}
