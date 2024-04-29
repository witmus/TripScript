package main;

import visitor.TripScriptMainVisitor;
import grammar.TripScriptLexer;
import grammar.TripScriptParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        CharStream inp = null;
        try {
            inp = CharStreams.fromFileName("input.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        CharStream inp = CharStreams.fromStream(System.in);

        TripScriptLexer lex = new TripScriptLexer(inp);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        TripScriptParser par = new TripScriptParser(tokens);

        ParseTree tree = par.prog();

        var v = new TripScriptMainVisitor();
        String res = v.visit(tree);
        System.out.printf(res);
    }
}