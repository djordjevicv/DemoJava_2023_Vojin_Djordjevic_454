package rs.ac.ni.pmf.oop2;

public class ParserMain
{
	public static void main(String[] args)
	{
		TextParser textParser = new TextParser();

		textParser.setEncoder(new UpperCaseEncoder());
		textParser.setStorage(new NetworkStorage());
		textParser.parse("  voJin DjordjeviC 454     ");

		System.out.println();

		textParser.setEncoder(new LowerCaseEncoder());
		textParser.setStorage(new DatabaseStorage());
		textParser.parse("  voJin DjordjeviC 454     ");

		System.out.println();

		textParser.setEncoder(new LowerCaseEncoder());
		textParser.setStorage(new FileStorage());
		textParser.parse("  voJin DjordjeviC 454     ");


	}
}
