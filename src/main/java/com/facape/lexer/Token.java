/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facape.lexer;

/**
 *
 * @author José Murillo
 */
public class Token {    
    public int lexemePosion;
    public Tokens token;
    
    public enum Tokens {
        TK_NUMBER,
        TK_IDENTIFIER,
        TK_OP_REL,
        TK_POINTER,
        TK_OPEN_KEY,
        TK_CLOSE_KEY,
        TK_OPEN_PAR,
        TK_CLOSE_PAR,
        TK_COMMA,
        TK_TWO_POINTER,
        TK_END_LINE,
        TK_CONST_CARACTERE,
        TK_CONST_BOOLEAN,
        TK_OP_ARG,
        TK_ADD_ARIT,
        TK_ADD_LOGIC,
        TK_OP_MULT,
        TK_RESERVATION,
        TK_ERROR,
        TK_NUMBER_FLOAT,
        TK_OP_ATR,
        TK_OPEN_ARRAY,
        TK_CLOSE_ARRAY;
    }
    
        
    public Token(int lexemePosion, Tokens token) {
        this.lexemePosion = lexemePosion;
        this.token = token;
    }
    
    @Override
    public String toString() {
        return "<" + this.lexemePosion + ", " + this.token + ">";
    }
}
