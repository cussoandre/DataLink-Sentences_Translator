package main_package;

public class SentenceTranslatorMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String mySent;
		
		try 
		{
			mySent = new String (args[0]);
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ATTENZIONE: INSERIRE L'ARGOMENTO! \n Sintassi: \t java SentenceTranslatorMain \"Sentenza\"");
			mySent = new String ("Sentence");
		}
		
		Checksum ch = new Checksum (mySent);
		System.out.println(ch.GetStr("full"));
	}

}
