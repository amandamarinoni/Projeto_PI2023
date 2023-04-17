
public class Orcamento {
    
    private final double valorTotal;
    private String ID_cliente;
    private String descricao;
    private String servico;
    private Date dataentrega;
    private Date dataorcamento;
    

    public Orcamento(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getvalorTotal() {
        return valorTotal;
    }
    
    public String getID_Cliente() {
        return ID_cliente;
    }

    public void setID_cliente(String ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }    
        
    public String getServico() {
        return servico;
    }
    
    public void setServico(String servico) {
        this.servico = servico;
    }
    
    public Date getDataentrega() {
        return dataentrega;
    }

    public void setDataentrega(Date dataentrega) {
        this.dataentrega = dataentrega;
    }

    public Date getDataorcamento() {
        return dataorcamento;
    }

    public void setDataorcamento(Date dataorcamento) {
        this.dataorcamento = dataorcamento;
    }

    private static class Date {

        public Date() {
        }
    }
	
	
}

