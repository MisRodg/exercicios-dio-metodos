package exercicios.dio.criacao;

public class Main {

    public static void main(String[] args) {
        //Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 5);
        Calculadora.subtracao(11, 3);
        Calculadora.multiplicacao(4, 7);
        Calculadora.divisao(9, 3);

        //Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(2);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(21);

        //Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDozeParcelas());
        Emprestimo.calcular(1000, Emprestimo.getDozeParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
