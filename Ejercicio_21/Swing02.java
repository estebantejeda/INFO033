import javax.swing.*;

public class Swing02 extends JFrame{
	public Swing02(){
		super("Contenedor JFrame");
		setDefaultLookAndFeelDecorated(true);
		JLabel etiqueta = new JLabel("Hola amigos");
		getContentPane().add(etiqueta);
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}