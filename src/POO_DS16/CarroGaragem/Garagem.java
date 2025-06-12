package POO_DS16.CarroGaragem;

public class Garagem {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Vermelho", "Ford", "Mustang");

        System.out.println("Objeto meuCarro foi criado.");
        meuCarro.exibirInformacoes();
        meuCarro.ligar();
        meuCarro.acelerar(50);
        meuCarro.frear(20);
        meuCarro.desligar();
        System.out.println();

        Carro outroCarro = new Carro("Azul", "Chevrolet", "Camaro");

        System.out.println("Objeto outroCarro foi criado.");
        outroCarro.exibirInformacoes();
        outroCarro.ligar();
        outroCarro.acelerar(80);
        outroCarro.acelerar(30);
        outroCarro.frear(100);
        outroCarro.desligar();
        System.out.println();
    }
}
