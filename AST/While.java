package org.astral.interprete.ast;

import java.util.List;
import java.util.Map;

public class While implements NodoAST {
    private NodoAST condicion;
    private List<NodoAST> subCuerpo;

    public While(NodoAST condicion, List<NodoAST> subCuerpo) {
        this.condicion = condicion;
        this.subCuerpo = subCuerpo;
    }

    @Override
    public Object ejecutar(Map<String, Object> tablaSimbolos) {
        while((boolean)condicion.ejecutar(tablaSimbolos))
        {
            for(NodoAST lineas : subCuerpo)
            {
                lineas.ejecutar(tablaSimbolos);
            }
        }
        return null;
    }
}
