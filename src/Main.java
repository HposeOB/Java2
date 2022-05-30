import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        System.out.println(iva(20));
    }

    static double iva(double precio){

        double iva = precio * 0.21;

        return precio + iva;

    }
}