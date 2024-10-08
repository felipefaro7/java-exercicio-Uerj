/*(Crie uma classe chamada Retangulo para representar um retângulo. Ela deve possuir os seguintes atributos:

largura (tipo double) com valor padrão 1.0.
altura (tipo double) com valor padrão 1.0.
Implemente:

Métodos get e set para os atributos.
Um método chamado calcularArea() que retorna a área do retângulo (largura * altura).
Um método chamado calcularPerimetro() que retorna o perímetro (2 * (largura + altura)).
Um método para exibir os dados do retângulo.
No método main, instancie dois objetos da classe Retangulo, altere os valores de altura e largura, e exiba suas áreas e perímetros.*/

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo (){
        this.largura=1.0;
        this.altura=1.0;
    }
    public double getLargura() {
        return largura;
    }
    public void setLargura(double largura) {
        this.largura = largura;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularArea(){
        return largura*largura; 
    }

    public double calcularPerimetro (){
        return 2*(largura + altura);
    }

    public String imprimirResultado(){
       return ("\n Largura:" + largura + "\n Altura: " + altura + "\n Area: " + calcularArea() + "\n Perimetro: " + calcularPerimetro());
    }

}
