package InformacionPersona;

import java.lang.reflect.Array;

public class Usuario {
	
	String nombre = "";
	String apellidos = "";
	int edad = 0;
	double peso = 0.0;
	double altura = 0.0;
	String telefono = "";
	static String usuario = "a";
	static String contrasena = "aa";
	Character diasDisponibleEjercicio [] = new Character [5];
	
	
	public String getNombre () {
		return nombre;
	}
	
	public String getApellidos () {
		return apellidos;
	}
	
	public int getEdad () {
		return edad;
	}
	
	public double getPeso () {
		return peso;
	}
	
	public double getAltura () {
		return altura;
	}
	
	public static String getUsuario () {
		return usuario;
	}
	
	public static String getContrasena () {
		return contrasena;
	}
	
	public String getTelefono () {
		return telefono;
	}
	

}
