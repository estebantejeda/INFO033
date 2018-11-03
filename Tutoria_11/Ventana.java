//Importar Librerias

import java.util.*;
import javax.swing.*;
import java.awt.*;

//Crear Clase Ventana

public class Ventana extends JFrame{
	
	public Ventana(){
		setLayout(null);
	}

	public static void main(String[] args) {
		Ventana v = new Ventana();	
		v.setTitle("Ola k asdasds");
		v.setSize(800, 600);
		v.setLocationRelativeTo(null);
		v.setResizable(false);
		v.setVisible(true);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.getContentPane().setLayout(new BorderLayout());
		v.add(new JLabel("dsabhdbsauydvasyud"), BorderLayout.NORTH);
		v.add(new JLabel("dsabhdbsauydvasyud"), BorderLayout.SOUTH);
		v.add(new JLabel("dsabhdbsauydvasyud"), BorderLayout.WEST);
	}
}