
public class Main {

    public static void main(String[] args) {

        System.out.println(calcularIva(20));
    }

    /**
     *
     * @param precio
     * @return devuelve el importe con iva incluido
     */
    static double calcularIva(double precio){

        return precio * 1.21;
    }
}