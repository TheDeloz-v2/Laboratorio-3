import java.util.ArrayList;

/**
 * Clase QueOndaMano
 * 
 * Encargada de agrega, ordenar y manejar los posts en general, asi como las reacciones de estos.
 * 
 * @version 1.0, 30/10/2021
 * finalizacion 02/10/2021
 * 
 * @author Diego E. Lemus L. - 21469
 */

 public class QueOndaMano {

    //-----PROPIEDADES-----
    private ArrayList<Post> posts = new ArrayList<Post>();

    //-----METODOS-----
    /** 
     * Metodo constructor de QueOndaMano
     */
    public QueOndaMano(){

    }

    /** 
     * Metodo para agregar un post a la res
     * @param post
     * @return boolean
     */
    public boolean agregarPost(Post post){
        posts.add(post);
        return true;
    }

    /** 
     * Metodo para agregar un comentario a un post
     * @param id
     * @param coment
     * @return boolean
     */
    public boolean agregarComentario(int id, String coment){
        Comentario comentario = new Comentario("", "", "", "", coment);
        posts.get(id).comentario(comentario);
        return true;
    }

    
    /** 
     * Metodo para ordenar los posts por fecha
     * @param fecha
     * @return String
     * @throws Exception
     */
    private String ordenarFecha(String fecha) throws Exception{
        String postsOrdenados = "";

        try{
            for(int i=0; i<posts.size(); i++){
                //Verifica que si hayan posts
                if(posts.get(i) != null){
                    if(posts.get(i).getFecha().equals(fecha)){
                        //Los ordena
                        postsOrdenados += "["+i+"]"+posts.get(i)+"\n";
                    }
                }else{
                    System.out.println("No hay posts.");
                }
            }
            //En caso de ingreso invalido
        }catch(Exception e){
            String s = "Error: Ingrese una fecha valida" + e.toString();
            throw new Exception(s);
        }
        return postsOrdenados;
    }

    /** 
     * Metodo para ordenar los posts
     * @param fecha
     * @return String
     * @throws Exception
     */
    public String ordenar() throws Exception{
        String postsOrdenados = "";

        try{
            for(int i=0; i<posts.size(); i++){
                //Verifica que si hayan posts
                if(posts.get(i) != null){
                    postsOrdenados += "["+i+"]"+posts.get(i)+"\n";
                }else{
                    System.out.println("No hay posts.");
                }
            }
            //En caso de ingreso invalido
        }catch(Exception e){
            String s = "Error: Ingrese una fecha valida" + e.toString();
            throw new Exception(s);
        }
        return postsOrdenados;
    }
    
    /** 
     * Metodo para ordenar los posts por hashtag
     * @param hashtag
     * @return String
     * @throws Exception
     */
    private String ordenarHashtag(String hashtag) throws Exception{
        String postsOrdenados = "";

        try{
            for(int i=0; i<posts.size(); i++){
                //Verifica que si hayan posts
                if(posts.get(i) != null){
                    for(int h=0; h<posts.get(i).getHashtags().length; h++){
                        //Los ordena
                        if(posts.get(i).getHashtags()[h].equals(hashtag)){
                            postsOrdenados += "["+i+"]"+posts.get(i)+"\n";
                        }else{
                        System.out.println("No hay posts.");
                        }
                    }
                }
            }
            //En caso de ingreso invalido
        }catch(Exception e){
            String s = "Error: Ingrese un hashtag valido" + e.toString();
            throw new Exception(s);
        }
        return postsOrdenados;
    }

    /** 
     * Metodo que filtra los post segun el criterio de orden
     * @param tipoB
     * @param param
     * @return String
     * @throws Exception
     */
    public String filtradoPost(int tipoB, String param) throws Exception{
        String postsO = "\n--------------------------[Inicio]--------------------------\n";

        if(tipoB == 1){
            postsO += ordenarHashtag(param);
        }else if(tipoB == 2){
            postsO += ordenarFecha(param);
        }
        postsO += "--------------------------[Fin]--------------------------\n";

        return postsO;
    }

    /** 
     * Metodo para agregar un like a un post
     * @param id
     * @return boolean
     */
    public boolean agregarLike(int id){
        posts.get(id).setLikes();
        return true;
    }

    /** 
     * Metodo para reproducir un post
     * @param id
     * @return String
     */
    public String reproducirPost(int id){
        String msgRep = "";
        msgRep = posts.get(id).reproducir();
        return msgRep;
    }

}
