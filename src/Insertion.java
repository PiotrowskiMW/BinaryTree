import java.util.ArrayList;
import java.util.Random;


public class Insertion {
	ArrayList<Double> programLoop(BinaryTree btr,ArrayList<Integer> input)
	{
		ArrayList<Double> scores = new ArrayList<Double>(10);
		for(int i : input)
		{
			insertN(i,btr);
			scores.add((btr.treeMaxHeight(btr.root)/(Math.log(btr.treeSize(btr.root))/Math.log(2))));
			btr.eraseTree();
		}
		return scores;
	}
	
	
	void insertN(int n,BinaryTree btr)
	{
		Random random = new Random();
		for(int i=0;i<n;i++)
		{
			btr.insert(btr.root, random.nextInt(Integer.MAX_VALUE));
		}
	}
}
