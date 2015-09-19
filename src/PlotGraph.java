

import java.util.ArrayList;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.ApplicationFrame;



public class PlotGraph extends ApplicationFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7617118581644477271L;

	/**
	 * This class draw plot
	 *
	 * @param title  the frame title.
	 * @param probe - horizontal data on graph
	 * @param result - vertical data on graph
	 */
	public PlotGraph(final String title,ArrayList<Integer> probe,ArrayList<Double> result) {

		super(title);
		final XYSeries series = new XYSeries("Binary Tree Ratio");

		for(int i=0;i<probe.size();i++)
			series.add(probe.get(i), result.get(i));

		final XYSeriesCollection data = new XYSeriesCollection(series);
		final JFreeChart chart = ChartFactory.createScatterPlot(
				"Result",
				"n", 
				"height/ log 2 n", 
				data,
				PlotOrientation.VERTICAL,
				true,
				true,
				false
				);

		final ChartPanel chartPanel = new ChartPanel(chart);
		chartPanel.setPreferredSize(new java.awt.Dimension(640, 480));
		setContentPane(chartPanel);

	}
}
