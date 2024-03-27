public class Principal {

    public static void main(String[] args) {

        Material livro = new Material("A culpa é das estrelas", 2012);
        Emprestimo emprestimoCurtoPrazo = new EmprestimoCurtoPrazo(livro, 1.5);
        Emprestimo emprestimoLongoPrazo = new EmprestimoLongoPrazo(livro, 3);

        int atraso = 5;

        //Multa para empréstimo de Curto Prazo
        double multaCurtoPrazo = emprestimoCurtoPrazo.calcularMulta(atraso);
        System.out.println("Multa para empréstimo de curto prazo: " + multaCurtoPrazo);

        //Multa para empréstimo de longo prazo
        double multaLongoPrazo = emprestimoLongoPrazo.calcularMulta(atraso);
        System.out.println("Multa para empréstimo de longo prazo: " + multaLongoPrazo);
    }
}