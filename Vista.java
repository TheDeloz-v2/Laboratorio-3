import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Clase Vista
 * Encargada de recibir y mostrarle la información al usuario.
 * 
 * @version 1.0, 30/10/2021
 * finalizacion 02/10/2021
 * 
 * @author Diego E. Lemus L. - 21469
 */

 public class Vista {
    //-----PROPIEDADES-----
    Scanner scan = new Scanner(System.in);

    //-----METODOS-----
    /** 
     * Metodo que muestra el menú, además lee y devuelve la opción del usuario.
     * @return int op, seleccionada por el usuario (1-3)
     */
    public int mostrarMenu() throws Exception, InputMismatchException{
        int op = 0;
        boolean verificacion = false;

        try{
            System.out.println("\n\n\n--------------------Menu--------------------");
            System.out.println("Opcion 1: Publicar Post");
            System.out.println("Opcion 2: Ver Posts");
            System.out.println("OPcion 3: Salir\n");
            
            while(verificacion == false){
                op = Integer.parseInt(scan.nextLine());
                if(op <= 3 && op >= 1){
                    verificacion = true;
                }else{
                    System.out.println("% Ingrese una opcion valida (1-3) %");
                }
            }
            //En caso de ingreso invalido
        }catch(InputMismatchException e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new InputMismatchException(s);
        }catch(Exception e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new Exception(s);
        }
        return op;
    }

    /** 
     * Metodo que imprime la bienvenida.
     */
    public void bienvenida(){
        System.out.println("\n¡Bienvenido a QueOndaMano, la mejor red social para estar en onda!\n\n");
    }

    /** 
     * Metodo que indica que el ingreso de opcion no es válido.
     */
    public void ingresoIncorrecto(){
        System.out.println("\n%% Opcion invalida, intentelo otra vez. %%");
    }

    /** 
     * Metodo que imprime la despedida.
     */
    public void despedida(){
        System.out.println("\n\nHa salido de QueOndaMano, que tenga un buen dia.\n");
    }

    /** 
     * Metodo que muestra el menú de Post, además lee y devuelve la opción del usuario.
     * @return int op, seleccionada por el usuario (1-3)
     */
    public int mostrarMenuPost() throws Exception, InputMismatchException{
        int op = 0;
        boolean verificacion = false;

        try{
            System.out.println("\n\n¿Que tipo de post quiere publicar?\n");
            System.out.println("Opcion 1: Texto");
            System.out.println("Opcion 2: Multimedia");
            System.out.println("Opcion 3: Emoticon\n");
            
            while(verificacion == false){
                op = Integer.parseInt(scan.nextLine());
                if(op > 0 && op <= 3){
                    verificacion = true;
                }else{
                    System.out.println("% Ingrese una opcion valida (1-3) %");
                }
            }
            //En caso de ingreso invalido
        }catch(InputMismatchException e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new InputMismatchException(s);
        }catch(Exception e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new Exception(s);
        }
        return op;
    }

    /** 
     * Metodo que muestra el menú de Post Multimedia, además lee y devuelve la opción del usuario.
     * @return int op, seleccionada por el usuario (1-3)
     */
    public int mostrarMenuPostMultimedia() throws Exception, InputMismatchException{
        int op = 0;
        boolean verificacion = false;

        try{
            System.out.println("\n\n¿Que tipo de archivo multimedia quiere publicar?\n");
            System.out.println("Opcion 1: Audio");
            System.out.println("Opcion 2: Imagen");
            System.out.println("Opcion 3: Video\n");
            
            while(verificacion == false){
                op = Integer.parseInt(scan.nextLine());
                if(op <= 3 && op >= 1){
                    verificacion = true;
                }else{
                    System.out.println("% Ingrese una opcion valida (1-3) %");
                }
            }
            //En caso de ingreso invalido
        }catch(InputMismatchException e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new InputMismatchException(s);
        }catch(Exception e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new Exception(s);
        }
        return op;
    }

    /** 
     * Metodo que muestra el menú de busqueda, además lee y devuelve la opción del usuario.
     * @return int op, seleccionada por el usuario (1-2)
     */
    public int mostrarMenuBusqueda() throws Exception, InputMismatchException{
        int op = 0;
        boolean verificacion = false;

        try{
            System.out.println("\n\nElija un criterio de Busqueda:");
            System.out.println("Opcion 1: Hashtag");
            System.out.println("Opcion 2: Fecha de publicacion\n");
            
            while(verificacion == false){
                op = Integer.parseInt(scan.nextLine());
                if(op <= 2 && op >= 1){
                    verificacion = true;
                }else{
                    System.out.println("% Ingrese una opcion valida (1-2) %");
                }
            }
            //En caso de ingreso invalido
        }catch(InputMismatchException e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new InputMismatchException(s);
        }catch(Exception e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new Exception(s);
        }
        return op;
    }

    /** 
     * Metodo que muestra el menú de Interaccion, además lee y devuelve la opción del usuario.
     * @return int op, seleccionada por el usuario (1-3)
     */
    public int mostrarMenuInteraccion() throws Exception, InputMismatchException{
        int op = 0;
        boolean verificacion = false;

        try{
            System.out.println("\n\n¿Como desea interactuar con el post?\n");
            System.out.println("Opcion 1: Reproducir");
            System.out.println("Opcion 2: Dar Like");
            System.out.println("Opcion 3: Comentar");
            System.out.println("Opcion 4: Nada\n");
            
            while(verificacion == false){
                op = Integer.parseInt(scan.nextLine());
                if(op <= 4 && op >= 1){
                    verificacion = true;
                }else{
                    System.out.println("% Ingrese una opcion valida (1-4) %");
                }
            }
            //En caso de ingreso invalido
        }catch(InputMismatchException e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new InputMismatchException(s);
        }catch(Exception e){
            String s = "Ocurrio un error en el ingreso de opcion "+ e.toString();
            throw new Exception(s);
        }
        return op;
    }
 
    /** 
     * Metodo que solicita el nombre del autor del post
     * @return String
     * @throws Exception
     */
    public String pedirAutor() throws Exception{
        String autor = "";
        boolean verificacion = false;

        try{
            while(verificacion == false){
                System.out.println("Ingrese su nombre de usuario:");
                autor = scan.nextLine();
                if(autor.equals("")){
                    verificacion = false;
                }else{
                    verificacion = true;
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de usuario "+ e.toString();
            throw new Exception(s);
        }
        return autor;
    }
  
    /** 
     * Metodo que solicita la fecha de publicacion del post
     * @return String
     * @throws Exception
     */
    public String pedirFecha() throws Exception{
        String fecha = "";
        boolean verificacion = false;

        try{
            while(verificacion == false){
                System.out.println("Ingrese la fecha de publicacion del post (dd/mm/aaaa):");
                fecha = scan.nextLine();
                if(fecha.equals("")){
                    verificacion = false;
                }else{
                    verificacion = true;
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de fecha "+ e.toString();
            throw new Exception(s);
        }
        return fecha;
    }

    /** 
     * Metodo que solicita la hora de publicacion del post
     * @return String
     * @throws Exception
     */
    public String pedirHora() throws Exception{
        String hora = "";
        boolean verificacion = false;

        try{
            while(verificacion == false){
                System.out.println("Ingrese la hora de publicacion del post (hh:mm):");
                hora = scan.nextLine();
                if(hora.equals("")){
                    verificacion = false;
                }else{
                    verificacion = true;
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de hora "+ e.toString();
            throw new Exception(s);
        }
        return hora;
    }

    /** 
     * Metodo que solicita el texto del post 
     * @return String
     * @throws Exception
     */
    public String pedirPostTexto() throws Exception{
        String txt = "";
        boolean verificacion = false;

        try{
            System.out.println("Ingrese su post [texto] (maximo 20 caracteres):");
            while(verificacion == false){
                txt = scan.nextLine();
                //Validacion del maximo de caracteres
                if(txt.length() <= 20){
                    verificacion = true;
                }else{
                    System.out.println("% Ha sobrepasado el maximo de caracteres %");
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso del post "+ e.toString();
            throw new Exception(s);
        }
        return txt;
    }

    public boolean filtrarBusqueda(){
        boolean verificacion = false;
        System.out.println("¿Desea filtrar su busqueda? (si/no)");
        String resp = scan.nextLine();
        
        //Validacion de entrada si o no
        if(resp.equals("No") || resp.equals("no")){
            verificacion = true;
        }else if(resp.equals("Si") || resp.equals("si")){
            verificacion = false;
        }else{
            System.out.println("% Ingrese *si* o *no* %");
        }

        return verificacion;
    }

    /** 
     * Metodo que solicita el url del post multimedia
     * @return String
     * @throws Exception
     */
    public String pedirUrl() throws Exception{
        String url = "";
        boolean verificacion = false;

        try{
            while(verificacion == false){
                System.out.println("Ingrese el url del archivo multimedia:");
                url = scan.nextLine();
                if(url.equals("")){
                    verificacion = false;
                }else{
                    verificacion = true;
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de url "+ e.toString();
            throw new Exception(s);
        }
        return url;
    }

    /** 
     * Metodo que solicita el tamano del post multimedia
     * @return int
     * @throws Exception
     */
    public int pedirTamano() throws Exception{
        int tamano = 0;
        boolean verificacion = false;

        try{
            while(verificacion == false){
                System.out.println("Ingrese el tamano del archivo multimedia (kB):");
                tamano = Integer.parseInt(scan.nextLine());
                //Validacion tamano real
                if(tamano > 0){
                    verificacion = true;
                }else{
                    System.out.println("Ingrese un tamano de archivo valido");
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de tamano "+ e.toString();
            throw new Exception(s);
        }
        return tamano;
    }

    /** 
     * Metodo que solicita el formato del post multimedia imagen
     * @return String
     * @throws Exception
     */
    public String pedirFormato() throws Exception{
        String formato = "";
        boolean verificacion = false;

        try{
            while(verificacion == false){
                System.out.println("Ingrese el formato de la imagen (jpeg, png, gif, etc.):");
                formato = scan.nextLine();
                if(formato.equals("")){
                    verificacion = false;
                    System.out.println("Ingrese un formato de imagen valido");
                }else{
                    verificacion = true;
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de formato "+ e.toString();
            throw new Exception(s);
        }
        return formato;
    }
    
    /** 
     * Metodo que solicita la resolucion del post multimedia imagen
     * @return int
     * @throws Exception
     */
    public int pedirResolucion() throws Exception{
        int resolucion = 0;
        boolean verificacion = false;

        try{
            while(verificacion == false){
                System.out.println("Ingrese la resolucion de la imagen (megapixeles):");
                resolucion = Integer.parseInt(scan.nextLine());
                if(resolucion> 0){
                    verificacion = true;
                }else{
                    System.out.println("Ingrese una resolucion de imagen valida");
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de resolucion "+ e.toString();
            throw new Exception(s);
        }
        return resolucion;
    }

    /** 
     * Metodo que solicita el sample rate del post multimedia audio
     * @return int
     * @throws Exception
     */
    public int pedirSampleRate() throws Exception{
        int samplerate = 0;
        boolean verificacion = false;

        try{
            while(verificacion == false){
                System.out.println("Ingrese el sample rate del audio (kHz):");
                samplerate = Integer.parseInt(scan.nextLine());
                if(samplerate > 0){
                    verificacion = true;
                }else{
                    System.out.println("Ingrese un sample rate de audio valido");
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de sample rate "+ e.toString();
            throw new Exception(s);
        }
        return samplerate;
    }

    /** 
     * Metodo que solicita el bit depth del post multimedia audio
     * @return int
     * @throws Exception
     */
    public int pedirBitDepth() throws Exception{
        int bitdepth = 0;
        boolean verificacion = false;

        try{
            while(verificacion == false){
                System.out.println("Ingrese el bit depth del audio:");
                bitdepth = Integer.parseInt(scan.nextLine());
                if(bitdepth > 0){
                    verificacion = true;
                }else{
                    System.out.println("Ingrese un bit depth de audio valido");
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de bit depth "+ e.toString();
            throw new Exception(s);
        }
        return bitdepth;
    }

    /** 
     * Metodo que solicita el frame rate del post multimedia video
     * @return int
     * @throws Exception
     */
    public int pedirFrameRate() throws Exception{
        int framerate = 0;
        boolean verificacion = false;

        try{
            while(verificacion == false){
                System.out.println("Ingrese los frames por segundo del video (fps):");
                framerate = Integer.parseInt(scan.nextLine());
                if(framerate > 0){
                    verificacion = true;
                }else{
                    System.out.println("Ingrese una cantidad de frames por segundo valido");
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de frames por segundo "+ e.toString();
            throw new Exception(s);
        }
        return framerate;
    }

    /** 
     * Metodo que solicita el emoticon del post
     * @return String
     * @throws Exception
     */
    public String pedirPostEmoticon() throws Exception{
        String emoticono = "";
        boolean verificacion = false;

        try{
            System.out.println("Ingrese su post [emoticon]:");
            while(verificacion == false){
                emoticono = scan.nextLine();
                //Validacion de existencia de emoticon
                if(emoticono.equals("")){
                    verificacion = false;
                    System.out.println("% Ha sobrepasado el maximo de caracteres %");
                }else{
                    verificacion = true;
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso del post "+ e.toString();
            throw new Exception(s);
        }
        return emoticono;
    }
    
    /** 
     * Metodo que solicita los hashtags del post
     * @return String
     * @throws Exception
     */
    public String pedirHashtags() throws Exception{
        String hashtag = "";
        boolean verificacion = false;

        try{
            System.out.println("Ingrese un hashtag para su post (coloque # al inicio):");
            while(verificacion == false){
                hashtag += scan.nextLine();
                System.out.println("¿Desea colocar otro hashtag? (si/no)");
                String respuesta = scan.nextLine();
                //Validacion de entrada si o no
                if(respuesta.equals("No") || respuesta.equals("no")){
                    verificacion = true;
                }else if(respuesta.equals("Si") || respuesta.equals("si")){
                    verificacion = false;
                }else{
                    System.out.println("% Ingrese *si* o *no* %");
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de hashtags "+ e.toString();
            throw new Exception(s);
        }
        return hashtag;
    }

    /** 
     * Metodo que solicita el id del post
     * @return int
     * @throws Exception
     */
    public int pedirIdPost() throws Exception{
        int id = 0;
        boolean verificacion = false;

        try{
            System.out.println("Ingrese el Id del post que desea seleccionar:");
            while(verificacion == false){
                id = Integer.parseInt(scan.nextLine());
                if(id >= 0){
                    verificacion = true;
                }else{
                    System.out.println("% Ingrese un Id de post valido (que aparezca en pantalla) %");
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de hashtags "+ e.toString();
            throw new Exception(s);
        }
        return id;
    }
    
    /** 
     * Metodo que muestra los posts ordenados
     * @param posts
     */
    public void mostrarPosts(String posts){
        System.out.println(posts);
    }

    /** 
     * Metodo que solicita la fecha de busqueda
     * @return String
     * @throws Exception
     */
    public String pedirBuscarFecha() throws Exception{
        String fecha = "";
        boolean verificacion = false;

        try{
            while(verificacion == false){
                System.out.println("Ingrese la fecha de publicacion que desea buscar (dd/mm/aaaa):");
                fecha = scan.nextLine();
                if(fecha.equals("")){
                    verificacion = false;
                }else{
                    verificacion = true;
                }
            }
            //En caso de ingreso invalid
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de fecha "+ e.toString();
            throw new Exception(s);
        }
        return fecha;
    }

    /** 
     * Metodo que solicita el hashtag de busqueda
     * @return String
     * @throws Exception
     */
    public String pedirBuscarHashtag() throws Exception{
        String hashtag = "";
        boolean verificacion = false;

        try{
            while(verificacion == false){
                System.out.println("Ingrese el hashtag que desea buscar:");
                hashtag = scan.nextLine();
                if(hashtag.equals("")){
                    verificacion = false;
                }else{
                    verificacion = true;
                }
            }
            //En caso de ingreso invalido
        }catch (Exception e){
            String s = "Ocurrio un error en el ingreso de hashtag "+ e.toString();
            throw new Exception(s);
        }
        return hashtag;
    }

    /** 
     * Metodo que muestra el exito de agregar un post a la red
     * @param verificacion
     */
    public void mostrarPublicacion(boolean verificacion){
        if(verificacion == true){
            System.out.println("\n¡Se ha publicado el post correctamente!\n");
        }else{
            System.out.println("\nHa ocurrido un error, el post no se ha publicado.\n");
        }
    }

    /** 
     * Metodo que muestra el exito de agregar un like a un post
     * @param verificacion
     */
    public void mostrarLike(boolean verificacion){
        if(verificacion == true){
            System.out.println("¡Ha reaccionado con un Like al post!\n");
        }else{
            System.out.println("Ha ocurrido un error, no ha podido reaccionar al post.\n");
        }
    }

    /** 
     * Metodo que muestra el exito de agregar un comentario a un post
     * @param verificacion
     */
    public void mostrarComentario(boolean verificacion){
        if(verificacion == true){
            System.out.println("¡Ha realizado un comentario en el post!\n");
        }else{
            System.out.println("Ha ocurrido un error, no ha podido comentar el post.\n");
        }
    }

    /** 
     * Aviso de que ha ocurrido un error en la ejecucion del programa
     */
    public void avisoError(String e){
        System.out.println("Ha ocurrido un error -> " + e);
    }
}
