package main_package;

public class Checksum 
{
	//stato interno
	private String sentence;
	
	public Checksum (String _sentence)
	{
		this.sentence = _sentence;
	}
	
	private int CheckCalc ()
	{
		char[] sent = sentence.toCharArray();
		int len = sent.length;
		int checker = 0;
		
		
		for (int i = 0; i < len; i+= 1)
		{
			checker ^= ((int) sent[i]);
		}
		
		return (checker);
	}
	
	public String GetStr(String what)
	{
		String Out = "WRONG FORMAT!";
		String CheckHex = Integer.toHexString(CheckCalc());
		
		if (what == "Check" || what == "CheckSum" || what == "Checksum" || what == "checksum" || what == "check")
		{
			Out = new String (CheckHex);
		}
		
		else if (what == "full" || what == "fullstring" || what == "Fullstring" || what == "FullString")
		{
			Out = new String ("$" + this.sentence + "*" + CheckHex);
		}
		return Out;
	}
}
