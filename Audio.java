/**
 * Clase Audio
 * 
 * Clase hija de Multimedia, simula a un audio, posee las características básicas de archivo multimedia y audio.
 * 
 * @version 1.0, 30/10/2021
 * finalizacion 02/10/2021
 * 
 * @author Diego E. Lemus L. - 21469
 */

 public class Audio extends Multimedia{
    
    //-----PROPIEDADES-----
    protected int sampleRate;
    protected int bitDepth;

    //-----METODOS-----
    /** 
     * Metodo constructor de Audio
     */
    public Audio(String aut, String fec, String hor, String hash, String url, int tam,  int sam, int bit){
        super(aut, fec, hor, hash, url, tam);
        this.sampleRate = sam;
        this.bitDepth = bit;
    }
    
    /** 
     * Metodo que reproduce el audio
     * @return String
     */
    public String play(){
        String msgReproduccion = "";
        msgReproduccion += "& Voy a SONAR este audio con " + sampleRate + "de sample rate y" + bitDepth + "de bit depth &";
        return msgReproduccion;
    }

    /** 
     * Metodo para convertir el audio a String
     * @return String
     */
    public String toString(){
        String Apost = "";

        Apost += this.autor + " - " + this.fecha + " " + this.hora + " - likes: " + this.likes + "\n";

        for (int i=0; i<hashtags.length; i++){
            Apost += "#" + hashtags[i] + " ";
        }

        Apost +=  "\n(Audio) " + this.url + "\n";
        Apost += "Tamano: " + this.tamano + "kb / Sample Rate: " + this.sampleRate + "kHz / Bit Depth: " + this.bitDepth + "\n" + "--->Comentarios:" + "\n";

        for (int i = 0; i < comentarios.size(); i++){
            Apost += "[" + i + "] " + comentarios.get(i) + "\n";
        }
        return Apost;
    }
}
