package POO.veiculo;

public class Carro extends Veiculo {
    
    int qtd_porta;

    public Carro(String marca, int qtd_rodas, String nacionalidade, int qtd_porta){
        super(marca,qtd_rodas,nacionalidade);
        this.qtd_porta = qtd_porta;
    }

    @Override
    public void ligar_veiculo() {
        this.veiculo_ligado = true;
        System.out.println("O Carro foi ligado !");
    }



}




