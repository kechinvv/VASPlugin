parser grammar VASCParser;

options { tokenVocab = VASCLexer; }

program
    :
      NL*
      classDeclaration*
      NL*
      EOF
    ;

classDeclaration
    : CLASS NL* identifier NL*
      (EXTENDS NL* identifier)? NL*
      IS NL* (memberDeclaration NL*)*  END NL*
    ;

listType
    : LIST genericType
    ;

arrayType
    : ARRAY genericType
    ;

genericType
    : NL* L_SQUARE_BRACKET NL* className R_SQUARE_BRACKET NL*
    ;

memberDeclaration
    : variableDeclaration
    | methodDeclaration
    | constructorDeclaration
    ;

variableDeclaration
    : uninitializedVariable
    | initializedVariable
    ;
    
initializedVariable
    : VAR identifier COLON NL* expression
    ;
    
uninitializedVariable
    : VAR identifier type
    ;

parameters
    : L_BRACKET NL*
      (parameterDeclaration NL* (COMMA NL* parameterDeclaration NL*)*)?
      R_BRACKET
    ;

parameterDeclaration
    : identifier type
    ;

body
    : (bodyStatement NL*)*
    ;

bodyStatement
    : statement
    | variableDeclaration
    ;

methodDeclaration
    : METHOD identifier NL* parameters? NL* type? NL* IS NL* body NL* END
    ;

constructorDeclaration
    : THIS NL* parameters? NL* IS NL* body NL* END
    ;

statement
    : assignment
    | whileLoop
    | ifStatement
    | returnStatement
    | expression
    | print
    ;

print
    : PRINT L_BRACKET STRING R_BRACKET
    ;

assignment
    : identifier ASSIGN_OP NL* expression
    ;

whileLoop
    : WHILE NL* expression NL* LOOP NL* body NL* END
    ;

ifStatement
    : IF NL* expression NL* THEN NL* body NL* (ELSE NL* body)? NL* END
    ;

returnStatement
    : RETURN NL* expression?
    ;

expression
    : callableExpression
    | primary
    ;

callableExpression
    : callable arguments? chainExpression?
    ;

chainExpression
    : NL* DOT callableExpression
    ;

arguments
    : L_BRACKET NL* (expression (NL* COMMA NL* expression)* NL*)? R_BRACKET
    ;

callable
    : THIS
    | SUPER
    | className
    ;

primary
    : integerLiteral
    | realLiteral
    | bool=(TRUE | FALSE)
    | NULL
    ;

type
    : COLON NL* className
    ;
    
className
    : identifier
    | arrayType
    | listType
    ;

integerLiteral
   :   MINUS? DIGIT+
   ;

realLiteral
   :   MINUS? DIGIT+ DOT DIGIT+
   ;

identifier
   : IDENTIFIER
   ;