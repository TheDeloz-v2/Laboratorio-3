/**
 * Clase Controlador
 * Encargada de ejecutar el programa, llevar a cabo la seleccion de opciones, comunicarse con las
 * demás clases y sus respectivos procesos.
 * 
 * @version 1.0, 30/10/2021
 * finalizacion 02/10/2021
 * 
 * @author Diego E. Lemus L. - 21469
 */

public class Controlador {
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception{
        
        //-----PROPIEDADES-----
        Vista vista = new Vista();
        QueOndaMano qom = new QueOndaMano();
        Post post = null;

        try{
            //Mensaje de bienvenida
            vista.bienvenida();
            int op = 0;
            
            while (op != 3){
                op = vista.mostrarMenu();

                switch(op){

                    //Opcion 1> Agregar un post
                    case 1:
                        String autor = vista.pedirAutor();
                        String fecha = vista.pedirFecha();
                        String hora = vista.pedirHora();
                        String hashtag = vista.pedirHashtags();
                        int tipoPost = vista.mostrarMenuPost();
                        
                        //Post Texto
                        if(tipoPost == 1){
                            String texto = vista.pedirPostTexto();
                            post = new Texto(autor, fecha, hora, hashtag, texto);
                            boolean publi = qom.agregarPost(post);
                            vista.mostrarPublicacion(publi);

                        //Post Multimedia
                        }else if(tipoPost == 2){
                            String url = vista.pedirUrl();
                            int tamano = vista.pedirTamano();
                            int tipoMultimedia = vista.mostrarMenuPostMultimedia();
                            //Audio
                            if(tipoMultimedia == 1){
                                int samplerate = vista.pedirSampleRate();
                                int bitdepth = vista.pedirBitDepth();
                                post = new Audio(autor, fecha, hora, hashtag, url, tamano, samplerate, bitdepth);
                                boolean publi = qom.agregarPost(post);
                                vista.mostrarPublicacion(publi);
                            //Imagen
                            }else if(tipoMultimedia == 2){
                                String formato = vista.pedirFormato();
                                int resolucion = vista.pedirResolucion();
                                post = new Imagen(autor, fecha, hora, hashtag, url, tamano, formato, resolucion);
                                boolean publi = qom.agregarPost(post);
                                vista.mostrarPublicacion(publi);
                            //Video
                            }else if(tipoMultimedia == 3){
                                int fps = vista.pedirFrameRate();
                                post = new Video(autor, fecha, hora, hashtag, url, tamano, fps);
                                boolean publi = qom.agregarPost(post);
                                vista.mostrarPublicacion(publi);
                            }
                        
                        //Post Emoticon
                        }else if(op == 3){
                            String emoticon = vista.pedirPostEmoticon();
                            post = new Emoticon(autor, fecha, hora, hashtag, emoticon);
                            boolean publi = qom.agregarPost(post);
                            vista.mostrarPublicacion(publi);
                        }
                    break;

                    //Opcion 2> Mostrar e interactuar con los posts
                    case 2:
                        String param = "";

                        boolean ver = vista.filtrarBusqueda();

                        if(ver == false){
                            int tipoBusqueda = vista.mostrarMenuBusqueda();
                            //Ordenar por hashtag
                            if(tipoBusqueda == 1){
                                param = vista.pedirBuscarHashtag();
                            //Ordenar por fecha
                            }else if(tipoBusqueda == 2){
                                param = vista.pedirBuscarFecha();
                            }
                            //Se muestran los posts
                            String resultado = qom.filtradoPost(tipoBusqueda, param);
                            vista.mostrarPosts(resultado);

                            //Interaccion con los post
                            int tipoInteraccion = vista.mostrarMenuInteraccion();
                            
                            //Reproducir
                            if(tipoInteraccion == 1){
                                int id = vista.pedirIdPost();
                                String rep = qom.reproducirPost(id);
                                vista.mostrarPosts(rep);
                            //Like
                            }else if(tipoInteraccion == 2){
                                int id = vista.pedirIdPost();
                                boolean like = qom.agregarLike(id);
                                vista.mostrarLike(like);
                                resultado = qom.filtradoPost(tipoBusqueda, param);
                                vista.mostrarPosts(resultado);
                            //Comentar
                            }else if(tipoInteraccion == 3){
                                int id = vista.pedirIdPost();
                                String coment = vista.pedirPostTexto();
                                boolean comentario = qom.agregarComentario(id, coment);
                                vista.mostrarComentario(comentario);
                                resultado = qom.filtradoPost(tipoBusqueda, param);
                                vista.mostrarPosts(resultado);
                            }
                        }else{
                            String resultado = qom.ordenar();
                            vista.mostrarPosts(resultado);
                        }
                    break;

                    //Salir
                    case 3:
                        vista.despedida();
                    break;
                }
            }
            //En caso de error
        }catch (Exception e){
            String s = "Error: " + e.getMessage();
            vista.avisoError(s);
        }
    }
}