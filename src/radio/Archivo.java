//****************************************************************
// Javier Búcaro Carné: 13.... (CADA QUIEN PONGA SU CARNE)
// Max de León Carné: 13012
// Henry Orellana Carné: 13048
// Sección: 21
// Última modificación: 10/07/20134
// Nombre de Archivo: Archivo.java
// Breve Descripción: Clase creada para el control y lectura de las
// instrucciones de ayuda para el usuario del radio
//*****************************************************************
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import java.io.FileReader;
import java.io.BufferedReader;

public class Archivo{
// Atributos del programa
	private JFrame ventana;
	private JPanel panel;
	private String[] lista;
	private JList <String> lista1;
	private int contador;
	private String texto;
// Constructor de nuestro programa
	public Archivo(){
		contador = 0;
// Creación de la ventana y panel para presentar la ayuda para el cliente
		ventana = new JFrame();
		panel = new JPanel();
		ventana.setPreferredSize(new Dimension(300, 380));
		ventana.setTitle("Centro de ayuda");
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.white);
		ventana.setResizable(false);
		ventana.setContentPane(panel);
		ventana.pack();
		ventana.setVisible(true);
// Se crea la lista y demás situaciones para presetnar la información
		lista1 = new JList<String>();
		lista = new String[20];
// Se agrega la lista anuestro panel para presentarlo al usuario		
		panel.add(lista1);
// Se lee nuestro archivo para presentar lo que esta escrito ahí		
		try{
			FileReader lector = new FileReader("Archivo.txt");
			BufferedReader contenido = new BufferedReader(lector);
			while(contenido.ready()){
// Leemos el archivo linea por linea 
				texto = contenido.readLine();
// Agregamos cada linea de texto leida a nuestra lista
				lista[contador] = texto;
// La información se utiliza para nuestro "JList" y el contador aumenta en uno
				lista1.setListData(lista);
				contador++;
			}
		}
// Si no se puede llegar a leer el archivo se presenta un mensaje de error
		catch(Exception e){
			JOptionPane.showMessageDialog(null, "Error al leer el archivo");
		}
	}
}
