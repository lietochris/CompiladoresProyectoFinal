package org.astral.interprete.ast;

import java.util.List;
import java.util.Map;

public class IfElse implements NodoAST {
    private NodoAST condicion;
    private List<NodoAST> verdadero;
    private List<NodoAST> falso;

    public IfElse(NodoAST condicion, List<NodoAST> verdadero, List<NodoAST> falso) {
        this.condicion = condicion;
        this.verdadero = verdadero;
        this.falso = falso;
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
        else
        {
            for(NodoAST lineas : falso)
            {
                lineas.ejecutar(tablaSimbolos);
            }
        }
        return null;
    }
}
