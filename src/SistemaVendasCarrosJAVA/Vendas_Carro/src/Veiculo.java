public abstract class Veiculo{
    protected String  modelo;
    protected String marca;

    public Veiculo(String modelo, String marca){
        this.modelo = modelo;
        this.marca = marca;
    }

    public abstract void exibirInfo();
}
