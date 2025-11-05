package uninter_class.empresa;

public class Carro {
    String nome;
    String modelo;
    float velocidade;
    //valor imutavel e para todas os objetos
    static final double pi = 1.14;

    //metodo da clase e nao do objeto
    static float milhasParaMetros(float value){
        return value * 1600;
    };

}
