
public class LengthOfLastWord {
	
	//To find the length of last word we have few approaches but we are
	//going to see efficient approach let's start

	public static void main(String[] args) {
		
		String s="Learn Java Program  ";      //program has 7 words
		int lengthOfLastWord = lengthOfLastWord(s);
		System.out.println(lengthOfLastWord);

	}

	private static int lengthOfLastWord(String s) {

		int count=0;
		for(int i=s.length()-1;i>=0;i--) {
			if(s.charAt(i)!=' ') {
				count++;
			}else {
				if(count>0)
					return count;
			}
		}
		
		return count;
	}

}
