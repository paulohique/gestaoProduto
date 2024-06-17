package Pagamento;

public class formaPagamento {
    public String dinheiro;
    public String cartao;
    public String cheque;
    private float valorPago;





    public formaPagamento(float valorPago) {
        this.valorPago = valorPago;
    }
}
