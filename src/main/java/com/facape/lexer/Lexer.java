package com.facape.lexer;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author José Murillo
 */
public class Lexer {
    static final Runtime run = Runtime.getRuntime();
    static final String __dirname = "C:\\Users\\José Murillo\\Documents\\NetBeansProjects\\lexer\\src\\main\\java\\com\\facape\\lexer\\";
    
    public static void main(String[] args) throws IOException, InterruptedException {
        String file;
        Reader readContent;
            
        welcomeMessage();
        generator(__dirname); 
        
        codeFileMessage();
        file = scannerFile();
        
        readContent = readFile(__dirname + "scripts\\" + file + ".txt");
        generatorTokens(readContent);
        
        
    }   
    
    private static void generatorTokens(Reader readContent) throws IOException {
       ArrayList<Token> listTokens = new ArrayList<Token>();
       int positionTable = 0;
       ArrayList<TableSymbols> symbols = new ArrayList<TableSymbols>();
       int line = 1;
       int column = 0;
       
       LexerScanner lexer = new LexerScanner(readContent);
       
       while(true) {
           Token.Tokens token = lexer.yylex();
           if (token == null) {
                      
               recorderInFile(listTokens, symbols);
               
               TitleTokenMessage();
               forArrayTokens(listTokens);
               
               TitleSysmbolsMessage();
               forArraySymbols(symbols);
               return;
           }
           //System.out.println(lexer.lexeme);
           int find = findLexemeInTableSymbol(symbols, lexer.lexeme);
           if (token == Token.Tokens.TK_ERROR) {
               System.out.println("Error na coluna: " + column + " no seguinte token: " + lexer.lexeme);
           }
           if(find == -1) {
              Token newToken = new Token(positionTable, token);
              TableSymbols newSymbol = new TableSymbols(positionTable, lexer.lexeme, token);
              
              listTokens.add(newToken);
              symbols.add(newSymbol);
              
              positionTable += 1;
           } else {
               Token newToken = new Token(find, token);
               listTokens.add(newToken);
           }
           column += 1;
       }

    }
    
    public static void recorderInFile(ArrayList<Token> listTokens, ArrayList<TableSymbols> symbols) throws IOException {
        FileWriter fileTokens = new FileWriter(__dirname + ".\\outputs\\tokens.txt");
        FileWriter fileSymbols = new FileWriter(__dirname + ".\\outputs\\symbols.txt");
        
        PrintWriter recorderFileToken = new PrintWriter(fileTokens);
        PrintWriter recorderFileSymbols = new PrintWriter(fileSymbols);
        
        for (Token token : listTokens) {
            recorderFileToken.printf(token.toString() + "%n");
        }
        
        for (TableSymbols symbol: symbols) {
            recorderFileSymbols.printf(symbol.toString() + "%n");
        } 
        
        recorderFileToken.close();
        recorderFileSymbols.close();
        
        System.out.println("   ('-.       .-') _  _ .-') _   \n" +
" _(  OO)     ( OO ) )( (  OO) )  \n" +
"(,------.,--./ ,--,'  \\     .'_  \n" +
" |  .---'|   \\ |  |\\  ,`'--..._) \n" +
" |  |    |    \\|  | ) |  |  \\  ' \n" +
"(|  '--. |  .     |/  |  |   ' | \n" +
" |  .--' |  |\\    |   |  |   / : \n" +
" |  `---.|  | \\   |   |  '--'  / \n" +
" `------'`--'  `--'   `-------'  ");
        System.out.println("Arquivos gerados com sucesso");
        

    }
    
    private static void forArrayTokens(ArrayList<Token> listTokens) {
        for (Token token : listTokens) {
            System.out.println(token.toString());
        } 
    }
    
    private static void forArraySymbols(ArrayList<TableSymbols> symbols) {
        for (TableSymbols symbol: symbols) {
            System.out.println(symbol.toString());
        } 
    }
    
    private static int findLexemeInTableSymbol(ArrayList<TableSymbols> symbols, String lexeme) {
        for (TableSymbols symbol : symbols) {
            if (symbol.lexeme.equals(lexeme)) {
                return symbol.position;
            }
        }
        return -1;
    }
    
    private static void welcomeMessage() {
        System.out.println("  (`\\ .-') /`   ('-.                                  _   .-')       ('-.   \n" +
"   `.( OO ),' _(  OO)                                ( '.( OO )_   _(  OO)  \n" +
",--./  .--.  (,------.,--.       .-----.  .-'),-----. ,--.   ,--.)(,------. \n" +
"|      |  |   |  .---'|  |.-')  '  .--./ ( OO'  .-.  '|   `.'   |  |  .---' \n" +
"|  |   |  |,  |  |    |  | OO ) |  |('-. /   |  | |  ||         |  |  |     \n" +
"|  |.'.|  |_)(|  '--. |  |`-' |/_) |OO  )\\_) |  |\\|  ||  |'.'|  | (|  '--.  \n" +
"|         |   |  .--'(|  '---.'||  |`-'|   \\ |  | |  ||  |   |  |  |  .--'  \n" +
"|   ,'.   |   |  `---.|      |(_'  '--'\\    `'  '-'  '|  |   |  |  |  `---. \n" +
"'--'   '--'   `------'`------'   `-----'      `-----' `--'   `--'  `------' ");
    }
    
      private static void codeFileMessage() {
                System.out.println("   __                    \n" +
"  / /  _____  _____ _ __ \n" +
" / /  / _ \\ \\/ / _ \\ '__|\n" +
"/ /__|  __/>  <  __/ |   \n" +
"\\____/\\___/_/\\_\\___|_|   \n" +
"                       ");
    }
       
    private static void TitleTokenMessage() {
        System.out.println(" _____      _                  \n" +
"/__   \\___ | | _____ _ __  ___ \n" +
"  / /\\/ _ \\| |/ / _ \\ '_ \\/ __|\n" +
" / / | (_) |   <  __/ | | \\__ \\\n" +
" \\/   \\___/|_|\\_\\___|_| |_|___/\n" +
"                               ");
    }
    
    private static void TitleSysmbolsMessage() {
        System.out.println(" __                 _           _     \n" +
"/ _\\_   _ _ __ ___ | |__   ___ | |___ \n" +
"\\ \\| | | | '_ ` _ \\| '_ \\ / _ \\| / __|\n" +
"_\\ \\ |_| | | | | | | |_) | (_) | \\__ \\\n" +
"\\__/\\__, |_| |_| |_|_.__/ \\___/|_|___/\n" +
"    |___/                             ");
    }
    
    private static String scannerFile() {
        System.out.print("Informe o nome do aquivo desejado: ");
        Scanner scanner = new Scanner(System.in);
        String fileScanner = scanner.nextLine();
        return fileScanner;
    }
    
    public static void generator(String path) throws IOException, InterruptedException {
        Runtime r = Runtime.getRuntime();
        Process p;            
        p = r.exec(new String[]{"java", "-jar", ".\\jflex-full-1.8.2.jar", ".\\scanner.flex"}, null, new File(path));
        System.out.println(p.waitFor() == 0 ? "Sucess": "Error");
    }
    
    public static Reader readFile(String filename) throws IOException {
        Reader readContent = new BufferedReader(new FileReader(filename));
        return readContent;
    }
}
