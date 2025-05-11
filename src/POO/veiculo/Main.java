package POO.veiculo;

public class Main {
 
    public static void main(String[] args) {
        //Criando um carro
        Carro civic = new Carro("honda", 4, "a", 4, "civic");
        civic.ligar_veiculo();
        
        System.out.println("O nome do carro é: " + civic.getNome());
       

    }
    
}
