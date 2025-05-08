package dio.Aulas.HerancaPolimorfismoJava.Relogio;

public class App {
    public static void main(String[] args) {
        RelogioBrasileiro br = new RelogioBrasileiro(14, 45, 30);
        System.out.println("Brasileiro: " + br.verHoras());

        RelogioAmericano us = new RelogioAmericano(0, 0, 0, true);
        us.atualizarRelogio(br);
        System.out.println("Americano: " + us.verHoras());
    }
}
