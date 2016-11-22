grammar MyLanguage;		
commands : urlrest metodosRest+ json*;

metodosRest : ID  metodo DOS_PUNTOS LLA_IZQ returntype requesttype dir_url parametros* LLA_DER;
 
urlrest: 'URLREST' DOS_PUNTOS COMILLAS url COMILLAS;

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
ID_OBJECT: '-'[A-Z][a-zA-Z0-9_]*;

// *************************************************************
// JSON
// ************************************************************* 
json  : value;

object
   : '{' pair (',' pair)* '}'
   | '{' '}'
   ;

pair
   : COMILLAS ID COMILLAS ':' value1 
   | ID ':' value1
   ;
  

   
value1:  COMILLAS value COMILLAS
	| value
	;  
	
array
   : '[' value (',' value)* ']'
   | '[' ']'
   ;

value
   : ID
   | NUMBER
   | object
   | array
   | bool
   | 'null'
   | COMILLAS ID COMILLAS
   ;
   
valor_retorno: 'STRING' | 'NUMBER' | ID | 'bool' | 'null';

bool: 'true' | 'false';

NUMBER
   : [0-9]+( | [.][0-9]+)
   ;
   
// *************************************************************
// URL
// *************************************************************  
url
   : authority '://' login? host (':' port)? ('/' path)? ('?' search)?
   ;

authority
   : ID
   ;

host
   : hostname
   | hostnumber
   ;

cellname
   : hostname
   ;

hostname
   : ID ('.' ID)*
   ;

hostnumber
   : DIGITS '.' DIGITS '.' DIGITS '.' DIGITS
   ;

port
   : DIGITS
   ;

path
   : ID ('/' ID)*
   ;

search
   : searchparameter ('&' searchparameter)*
   ;

searchparameter
    : ID ('=' (ID |DIGITS ))?;

user
   : ID
   ;

login
    : user ':' password '@'
    ;

password
   : ID
   ;

fragmentid
   : ID
   ;


DIGITS
   : [0-9] +
   ;

   