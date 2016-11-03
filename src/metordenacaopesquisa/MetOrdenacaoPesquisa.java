package metordenacaopesquisa;

import Pessoas.Aluno;

public class MetOrdenacaoPesquisa {

    public static void main(String[] args) {

        ListaAluno lista = new ListaAluno();

        lista.inserirAluno(10, "AAAA");
        lista.inserirAluno(9, "BBBB");
        lista.inserirAluno(2, "CCCC");
        lista.inserirAluno(15, "DDDD");
        lista.inserirAluno(20, "EEEE");
        
         lista.imprimir();
         lista.localizarAluno(3132);

        lista.inserirAluno(3132, "Thiago Cézar");
        lista.inserirAluno(3150, "Marcos Sousa");

        lista.imprimir();
        lista.localizarAluno(3132);
        lista.ordenarAluno();

        lista.imprimir();

        lista.localizarAluno(3132);
    }

}
