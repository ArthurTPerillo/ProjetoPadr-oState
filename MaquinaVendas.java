public class MaquinaVendas {
    private EstadoMaquina estado;

    public MaquinaVendas() {
        this.estado = new SemMoeda(); // Estado inicial
    }

    public void setEstado(EstadoMaquina estado) {
        this.estado = estado;
    }

    public void inserirMoeda() {
        estado.inserirMoeda(this);
    }

    public void selecionarProduto() {
        estado.selecionarProduto(this);
    }

    public void dispensarProduto() {
        estado.dispensarProduto(this);
    }
}
