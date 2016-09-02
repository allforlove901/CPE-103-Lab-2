import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class LinearMMS {

	private static final Exception FileNotFoundException = null;

	public static void main(String args[]){
		
		ArrayList<ArrayList<Integer>> sets = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> numbers10 = new ArrayList<Integer>();
		ArrayList<Integer> numbers100 = new ArrayList<Integer>();
		ArrayList<Integer> numbers1000 = new ArrayList<Integer>();
		ArrayList<Integer> numbers10000 = new ArrayList<Integer>();
		
		Scanner scan10, scan100, scan1000, scan10000;
		
		sets.add(numbers10); sets.add(numbers100);
		sets.add(numbers1000); sets.add(numbers10000);
		
		File file1 = new File("list_size_10");
		File file2 = new File("list_size_100");
		File file3 = new File("list_size_1000");
		File file4 = new File("list_size_10000");
		
		//try{
		try {
			scan10 = new Scanner(file1);
			while(scan10.hasNextInt()){
				int next = scan10.nextInt();
				numbers100.add(next);
			}//close while
			scan10.close();
		} catch (java.io.FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			scan100 = new Scanner(file2);
			while(scan100.hasNextInt()){
				int next = scan100.nextInt();
				numbers100.add(next);
			}//close while
			scan100.close();
		} catch (java.io.FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			scan1000 = new Scanner(file3);
			while(scan1000.hasNext()){
				int next = scan1000.nextInt();
				numbers1000.add(next);
			}//close while
			scan1000.close();
		} catch (java.io.FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			scan10000 = new Scanner(file4);
			while(scan10000.hasNext()){
				int next = scan10000.nextInt();
				numbers10000.add(next);
			}//close while
			scan10000.close();
		} catch (java.io.FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//catch(Exception e){}
		
		for(int i = 0; i < sets.size(); i++){
			
			long prevTime = System.currentTimeMillis();
	        getMaxSum(sets.get(i));
	        long nextTime = System.currentTimeMillis();
			
	        System.out.println((nextTime - prevTime) + " milliseconds taken to sort " + (int)Math.pow(10, i+1) + " elements");
	        
		}//close i-for
	}//close main
	
	private static int getMaxSum(ArrayList<Integer> arrayList){
		
		int maxSum = 0;
		int thisSum = 0;
		for(int i = 0; i < arrayList.size(); i++){
			   thisSum = thisSum + arrayList.get(i);
			   if(thisSum > maxSum)
				   maxSum = thisSum;
			   if(thisSum < 0)
				   thisSum = 0;
		}//close i-for
		return maxSum;
	}
}
