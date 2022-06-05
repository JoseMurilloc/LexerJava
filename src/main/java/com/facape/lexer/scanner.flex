package com.facape.lexer;

%%
%class LexerScanner
%type Token.Tokens


L   =[a-zA-Z_]+
D=[0-9]+
espaco=[ ,\t,\r,\n]+


%{
    public String lexeme;
%}
%%
{espaco} {/*Ignore*/}

("+" | "-") {lexeme = yytext(); return Token.Tokens.TK_ADD_ARIT;}

("||") {lexeme = yytext(); return Token.Tokens.TK_ADD_LOGIC;}

(">" | "<" | "<=" | ">=" | "==" | "!=") {lexeme = yytext(); return Token.Tokens.TK_OP_REL;}

("true"|"false") {lexeme = yytext(); System.out.println(lexeme); return Token.Tokens.TK_CONST_BOOLEAN;}

("=") {lexeme = yytext(); return Token.Tokens.TK_OP_ATR;}

( System.out.println | System.out.print | boolean | char | string | switch | static | if | else | switch | while | break | int | String | float | return | break | continue | class | try | public | void ) {lexeme = yytext(); return Token.Tokens.TK_RESERVATION;}

{L}({L}|{D})* {lexeme=yytext(); return Token.Tokens.TK_IDENTIFIER;}

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
