package org.astral.interprete.ast;

import java.util.List;
import java.util.Map;

public class For implements NodoAST {
    private NodoAST variable;
    private NodoAST comparacion;
    private NodoAST aumento;
    private List<NodoAST> subCuerpo;

    public For(NodoAST variable, NodoAST comparacion, NodoAST aumento, List<NodoAST> subCuerpo) {
        this.variable = variable;
        this.comparacion = comparacion;
        this.aumento = aumento;
        this.subCuerpo = subCuerpo;
    }

    @Override
    public Object ejecutar(Map<String, Object> tablaSimbolos) {
        for(variable.ejecutar(tablaSimbolos); (boolean)comparacion.ejecutar(tablaSimbolos); aumento.ejecutar(tablaSimbolos))
        {
            for(NodoAST lineas : subCuerpo)
            {
                lineas.ejecutar(tablaSimbolos);
            }
        }
        return null;
    }
}
