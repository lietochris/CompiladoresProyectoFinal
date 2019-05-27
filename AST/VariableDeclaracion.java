package org.astral.interprete.ast;

import java.util.Map;

public class VariableDeclaracion implements NodoAST {
    private String nombre;

    public VariableDeclaracion(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Object ejecutar(Map<String, Object> tablaSimbolos) {
        tablaSimbolos.put(this.nombre, new Object() );
        return null;
    }
}
