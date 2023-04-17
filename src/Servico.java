
public class Servico {
    
    private Integer id;
    private String mãodeobra;
    private Float custo;
    private String descricao;
    
     public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getMãoDeObra() {
        return mãodeobra;
    }

    public void setMãoDeObra(String MãoDeObra) {
        this.mãodeobra = MãoDeObra;
    }

    public Float getCusto() {
        return custo;
    }

    public void setCusto(Float Custo) {
        this.custo = Custo;
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String Descricao) {
        this.descricao = Descricao;
        }

}
