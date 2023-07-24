import java.util.concurrent.ExecutionException;

public class Flujo {

    public static void main(String[] args) {
        System.out.println("Inicio main");
        try{
            metodo1();
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Fin de main");
    }

    private static void metodo1() {
        System.out.println("Inicio de metodo1");
        try {
            metodo2();
        } catch(MiException ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fin de metodo1");
    }

    private static void metodo2() throws MiException {
        System.out.println("Inicio de metodo2");
        int a = 50/0;
        Cuenta c = null;

        throw new ArithmeticException("dio error");
        // System.out.println("Fin de metodo2");
    }


}