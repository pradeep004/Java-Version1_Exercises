import javax.sql.RowSetEvent;

public class DayOneReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] wordList = {"Stressed","parts", "Straw","Keep"};
		String reverseWord =" ",b =",";
		char ch;
		
		for (int i = 0;i<wordList.length;i++) {
			reverseWord= wordList[i];
			for (int j =0; j< reverseWord.length();j++) {
				ch = reverseWord.charAt(j);
				b = ch+b;
				
			}
			
		}
		System.out.println(b);
		
	}
}
