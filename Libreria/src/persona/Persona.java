package persona;



import usuario.Usuario;

public class Persona {

	protected Integer dni;
	protected String nombre;
	protected String apellido;
	protected String email;
	protected Integer telefono;
	protected Usuario miUsuario;

	
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	public Usuario getMiUsuario() {
		return miUsuario;
	}
	public void setMiUsuario(Usuario miUsuario) {
		this.miUsuario = miUsuario;
	}
	
	public Persona(Integer dni, String nombre, String apellido, String email, Integer telefono) {
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
		this.email=email;
		this.telefono=telefono;
		}

	public String formatoPersona(){
		return "DNI: "+this.getDni()+ " " +" NOMBRE Y APELLIDO: "+this.getNombre()+ " " +this.getApellido()+ " "+" EMAIL: " +this.getEmail()+ " "+" TELEFONO: " + this.getTelefono()+ " ";
		}


	}


