package Ejercicio5;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
public class Ejercicio5 extends JFrame {

	private JPanel contentPane;
	private JLabel mensj;
	private JTextArea textArea;
	private JScrollPane scroll;
	private JButton boton;
	private String resp = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio5 frame = new Ejercicio5();
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
	public Ejercicio5() {
		setTitle("Todos los eventos del raton");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 456, 375);
        setVisible(true);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        mensj = new JLabel("Eventos: ");
        mensj.setBounds(10, 144, 75, 13);
        contentPane.add(mensj);
		
        textArea = new JTextArea();
        textArea.setBounds(0, 0, 332, 241);
        contentPane.add(textArea);
        textArea.addMouseListener(new MouseAdapter(){
        	public void mouseEntered(MouseEvent e) {
        		resp += "Has entrado\n";
        		textArea.setText(resp);
        	}
        });
        textArea.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                resp += "Has clicado\n";
                textArea.setText(resp);
            }

        });
        
        textArea.addMouseListener(new MouseAdapter(){
        	public void mouseExited(MouseEvent e) {
        		resp += "Has salido\n";
        		textArea.setText(resp);
        	}
        });
        
        scroll = new JScrollPane(textArea);
        scroll.setBounds(73, 36, 332, 241);
        contentPane.add(scroll);
        
        boton = new JButton("Limpiar");
        boton.setBounds(193,288,82,36);
        contentPane.add(boton);
        boton.addActionListener(new ActionListener(){
			public void actionPerformed (ActionEvent e) {
				resp = "";
				textArea.setText(resp);
			}
		});
	}

}
