import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("============Bem vindo a loja de carros ==========");
        System.out.println("Você deseja comprar um carro novo ou usado");
        System.out.println("digite 'novo' ou 'usado': ");
        String tipo = entrada.nextLine();

        System.out.print("Digite a marca do carro: ");
        String marca = entrada.nextLine();

        System.out.print("Digite o modelo do carro: ");
        String modelo = entrada.nextLine();

        System.out.print("Digite o preco do carro: ");
        double preco = entrada.nextDouble();

        Carro carro = null; //usar o polimorifmos

        entrada.nextLine(); // limpar o buffer

        if(tipo.equalsIgnoreCase("novo")){
            carro = new CarroNovo(modelo, marca, preco);
        }else if (tipo.equalsIgnoreCase("usado")) {
            System.out.print("Digite o ano de fabricação do carro: ");
            int ano = entrada.nextInt();
            carro = new CarroUsado(modelo, marca, preco, ano);
        }else{
            System.out.println("Tipo inválido, Encerrando o programa.");
            entrada.close();
            return;
        }
        System.out.println("\n-----Detalhes do carro escolido-----");
        carro.exibirInfo();

        carro.vender();
        entrada.close();

    }
}
