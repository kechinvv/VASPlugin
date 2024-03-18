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

identifier
    : IDENTIFIER
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
    : VAR IDENTIFIER COLON NL* expression
    ;

methodDeclaration
    : METHOD IDENTIFIER NL* parameters? NL* (COLON IDENTIFIER)? NL* IS NL* body NL* END
    ;

parameters
    : L_BRACKET NL*
      ((parameterDeclaration NL*
      (NL* COMMA NL* parameterDeclaration NL*)*)
      | )
      R_BRACKET
    ;

parameterDeclaration
    : IDENTIFIER COLON NL* className
    ;

body
    : (bodyStatement NL*)*
    ;

bodyStatement
    : statement
    | variableDeclaration
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
    : IDENTIFIER ASSIGN_OP NL* expression
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
    : callable arguments? (NL* DOT IDENTIFIER NL* arguments?)*
    | primary
    ;

arguments
    : L_BRACKET NL* ((expression (NL* COMMA NL* expression)* NL*) |) R_BRACKET
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
