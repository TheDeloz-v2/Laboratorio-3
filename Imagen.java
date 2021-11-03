/**
 * Clase Imagen
 * 
 * Clase hija de Multimedia, simula a una imagen, posee las características básicas de archivo multimedia e imagen.
 * 
 * @version 1.0, 30/10/2021
 * finalizacion 02/10/2021
 * 
 * @author Diego E. Lemus L. - 21469
 */

 public class Imagen extends Multimedia{

    //-----PROPIEDADES-----
    protected String formato;
    protected int resolucion;

    //-----METODOS-----
    /** 
     * Metodo constructor de Imagen
     */
    public Imagen(String aut, String fec, String hor, String hash, String url, int tam,  String form, int res){
        super(aut, fec, hor, hash, url, tam);
        this.formato = form;
        this.resolucion = res;
    }

    /** 
     * Metodo que reproduce la imagen
     * @return String
     */
    public String play(){
        String msgReproduccion = "";
        msgReproduccion += "& Estoy mostrando esta imagen con " + this.resolucion + " megapixeles de resolucion &";
        return msgReproduccion;
    }

    /** 
     * Metodo para convertir la imagen a String
     * @return String
     */
    public String toString(){
        String Ipost = "";

        Ipost += this.autor + " - " + this.fecha + " " + this.hora + " - likes: " + this.likes + "\n";

        for (int i=0; i<hashtags.length; i++){
            Ipost += "#" + hashtags[i] + " ";
        }

        Ipost +=  "\n(Imagen) " + this.url + "\n";
        Ipost += "Tamano: " + this.tamano + "kb / Formato: " + this.formato + " / Resolucion: " + this.resolucion + "\n" + "--->Comentarios:" + "\n";

        for (int i = 0; i < comentarios.size(); i++){
            Ipost += "[" + i + "] " + comentarios.get(i) + "\n";
        }
        return Ipost;
    }
}
