import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Carro extends Veiculo implements Vendavel{
    private double preco;

    public Carro(String modelo, String marca, double preco){
        super(modelo, marca);
        this.preco = preco;
    }

    //getters e setters
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public void exibirInfo(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preco: R$" + preco);
    }
    @Override
    public void vender(){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");

        System.out.println("Carro vendido com sucesso !");
        System.out.println("Hora da venda: " + agora.format(formatador));
    }
}
