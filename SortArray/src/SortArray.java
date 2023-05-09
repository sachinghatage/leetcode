import java.util.Arrays;

//1.Given array [1,100,9,100,25,98] perform sorting in descending order(with Stream api)
public class SortArray {

	public static void main(String[] args) {
	
		Integer[] array= {1,100,9,100,25,98};
		Arrays.stream(array)
		      // .sorted((a,b)->b.compareTo(a))    //this is for descending order
		         .sorted((a,b)->a.compareTo(b))    //this is for ascending order
		         .forEach(System.out::println);  

	}

}
