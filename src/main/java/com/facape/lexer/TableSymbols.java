/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.facape.lexer;

/**
 *
 * @author José Murillo
 */
public class TableSymbols {
    public int position;
    public String lexeme;
    public Token.Tokens token;
    
    public TableSymbols(int position, String lexeme, Token.Tokens token) {
        this.lexeme = lexeme;
        this.position = position;
        this.token = token;
    }
    
    @Override
    public String toString() {
        return "<" + this.position + ", " + this.lexeme + ", " + this.token + ">";
    }
}
