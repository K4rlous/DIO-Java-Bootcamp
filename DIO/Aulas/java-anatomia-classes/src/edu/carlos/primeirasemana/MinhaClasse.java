package edu.carlos.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        System.out.println("I'm tired boss....");

        String primeiroNome = "O Acre";
        String segundoNome = "Não Existe";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto("Fulano", "Beltrano"));
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome + " " + segundoNome;
    }
}
