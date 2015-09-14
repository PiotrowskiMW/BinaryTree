import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class DrawPlot extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7994838877357427274L;

	public void paintGraph (Graphics g){

        ArrayList<Integer> scores = new ArrayList<Integer>(10);
        int y1;
        int y2;

        for (int i = 0; i < scores.size(); i++){
            y1 = scores.get(i);
            y2 = scores.get(i+1);
            g.drawLine(i, y1, i+1, y2);
        }
    }
}