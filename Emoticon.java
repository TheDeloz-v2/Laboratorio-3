/**
 * Clase Emoticon
 * 
 * Simula la entrada de texto en forma de emoticono.
 * 
 * @version 1.0, 30/10/2021
 * finalizacion 02/10/2021
 * 
 * @author Diego E. Lemus L. - 21469
 */

 public class Emoticon extends Post{
    
    //-----PROPIEDADES-----
    protected String emoticono;

    //-----METODOS-----
    /** 
     * Metodo constructor de Emoticon
     */
    public Emoticon(String aut, String fec, String hor, String hash, String emo){
        super(aut, fec, hor, hash);
        this.emoticono = emo;
    }

    /** 
     * Metodo para convertir el emoticon a String
     * @return String
     */
    public String toString(){
        String Epost = "";

        Epost += this.autor + " - " + this.fecha + " " + this.hora + " - likes: " + this.likes + "\n";

        for (int i=0; i<hashtags.length; i++){
            Epost += "#" + hashtags[i] + " ";
        }

        Epost +=  "\n(Emoticon) " + this.emoticono + "\n" + "---> Comentarios:" + "\n";

        for (int i = 0; i < comentarios.size(); i++){
            Epost += "[" + i + "] " + comentarios.get(i) + "\n";
        }

        return Epost;
    }
}
