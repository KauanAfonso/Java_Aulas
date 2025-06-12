import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CarroUsado extends Carro{

    private int  ano;
    public CarroUsado(String modelo, String marca, double preco, int ano) {
        super(modelo, marca, preco);
        this.ano = ano;
    }

    @Override
    public void exibirInfo(){
        System.out.println("========= Carro USADO ==========");
        super.exibirInfo();
        System.out.printf("Ano de fabricação: %s\n" + ano);
        System.out.println("Estado: Revisado e em bom estado.");
        System.out.println("Estado: 0 Km, direto da fábrica !");
    }

    @Override
    public void vender(){
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");

        System.out.println("Carro usado vendido com vistoria completa");
        System.out.println("Hora da venda: " + agora.format(formatador));
    }
}
