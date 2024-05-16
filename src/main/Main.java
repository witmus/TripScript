package main;

import visitor.TripScriptMainVisitor;
import grammar.TripScriptLexer;
import grammar.TripScriptParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CharStream inp = null;
//        try {
//            inp = CharStreams.fromFileName("input.txt");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //CharStream inp = CharStreams.fromStream(System.in);
        Scanner scanner = new Scanner(System.in);
        String input;

        var v = new TripScriptMainVisitor();

        while (true) {
            input = scanner.nextLine();
            inp = CharStreams.fromString(input);

            // Check if the user wants to exit the loop
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting input loop...");
                break; // Exit the loop
            }
            TripScriptLexer lex = new TripScriptLexer(inp);
            CommonTokenStream tokens = new CommonTokenStream(lex);
            TripScriptParser par = new TripScriptParser(tokens);

            ParseTree tree = par.prog();

            String res = v.visit(tree);
            System.out.printf(res);
        }

        scanner.close();
    }
}