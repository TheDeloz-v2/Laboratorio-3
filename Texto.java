/**
 * Clase Texto
 * 
 * Clase que simula la entrada de texto, simulando un post del tipo texto, 
 * hereda de post y es clase padre de comentario.
 * 
 * @version 1.0, 30/10/2021
 * finalizacion 02/10/2021
 * 
 * @author Diego E. Lemus L. - 21469
 */

 public class Texto extends Post{
    
    //-----PROPIEDADES-----
    protected String txt;

    //-----METODOS-----
    /** 
     * Metodo constructor de Texto
     */
    public Texto(String aut, String fec, String hor, String hash, String txt){
        super(aut, fec, hor, hash);
        this.txt = txt;
    }

    /** 
     * Metodo para convertir el texto a String
     * @return String
     */
    public String toString(){
        String Tpost = "";

        Tpost += this.autor + " - " + this.fecha + " " + this.hora + " - likes: " + this.likes + "\n";

        for (int i=0; i<hashtags.length; i++){
            Tpost += "#" + hashtags[i] + " ";
        }

        Tpost +=  "\n(Texto) " + this.txt + "\n" + "--->Comentarios:" + "\n";

        for (int i = 0; i < comentarios.size(); i++){
            Tpost += "[" + i + "] " + comentarios.get(i) + "\n";
        }
        return Tpost;
    }
}
