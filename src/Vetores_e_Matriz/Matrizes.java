package Vetores_e_Matriz;

public class Matrizes {

    public static void main(String[] args) {
        int[][] tabela = new int[3][3];

        tabela[0][0] = 1;
        tabela[0][1] = 2;
        tabela[0][2] = 3;

        tabela[1][0] = 4;
        tabela[1][1] = 5;
        tabela[1][2] = 6;

        tabela[2][0] = 7;
        tabela[2][1] = 8;
        tabela[2][2] = 9;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(tabela[i][j] + ' ');
            }

            System.out.println();
        }

    }

}
