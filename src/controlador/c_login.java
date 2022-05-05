package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Locale;

public class c_login {
    public static Boolean compr_usu(String user, String password){
                if(user.equals(obtener_usuario().get(0)) && password.equals(obtener_usuario().get(1))){
                    return true;
                }else{
                   return false;
                }
    }
    private static ArrayList<String> obtener_usuario(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        ArrayList<String> ARLU=new ArrayList();
        try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            archivo = new File ("setup.txt");
            fr = new FileReader (archivo);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null)
                if(linea.toLowerCase(Locale.ROOT).trim().equals("user")){
                    ARLU.add(br.readLine());
                }else if(linea.toLowerCase(Locale.ROOT).trim().equals("password")){
                    ARLU.add(br.readLine());
                }
        }
        catch(Exception e){
           // e.printStackTrace();
        }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta
            // una excepcion.
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                //e2.printStackTrace();
            }
        }
        return ARLU;
    }

}
