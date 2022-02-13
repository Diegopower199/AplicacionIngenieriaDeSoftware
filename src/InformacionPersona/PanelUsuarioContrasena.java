package InformacionPersona;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelUsuarioContrasena extends JFrame {

	private JFrame frame;

	private JLabel textoUsuario;
	private JLabel textoContrasena;
	private JTextField usuarioPersonaIntroducido;
	private JPasswordField contrasenaPersonaIntroducido;
	private JButton botonEntrar;
	private JButton botonRegistrarte;


	public PanelUsuarioContrasena () {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		textoUsuario = new JLabel("Usuario");
		textoUsuario.setBounds(55, 86, 71, 14);
		panel.add(textoUsuario);

		usuarioPersonaIntroducido = new JTextField();
		usuarioPersonaIntroducido.setBounds(155, 83, 124, 20);
		panel.add(usuarioPersonaIntroducido);
		usuarioPersonaIntroducido.setColumns(10);

		textoContrasena = new JLabel("Contrase\u00F1a");
		textoContrasena.setBounds(55, 129, 71, 14);
		panel.add(textoContrasena);

		contrasenaPersonaIntroducido = new JPasswordField ();
		contrasenaPersonaIntroducido.setColumns(10);
		contrasenaPersonaIntroducido.setBounds(155, 126, 124, 20);
		panel.add(contrasenaPersonaIntroducido);

		botonEntrar = new JButton("Entrar");
		//botonEntrar.addActionListener(this); // esto lo que hace es que se va al actionPerformed de abajo
		botonEntrar.setBounds(55, 171, 89, 23);
		panel.add(botonEntrar);

		botonRegistrarte = new JButton("Registrarte");
		//ActionListener  loginButtonListener = new RegistroUsuarioNuevo();
		//botonRegistrarte.addActionListener(loginButtonListener);
		botonRegistrarte.setBounds(163, 171, 89, 23);
		panel.add(botonRegistrarte);

		frame.setVisible(true);




		// Añadir escucha para el botón de registro
		botonEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{


					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection(
							"jdbc:mysql://localhost:3306/ingenieriadesoftware","root","Power555");

					Statement s = con.createStatement();
					ResultSet rs = s.executeQuery ("select * from informacionpersona");
					
					while (rs.next()) {
						//Thread.sleep(1000);
						if (rs.getString(7).equals(usuarioPersonaIntroducido.getText()) && rs.getString(8).equals(new String(contrasenaPersonaIntroducido.getPassword()))) {
							System.out.println("SON LAS MISMAS");
						}
					    //System.out.println (rs.getString (1) + " " + rs.getString (2)+ " " + rs.getInt(3));
					}
					System.out.println (rs.next());
					System.out.println("Connected");
				}
				catch(Exception e1) {
					System.out.println(e1);
				}
			}
			
		});
		
		botonRegistrarte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// página de registro
				frame.setVisible(false);
				RegistroUsuarioNuevo registrarse = new RegistroUsuarioNuevo(); 
			}
		});
	}


	// Cuando doy al boton de entrar hacer que acceda a la base de datos creandome la conexion y todas las movidas

	/*
	@Override
	public void actionPerformed(ActionEvent e) {
		String contrasenaString = new String(contrasenaPersonaIntroducido.getPassword());

		if (usuarioPersonaIntroducido.getText().equals(Usuario.getUsuario())) {
			System.out.println("Usuario bien");

			if (contrasenaString.equals(Usuario.getContrasena())) {
				System.out.println("Contraseña bien");
			}
			else {
				JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", null, JOptionPane.ERROR_MESSAGE);
			}
		}
		else {
			JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta", null, JOptionPane.ERROR_MESSAGE);
		}

	}*/

}
