package Vendas;

import Cliente.Cliente;
import Pagamento.formaPagamento;

public class Venda {
    private String produtoVendido;
    private Cliente cliente;
    private formaPagamento formaPagamento;
    private double valorTotalVenda;
    private double aplicarDesconto;
    private boolean finalizarVenda;


    public Venda(String produtoVendido, Cliente cliente, formaPagamento formaPagamento, double valorTotalVenda, double aplicarDesconto, boolean finalizarVenda) {
        this.produtoVendido = produtoVendido;
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
        this.valorTotalVenda = valorTotalVenda;
        this.aplicarDesconto = aplicarDesconto;
        this.finalizarVenda = finalizarVenda;
    }


    public String getProdutoVendido() {
        return produtoVendido;
    }

    public void setProdutoVendido(String produtoVendido) {
        this.produtoVendido = produtoVendido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public formaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(formaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public double getAplicarDesconto() {
        return aplicarDesconto;
    }

    public void setAplicarDesconto(double aplicarDesconto) {
        this.aplicarDesconto = aplicarDesconto;
    }

    public boolean isFinalizarVenda() {
        return finalizarVenda;
    }

    public void setFinalizarVenda(boolean finalizarVenda) {
        this.finalizarVenda = finalizarVenda;
    }
}
