import java.util.*;
public class Pubtokenizer 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		tokenizer tok1 = new tokenizer();
		
		String theStr = "";
		String theToken = "" ;
		
		
		System.out.println("Enter a message"); 
		tok1.setStr(theStr = input.nextLine());
		
		System.out.println("Enter the token");
		tok1.setToken(theToken = input.nextLine());
		
		
		//System.out.print(" ");
		System.out.println(tok1.tokenize());
		
	}

}
