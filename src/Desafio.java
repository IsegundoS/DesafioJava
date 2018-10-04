public class Desafio {
    public static void main(String[] args) {
        //string cadenaSalida="";
        //System.out.println("Desafio");
        try {
            Negocio desafio = new Negocio();
            desafio.setCadena("1o2o3o4o5o");
            //desafio.setCadena("Hola mundo");
            System.out.println("Cadena Original " + desafio.getCadena());
            System.out.println("Convertir: " + desafio.convertir(desafio.getCadena()));
            //System.out.println(desafio.convertir("1o2o3o4o5o"));

            //System.out.println(desafio.getCadena());
        }catch (Exception Ex){
            System.out.println(Ex.getMessage());
        }
    }
}
