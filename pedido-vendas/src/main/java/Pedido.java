public class Pedido {

    private double valorTotal;
    private double desconto;
    public void adicionarItem(String descricao, double valorUnitario, int quantidade) {
        valorTotal = valorUnitario * quantidade;
    }

    public double valorTotal() {
        return valorTotal;
    }

    public double desconto() {
        return desconto;
    }
}
