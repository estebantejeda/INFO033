import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Trigo extends JFrame implements ActionListener{
	private JButton b1;
	private JTextField campo1;
	private int numClicks = 0;
	public Trigo(){
		b1 = new JButton("seno");
		b1.addActionListener(this);
		campo1 = new JTextField();
		this.getContentPane().add(b1, BorderLayout.NORTH);
		this.getContentPane().add(campo1, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		Trigo miAplicacion = new Trigo();
		miAplicacion.setBounds(10, 10, 200, 200);
		miAplicacion.pack();
		miAplicacion.setVisible(true);
	}

 public void actionPerformed(ActionEvent e){
        numClicks++;
        campo1.setText(numClicks+"");
        if (numClicks%2 == 0){
        	campo1.setText("Es par");
        }
        else{
        	campo1.setText("Pico");
        }
      }


}