
package ClassesMidia;


public class Principal {

    public static void main(String[] args) {

        Midia md = new CD(1);
        md.inserirDados();
        System.out.println(md.getDetalhes());
        
        Midia dvd = new DVD(1);
        
        dvd.inserirDados();
        System.out.println(dvd.getDetalhes());
        

    }
}
