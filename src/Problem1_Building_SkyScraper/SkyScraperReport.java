package Problem1_Building_SkyScraper;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class SkyScraperReport {
    //stack create stack to store floors
	static Stack<Integer> stack = new Stack<Integer>();
    // Create Priority Queue to Assemble floor in order
	static PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
	// create integer array to store daily floor size supplied by factories
	static int n[];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Factory can create only one floor in a day of different size
		System.out.println("Enter Number of floors to be assembled");
		int N = sc.nextInt();
		if(N<0)
		{
			System.out.println("Negative number of floors is not Possible :");
			System.out.println("\n----Exiting Program----");
			System.exit(0);
		}
		n = new int[N];
		// input of size provided by factory day by day:
		System.out.println("Enter size of floor provided day by day from factories:\n");
		for (int i = 0; i < N; ++i) {
			System.out.println("Enter size of floor in : " + (i + 1) + " Day");
			n[i] = sc.nextInt();
			q.add(n[i]);
		}
		// Outputs using Utilities are
		System.out.println("\nReport of daily work done of construction as :");
		for (int i = 0; i < N; ++i) 
		{
			System.out.println("\n Work Assembled on Day:" + (i + 1));
			if (n[i] == q.peek()) 
			{
				System.out.print(" " + q.poll() + " ");
				while (stack.contains(q.peek())) 
				{
					System.out.print(q.poll() + " ");
					if (q.isEmpty())
						break;
				}

			} 
			else
				stack.push(n[i]);

		}
		System.out.println("\n\n-----Program completed Successfully-----");
		stack.removeAllElements();
		sc.close();
	}
	
}//class ends
