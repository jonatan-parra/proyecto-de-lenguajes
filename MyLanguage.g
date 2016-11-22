grammar MyLanguage;		
commands : urlrest ID metodo DOS_PUNTOS LLA_IZQ returntype requesttype dir_url parametros* LLA_DER;

urlrest: URLREST DOS_PUNTOS COMILLAS 'url'  COMILLAS;

metodo: ('GET' | 'POST' | 'PUT' | 'DELETE' | 'HEAD' | 'OPTIONS' | 'TRACE' | 'PATCH');

returntype: RETURNTYPE DOS_PUNTOS valor_retorno;

requesttype: REQUESTTYPE DOS_PUNTOS COMILLAS (QUERY | TEMPLATE | HEADER |  MATRIX | PLAIN) COMILLAS;

dir_url: DIR_URL DOS_PUNTOS COMILLAS (SLASH ID)+ COMILLAS;

parametros:  valor_retorno ID;
// Seccion de palabras reservadas
URL: U R L;
QUERY: Q U E R Y;
TEMPLATE: T E M P L A T E;
HEADER: H E A D E R;
MATRIX: M A T R I X;
PLAIN: P L A I N;

RETURNTYPE : 'RETURNTYPE';
URLREST: 'URLREST';
REQUESTTYPE: 'REQUESTTYPE';
DIR_URL: 'DIR_URL';

COMMENT 		: '/*' .*? '*/' -> skip ;
LINE_COMMENT 	: '//' ~[\r\n]* -> skip ;
WS		: [ \t\r\n]+ -> skip ;   
    
// Seccion tipos de variables
VAR   	 : ( R E A L | E N T E R O | N U M E R I C O | L O G I C O | C A R A C T E R | T E X T O | C A D E N A | N U M E R O);

   
// Seccion de caracteres
A : 'a' | 'A';
B : 'b' | 'B';
C: 'c' | 'C';
D: 'd' | 'D';
E: 'e' | 'E';
F: 'f' | 'F';
G: 'g' | 'G';
H: 'h' | 'H';
I: 'i' | 'I';
J: 'j' | 'J';
K: 'k' | 'K';
L: 'l' | 'L';
M: 'm' | 'M';
N: 'n' | 'N';
O: 'o' | 'O';
P: 'p' | 'P';
Q: 'q' | 'Q';
R: 'r' | 'R';
S: 's' | 'S';
T: 't' | 'T';
U: 'u' | 'U';
V: 'v' | 'V';
W: 'w' | 'W';
X: 'x' | 'X';
Y: 'y' | 'Y';
Z: 'z' | 'Z';



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
MODULO  : M O D;
POTENCIA : '^';

AND_OP : ('&' | Y);
OR_OP : ('|' | O);


ID    	 : [a-zA-Z][a-zA-Z0-9_]*; 
ID_METODO : [A-Z0-9_]+;

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
   
valor_retorno: 'STRING' | 'NUMBER' | 'object' | 'array' | 'bool' | 'null';

bool: 'true' | 'false';

STRING
   : [a-zA-Z][a-zA-Z0-9_]*
   ;

NUMBER
   : [0-9]+( | [.][0-9]+)
   ;
