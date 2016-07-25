/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelasPrincipais;

import Empregado.*;

public class Principal {
        public static void main(String[] args) {
            
            GeradorRelatorio r = new GeradorRelatorio();
            Professor p = new Professor();
            p.setInfo("Teste");
            p.setSalario(10000);
            p.setHorasAula(10);
            
            ResponsavelCantina rc = new ResponsavelCantina();
            rc.setInfo("Zoeira");
            rc.setQtdPasteis(10);
            rc.setSalario(2000);
            
            r.imprimir(p);
            r.imprimir(rc);
        }
}
