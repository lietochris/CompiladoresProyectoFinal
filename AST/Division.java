package org.astral.interprete.ast;

import java.util.Map;

public class Division implements NodoAST {

    private NodoAST numero_1;
    private NodoAST numero_2;

    public Division(NodoAST numero_1, NodoAST numero_2) {
        this.numero_1 = numero_1;
        this.numero_2 = numero_2;
    }

    @Override
    public Object ejecutar(Map<String, Object> tablaSimbolos) {
        return (float)numero_1.ejecutar(tablaSimbolos) / (float)numero_2.ejecutar(tablaSimbolos);
    }
}
