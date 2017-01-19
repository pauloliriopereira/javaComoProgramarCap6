package exercicio_6_1;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class DesenhaCirculos extends JPanel 
{
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		
		// desenha o primeiro circulo###
		Color cor1 = new Color( aleatorio(), aleatorio(), aleatorio() );
		g.setColor( cor1 );
		g.fillOval( 10, 10, 200, 200 );
		
		// desenha o segundo circulo
		Color cor2 = new Color( aleatorio(), aleatorio(), aleatorio() );
		g.setColor( cor2 );
		g.fillOval( 20, 20, 180, 180 );
		
		// desenha o terceiro circulo
		Color cor3 = new Color( aleatorio(), aleatorio(), aleatorio() );
		g.setColor( cor3 );
		g.fillOval( 30, 30, 170, 170 );
		
		// desenha o terceiro circulo
		Color cor4 = new Color( aleatorio(), aleatorio(), aleatorio() );
		g.setColor( cor4 );
		g.fillOval( 40, 40, 160, 160 );
				
		// desenha o terceiro circulo
		Color cor5 = new Color( aleatorio(), aleatorio(), aleatorio() );
		g.setColor( cor5 );
		g.fillOval( 50, 50, 60, 60 );
	}
	
	private int aleatorio()
	{
		Random numero = new Random();
		return numero.nextInt( 256 );
	}
}