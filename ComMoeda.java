    public class ComMoeda implements EstadoMaquina {
        @Override
        public void inserirMoeda(MaquinaVendas maquina) {
            System.out.println("Moeda já foi inserida.");
        }

    @Override
    public void selecionarProduto(MaquinaVendas maquina) {
        System.out.println("Produto selecionado.");
        maquina.setEstado(new ProdutoVendido());
    }

    @Override
    public void dispensarProduto(MaquinaVendas maquina) {
        System.out.println("Selecione um produto primeiro.");
    }
}
