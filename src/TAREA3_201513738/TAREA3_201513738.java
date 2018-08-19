package TAREA3_201513738;
import java.util.Scanner;
public class TAREA3_201513738 {

    public static void main(String[] args) { //Codigo para salir del sistema
        Scanner entrada = new Scanner(System.in);
        Menu objMenu=new Menu();
        Funcion objFuncion=new Funcion();
        int intFuncion=-1;
        Boolean Salir=false;
        while(Salir==false){
            intFuncion=objMenu.ImprimeMenu(entrada);
            if(intFuncion==1){
                System.out.println("Usted ha salido del programa, Esperamos que regrese!."); //Mensaje Final
                break;
            }
            objFuncion.ProcesarFuncion(intFuncion, entrada);
        }
        
    }
    
}

