/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExLivre;

import javax.swing.JOptionPane;

public class Cafeteira {

    Object[] cafe = {"Expresso", "Com Leite", "Programador"};
    Cafe[] cafezes;

    public Cafe preparaCafe() {
        int opcao;
        opcao = JOptionPane.showOptionDialog(null, "Qual tipo de café você quer?", "Cafeteira 2.0", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, this.cafe, this.cafe[0]);

        if (opcao == 0) {
            return new Expresso();
        } else if (opcao == 1) {
            return new ComLeite();
        } else if (opcao == 2) {
            return new Programador();
        } else {
            return null;
        }
    }
    
      public void Ligar(){
      
          preparaCafe();
          
      }
     
}
