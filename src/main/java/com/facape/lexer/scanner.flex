package com.facape.lexer;

%%
%class LexerScanner
%type Token.Tokens


L   =[a-zA-Z]
D=[0-9]+
identifier   = ({L}|"_")({L}|{D}|"_")*


space = " "
line_end = \n|\r|\r\n
whitespace = {space}|{line_end}| [\t\n]

commentary = {commentary_line}|{commentary_block}
commentary_line = "//".*
commentary_block = [/][*][^*]*[*]+([^*/][^*]*[*]+)*[/] 


%{
    public String lexeme;
    public int countLine = 1;
%}
%%
{whitespace} {/*Ignore*/}
{commentary} {/* DO NOTHING */}
    

("+" | "-") {lexeme = yytext(); return Token.Tokens.TK_ADD_ARIT;}

("||") {lexeme = yytext(); return Token.Tokens.TK_ADD_LOGIC;}

(">" | "<" | "<=" | ">=" | "==" | "!=") {lexeme = yytext(); return Token.Tokens.TK_OP_REL;}

("true"|"false") {lexeme = yytext(); System.out.println(lexeme); return Token.Tokens.TK_CONST_BOOLEAN;}

("=") {lexeme = yytext(); return Token.Tokens.TK_OP_ATR;}

( System.out.println | System.out.print | boolean | char | string | switch | static | if | else | switch | while | break | int | String | float | return | break | continue | class | try | public | void ) {lexeme = yytext(); return Token.Tokens.TK_RESERVATION;}

{identifier} {lexeme=yytext(); return Token.Tokens.TK_IDENTIFIER;}

("args") {lexeme = yytext(); return Token.Tokens.TK_OP_ARG;}

("(-"{D}+")")|{D}+ {lexeme=yytext(); return Token.Tokens.TK_NUMBER;}

{D}+"."{D}* {lexeme = yytext(); return Token.Tokens.TK_NUMBER_FLOAT;}

("*" | "&&" | "%" | "/") {lexeme = yytext(); return Token.Tokens.TK_OP_MULT;}

("[") {lexeme = yytext(); return Token.Tokens.TK_OPEN_ARRAY;}

("]") {lexeme = yytext(); return Token.Tokens.TK_CLOSE_ARRAY;}

("{") {lexeme = yytext(); return Token.Tokens.TK_OPEN_KEY;}

("}") {lexeme = yytext(); return Token.Tokens.TK_CLOSE_KEY;}

("(") {lexeme = yytext(); return Token.Tokens.TK_OPEN_PAR;}

(":") {lexeme = yytext(); return Token.Tokens.TK_TWO_POINTER;}

(")") {lexeme = yytext(); return Token.Tokens.TK_CLOSE_PAR;}

(\"[^\n,]*\" | \'[^\n,]*\') {lexeme = yytext(); return Token.Tokens.TK_CONST_BOOLEAN;}

(";") {lexeme = yytext(); return Token.Tokens.TK_END_LINE;}

 . {System.out.println("ERROR"); return Token.Tokens.TK_ERROR;}
