public class ItemPedido {

    private String item;
    private double valorUnitario;
    private int quantidade;

    public ItemPedido(
            String item,
            double valorUnitario,
            int quantidade) {
        this.item = item;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

}
