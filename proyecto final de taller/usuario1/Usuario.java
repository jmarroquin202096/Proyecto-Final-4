package usuario1;

public class Usuario extends Persona{
	
     private String nombre1;
     private int edad;
	
     public Usuario(){

    }
    public Usuario(String nombre1, String apellido, int edad, String genero,String nombre,int indenti){
    	super( nombre,  apellido,  edad,  genero);
        this.nombre1 = nombre1;
        this.edad = edad;
    }
    public String getNombre1(){
        return nombre1;
    }
    public void setNombre1(String nombre1){
        this.nombre1 = nombre1;
    }
    public int getEdad(){
        return edad;
    } 
    public void setEdad(int edad){
        this.edad = edad;
    }
    public String toString(){
       return super.toString()+ "(nombre" + nombre1 + ",edad"+ edad +")";
    }


}