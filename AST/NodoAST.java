package org.astral.interprete.ast;

import java.util.Map;

public interface NodoAST {
    public Object ejecutar(Map<String, Object> tablaSimbolos);
}
