import org.antlr.v4.runtime.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        if(args.length < 1){
            System.out.println("Fallo al abrir el documento");
            return;
        }

        astralLexer lexico = new astralLexer(CharStreams.fromFileName(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lexico);
        astralParser sintactico = new astralParser(tokens);

        sintactico.inicio();

        System.out.println("\nInterpretacion finalizada.");
    }
}
