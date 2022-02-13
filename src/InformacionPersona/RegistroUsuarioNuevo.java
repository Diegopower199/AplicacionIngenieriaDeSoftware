package InformacionPersona;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class RegistroUsuarioNuevo{

	private JFrame frame;
	private JTextField textoNombre;
	private JTextField textoEmail;
	private JPasswordField textoContrasena;
	private JPasswordField textoConfirmarContrasena;

	private JLabel textoRegistrarte;
	private JLabel etiquetaUsuario; 
	private JLabel etiquetaEmail;
	private JLabel etiquetaContrasena;
	private JLabel etiquetaConfirmarContrasena;
	private JButton botonRegistrarse;

	public RegistroUsuarioNuevo() {
		frame = new JFrame();
		frame.setBounds(100, 100, 445, 416);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		textoRegistrarte = new JLabel("Registrarse");
		textoRegistrarte.setBounds(185, 11, 62, 35);
		panel.add(textoRegistrarte);

		etiquetaUsuario = new JLabel("Nombre");
		etiquetaUsuario.setBounds(46, 70, 62, 22);
		panel.add(etiquetaUsuario);

		etiquetaEmail = new JLabel("E-mail");
		etiquetaEmail.setBounds(46, 136, 62, 22);
		panel.add(etiquetaEmail);

		etiquetaContrasena = new JLabel("Contrase\u00F1a");
		etiquetaContrasena.setBounds(46, 201, 62, 31);
		panel.add(etiquetaContrasena);

		etiquetaConfirmarContrasena = new JLabel("Confirmar contrase\u00F1a");
		etiquetaConfirmarContrasena.setBounds(46, 268, 110, 22);
		panel.add(etiquetaConfirmarContrasena);

		textoNombre = new JTextField();
		textoNombre.setBounds(46, 91, 293, 31);
		panel.add(textoNombre);
		textoNombre.setColumns(10);

		textoEmail = new JTextField();
		textoEmail.setColumns(10);
		textoEmail.setBounds(46, 155, 293, 31);
		panel.add(textoEmail);

		textoContrasena = new JPasswordField();
		textoContrasena.setColumns(10);
		textoContrasena.setBounds(46, 226, 293, 31);
		panel.add(textoContrasena);

		textoConfirmarContrasena = new JPasswordField();
		textoConfirmarContrasena.setColumns(10);
		textoConfirmarContrasena.setBounds(46, 289, 293, 31);
		panel.add(textoConfirmarContrasena);

		botonRegistrarse = new JButton("Registrarse");
		//botonRegistrarse.addActionListener(this);
		botonRegistrarse.setBackground(Color.LIGHT_GRAY);
		botonRegistrarse.setForeground(Color.BLACK);
		botonRegistrarse.setBounds(46, 331, 110, 35);
		panel.add(botonRegistrarse);

		frame.setVisible(true);
		
		// Añadir escucha para el botón de registro
		botonRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textoNombre.getText().equals("") || textoEmail.getText().equals("") || textoContrasena.getText().equals("") || textoConfirmarContrasena.getText().equals("")) {
					
				}
				else {
					if (new String(textoContrasena.getPassword()).equals(new String(textoConfirmarContrasena.getPassword()))) {
						System.out.println("AMBAS CONTRASEÑAS IGUALES");
					}
				}
				
				// new String(textoConfirmarContrasena.getPassword()); ESTO ME PASA LA CONTRASEÑA A UN STRING DIRECTAMENTE YA QUE ME CREO UN OBJETO STRING
			}
		});
	}
	

}
