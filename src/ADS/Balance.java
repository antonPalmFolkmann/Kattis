package ADS;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

// Inspiration from the Dijkstra Two-Stack Algorithm in SW p. 129.
public class Balance{
	public static void main(String[] args){
		Stack<String> par = new Stack<String>();
		String s = StdIn.readString();
		int output = 1;

		for (int i = 0; i < s.length(); i++){
			String ss = s.substring(i,i+1);
			if 	(ss.equals("(")) par.push(ss);
			else if (ss.equals("[")) par.push(ss);
			else if (ss.equals(")")) {
				if (par.isEmpty()){
					output = 0;
					break;
				} else if (!par.pop().equals("(")){
					output = 0;
					break;
				}
			} else if (ss.equals("]")) {
				if (par.isEmpty()) {
					output = 0;
					break;
				} else if (!par.pop().equals("[")){
					output = 0;
					break;
				}
			}
			
		}
		if (!par.isEmpty()) output = 0;
		StdOut.println(output);
	}
}
