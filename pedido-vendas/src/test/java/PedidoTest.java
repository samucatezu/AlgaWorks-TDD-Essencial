import org.junit.Before;
import org.junit.Test;
import pedidoVendas.ItemPedido;
import pedidoVendas.Pedido;
import pedidoVendas.ResumoPedido;

import static org.junit.Assert.assertEquals;

public class PedidoTest {


    Pedido pedido = new Pedido();

    @Before
    public void setup() {
        pedido = new Pedido();
    }

    private void assertResumoPedido(double valorTotal, double desconto) {
        ResumoPedido resumoPedido = pedido.resumo();
        assertEquals(valorTotal, resumoPedido.getValorTotal(), 0.0001);
        assertEquals(desconto, resumoPedido.getDesconto(), 0.0001);
    }

    @Test
    public void devePermitirAdicionarUmItemNoPedido() throws Exception {

        pedido.adicionarItem(new ItemPedido("Sabonete", 3.0, 10));
    }



    @Test
    public void deveCalcularValorTotalEDescontoParaPedidoVazio() throws Exception {
        assertResumoPedido(0.0, 0.0);

    }

    @Test
    public void deveCalcularResumoParaUmItemSemDesconto() throws Exception {
        pedido.adicionarItem(new ItemPedido("Sabonete", 5, 5));
        assertResumoPedido(25.0, 0.0);
    }

    @Test
    public void deveCalcularResumoParaDoisItemSemDesconto() throws Exception {
        pedido.adicionarItem(new ItemPedido("Sabonete", 3.0, 10));
        pedido.adicionarItem(new ItemPedido("Pasta dental", 7.0, 3));

        assertResumoPedido(30.0,0.0);
    }

    @Test
    public void deveAplicarDescontoNa1aFaixa() throws Exception{
        pedido.adicionarItem(new ItemPedido("Creme", 20.0,20));

        assertResumoPedido(400.0,16);
    }

    @Test
    public void deveAplicarDescontoNa2aFaixa() throws Exception {
        pedido.adicionarItem(new ItemPedido("Shampoo", 15.0,30));
        pedido.adicionarItem(new ItemPedido("Oleo", 15.0, 30));

        assertResumoPedido(900.0, 54.0);
    }

    @Test
    public void deveAplicarDescontoNa3aFaixa() throws Exception {
        pedido.adicionarItem(new ItemPedido("Shampoo", 15.0,30));
        pedido.adicionarItem(new ItemPedido("Oleo", 15.0, 30));
        pedido.adicionarItem(new ItemPedido("Creme", 20.0,20));

        assertResumoPedido(1200.0, 96.0);
    }
}