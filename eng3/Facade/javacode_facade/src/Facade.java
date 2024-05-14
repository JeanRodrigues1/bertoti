class Facade {
    private Pagamento pagamento;
    private Pecas pecas;

    public Facade() {
        this.pagamento = new Pagamento();
        this.pecas = new Pecas();
    }

    public void finalizarCompra(double preco, int quantidade) {
        pagamento.pegarPagamento(preco);
        pecas.quantidadePecas(quantidade);
        System.out.println("Compra finalizada com sucesso!!");
    }
}
