package ClassesMidia;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        /* Midia md = new CD(1);
        md.inserirDados();
        System.out.println(md.getDetalhes());

        Midia dvd = new DVD(1);

        dvd.inserirDados();
        System.out.println(dvd.getDetalhes());
         */
        int qtd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de midias"));
        Midia[] mdl = new Midia[qtd];

        for (int i = 0; i < qtd; i++) {
            Object[] options = {"CD", "DVD", "K7", "Vinil"};
            int opcao = JOptionPane.showOptionDialog(null, "Qual midia você deseja inserir? ", "Midias", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (opcao == 0) {
                mdl[i] = new CD();
                mdl[i].inserirDados();
            } else if (opcao == 1) {
                mdl[i] = new DVD();
                mdl[i].inserirDados();
            } else if (opcao == 2) {
                mdl[i] = new FitaK7();
                mdl[i].inserirDados();
            } else if (opcao == 3) {
                mdl[i] = new Vinil();
                mdl[i].inserirDados();

            }
        }
        String msg = "";
        for (int i = 0; i != mdl.length; i++) {
            msg += mdl[i].getDetalhes();
        }

        JOptionPane.showMessageDialog(null, msg);

    }

}
