package classes;
import java.io.File;
import java.io.FileInputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Interpreter {

	public static void main(String [] args) throws Exception{
		System.setIn(new FileInputStream(new File("input.txt")));
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		MyLanguageLexer lexer = new MyLanguageLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MyLanguageParser parser = new MyLanguageParser(tokens);
		ParseTree tree = parser.commands();


		MyVisitor<Object> loader = new MyVisitor<Object>();
		loader.visit(tree);
		
		String clazz = Generador.myClass(MyVisitor.METODOSREST, MyVisitor.URLREST);
		Generador.generator(clazz);
	}
}
