package br.pucpr;

public class TrocaLetras implements Criptografia{

    @Override
    public String criptografar(String text) {
        String[] resultado = text.split("");
        for (int i = 0; i < (text.length() - text.length()%2); i = i +2) {
            var newChar = resultado[i + 1];
            resultado[i + 1] = resultado[i];
            resultado[i] = newChar;
        }
        return String.join("", resultado);
    }

    @Override
    public String descriptografar(String text) {
        String[] resultado = text.split("");

        for (int i = 0; i < (text.length() - text.length()%2); i = i +2) {
            var newChar = resultado[i + 1];
            resultado[i + 1] = resultado[i];
            resultado[i] = newChar;
        }
        return String.join("", resultado);
    }
}



