package POO_DS16.CarroGaragem;

public class Carro {
    String cor;
    String marca;
    String modelo;

    int velocidadeAtual;

    public Carro(String cor, String marca, String modelo){
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;

        this.velocidadeAtual = 0;
    }

    public void ligar(){
        System.out.println("O carro" + this.modelo + " Ligou ");
    }

    public void acelerar(int incremento){
        this.velocidadeAtual += incremento;
        System.out.println("Acelerando... Velocidade atual: "+ this.velocidadeAtual + "Km/h");
    }

    public void frear(int decremento){

        if(this.velocidadeAtual - decremento >= 0){
            this.velocidadeAtual -= decremento;
            System.out.println("Freando.. velocidade atual: " + this.velocidadeAtual + "km/h");
        }else{
            this.velocidadeAtual = 0;
            System.out.println("o carro parou");
        }
    }

    public void desligar(){
        System.out.println("O carro " + this.modelo + "Desligou. ");
    }

    public void exibirInformacoes(){

        System.out.println("----------------- Informações do Carro ---------------------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + "km/h");
        System.out.println("------------------------------------------------------------");
    }
}
