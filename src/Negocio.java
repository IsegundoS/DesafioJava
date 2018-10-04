import mx.com.sintelti.desafios.oporx.Solucion;

public class Negocio implements Solucion {
    private String cadena;

    public void setCadena(String cadena){
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

/**
    @Override
    public String convertir(String entrada) {
        char[] cadenaOriginal = entrada.toCharArray();
        String remplazaX="";
        String salida=entrada;
        int contador=0;
        int largoCadena = entrada.length();
        for (int i = 0; i< largoCadena; i++){
            if (cadenaOriginal[i] == 'o'){
                contador++;
                remplazaX = cadenaRemplazar(contador);
                salida = salida.replaceFirst("o", remplazaX);
            }
        }
        return salida;
    }
 **/

    @Override
    public String convertir(String entrada) {
        char[] cadenaOriginal = entrada.toCharArray();
        String remplazaX = "";
        String salida = "";
        int contador = 0;
        int indexInicio = 0;
        int indexFin = 0;
        //int largoCadena = entrada.length();
        for (int i = 0; i< entrada.length(); i++){
            if (cadenaOriginal[i] == 'o'){
                contador++;
                remplazaX = cadenaRemplazar(contador);
                //System.out.println(i);
                indexFin = i;
                salida = salida+entrada.substring(indexInicio, indexFin)+remplazaX;
                indexInicio= i+1;
                //System.out.println(salida);
            }
        }
        return salida;
}

    private String cadenaRemplazar(int contador){
        String cadenaRetorno="";
        for (int i = 0; i<contador; i++){
            cadenaRetorno=cadenaRetorno+"x";
        }
        return  (cadenaRetorno);
    }




}
