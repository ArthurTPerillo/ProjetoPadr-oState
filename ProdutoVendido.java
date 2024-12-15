public class ProdutoVendido implements EstadoMaquina {
    @Override
    public void inserirMoeda(MaquinaVendas maquina) {
        System.out.println("Aguarde, estamos processando o pedido.");
    }

    @Override
    public void selecionarProduto(MaquinaVendas maquina) {
        System.out.println("Produto já foi selecionado.");
    }

    @Override
    public void dispensarProduto(MaquinaVendas maquina) {
        System.out.println("Dispensando produto.");
        maquina.setEstado(new SemMoeda());
    }
}
