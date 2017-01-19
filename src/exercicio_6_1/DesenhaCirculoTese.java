package exercicio_6_1;

import javax.swing.JFrame;

public class DesenhaCirculoTese 
{
	public static void main( String[] args )
	{
		DesenhaCirculos painel = new DesenhaCirculos();
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		application.add( painel );
		application.setSize( 230, 250);
		application.setVisible( true );
	}
}