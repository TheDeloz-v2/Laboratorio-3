/**
 * Clase Comentario
 * 
 * Simula los comentarios en un post, por lo que pertenecen directamente a uno, hereda de Texto.
 * 
 * @version 1.0, 30/10/2021
 * finalizacion 02/10/2021
 * 
 * @author Diego E. Lemus L. - 21469
 */

 public class Comentario extends Texto{
    //-----PROPIEDADES-----
    protected Post post;

    //-----METODOS-----
    /** 
     * Metodo constructor de Comentario
     */
    public Comentario(String autor, String fecha, String hora, String hashtags, String txt){
        super(autor, fecha, hora, hashtags, txt);
    }
}
