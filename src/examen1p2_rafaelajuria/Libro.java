/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_rafaelajuria;

/**
 *
 * @author rajur
 */
public class Libro {
    String Titulo;
    String Descripcion;
    int Puntaje;
    int Copias;
    String Genero;
    double Valor;
    int Edicion;
    String Autor;
    int AñoDePublicacion;

    public Libro(String Titulo, String Descripcion, int Puntaje, int Copias, String Genero, double Valor, int Edicion, String Autor, int AñoDePublicacion) {
        this.Titulo = Titulo;
        this.Descripcion = Descripcion;
        this.Puntaje = Puntaje;
        this.Copias = Copias;
        this.Genero = Genero;
        this.Valor = Valor;
        this.Edicion = Edicion;
        this.Autor = Autor;
        this.AñoDePublicacion = AñoDePublicacion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPuntaje() {
        return Puntaje;
    }

    public void setPuntaje(int Puntaje) {
        this.Puntaje = Puntaje;
    }

    public int getCopias() {
        return Copias;
    }

    public void setCopias(int Copias) {
        this.Copias = Copias;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double Valor) {
        this.Valor = Valor;
    }

    public int getEdicion() {
        return Edicion;
    }

    public void setEdicion(int Edicion) {
        this.Edicion = Edicion;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getAñoDePublicacion() {
        return AñoDePublicacion;
    }

    public void setAñoDePublicacion(int AñoDePublicacion) {
        this.AñoDePublicacion = AñoDePublicacion;
    }

    @Override
    public String toString() {
        return "Libro{" + "Titulo=" + Titulo + ", Descripcion=" + Descripcion + ", Puntaje=" + Puntaje + ", Copias=" + Copias + ", Genero=" + Genero + ", Valor=" + Valor + ", Edicion=" + Edicion + ", Autor=" + Autor + ", A\u00f1oDePublicacion=" + AñoDePublicacion + '}';
    }
    
    
    
}
