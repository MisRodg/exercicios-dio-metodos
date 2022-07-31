package exercicios.dio.criacao;

public class Emprestimo {

    public static int getSeisParcelas() {
        return 6;
    }
    public static int getDozeParcelas() {
        return 12;
    }

    public static double getTaxaSeisParcelas(){
        return 1.2;
    }

    public static double getTaxaDozeParcelas() {
        return 1.8;
    }

    public static void calcular(double valor, int parcelas) {
        if (parcelas == 6) {

            double valorFinal = valor + (valor * getSeisParcelas());

        System.out.println("Valor final do empréstimo para 6 parcelas: R$ " + valorFinal);
        } else if (parcelas == 12) {

            double valorFinal = valor + (valor * getDozeParcelas());

            System.out.println("Valor final do empréstimo para 12 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");

        }
    }
}
