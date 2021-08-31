package edu.uaslp.library.model;

import java.time.LocalDate;

public class Prestamo {

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
