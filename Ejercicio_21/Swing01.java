//Importar Librerias

import javax.swing.*;

//Crear Main

public class Swing01{
	public void crearMostrarGUI(){
		
		//"Decorar" el contenedor

		JFrame.setDefaultLookAndFeelDecorated(true);

		//Nombre de la ventana

		JFrame frame = new JFrame("Contenedor JFrame");

		//Al cerrar la ventana finaliza

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Agrega Etiqueta en el Objeto frame a retornar

		JLabel etiqueta = new JLabel("Hola amigos");
		frame.getContentPane().add(etiqueta);

		//Ajusta el tamaño de la Ventana de Modo Automatico

		frame.pack();

		//Hace Visible el Frame

		frame.setVisible(true);


	}
}