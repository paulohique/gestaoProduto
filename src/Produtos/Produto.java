package Produtos;

public class Produto
{
    private String nome;
    private String descricao;
    private String codigo;
    private double preco;

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int quantidade;
    public Produto(String nome,String descricao, String codigo, double preco,int quantidade){
         this.nome = nome;
         this.descricao = descricao;
         this.codigo = codigo;
         this.preco = preco;
         this.quantidade = quantidade;
    }
    public void setQuantidade(int quantidade){
         this.quantidade = quantidade;
    }
}
