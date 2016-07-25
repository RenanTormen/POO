package Empregado;

public class ResponsavelCantina extends EmpregadoUniversidade{
    
    private int qtdPasteis;

    public int getQtdPasteis() {
        return qtdPasteis;
    }

    public void setQtdPasteis(int qtdPasteis) {
        this.qtdPasteis = qtdPasteis;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + (this.qtdPasteis*4);
    }


    @Override
    public String getInfo() {
        return super.getInfo() + "\n Qtd pasteis vendidos: "+this.getQtdPasteis();
    }
  
}
