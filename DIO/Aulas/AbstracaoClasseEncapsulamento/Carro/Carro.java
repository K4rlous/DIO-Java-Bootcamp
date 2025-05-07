package dio.Aulas.AbstracaoClasseEncapsulamento.Carro;

import java.util.Scanner;

public class Carro {
    private boolean ligado = false;
    private int marcha = 0;
    private int velocidade = 0;

    public void ligarCarro() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro está ligado!");
        } else {
            System.out.println("O carro já está ligado!");
        }
    }

    public void desligarCarro() {
        if (!ligado) {
            System.out.println("O carro já está desligado!");
        } else if (marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("O carro está desligado!");
        } else {
            System.out.println("Pare o carro e coloque em ponto morto para desligar!");
        }
    }

    public void acelerar() {
        if (!ligado) {
            System.out.println("O carro está desligado!");
            return;
        }

        if (velocidade >= 120) {
            System.out.println("Velocidade máxima atingida!");
            return;
        }

        int novaVelocidade = velocidade + 1;
        if (!velocidadeIncompativelAtual(novaVelocidade)) {
            velocidade = novaVelocidade;
            System.out.println("Aumentando a velocidade para " + velocidade + " km/h.");
        } else {
            System.out.println("Troque para uma marcha adequada antes de acelerar!");
        }
    }

    public void diminuirVelocidade() {
        if (!ligado) {
            System.out.println("O carro está desligado!");
            return;
        }

        if (velocidade <= 0) {
            System.out.println("Velocidade mínima atingida!");
            return;
        }

        int novaVelocidade = velocidade - 1;
        if (!velocidadeIncompativelAtual(novaVelocidade)) {
            velocidade = novaVelocidade;
            System.out.println("Diminuindo a velocidade para " + velocidade + " km/h.");
        } else {
            System.out.println("Troque para uma marcha adequada antes de reduzir!");
        }
    }

    public void virarEsquerda() {
        if (!ligado) {
            System.out.println("Ligue o carro antes!");
        } else if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para a esquerda!");
        } else {
            System.out.println("Velocidade inadequada para fazer curvas!");
        }
    }

    public void virarDireita() {
        if (!ligado) {
            System.out.println("Ligue o carro antes!");
        } else if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Virando para a direita!");
        } else {
            System.out.println("Velocidade inadequada para fazer curvas!");
        }
    }

    public void verificarVelocidade() {
        if (!ligado) {
            System.out.println("O carro está desligado!");
        } else if (velocidade == 0) {
            System.out.println("O carro está parado!");
        } else {
            System.out.println("Velocidade atual: " + velocidade + " km/h.");
        }
    }

    public void trocarMarcha() {
        if (!ligado) {
            System.out.println("O carro está desligado!");
            return;
        }

        System.out.println("Marcha atual: " + marcha);
        System.out.println("Deseja (1) subir ou (2) descer marcha?");
        Scanner scanner =  new Scanner(System.in);
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> {
                if (marcha < 6) {
                    if (!velocidadeIncompativel(marcha + 1)) {
                        marcha++;
                        System.out.println("Subiu para a marcha " + marcha);
                    } else {
                        System.out.println("Velocidade incompatível com a próxima marcha!");
                    }
                } else {
                    System.out.println("Já está na última marcha!");
                }
            }
            case 2 -> {
                if (marcha > 0) {
                    if (!velocidadeIncompativel(marcha - 1)) {
                        marcha--;
                        System.out.println("Reduziu para a marcha " + marcha);
                    } else {
                        System.out.println("Velocidade incompatível com a marcha anterior!");
                    }
                } else {
                    System.out.println("Já está em ponto morto!");
                }
            }
            default -> System.out.println("Opção inválida.");
        }
        scanner.close();
    }

    private boolean velocidadeIncompativel(int marchaDestino) {
        return switch (marchaDestino) {
            case 0 -> velocidade != 0;
            case 1 -> velocidade < 0 || velocidade > 20;
            case 2 -> velocidade < 20 || velocidade > 40;
            case 3 -> velocidade < 40 || velocidade > 60;
            case 4 -> velocidade < 60 || velocidade > 80;
            case 5 -> velocidade < 80 || velocidade > 100;
            case 6 -> velocidade < 100 || velocidade > 120;
            default -> true;
        };
    }

    private boolean velocidadeIncompativelAtual(int novaVelocidade) {
        return switch (marcha) {
            case 0 -> novaVelocidade != 0;
            case 1 -> novaVelocidade < 0 || novaVelocidade > 20;
            case 2 -> novaVelocidade < 20 || novaVelocidade > 40;
            case 3 -> novaVelocidade < 40 || novaVelocidade > 60;
            case 4 -> novaVelocidade < 60 || novaVelocidade > 80;
            case 5 -> novaVelocidade < 80 || novaVelocidade > 100;
            case 6 -> novaVelocidade < 100 || novaVelocidade > 120;
            default -> true;
        };
    }
}
