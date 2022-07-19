package usuario1;

public class Persona{
	
	private String nombre;
	private String apellido;
	private int corroe electronico;
	private String genero;

	 public Persona(){

	 }
	 public Persona(String nombre, String apellido, int identi, String genero){
     this.nombre = nombre;
     this.apellido = apellido;
     this.identi = identi;
     this.genero = genero ;
	 }
	 public String getNombre(){
	 	return nombre;
	 }
	 public void setNombre(String nombre){
     this.nombre = nombre;
	 }
	 public String getApellido(){
	 	return apellido;
	 }
	 public void setApellido(String apellido){
	 	this.apellido = apellido;
	 }
	 public int getIdenti(){
	 	return identi;
	 }
	 public void setIdenti(int identi){
   		this.identi = identi;
	 }
	 public String getGenero(){
	 	return genero;
	 }
	 public void setGenero(String genero){
	 	this.genero = genero;
	 }
	 public String toString(){
	 	return "(nombre "+ nombre + ",apellido "+ apellido + ",identificacion "+ identi + ",genero"+ genero +")";
	 }

	





}
