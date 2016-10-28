package metordenacaopesquisa;

import Pessoas.Aluno;

public class ListaAluno {

    private boolean ordenada = false;
    Aluno vetAluno[];
    int ultima = 0;

    public ListaAluno() {
        vetAluno = new Aluno[5];
    }

    public void inserirAluno(int ra, String nome) {

        ordenada = false;

        Aluno A = new Aluno(ra, nome);
        vetAluno[ultima] = A;
        ultima++;

    }

    public void ordenarAluno() {
        ordenada = true;

        int i, j, minIndex, temp;

        for (i = 0; i < vetAluno.length - 1; i++) {
            minIndex = i;

            for (j = i + 1; j < vetAluno.length; j++) {

                if (vetAluno[j].getRa() < vetAluno[minIndex].getRa()) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = i;
                vetAluno[i] = vetAluno[minIndex];
                vetAluno[minIndex] = vetAluno[temp];

            }

        }

    }

    public void localizar(int ra) {
        if (ordenada) {

        } else {
            System.out.println("Lista não ordenada, deve ser implementado "
                    + "um método para busca sequencial");
        }
    }

    public void imprimir() {

        for (int i = 0; i < vetAluno.length; i++) {
            if (vetAluno[i] != null) {
                System.out.println(vetAluno[i]);
            }
        }
    }

}
