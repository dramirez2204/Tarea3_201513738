package TAREA3_201513738;
import java.util.Scanner;

public class Menu {
    int intMenuPrincipal=-1;
    int intSubMenu=-1;
    int intFuncion;
    int matriz [][] = new int [6][6];
    int suma1, suma2, suma3, suma4, suma5, suma6 = 0;
    int promedio1, promedio2, promedio3, promedio4, promedio5, promedio6 = 0;
    Scanner teclado = new Scanner(System.in);
    
    boolean blnSeleccionada=false;
    //Constructor de la clase es el primero que la crea
    public void Menu(){
        this.intMenuPrincipal=-1; //no tengo ningun menu principal
    }
    public int ImprimeMenu(Scanner objOpcionUsuario){
        blnSeleccionada=false;
        while(blnSeleccionada==false){
            if(intMenuPrincipal==-1){
                ImprimeMenuPrincipal();
                intMenuPrincipal=objOpcionUsuario.nextInt();
                if(!(intMenuPrincipal>=1 && intMenuPrincipal<=5)){
                    System.out.println("******* Opcion seleccionada invalida **********"); 
                    System.out.println("***********************************************");
                    intMenuPrincipal=-1;
                    continue;
                }
                if(intMenuPrincipal==4){
                    return 9; 
                }
                if(intMenuPrincipal==5){
                    this.intFuncion=1;
                    break;
                }
            }
            ImprimeSubMenu(intMenuPrincipal);
            intSubMenu=objOpcionUsuario.nextInt();
            intFuncion=getTipoFuncion(intMenuPrincipal,intSubMenu);
            if(intFuncion==0){
                intMenuPrincipal=-1;
                continue;
            }
        }
        return intFuncion;
    }
    private int getTipoFuncion(int intMenuPrincipal,int intSubMenu){
        this.blnSeleccionada=true;
        if(intSubMenu==4){
            this.blnSeleccionada=false;
            return 0;
        }else if(intMenuPrincipal==1 && intSubMenu==1){
            return 2; //Ingresar Usuarios
        }else if(intMenuPrincipal==1 && intSubMenu==2){
            return 3; //Mostrar Usuario ascendente
        }else if(intMenuPrincipal==1 && intSubMenu==3){
            return 4; //Mostrar Usuario descendente
        }else if(intMenuPrincipal==2 && intSubMenu==1){
            return 5; //Ingresar numero
        }else if(intMenuPrincipal==2 && intSubMenu==2){
            return 6; //Mostrar digitos
        }else if(intMenuPrincipal==3 && intSubMenu==1){
            return 7; //Ingresar numero
        }else if(intMenuPrincipal==3 && intSubMenu==2){
            return 8; //Mostrar ordenados
        }else{
            this.blnSeleccionada=false;
            System.out.println("******* Opcion seleccionada invalida **********"); 
            System.out.println("***********************************************");
            return -1;
        }
        
    }
    public void ImprimeMenuPrincipal(){ //Muestra Menu Principal
        System.out.println("=================================");
        System.out.println("Menu Principal");
        System.out.println("1.-Usuarios");
        System.out.println("2.-Contador de Digitos");
        System.out.println("3.-Tres Números de Mayor a Menor");
        System.out.println("4.-Calcular Promedio");
        System.out.println("5.-Salir");
    }
    public void ImprimeSubMenu(int Opcion){ //Sub Menu Usuarios
        System.out.println("=================================");
        switch(Opcion){
            case 1:{
                System.out.println("Usuarios");
                System.out.println("1.-Ingresar Usuarios");
                System.out.println("2.-Mostrar Usuarios ascendente");
                System.out.println("3.-Mostrar Usuarios descendente");
                System.out.println("4.-Menu Principal");
                break;
            }
            case 2:{ //Sub Menu Contador de Digitos
                System.out.println("Contador de Digitos");
                System.out.println("1.-Ingresar numero");
                System.out.println("2.-Mostrar numero de digitos");
                System.out.println("4.-Menu Principal");
                break;
            }
            case 3:{ //Sub Menu Tres Numeros de Menor a Mayor
                System.out.println("Tres Números de Menor a Mayor");
                System.out.println("1.-Ingresar números");
                System.out.println("2.-Mostrar ordenados");
                System.out.println("4.-Menu Principal");
                break;
            }
            case 4:{
               for (int x=0; x < matriz.length; x++){
                   
                for (int y=0; y< matriz[x].length; y++){
                   if(y == 0){
                       System.out.println("Ingrese Id de Estudiante: ");
                       matriz[x][0] = teclado.nextInt();
                   }else if
                   (y == 5){
                   matriz[x][5] = 100;
                   }else{ 
                   switch (y){
                        case 0: 
                            System.out.println("Ingrese Notas Estudiante: ");
                            matriz[x][y] = teclado.nextInt();
                            break;
                        case 1:
                            System.out.println("Ingrese Notas Estudiante: ");
                            matriz[x][y] = teclado.nextInt();
                            break;
                        case 2:
                            System.out.println("Ingrese Notas Estudiante: ");
                            matriz[x][y] = teclado.nextInt();
                            break; 
                        case 3:
                            System.out.println("Ingrese Notas Estudiante: ");
                            matriz[x][y] = teclado.nextInt();
                            break;    
                        case 4:
                            System.out.println("Ingrese Notas Estudiante: ");
                            matriz[x][y] = teclado.nextInt();
                            break;    
                        case 5:
                            System.out.println("Ingrese Notas Estudiante: ");
                            matriz[x][y] = teclado.nextInt();
                            break;   
                    }
                  }
                }
                 for(int x=0; x<=5; x++){
                   int conteo = 0;
                   for (int y=1; y <=4; y++){
                       conteo += matriz[x][y];
                   }
                   matriz[x][5] = conteo / 4;
                }
               for(int x=0; x < matriz.length; x++){
                   System.out.print("|");
                   for (int y=0; y < matriz[x].length; y++){
                       System.out.print(matriz[x][y]);
                       if(y!=matriz[x].length-1) System.out.print("\t");
                    }
                   System.out.println("|");
               }
            }
        }
    }
}
}