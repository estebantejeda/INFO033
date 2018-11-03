//Importar Librerias

import java.util.*;
import javax.swing.*;
import java.awt.*;

//Crear Clase Ventana

public class Panel extends JFrame{
	
//Crear Atributos

	JButton boton01;
	JButton boton02;
	JLabel texto01;
	JLabel texto02;
	JTextField input01;
	JTextField input02;

//Crear Constructor	

	public Panel(){
		boton01 = new JButton("Oprimir");
		boton02 = new JButton("Descoprimir");
		texto01 = new JLabel("");
		texto02 = new JLabel("");
		input01 = new JTextField("");
		JPanel panel = new JPanel();
		this.add(panel);
		this.setSize(220, 130);
		this.setResizable(false);
		panel.add(boton01);
		panel.add(boton02);
		panel.add(texto01);
		panel.add(texto02);
		panel.add(input01);
		boton01.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent evt01){
				botonMouseClicked01(evt01);
			}
		});
		boton02.addMouseListener(new java.awt.event.MouseAdapter(){
			public void mouseClicked(java.awt.event.MouseEvent evt02){
				botonMouseClicked02(evt02);
			}
		});	
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}

//Crear Metodos

	//Metodo botonMouseClicked01

	public void botonMouseClicked01(java.awt.event.MouseEvent evt01){
		System.out.println("Tinimos la Libertaore");
		texto01.setText("Tinimos la Libertaore");
	}

	//Metodo botonMouseClicked02

	public void botonMouseClicked02(java.awt.event.MouseEvent evt02){
		System.out.println("No Tinimo Estaio, pero lo llinamu");
		texto02.setText("No Tinimo Estaio, pero lo llinamu");
	}

}