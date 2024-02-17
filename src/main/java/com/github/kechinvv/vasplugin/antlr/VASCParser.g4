parser grammar VASCParser;

options { tokenVocab = VASCLexer; }

program
    :
      classDeclaration*
      EOF
    ;

classDeclaration
    : CLASS className (EXTENDS className)? IS memberDeclaration* END
    ;

className
    : IDENTIFIER (L_SQUARE_BRACKET className R_SQUARE_BRACKET)?
    ;

memberDeclaration
    : variableDeclaration
    | methodDeclaration
    | constructorDeclaration
    ;

variableDeclaration
    : VAR IDENTIFIER COLON expression
    ;

methodDeclaration
    : METHOD IDENTIFIER parameters? (COLON IDENTIFIER)?
    ;

parameters
    : parameterDeclaration (COMMA parameterDeclaration)*
    ;


parameterDeclaration
    : IDENTIFIER COLON className
    ;

body
    : bodyStatement*
    ;

bodyStatement
    : statement
    | variableDeclaration
    ;

constructorDeclaration
    : THIS parameters? IS body END
    ;

statement
    : assignment
    | whileLoop
    | ifStatement
    | returnStatement
    ;

assignment
    : IDENTIFIER ASSIGN_OP expression
    ;

whileLoop
    : WHILE expression LOOP body END
    ;

ifStatement
    : IF expression THEN body (ELSE body)? END
    ;

returnStatement
    : RETURN expression?
    ;

expression
    : primary (DOT IDENTIFIER arguments?)*
    ;

arguments
    : L_BRACKET expression (COMMA expression)* R_BRACKET
    ;

primary
    : integerLiteral
    | realLiteral
    | THIS
    | className
    | bool=(TRUE | FALSE)
    ;

integerLiteral
   :   MINUS? DIGIT+
   ;

realLiteral
   :   MINUS? DIGIT+ DOT DIGIT+
   ;
