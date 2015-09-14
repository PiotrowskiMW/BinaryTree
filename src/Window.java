import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;


public class Window extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6791503228233798055L;

	public Window()
	{
		super("Result:");
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrawPlot plot = new DrawPlot();
		setPreferredSize(new Dimension(640, 480));
		pack();
		setVisible(true);
	}
	
}