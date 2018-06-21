package main;

import LexAnalysis.Lexer;
import SynAnalysis.Parser;
import Utility.SourceCode;

public class Main {

	public static void main(String[] args) throws Exception 
	{
		
		SourceCode test=new SourceCode();
		test.setPath("code.txt");
		test.Input(); 
		Lexer lexer=new Lexer();
		Parser parser=new Parser(lexer);
		parser.program(test);

	}
}
