package org.astral.interprete.ast;

import java.util.List;
import java.util.Map;

public class If implements NodoAST {
    private NodoAST condicion;
    private List<NodoAST> verdadero;

    public If(NodoAST condicion, List<NodoAST> verdadero) {
        this.condicion = condicion;
        this.verdadero = verdadero;
    }

    @Override
    public Object ejecutar(Map<String, Object> tablaSimbolos) {
        if((boolean)condicion.ejecutar(tablaSimbolos))
        {
            for(NodoAST lineas : verdadero)
            {
                lineas.ejecutar(tablaSimbolos);
            }
        }
        return null;
    }
}
