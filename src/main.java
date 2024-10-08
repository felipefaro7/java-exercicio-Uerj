public class main {
    public static void main(String[] args) {

        Retangulo r1 = new Retangulo();
        r1.setAltura(2);
        r1.setLargura(2);
        System.out.println("Retangulo 1: " + r1.imprimirResultado());

        System.out.println("-----------------------------------------");
        
        Retangulo r2 = new Retangulo();
        r2.setAltura(10);
        r2.setLargura(5);
        System.out.println("Retangulo 2: " + r2.imprimirResultado());

        System.out.println("-----------------------------------------");
        
        Retangulo r3 = new Retangulo();
        r3.setAltura(45);
        r3.setLargura(8);
        System.out.println("Retangulo 3: " + r3.imprimirResultado());


    }
}
