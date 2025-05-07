package dio.Aulas.AbstracaoClasseEncapsulamento.Petshop;

public class MaquinaDeBanho {
    private int agua = 0;
    private int shampoo = 0;
    private boolean petNaMaquina = false;
    private boolean petLimpo = false;

    private final int MAX_AGUA = 30;
    private final int MAX_SHAMPOO = 10;

    public void colocarPet() {
        if (petNaMaquina) {
            System.out.println("Já há um pet na máquina!");
        } else {
            petNaMaquina = true;
            petLimpo = false;
            System.out.println("Pet colocado na máquina.");
        }
    }

    public void retirarPet() {
        if (!petNaMaquina) {
            System.out.println("Não há pet na máquina.");
            return;
        }

        if (!petLimpo) {
            System.out.println("Pet removido sujo! Será necessário limpar a máquina.");
        } else {
            System.out.println("Pet retirado limpo!");
        }
        petNaMaquina = false;
    }

    public void darBanho() {
        if (!petNaMaquina) {
            System.out.println("Coloque um pet na máquina primeiro.");
        } else if (agua < 10 || shampoo < 2) {
            System.out.println("Não há água ou shampoo suficiente para o banho.");
        } else {
            agua -= 10;
            shampoo -= 2;
            petLimpo = true;
            System.out.println("Banho dado com sucesso! Pet está limpo.");
        }
    }

    public void limparMaquina() {
        if (agua < 3 || shampoo < 1) {
            System.out.println("Não há água ou shampoo suficiente para limpar a máquina.");
        } else {
            agua -= 3;
            shampoo -= 1;
            System.out.println("Máquina limpa. Pode colocar outro pet.");
        }
    }

    public void abastecerAgua() {
        if (agua + 2 <= MAX_AGUA) {
            agua += 2;
            System.out.println("Abastecido com 2L de água. Total agora: " + agua + "L.");
        } else {
            System.out.println("A máquina não suporta mais água!");
        }
    }

    public void abastecerShampoo() {
        if (shampoo + 2 <= MAX_SHAMPOO) {
            shampoo += 2;
            System.out.println("Abastecido com 2L de shampoo. Total agora: " + shampoo + "L.");
        } else {
            System.out.println("A máquina não suporta mais shampoo!");
        }
    }

    public void verificarNivelAgua() {
        System.out.println("Nível atual de água: " + agua + "L.");
    }

    public void verificarNivelShampoo() {
        System.out.println("Nível atual de shampoo: " + shampoo + "L.");
    }

    public void verificarPetNaMaquina() {
        if (petNaMaquina) {
            System.out.println("Há um pet na máquina.");
        } else {
            System.out.println("A máquina está vazia.");
        }
    }
}
