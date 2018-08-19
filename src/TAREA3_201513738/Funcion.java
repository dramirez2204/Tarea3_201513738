package TAREA3_201513738;
import java.util.Scanner;

public class Funcion { //Operaciones Menu de Usuarios
    String[] strUsuarios=new String[5];
    int intNumero=-1;
    Integer[] intNumeros=new Integer[3];
    public void ProcesarFuncion(int intFuncion,Scanner objIngresoUsuario){
        if(intFuncion==2){
            IngresarUsuarios(objIngresoUsuario);
        }else if(intFuncion==3){
            MostrarUsuarioAscedente();
        }else if(intFuncion==4){
            MostrarUsuarioDescendente();
        }else if(intFuncion==5){
            IngresarNumeros(objIngresoUsuario);
        }else if(intFuncion==6){
            MostrarDigitos();
        }else if(intFuncion==7){
            Ingresar3Numeros(objIngresoUsuario);
        }else if(intFuncion==8){
            OrdenarNumeros();
        }
    }
    private void IngresarUsuarios(Scanner objUsuario){
        int intContador=0;
        String strNombre="";
        System.out.println("=====Ingreso de usuarios======="); //Pido los datos
        strNombre=objUsuario.nextLine();
        while(intContador<5){
            System.out.println("Ingresar Usuario");
            strNombre=objUsuario.nextLine();
            for(int i=0;i<intContador;i++){
                if(this.strUsuarios[i].compareToIgnoreCase(strNombre)==0){ //Verifico si ya existe el Usuario
                    System.out.println("ERROR: Usuario ya ingresado");
                    continue;
                }
            }
            this.strUsuarios[intContador]=strNombre;
            intContador++;
        }
        System.out.println("Usuarios Ingresados Satisfactoriamente.");
    }
    private void MostrarUsuarioAscedente(){
        System.out.println("=====Mostrar usuarios ascedente=======");
        for(int i=4;i>=0;i--){
            System.out.println(this.strUsuarios[i]);
        }
    }
    private void MostrarUsuarioDescendente(){
        System.out.println("=====Mostrar usuarios descendente=======");
        for(int i=0;i<5;i++){
            System.out.println(this.strUsuarios[i]);
        }
    }
    private void IngresarNumeros(Scanner objUsuario){
        System.out.println("=====Contador de digitos=======");
        try{
            System.out.println("Ingresar Numero");
            intNumero=objUsuario.nextInt();
        }catch(Exception e){
            intNumero=-1;
            System.out.println("Numero invalido");
        }
    }
    private void MostrarDigitos(){
        if(intNumero==-1){
            System.out.println("Numero no ingresado");
        }
        String strNumero=String.valueOf(intNumero);
        System.out.println("El numero ingresado es "+strNumero+" Y el numero de digitos son: "+strNumero.length());
    }
    private void Ingresar3Numeros(Scanner objUsuario){
        int intContador=0;
        Integer intNumero;
        System.out.println("=====Ingreso de numeros======="); //Pido los Numeros
        while(intContador<3){
            System.out.println("Ingresar numeros");
            intNumero=objUsuario.nextInt();
            for(int i=0;i<intContador;i++){
                if(this.intNumeros[i]==intNumero){
                    System.out.println("Usuario ya ingresado");
                    continue;
                }
            }
            this.intNumeros[intContador]=intNumero;
            intContador++;
        }
        System.out.println("Numeros ingresados satisfactoriamente.");
    }
    private void OrdenarNumeros(){ //Método para ordenar los numeros ingresados
        int temp;
        for(int i=0;i<intNumeros.length;i++){
            for (int u=0;u<intNumeros.length-1;u++){
                if(intNumeros[u]>intNumeros[u+1]){
                    temp=intNumeros[u];
                    intNumeros[u]=intNumeros[u+1];
                    intNumeros[u+1]=temp;
                }
            }
        }
        String strValoresOrdenados="";
        for(int i=0;i<intNumeros.length;i++){
            if(strValoresOrdenados.compareTo("")!=0) strValoresOrdenados +=", ";
            strValoresOrdenados += String.valueOf(intNumeros[i]);
        }
        System.out.println("Los valores ordenados son [" + strValoresOrdenados + "]");
    }     
                
}

