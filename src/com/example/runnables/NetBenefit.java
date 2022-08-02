package com.example.runnables;

import com.example.structures.IntQueueImpl;
import java.io.*;

public class NetBenefit {

	public static void main(String[] args) {
		String path= null;
		String line;
		IntQueueImpl Queue = new IntQueueImpl();
		File f;
		FileReader fr;
		BufferedReader br = null;

		if (0 < args.length) {
			   path = args[0];
			} else {
			   System.err.println("Invalid arguments count:" + args.length);
			   System.exit(1);
			}

		try {
			f = new File(path);
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			line = br.readLine();
			int buyNumber;
			int buyPrice = 0;
			int cost = 0;
			int total = 0;
			int sellNumber;
			int sellPrice;
			int cost2;
			int profit = 0;
			int index;
			
			if(line.trim().startsWith("sell")){
				System.out.println("Error! Tries to sell more than it has.");
			}
			else{
				while(line != null) {
					if (line.startsWith("buy")){
						//If the line refers to buying a share we add in our queue the cost of the share
						index = line.indexOf("p");
						buyNumber = Integer.parseInt(line.substring(4,index - 1));
						buyPrice = Integer.parseInt(line.substring(index + 6));
						cost = buyNumber * buyPrice;
						Queue.put(cost);
						line = br.readLine();
						total += buyNumber;
					}
					else{
						//if the line refers to share selling
						index = line.indexOf("p");
						sellNumber = Integer.parseInt(line.substring(5, index - 1));
						if(total < sellNumber){
							System.out.println("Error! Tries to sell more than it has.");
							break;
						}
						else{
							//we calculate the profit of the selling by subtracting from the cost of sale the costs of buying and adding what there is still left
							total -= sellNumber;
							sellPrice = Integer.parseInt(line.substring(index + 6));
							cost2 = sellNumber * sellPrice;
							profit += cost2;
							while (!Queue.isEmpty()){
								int c = Queue.get();
								profit = profit - c;
							}
							buyNumber = total;
							cost = buyNumber * buyPrice;
							profit = profit + cost;
							Queue.put(cost);
							line = br.readLine();
						}
					}
				}
				//if not all shares were sold I subtract from the profit the price of those that are still left unsold
				if(cost>0){
					profit = profit - cost;
				}
				System.out.println("Our Profit is: " +profit);
			}
		}
		catch (IOException e) {
			System.err.println("Error opening file!");
		}
		
		try {
			br.close();
		}
		catch(IOException e){
			System.err.println("Error closing file.");
		}
	}
}
