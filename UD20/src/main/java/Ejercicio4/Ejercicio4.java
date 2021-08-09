package Ejercicio4;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ejercicio4 extends JFrame {

	private JPanel contentPane;
	private JLabel mensaje;
	private JTextArea textArea;
	private JScrollPane scroll;

	private String r = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio4 frame = new Ejercicio4();
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
	public Ejercicio4() {
		setTitle("Ventana oyente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 456, 375);
        setVisible(true);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);

        mensaje = new JLabel("Eventos: ");
        mensaje.setBounds(10, 144, 75, 13);
        contentPane.add(mensaje);
		
        textArea = new JTextArea();
        textArea.setBounds(73, 36, 332, 241);
        contentPane.add(textArea);
        textArea.addMouseListener(new MouseAdapter(){
        	public void mouseEntered(MouseEvent e) {
        		r += "Has entrado\n";
        		textArea.setText(r);
        	}
        });
        textArea.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                r += "Has clicado\n";
                textArea.setText(r);
            }

        });
        
        textArea.addMouseListener(new MouseAdapter(){
        	public void mouseExited(MouseEvent e) {
        		r += "Has salido\n";
        		textArea.setText(r);
        	}
        });
        
        scroll = new JScrollPane(textArea);
        scroll.setBounds(73, 36, 332, 241);
        contentPane.add(scroll);
	}

}
