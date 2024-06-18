package Estoque;

import Produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEstoque {

    private List<Produto> listaProdutos;

    public GerenciadorEstoque() {
        this.listaProdutos = new ArrayList<>();
    }

    public int obterEstoque(Produto produto) {
        return produto.getQuantidade();
    }


    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public void removerProduto(Produto produto) {
        listaProdutos.remove(produto);
    }

    // Métodos getters e setters
    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
}
