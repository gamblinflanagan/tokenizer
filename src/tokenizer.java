import java.util.*;
public class tokenizer
{
	private String Str;
	private String token;

	tokenizer()
	{
		Str = "";
		token = "";
	}
	
	tokenizer(String theStr, String theToken)
	{
		theStr = "";
		theToken = "";
	
	}
	
	public void setStr(String theStr)
	{
		Str = theStr;
	}
	
	public void setToken(String theToken)
	{
		token = theToken;
	}
	
	public String tokenize()
	{
		for(int i = 0; i < Str.length(); i++)
		{
			if(Str.charAt(i) == token.charAt(0))
			{
				Str = Str.substring(0,i)+ ("\n") + Str.substring(i++);
			}
		}
		return Str;
	}

	

}

/*
 

	

*/