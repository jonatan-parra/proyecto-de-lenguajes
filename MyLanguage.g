grammar MyLanguage;		
commands : urlrest metodosRest+ json*;

metodosRest : ID  metodo DOS_PUNTOS LLA_IZQ returntype requesttype dir_url parametros* LLA_DER;
 
urlrest: 'URLREST' DOS_PUNTOS COMILLAS 'no_sirve' COMILLAS;

url_rest:  COMILLAS url_rest COMILLAS ;

metodo: ('GET' | 'POST' | 'PUT' | 'DELETE');

returntype: 'RETURNTYPE' DOS_PUNTOS valor_retorno;

requesttype: 'REQUESTTYPE' DOS_PUNTOS COMILLAS ('QUERY' |  'MATRIX' | 'PATH') COMILLAS;

dir_url: 'DIR_URL' DOS_PUNTOS COMILLAS (SLASH ID)+ COMILLAS;

parametros:  valor_retorno ID;

COMMENT 		: '/*' .*? '*/' -> skip ;
LINE_COMMENT 	: '//' ~[\r\n]* -> skip ;
WS		: [ \t\r\n]+ -> skip ;   
    
// Seccion tipos de variables

// Seccion tokens
PAR_IZQ : '(' ;
PAR_DER : ')' ;
COR_IZQ : '[';
COR_DER :']';

LLA_IZQ : '{' ;
LLA_DER : '}' ;

DOS_PUNTOS: ':';
COMILLAS: '"';
COMA: ',';

 
SLASH : '/';

// Operadores
MULOP	: ( '*'|'/' );
SUMOP	: ('+'|'-');
MODOP   : '%';
POTENCIA : '^';
AND_OP : ('&');
OR_OP : ('|');


ID    	 : [a-zA-Z][a-zA-Z0-9_]*; 

//miniscula


// *************************************************************
// JSON
// *************************************************************
json  : value;

object
   : '{' pair (',' pair)* '}'
   | '{' '}'
   ;

pair
   : STRING ':' value
   ;

array
   : '[' value (',' value)* ']'
   | '[' ']'
   ;

value
   : STRING
   | NUMBER
   | object
   | array
   | bool
   | 'null'
   ;
   
valor_retorno: 'STRING' | 'NUMBER' | ID | 'bool' | 'null';


bool: 'true' | 'false';

STRING
   : [a-zA-Z][a-zA-Z0-9_]*
   ;

NUMBER
   : [0-9]+( | [.][0-9]+)
   ;