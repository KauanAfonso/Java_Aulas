package POO.veiculo;

public class Veiculo {
        
        String marca;
        int qtd_rodas;
        String nacionalidade;   
        boolean veiculo_ligado;

        public Veiculo(String marca, int qtd_rodas, String nacionalidade) {
            this.marca = marca;
            this.qtd_rodas = qtd_rodas;
            this.nacionalidade = nacionalidade;
            this.veiculo_ligado = false;
        }

        //metodo de ligar o veiculo
        public void ligar_veiculo(){
            this.veiculo_ligado = true;
        }

        public void desligar_veiculo(){
            this.veiculo_ligado = false;
        }

        

}
