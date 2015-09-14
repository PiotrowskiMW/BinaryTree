import java.util.ArrayList;


public class MainClas{
	public static void main(String[] args)
	{

		BinaryTree newTree = new BinaryTree();
		Insertion ins= new Insertion();
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(100);
		input.add(500);
		for(int i = 1000;i <=10000;i+=1000)
		{
			input.add(i);
		}
		ArrayList<Double> scores = ins.programLoop(newTree,input);
		System.out.println("Input: "+ input.toString());
		System.out.println("Scores: "+ scores.toString());
		Window neo = new Window();
	}
}
