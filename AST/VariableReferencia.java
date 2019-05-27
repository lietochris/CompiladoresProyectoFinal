package org.astral.interprete.ast;

import java.util.Map;

public class VariableReferencia implements NodoAST {
    private String nombre;

    public VariableReferencia(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Object ejecutar(Map<String, Object> tablaSimbolos) {
        return tablaSimbolos.get(nombre);
    }
}
