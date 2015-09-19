import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author Marcin Piotrowski
 * This class contains functions required in program.
 */
public class Insertion {
	/**
	 * This function calculate factor required in program for given values
	 * @param btr reference to tree
	 * @param input array of input data
	 * @return array of required factors
	 */
	ArrayList<Double> programLoop(BinaryTree btr,ArrayList<Integer> input)
	{
		ArrayList<Double> scores = new ArrayList<Double>(10);
		for(int i : input)
		{
			insertN(i,btr);
			scores.add((btr.treeMaxHeight()/(Math.log(btr.treeSize())/Math.log(2))));
			btr.eraseTree();
		}
		return scores;
	}
	
	
	void insertN(int n,BinaryTree btr)
	{
		Random random = new Random();
		for(int i=0;i<n;i++)
		{
			btr.insert(random.nextInt(Integer.MAX_VALUE));
		}
	}
}
