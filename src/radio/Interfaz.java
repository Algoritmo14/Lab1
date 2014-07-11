//****************************************************************
// Javier Búcaro Carné: 13.... (CADA QUIEN PONGA SU CARNE)
// Max de León Carné: 13012
// Hendry Orellana Carné: 13.... (CADA QUIEN PONGA SU CARNE)
// Sección: 21
// Última modificación: 10/08/2014
// Nombre de Archivo: Interfaz.java
// Breve Descripción: Creación de una nueva Interfaz Gráfica, donde
// se colocarán los botones y distintos paneles.
//*****************************************************************
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JComponent;
import java.lang.*;

public class Interfaz{
// Atributos definidos para la interfaz gráfica del radio
	private JFrame ventana;
	private JPanel panel;
	private JLabel lEstacion, lBienvenida;
	private JButton bEncender, bSubir, bBajar, bGuardar, bFrecuencia, bAyuda, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
	private String	num;
	private boolean bandera, bandera1;
// Se crea la interfaz del programa (ventana)	
	public Interfaz(){
		bandera = true;
		bandera1 = true;
		ventana = new JFrame();
		panel = new JPanel();
		ventana.setPreferredSize(new Dimension(400, 200));
		ventana.setTitle("Radio SONY");
		panel.setLayout(null);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		ventana.setContentPane(panel);
		ventana.setTitle("SONY");
// Area donde se encuentran los botones del programa
		bEncender = new JButton("ON");
		bEncender.setBounds(320, 10, 60, 20);
		bEncender.addActionListener(new ButtonListener());
		bSubir = new JButton(">>");
		bSubir.setBounds(80, 50, 50, 20);
		bSubir.addActionListener(new ButtonListener());
		bBajar = new JButton("<<");
		bBajar.setBounds(20, 50, 50, 20);
		bBajar.addActionListener(new ButtonListener());
		bGuardar = new JButton("SAVE");
		bGuardar.setBounds(140, 50, 80, 20);
		bGuardar.addActionListener(new ButtonListener());
		bFrecuencia = new JButton("FM");
		bFrecuencia.setBounds(20, 10, 60, 20);
		bFrecuencia.addActionListener(new ButtonListener());
		bAyuda = new JButton("?");
		bAyuda.setBounds(330, 90, 50, 30);
		bAyuda.addActionListener(new ButtonListener());
// Botones para guardar las estaciones (12)
		b1 = new JButton("1");
		b1.setBounds(10, 90, 45, 20);
		b1.addActionListener(new ButtonListener());
		b2 = new JButton("2");
		b2.setBounds(60, 90, 45, 20);
		b2.addActionListener(new ButtonListener());
		b3 = new JButton("3");
		b3.setBounds(110, 90, 45, 20);
		b3.addActionListener(new ButtonListener());
		b4 = new JButton("4");
		b4.setBounds(160, 90, 45, 20);
		b4.addActionListener(new ButtonListener());
		b5 = new JButton("5");
		b5.setBounds(210, 90, 45, 20);
		b5.addActionListener(new ButtonListener());
		b6 = new JButton("6");
		b6.setBounds(260, 90, 45, 20);
		b6.addActionListener(new ButtonListener());
		b7 = new JButton("7");
		b7.setBounds(10, 130, 45, 20);
		b7.addActionListener(new ButtonListener());
		b8 = new JButton("8");
		b8.setBounds(60, 130, 45, 20);
		b8.addActionListener(new ButtonListener());
		b9 = new JButton("9");
		b9.setBounds(110, 130, 45, 20);
		b9.addActionListener(new ButtonListener());
		b10 = new JButton("10");
		b10.setBounds(160, 130, 50, 20);
		b10.addActionListener(new ButtonListener());
		b11 = new JButton("11");
		b11.setBounds(215, 130, 50, 20);
		b11.addActionListener(new ButtonListener());
		b12 = new JButton("12");
		b12.setBounds(270, 130, 50, 20);
		b12.addActionListener(new ButtonListener());
// Area donde se encuentran las label's del programa
		lBienvenida = new JLabel("RADIO SONY BIENVENIDO");
		lBienvenida.setBounds(130, 10, 250, 10);
		lEstacion = new JLabel("");
		lEstacion.setBounds(270, 50, 100, 20);
// Agregando todos los botones y labels al panel
		panel.add(bEncender);
		panel.add(bSubir);
		panel.add(bBajar);
		panel.add(bGuardar);
		panel.add(bFrecuencia);
		panel.add(bAyuda);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(b10);
		panel.add(b11);
		panel.add(b12);
		panel.add(b12);
		panel.add(lBienvenida);
		panel.add(lEstacion);
	}
	public void mostrar(){
		ventana.pack();
		ventana.setVisible(true);
	}
	public void apagar(){
		bSubir.setEnabled(false);
		bBajar.setEnabled(false);
		bGuardar.setEnabled(false);
		bFrecuencia.setEnabled(false);
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
		b10.setEnabled(false);
		b11.setEnabled(false);
		b12.setEnabled(false);
	}
	public void encender(){
		bSubir.setEnabled(true);
		bBajar.setEnabled(true);
		bGuardar.setEnabled(true);
		bFrecuencia.setEnabled(true);
		b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		b9.setEnabled(true);
		b10.setEnabled(true);
		b11.setEnabled(true);
		b12.setEnabled(true);
	}
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent mouse){
			if(mouse.getSource() == bEncender){
				if(bandera1 == true){
					JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro radio");
					bEncender.setText("OFF");
					bandera1 = false;
					apagar();
				}else{
					JOptionPane.showMessageDialog(null, "Bienvenido nuevo usuario");
					bEncender.setText("ON");
					bandera1 = true;
					encender();
				}
			}
			if(mouse.getSource() == bSubir){
				JOptionPane.showMessageDialog(null, "HOLA MUNDO");
			}
			if(mouse.getSource() == bBajar){
				JOptionPane.showMessageDialog(null, "HOLA MUNDO");
			}
			if(mouse.getSource() == bGuardar){
				num = JOptionPane.showInputDialog("En que numero desea guardar la estacion?");
				JOptionPane.showMessageDialog(null, "La estacion ha sido almacenada exitosamente");
			}
			if(mouse.getSource() == bFrecuencia){
				if(bandera == true){
					bFrecuencia.setText("AM");
					bandera = false;
				}else{
					bFrecuencia.setText("FM");
					bandera = true;
				}
			}
			if(mouse.getSource() == bAyuda){
				Archivo nuevo = new Archivo();
			}
			if(mouse.getSource() == b1){
				JOptionPane.showMessageDialog(null, "ESTACION 1");
// Se cambia el valor de la label para presentar la estación  guardada
				lEstacion.setText("1");
			}
			if(mouse.getSource() == b2){
				JOptionPane.showMessageDialog(null, "ESTACION 2");
				lEstacion.setText("2");
			}
			if(mouse.getSource() == b3){
				JOptionPane.showMessageDialog(null, "ESTACION 3");
				lEstacion.setText("3");
			}
			if(mouse.getSource() == b4){
				JOptionPane.showMessageDialog(null, "ESTACION 4");
				lEstacion.setText("4");
			}
			if(mouse.getSource() == b5){
				JOptionPane.showMessageDialog(null, "ESTACION 5");
				lEstacion.setText("5");
			}
			if(mouse.getSource() == b6){
				JOptionPane.showMessageDialog(null, "ESTACION 6");
				lEstacion.setText("6");
			}
			if(mouse.getSource() == b7){
				JOptionPane.showMessageDialog(null, "ESTACION 7");
				lEstacion.setText("7");
			}
			if(mouse.getSource() == b8){
				JOptionPane.showMessageDialog(null, "ESTACION 8");
				lEstacion.setText("8");
			}
			if(mouse.getSource() == b9){
				JOptionPane.showMessageDialog(null, "ESTACION 9");
				lEstacion.setText("9");
			}
			if(mouse.getSource() == b10){
				JOptionPane.showMessageDialog(null, "ESTACION 10");
				lEstacion.setText("10");
			}
			if(mouse.getSource() == b11){
				JOptionPane.showMessageDialog(null, "ESTACION 11");
				lEstacion.setText("11");
			}
			if(mouse.getSource() == b12){
				JOptionPane.showMessageDialog(null, "ESTACION 12");
				lEstacion.setText("12");
			}
		}
	}
// ESTO SOLO VA PARA CORRER LA INTERFAZ DIRECTO DE AQUI SIN UN MAIN
// SI QUIEREN SE LO QUITAN Y LO CORREN CON EL MAIN, YO NO SABIA COMO 
// SE LLAMARIA ASI QUE ASI LO HICE
	public static void main (String[] args){
		Interfaz ventana = new Interfaz();
		ventana.mostrar();
	}
}
