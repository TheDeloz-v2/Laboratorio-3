/**
 * Clase Multimedia
 * 
 * Clase de todos los archivos multimedia (audio, imagen, video), 
 * posee las características principales, hereda de Post.
 * 
 * @version 1.0, 30/10/2021
 * finalizacion 02/10/2021
 * 
 * @author Diego E. Lemus L. - 21469
 */

 public abstract class Multimedia extends Post{
    
    //-----PROPIEDADES-----
    protected String url;
    protected int tamano;

    //-----METODOS-----
    /** 
     * Metodo constructor de Multimedia
     */
    public Multimedia(String aut, String fec, String hor, String hash, String url, int tam){
        super(aut, fec, hor, hash);
        this.url = url;
        this.tamano = tam;
    }

    /** 
     * Metodo abstracto para reproducir un post
     * @return String
     */
    public abstract String play();

    /** 
     * Metodo abstracto para convertir los posts a String
     * @return String
     */
    public abstract String toString();

    /** 
     * Metodo para obtener la url del archivo multimedia
     * @return String
     */
    public String getUrl(){
        return url;
    }

    /** 
     * Metodo para obtener el tamano del archivo multimedia
     * @return int
     */
    public int getTamano(){
        return tamano;
    }
}
