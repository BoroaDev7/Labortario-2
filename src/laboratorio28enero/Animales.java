
package laboratorio28enero;

import java.util.ArrayList;

/**
 *
 * @author Juan Manuel Borjas Figueroa
 */
public class Animales {
    private String nombrecien;
    private String nombre;
    private String habitat;
    private String alimentacion;
    private String desrasgos;
    private String disgeo;
    private int vida;
 
    
     public Animales(){
         
     }
     
      public Animales(String nombrecien,String nombre, String habitat, String alimentacion, String desrasgos, String disgeo, int vida){
          this.nombrecien=nombrecien;
          this.nombre=nombre;
          this.habitat=habitat;
          this.alimentacion=alimentacion;
          this.desrasgos=desrasgos;
          this.disgeo=disgeo;
          this.vida=vida;
  
       }
      
      
      public void setNombrecien(String nombrecien){
          this.nombrecien=nombrecien;
        
      }
    
      public String getNombrecien(){
          return nombrecien;
      }
      public String setNombre(String nombre){
          this.nombre=nombre;
          return null;
      }
      public String getNombre(){
          return nombre;
      }
      public void setHabitat(String habitat){
          this.habitat=habitat;
         
      }
      public String getHabitat(){
          return habitat;
         
      }
      public void  setAlimentacion(String alimentacion){
          this.alimentacion=alimentacion;
      }
      public String getAlimentacion(){
          return alimentacion;
         
      }
      public void setDesrasgos(String desrasgos){
          this.desrasgos=desrasgos;
          
      }
      public String getDesrasgos(){
          return desrasgos;
          
      }
     
      public void setDisgeo(String disgeo){
          this.disgeo=disgeo;
          
      }

      public String getDisgeo(){
          return disgeo;
      }
      
      public void setVida(int vida){
          this.vida=vida;
      }
      public int getVida(){
          return vida;
      }
    
      
      @Override
    public String toString() {
    return "Nombre cientifico="+nombrecien+" Nombre="+nombre+" Habitat="+habitat+" Alimentacion="+alimentacion +" Descripcion de rasgos="+desrasgos+" Distribucion geografica="+disgeo+" Vida="+vida;
   
    }
        
    
    
    
}

 
