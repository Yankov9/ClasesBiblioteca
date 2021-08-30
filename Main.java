import java.time.LocalDate;

class Libro
{
    private String author;
    private String isbn;
    private String title;
    private String editorial;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}

class Usuario
{
    private String nombre;
    private String clave;
    private String phone;
    private String email;
    private LocalDate registerDate;
    private String address;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class Empleado
{
    private String nombre;
    private String clave;
}

class Prestamo
{
    private LocalDate fechaHora;
    private Usuario usuario;
    private Libro[] libros;
    private Empleado empleado;

    public LocalDate getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDate fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro[] getLibro() {
        return libros;
    }

    public void setLibro(Libro[] libro) {
        this.libros = libro;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
}


class AdministradorDeUsuarios
{

}

class AdministradorDeLibros
{

}

class AdministradorDePrestamos
{

}
public class Main {

    public static void main(String[] args) {
    }
}
