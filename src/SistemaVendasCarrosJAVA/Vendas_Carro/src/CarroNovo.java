import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CarroNovo extends Carro {
    public CarroNovo(String modelo, String marca, double preco){
        super(modelo,marca,preco);
    }

    @Override
    public void exibirInfo(){
        System.out.println("========= Carro NOVO ==========");
        super.exibirInfo();
        System.out.println("Estado: 0 Km, direto da fábrica !");
    }

    @Override
    public void vender(){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");

        System.out.println("Carro novo vendido com garantia de 3 anos");
        System.out.println("Hora da venda: " + agora.format(formatador));
    }
}
