public class Main {
    public static void main(String[] args) {
        MaquinaVendas maquina = new MaquinaVendas();

        maquina.selecionarProduto(); // "Insira uma moeda primeiro."
        maquina.inserirMoeda();      // "Moeda inserida."
        maquina.selecionarProduto(); // "Produto selecionado."
        maquina.selecionarProduto(); // "Produto já foi selecionado"
        maquina.dispensarProduto();  // "Dispensando produto."
    }
}
