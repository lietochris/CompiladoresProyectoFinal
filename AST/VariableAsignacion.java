package org.astral.interprete.ast;

import java.util.Map;

public class VariableAsignacion implements NodoAST {
    private String nombre;
    private NodoAST expresion;

    public VariableAsignacion(String nombre, NodoAST expresion) {
        this.nombre = nombre;
        this.expresion = expresion;
    }

    @Override
    public Object ejecutar(Map<String, Object> tablaSimbolos) {
        tablaSimbolos.put(this.nombre,expresion.ejecutar(tablaSimbolos));
        return null;
    }
}
