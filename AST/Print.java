package org.astral.interprete.ast;

import java.util.Map;

public class Print implements NodoAST {
    private NodoAST datos;

    public Print(NodoAST datos) {
        this.datos = datos;
    }

    @Override
    public Object ejecutar(Map<String, Object> tablaSimbolos) {
        System.out.println(datos.ejecutar(tablaSimbolos));
        return null;
    }
}
