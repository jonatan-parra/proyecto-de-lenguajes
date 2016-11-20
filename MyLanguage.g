grammar MyLanguage;		

commands : NAMEMETHOD DOS_PUNTOS ID verbo;


 
verbo: METHOD  DOS_PUNTOS LLA_IZQ parametros* LLA_DER;
parametros:  URL DOS_PUNTOS COMILLAS fragmentaddress COMILLAS COMA// fragmentaddress es para la URL
 			| REQUESTTYPE DOS_PUNTOS COMILLAS ID COMILLAS COMA
 			;


METHOD: G E T | P O S T | P U T | D E L E T E | H E A D | O P T I O N S | T R A C E | P A T C H;

// Seccion de palabras reservadas
URL: U R L;

QUERY: Q U E R Y;
TEMPLATE: T E M P L A T E;
HEADER: H E A D E R;
MATRIX: M A T R I X;
PLAIN: P L A I N;

REQUESTTYPE: R E Q U E S T T Y P E;
NAMEMETHOD: N A M E M E T H O D;

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


// Operadores
MULOP	: ( '*'|'/' );
SUMOP	: ('+'|'-');
MODOP   : '%';
MODULO  : M O D;
POTENCIA : '^';

AND_OP : ('&' | Y);
OR_OP : ('|' | O);


ID    	 : [a-zA-Z][a-zA-Z0-9_]*; 

// *************************************************************
// JSON
// *************************************************************
json
   : value
   ;

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
   | 'true'
   | 'false'
   | 'null'
   ;


// STRING    : '"' (ESC | ~ ["\\])* '"'    ;
fragment ESC
   : '\\' (["\\/bfnrt] | UNICODE)
   ;
fragment UNICODE
   : 'u' HEX HEX HEX HEX
   ;
// fragment HEX    : [0-9a-fA-F]    ;
NUMBER
   : '-'? INT '.' [0-9] + EXP? | '-'? INT EXP | '-'? INT
   ;
fragment INT
   : '0' | [1-9] [0-9]*
   ;
// no leading zeros
fragment EXP
   : [Ee] [+\-]? INT
   ;
// \- since - means "range" inside [...]
// WS    : [ \t\n\r] + -> skip    ;
// *************************************************************
// URL
// *************************************************************

fragmentaddress
   : uri ('#' fragmentid)? WS?
   ;

uri
   : url
   ;

url
   : authority '://' login? host (':' port)? ('/' path)? ('?' search)?
   ;

authority
   : STRING
   ;

host
   : hostname
   | hostnumber
   ;

cellname
   : hostname
   ;

hostname
   : STRING ('.' STRING)*
   ;

hostnumber
   : DIGITS '.' DIGITS '.' DIGITS '.' DIGITS
   ;

port
   : DIGITS
   ;

path
   : STRING ('/' STRING)*
   ;

search
   : searchparameter ('&' searchparameter)*
   ;

searchparameter
    : STRING ('=' (STRING |DIGITS | HEX))?;

user
   : STRING
   ;

login
    : user ':' password '@'
    ;

password
   : STRING
   ;

fragmentid
   : STRING
   ;

HEX
    : ('%' [a-fA-F0-9] [a-fA-F0-9])+
    ;

STRING
   : ([a-zA-Z~] |HEX) ([a-zA-Z0-9.-] | HEX)*
 //	: 'dia'
   ;

DIGITS
   : [0-9] +
   ;


// WS    : [\r\n] +    ;



