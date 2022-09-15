package br.pucpr;


import static java.lang.String.valueOf;

public class Caesar implements Criptografia {

    @Override
    public String criptografar(String text) {
        String result = "";
        String alfabeto1 = "abcdefghijklmnopqrstuvwxyz";
        String alfabeto2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < text.length(); i++) {
            char novaString = ' ';
            int charPosition = 0;
            if (alfabeto1.contains(valueOf(text.charAt(i)))) {
                charPosition = alfabeto1.indexOf(text.charAt(i)) ;
            } else if (alfabeto2.contains(valueOf(text.charAt(i)))) {
                charPosition = alfabeto2.indexOf(text.charAt(i)) ;
            }
            if (text.charAt(i) == ' ') {
                result += novaString;
            } else {
                if (Character.isLowerCase(text.charAt(i))) {
                    int somaChar = (5 + charPosition) % 26;
                    char novoChar = alfabeto1.charAt(somaChar);
                    result += novoChar;
                } else if (Character.isUpperCase(text.charAt(i))) {
                    int somaChar = (5 + charPosition) % 26;
                    char novoChar = alfabeto2.charAt(somaChar);
                    result += novoChar;
                }
            }
        }
        return result;
    }

    @Override
    public String descriptografar(String text) {
        String result = "";
        String alfabeto1 = "abcdefghijklmnopqrstuvwxyz";
        String alfabeto2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < text.length(); i++) {
            char novaString = ' ';
            int charPosition = 0;
            if (alfabeto1.contains(valueOf(text.charAt(i)))) {
                charPosition = alfabeto1.indexOf(text.charAt(i)) ;
            } else if (alfabeto2.contains(valueOf(text.charAt(i)))) {
                charPosition = alfabeto2.indexOf(text.charAt(i)) ;
            }
            if (text.charAt(i) == ' ') {
                result += novaString;
            } else {
                if (Character.isLowerCase(text.charAt(i))) {
                    int somaChar = (charPosition - 5) % 26;
                    char novoChar = alfabeto1.charAt(somaChar);
                    result += novoChar;
                } else if (Character.isUpperCase(text.charAt(i))) {
                    int somaChar = (charPosition - 5) % 26;
                    char novoChar = alfabeto2.charAt(somaChar);
                    result += novoChar;
                }
            }
        }
        return result;
    }
}
