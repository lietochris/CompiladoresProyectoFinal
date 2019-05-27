package org.astral.interprete.ast;

import java.util.Map;

public class Constante implements NodoAST {
    private Object numero;

    public Constante(Object numero) {
        this.numero = numero;
    }

    @Override
    public Object ejecutar(Map<String, Object> tablaSimbolos) {
        return numero;
    }
}
