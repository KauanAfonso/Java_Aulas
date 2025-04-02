package Prova;


public class exercicio14 {

    public static void main(String[] args) {
        String palavra = "KAUAn AFONSO";
        int cont_vaogal = 0;
        int cont_consoante = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'U' || letra == 'O' || letra == 'a' || letra == 'e' || letra == 'i' || letra == 'u' || letra == 'o' ){
                cont_vaogal+=1;
            } else if (letra == ' ') {
                continue;
            }else{
                cont_consoante+=1;
            }
        }

        System.out.printf("A palvra %s tem %s vogais e %s consoantes", palavra , cont_vaogal, cont_consoante);

    }

}
