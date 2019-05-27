grammar astral;

@parser::header{

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.astral.interprete.ast.*;

}

inicio
    :
    {
        List<NodoAST> cuerpo = new ArrayList<NodoAST>();
        Map<String, Object> tablaSimbolos = new HashMap<String, Object>();

    }
      (sentencias {cuerpo.add($sentencias.nodo);})*
      {
        for(NodoAST lineas : cuerpo)
        {
            lineas.ejecutar(tablaSimbolos);
        }
      }
    ;

sentencias returns[NodoAST nodo]
    : expresion {$nodo = $expresion.nodo;}
    | impresion {$nodo = $impresion.nodo;}
    | comparacion {$nodo = $comparacion.nodo;}
    | ciclos {$nodo = $ciclos.nodo;}
    | variable_asignacion {$nodo = $variable_asignacion.nodo;}
    | variable_declaracion {$nodo = $variable_declaracion.nodo;}
    ;

expresion returns[NodoAST nodo]
    : NUMERO {$nodo = new Constante( Float.parseFloat($NUMERO.text) );}
    | BOOLEANO {$nodo = new Constante(Boolean.parseBoolean($BOOLEANO.text));}
    | STRING {$nodo = new Constante($STRING.text);}
    | ID {$nodo = new VariableReferencia($ID.text);}
    | PARA expresion PARB {$nodo = $expresion.nodo;}

    | a=expresion SUMA b=expresion {$nodo = new Suma($a.nodo, $b.nodo);}
    | a=expresion RESTA b=expresion {$nodo = new Resta($a.nodo, $b.nodo);}
    | a=expresion (MULTI b=expresion) {$nodo = new Multiplicacion($a.nodo, $b.nodo);}
    | a=expresion (DIVI b=expresion) {$nodo = new Division($a.nodo, $b.nodo);}

    | a=expresion (MAYOR b=expresion) {$nodo = new Mayor($a.nodo, $b.nodo);}
    | a=expresion (MENOR b=expresion) {$nodo = new Menor($a.nodo, $b.nodo);}
    | a=expresion (MAYORIGUAL b=expresion) {$nodo = new MayorIgual($a.nodo, $b.nodo);}
    | a=expresion (MENORIGUAL b=expresion) {$nodo = new MenorIgual($a.nodo, $b.nodo);}
    | a=expresion (TOTALIGUAL b=expresion) {$nodo = new TotalIgual($a.nodo, $b.nodo);}
    ;
variable_declaracion returns[NodoAST nodo]
    : VAR ID PYQ {$nodo = new VariableDeclaracion($ID.text);}
    | VAR ID IGUAL expresion PYQ {$nodo = new VariableAsignacion($ID.text, $expresion.nodo);}
;
variable_asignacion returns[NodoAST nodo]
    : ID IGUAL expresion PYQ {$nodo = new VariableAsignacion($ID.text, $expresion.nodo);}
    | ID IGUAL expresion {$nodo = new VariableAsignacion($ID.text, $expresion.nodo);}
;

comparacion returns[NodoAST nodo]
    : IF PARA expresion PARB DP {List<NodoAST> verdadero = new ArrayList<NodoAST>();}
     (sentencias {verdadero.add($sentencias.nodo);})*
     ENDIF {$nodo = new If($expresion.nodo, verdadero);}

    | IF PARA expresion PARB DP
    {List<NodoAST> verdadero = new ArrayList<NodoAST>(); List<NodoAST> falso = new ArrayList<NodoAST>();}
     (v=sentencias {verdadero.add($v.nodo);})*
     ELSE DP
     (f=sentencias {falso.add($f.nodo);})*
     ENDIF {$nodo = new IfElse($expresion.nodo, verdadero, falso);}

    ;

ciclos returns[NodoAST nodo]
    : WHILE PARA expresion PARB DP
        {List<NodoAST> sublineas = new ArrayList<NodoAST>();}
    (sentencias {sublineas.add($sentencias.nodo);})*
    ENDWHILE {$nodo = new While($expresion.nodo, sublineas);}

    | FOR PARA (a=variable_asignacion) expresion PYQ (b=variable_asignacion) PARB DP
        {List<NodoAST> sublineasFor = new ArrayList<NodoAST>();}
     (sentencias {sublineasFor.add($sentencias.nodo);})*
     ENDFOR {$nodo = new For($a.nodo, $expresion.nodo, $b.nodo, sublineasFor);}
;

impresion returns[NodoAST nodo]: PRINT PARA expresion PARB PYQ {$nodo = new Print($expresion.nodo);};

PRINT: 'print';
VAR: 'var';
IF: 'if';
ELSE: 'else';
ENDIF:'endif';
WHILE: 'while';
ENDWHILE: 'endwhile';
FOR: 'for';
ENDFOR:'endfor';

SUMA: '+';
RESTA: '-';
MULTI: '*';
DIVI: '/';
PARA: '(';
PARB: ')';
IGUAL: '=';

BOOLEANO: 'true' | 'false';

MAYOR: '>';
MENOR: '<';
MAYORIGUAL: '>=';
MENORIGUAL: '<=';
TOTALIGUAL: '==';

PYQ: ';';
DP: ':';
COMILLAS:'"';

NUMERO: [0-9]+ | [0-9]+'.'[0-9]+;
STRING: '"' ~('"')* '"';
ID: [a-zA-Z_][a-zA-Z0-9_]*;

COMENTARIO:'/*'(' ' | [a-zA-Z0-9_]+)*'*/' -> skip;
WS : [ \t\n\r]+ -> skip;