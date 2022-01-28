
package laboratorio28enero;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Manuel Borjas Figueroa
 *  Perdon por hacerte revisar esto tan lamentable, la verdad esta bien malo pero no se me ocurria como realizar las soluciones bien xD
 */
public class Laboratorio28enero {
  public static ArrayList<Animales> lista=new ArrayList();
  public static Scanner leer= new Scanner(System.in);
  public static Animales animal1=new Animales();
  public static Animales animal2=new Animales();
  public static Animales animal3=new Animales();

    public static void main(String[] args) {
        animal1 = new Animales("Felis catus", "Gato", "casa", "croquetas", "amarillo", "japon", 2 );
        animal2 = new Animales("Canis", "Perro", "casa", "croquetas", "negro", "Honduras", 3 );
        animal3 = new Animales("Psittacoidea", "Loro", "casa", "frutas", "verde", "Rusia", 1 );
        
        lista.add(animal1);
        lista.add(animal2);
        lista.add(animal3);
     do{
            opciones( menu() );
        }while(true);
        
     
     
    }
    
    
    public static int menu(){
        System.out.println("");
        System.out.println("");
        System.out.println("0. Salir");
        System.out.println("1. Registrar animales\n" +
                            "2. Listar animales\n" +
                            "3. Editar animales\n" +
                            "4. Eliminar animales\n" +
                            "5. Alimentar animales\n" +
                            "Ingrese la opcion: ");
        return leer.nextInt();
    }
     public static void opciones(int opcion){
         if(opcion == 0)
            System.exit(0);
        else if(opcion == 1)
            registrar();
        else if(opcion == 2)
            listar();
        else if(opcion == 3)
            editar();
        else if(opcion == 4)
            eliminar();
        else if(opcion == 5)
            alimentar();
         
         }
     
     public static void registrar(){
         System.out.print("Nombre Cientifico: ");
        String nombrecien = leer.nextLine();
        nombrecien = leer.nextLine();
        System.out.print("Nombre Comun: ");
        String nombre = leer.nextLine();
        System.out.print("Habitat: ");
        String habitat = leer.nextLine();
        System.out.print("Alimentacion: ");
        String alimentacion = leer.nextLine();
        System.out.print("Descripcion de rasgos: ");
        String desrasgos = leer.nextLine();
        System.out.print("Distribucion Geografica: ");
        String disgeo = leer.nextLine();
        System.out.print("Vida: ");
        int vida=leer.nextInt();
        while(vida==0){
            System.out.println("La vida no puede ser 0\n");
            System.out.print("Vida: ");
            vida=leer.nextInt();   
        }
        lista.add(new Animales(nombrecien, nombre, habitat, alimentacion, desrasgos, disgeo, vida));
     }
 
     public static void listar(){
        
         
         System.out.println("1.Imrprimir por posicion de la lista\n"+
                              "2.Imprimir lista completa\n" +
                                "3.Imprimir por nombre cientifico\n");
         System.out.println("Ingrese la opcion que quiere imprimir");
         int opcion=leer.nextInt();
         
          if(opcion == 1){
              System.out.println("Ingrese la posicion");
          int pos=leer.nextInt();
            imprimirpos(pos);
            }
            else if(opcion == 2)
            imprimircomp();
            else if(opcion == 3)
             System.out.println("Ingrese el Nombre Cientifico del animal");
            String imp=leer.nextLine();
             int indice=lista.indexOf(imp);
            imprimirnomb(indice,imp);
            
         } 
     public static void imprimirpos(int pos){
         System.out.println(lista.get(pos));
     }
     public static void imprimircomp(){
         for (Animales animales : lista) {
            System.out.println(animales.toString());
        }
     }
     public static void imprimirnomb(int indice,String imp){
         System.out.println(lista.indexOf(imp));
         
     }
     
     public static void editar(){
         System.out.println("Ingrese el nombre cienfitico del animal");
         String imp=leer.nextLine();
         imp=leer.nextLine();
             int indice;
             indice=lista.indexOf(imp);
             System.out.println(    "1.Editar un Atributo\n"+
                                    "2.Editar todo\n");
             System.out.println("Ingrese la opcion que desea editar" );
             int opcion=leer.nextInt();
             if(opcion==1)
                 editaruno(indice);
             else if(opcion==2)
                 editartodos(indice);
     }
      
     
     public static void editaruno(int indice){
        System.out.println("1. Nombre Cientifico\n");
        System.out.println("2. Nombre Comun\n");
        System.out.println("3. Habitat\n");
        System.out.println("4. Alimentacion");
        System.out.println("5. Descripcion de Rasgos\n");
        System.out.println("6. Distribucion Geografica\n");
        System.out.println("7. Vida\n");
        System.out.print("Ingrese la opcion: ");
        int opcion = leer.nextInt();
        if(opcion == 1){
            System.out.print("Nombre Cientifico: ");
            if(indice!=-1)
            lista.get(indice).setNombrecien(leer.nextLine());
            
        }else if(opcion == 2){
            System.out.print("Nombre: ");
            lista.get(indice).setNombre(leer.nextLine());
        }else if(opcion == 3){
            System.out.print("Habitat: ");
            lista.get(indice).setHabitat(leer.nextLine());
        }else if(opcion == 4){
            System.out.println("Alimentacion: ");
            lista.get(indice).setAlimentacion(leer.next());
        }else if(opcion == 5){
            System.out.print("Descripcion de Rasgos: ");
            lista.get(indice).setDesrasgos(leer.nextLine());
        }else if(opcion == 6){
            System.out.print("Distribucion Geografica: ");
            lista.get(indice).setDisgeo(leer.nextLine());
        }else if(opcion == 7){
            System.out.println("Vida: ");
            lista.get(indice).setVida(leer.nextInt());
        }
    }
     public static void editartodos(int indice){
         System.out.print("Nombre Cientifico: ");
            lista.get(indice).setNombrecien(leer.nextLine());
        System.out.print("Nombre: ");
            lista.get(indice).setNombre(leer.nextLine());
        System.out.print("Habitat: ");
            lista.get(indice).setHabitat(leer.nextLine());
        System.out.println("Alimentacion: ");
            lista.get(indice).setAlimentacion(leer.next());
       System.out.print("Descripcion de Rasgos: ");
            lista.get(indice).setDesrasgos(leer.nextLine());
        System.out.print("Distribucion Geografica: ");
            lista.get(indice).setDisgeo(leer.nextLine());
       System.out.println("Vida: ");
            lista.get(indice).setVida(leer.nextInt());
    }
     
     
    public static void eliminar(){
        int indice;
        System.out.println("Ingrese el nombre cienfitico del animal"); 
        String imp=leer.nextLine();
         imp=leer.nextLine();
             indice=lista.indexOf(imp);
             lista.remove(indice);
                  
    }
    
     public static void alimentar(){
        System.out.println("Ingrese la posicion del animal al que alimentara");
        int pos=leer.nextInt();
        System.out.println("Ingrese la posicion del animal al que se devoraran");
        int pos2=leer.nextInt();
        //lista.get(pos).setVida((pos)+(pos2));
        lista.remove(pos2);
        
    
    }
    
   
     
}
