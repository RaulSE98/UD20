package Ejercicio7;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ejercicio7 extends JFrame {

	private JPanel contentPane;
	private JButton cambiar;
	private JButton pesetas;
	private JButton euros;
	private JLabel texto;
	private JLabel texto2;
	private JLabel respuesta;
	private JTextField num1;
	private double resultado = 0;
	private int num = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio7 frame = new Ejercicio7();
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
	public Ejercicio7() {
		setTitle("Calculadora cambio de monedas");
		setBounds(100, 100, 550, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		cambiar = new JButton("Cambiar");
		cambiar.setBounds(237,69,97,20);
		contentPane.add(cambiar);
		cambiar.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				if (num % 2 == 0) {
					contentPane.remove(euros);
					pesetas = new JButton("Pesetas a Euros");
					pesetas.setBounds(218, 100, 143, 20);
					contentPane.add(pesetas);
					pesetas.addActionListener(new ActionListener(){
						public void actionPerformed (ActionEvent e) {
							resultado = Double.parseDouble(num1.getText()) * 0.006;
							resultado = Math.round(resultado*100.0) /100.0;
							
							respuesta.setText("" + resultado);
						}
					});
				}
				else {
					contentPane.remove(pesetas);
					euros = new JButton("Euros a Pesetas");
					euros.setBounds(218, 100, 143, 20);
					contentPane.add(euros);
					euros.addActionListener(new ActionListener(){
						public void actionPerformed (ActionEvent e) {
							resultado = Double.parseDouble(num1.getText()) * 166.386;
							resultado = Math.round(resultado*100.0) /100.0;
							
							respuesta.setText("" + resultado);
						}
					});
				}
				num++;
			}
		});
		
		texto = new JLabel("Cantidad a convertir");
		texto.setBounds(58, 35, 126, 20);
		contentPane.add(texto);
		
		texto2 = new JLabel("Resultado");
		texto2.setBounds(58, 100, 81, 20);
		contentPane.add(texto2);
		
		euros = new JButton("Euros a Pesetas");
		euros.setBounds(218, 100, 143, 20);
		contentPane.add(euros);
		euros.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				resultado = Double.parseDouble(num1.getText()) * 166.386;
				resultado = Math.round(resultado*100.0) /100.0;
				
				respuesta.setText("" + resultado);
			}
		});
		
		respuesta = new JLabel();
		respuesta.setBounds(58,194,81,10);
		contentPane.add(respuesta);
		
		num1 = new JTextField();
		num1.setBounds(58, 66, 143, 20);
		contentPane.add(num1);
	}

}
