import java.util.ArrayList;

/**
 * Clase Post
 * 
 * Clase que simulará al post con todas sus características:
 * autor, la fecha de publicación, la hora de la publicación y la cantidad de likes que tiene.
 * Y tipos de post, sirve como madre de texto y multimedia.
 * 
 * @version 1.0, 30/10/2021
 * finalizacion 02/10/2021
 * 
 * @author Diego E. Lemus L. - 21469
 */

public abstract class Post {
    
    //-----PROPIEDADES-----
    protected String autor;
    protected String fecha;
    protected String hora;
    protected int likes;
    protected String[] hashtags;
    protected ArrayList<Comentario> comentarios;

    //-----METODOS-----
    /** 
     * Metodo constructor de Post
     */
    public Post(String aut, String fec, String hor, String hash){
        this.autor = aut;
        this.fecha = fec;
        this.hora = hor;
        this.likes = 0;
        this.hashtags = hash.split("#");
        this.comentarios = new ArrayList<Comentario>();
    }

    /** 
     * Metodo abstracto para convertir los posts a String
     * @return String
     */
    public abstract String toString();
    
    /** 
     * Metodo para obtener el autor del post
     * @return String
     */
    public String getAutor(){
        return autor;
    }
    
    /** 
     * Metodo para obtener la fecha del post
     * @return String
     */
    public String getFecha(){
        return fecha;
    }

    /** 
     * Metodo para obtener la hora del post
     * @return String
     */
    public String getHora(){
        return hora;
    }

    /** 
     * Metodo para obtener los likes del post
     * @return int
     */
    public int getLikes(){
        return likes;
    }

    /** 
     * Metodo para actualizar los likes del post
     */
    public void setLikes(){
        likes++;
    }

    /** 
     * Metodo para agregar un comentario al post
     * @param coment
     */
    public void comentario(Comentario coment){
        comentarios.add(coment);
    }

    /** 
     * Metodo para obtener los hashtags del post
     * @return String[]
     */
    public String[] getHashtags(){
        return hashtags;
    }
    
    /** 
     * Metodo para reproducir el post
     * @return String
     */
    public String reproducir(){
        String msg = "Se esta reproduciendo el post.";
        return msg;
    }
}
