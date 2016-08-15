
package ExLivre;

public class Cafe {
    String tipo;
    int quantidade;
    String tipomelita;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipomelita() {
        return tipomelita;
    }

    public void setTipomelita(String tipomelita) {
        this.tipomelita = tipomelita;
    }
    
    public String retornaDados(){
        return "\n" + this.getTipo() + "\n" + this.getTipo() + "\n" + this.getTipomelita();
    }
}
