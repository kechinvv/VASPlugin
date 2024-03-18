lexer grammar VASCLexer;

DOT : '.' ;

COLON : ':' ;

COMMA : ',' ;

MINUS : '-' ;

L_BRACKET : '(' ;

R_BRACKET : ')' ;

L_SQUARE_BRACKET : '[' ;

R_SQUARE_BRACKET : ']' ;

ASSIGN_OP : ':=' ;

CLASS
    : 'class'
    ;

EXTENDS
    : 'extends'
    ;

METHOD
    : 'method'
    ;

WHILE
    : 'while'
    ;

LOOP
    : 'loop'
    ;

IS
    : 'is'
    ;

END
    : 'end'
    ;

RETURN
    : 'return'
    ;

LIST
    : 'List'
    ;

THIS
    : 'this'
    ;

ARRAY
    : 'Array'
    ;

PRINT
    : 'println'
    ;

SUPER
    : 'super'
    ;

IF
    : 'if'
    ;

THEN
    : 'then'
    ;

ELSE
    : 'else'
    ;

VAR
    : 'var'
    ;

TRUE
    : 'true'
    ;

FALSE
    : 'false'
    ;

NULL
    : 'null'
    ;

STRING
    : '"' .*? '"'
    ;

IDENTIFIER
    :   [a-zA-Z_][a-zA-Z0-9_]*
    |   '`' .*? '`'
    ;

DIGIT: ('0'..'9');

MlComment
    : '/*' ( MlComment | .)*? '*/' -> channel(HIDDEN)
    ;

COMMENT
    : ('//' ~[\r\n]*) -> channel(HIDDEN)
    ;

WS
    : [\u0020\u0009\u000C]+ -> channel(HIDDEN)
    ;

NL
    : '\n'
    | '\r' '\n'?
    ;

BAD_CHARACTER
   :   .
   ;