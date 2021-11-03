/**
 * Clase Video
 * 
 * Clase hija de Multimedia, simula a un video, 
 * posee las características básicas de archivo multimedia y video.
 * 
 * @version 1.0, 30/10/2021
 * finalizacion 02/10/2021
 * 
 * @author Diego E. Lemus L. - 21469
 */

 public class Video extends Multimedia{

    //-----PROPIEDADES-----
    protected int framerate;

    //-----METODOS-----
    /** 
     * Metodo constructor de Video
     */
    public Video(String aut, String fec, String hor, String hash, String url, int tam, int fra){
        super(aut, fec, hor, hash, url, tam);
        this.framerate = fra;
    }
    
    /** 
     * Metodo que reproduce el video
     * @return String
     */
    public String play(){
        String msgReproduccion = "";
        msgReproduccion += "& Voy a MOSTRAR este video con " + this.framerate + " fps &";
        return msgReproduccion;
    }
    
    /** 
     * Metodo para convertir el video a String
     * @return String
     */
    public String toString(){
        String Vpost = "";

        Vpost += this.autor + " - " + this.fecha + " " + this.hora + " - likes: " + this.likes + "\n";

        for (int i=0; i<hashtags.length; i++){
            Vpost += "#" + hashtags[i] + " ";
        }

        Vpost +=  "\n(Video) " + this.url + "\n";
        Vpost += "Tamano: " + this.tamano + "kb / Frame Rate: " + this.framerate + "fps" + "\n" + "--->Comentarios:" + "\n";

        for (int i = 0; i < comentarios.size(); i++){
            Vpost += "[" + i + "] " + comentarios.get(i) + "\n";
        }
        return Vpost;
    }
}
