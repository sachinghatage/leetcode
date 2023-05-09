package com.triangle;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	
//	expected output
//	
//	         1          for every row list is created
//	       1    1
//	     1    2   1
//	   1   3   3   1
//	 1   4   6   4   1
	
	
	
	

	public static void main(String[] args) {

		int numRows=5;                                   //we entered number of rows 5
		List<List<Integer>> generate = generate(numRows);
		System.out.println(generate);
	}

	private static List<List<Integer>> generate(int numRows) {

		List<List<Integer>> triangle=new ArrayList<>();
		if(numRows==0) return triangle;
		
		List<Integer> firstRow=new ArrayList<>();
		firstRow.add(1);
		triangle.add(firstRow);
		
		for(int i=1;i<numRows;i++) {
			List<Integer> prevRow=triangle.get(i-1);
			List<Integer> row=new ArrayList<>();
			row.add(1);
			
			
			for(int j=1;j<i;j++) {
				row.add(prevRow.get(j-1)+prevRow.get(j));
			}
			
			row.add(1);
			triangle.add(row);
		}
		
		return triangle;
		
	}

}
