public class SemMoeda implements EstadoMaquina {
    @Override
    public void inserirMoeda(MaquinaVendas maquina) {
        System.out.println("Moeda inserida.");
        maquina.setEstado(new ComMoeda());
    }

    @Override
    public void selecionarProduto(MaquinaVendas maquina) {
        System.out.println("Insira uma moeda primeiro.");
    }

    @Override
    public void dispensarProduto(MaquinaVendas maquina) {
        System.out.println("Nenhum produto pode ser dispensado.");
    }
}
