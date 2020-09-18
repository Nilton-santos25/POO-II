import java.util.Date;

public class Contrato {

    private int nro_contrato;
    private Date data_contrato;
    private double valor_total;

    //construtor vazio
    public Contrato() {

    }

    //construtor com parametros
    public Contrato(int nro_contrato, Date data_contrato, double valor_total){
        this.nro_contrato = nro_contrato;
        this.data_contrato = data_contrato;
        this.valor_total = valor_total;
    }

    //estrutura get
    public int getNro_contrato(){
        return nro_contrato;
    }

    //estrutura set
    public void setNro_contrato (int nro_contrato){
        this.nro_contrato = nro_contrato;
    }

    public Date getData_contrato(){
        return data_contrato;
    }

    public void setData_contrato(Date data_contrato){
        this.data_contrato = data_contrato;
    }

    public double getValor_total(){
        return valor_total;
    }

    public void setValor_total(double valor_total){
        this.valor_total = valor_total;
    }

    
}
