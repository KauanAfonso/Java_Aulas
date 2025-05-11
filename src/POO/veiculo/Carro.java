package POO.veiculo;

public class Carro extends Veiculo {
    
    int qtd_porta;
    private String nome;

    //construtora 
    public Carro(String marca, int qtd_rodas, String nacionalidade, int qtd_porta, String nome){
        super(marca,qtd_rodas,nacionalidade); //definindo o que vem da classe mãe
        this.qtd_porta = qtd_porta;
        this.nome = nome;
    }

    //polimorfismo-> alterando um metodo ja existente
    @Override
    public void ligar_veiculo() {
        this.veiculo_ligado = true;
        System.out.println("O Carro foi ligado !");
    }

    //getter de nome
    public String getNome() {
        return this.nome;
    }


}




