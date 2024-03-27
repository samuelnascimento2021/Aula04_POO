class EmprestimoLongoPrazo extends Emprestimo {
    public EmprestimoLongoPrazo(Material material, double taxaMulta) {
        super(material, taxaMulta);
    }
    @Override
    public double calcularMulta(int atraso) {
        return super.calcularMulta(atraso);
    }
}