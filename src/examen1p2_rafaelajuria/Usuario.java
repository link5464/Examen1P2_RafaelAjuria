/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_rafaelajuria;

import java.util.ArrayList;

/**
 *
 * @author rajur
 */
public class Usuario {
    String Username;
    String Password;
    String DOB;
    int Numero;
    String Email;
    String Nombre;
    String GeneroFavorito;
    ArrayList<Libro> LibrosLeidos;
    ArrayList<Usuario> Amigos;

    public Usuario(String Username, String Password, String DOB, int Numero, String Email, String Nombre, String GeneroFavorito, ArrayList LibrosLeidos, ArrayList Amigos) {
        this.Username = Username;
        this.Password = Password;
        this.DOB = DOB;
        this.Numero = Numero;
        this.Email = Email;
        this.Nombre = Nombre;
        this.GeneroFavorito = GeneroFavorito;
        this.LibrosLeidos = LibrosLeidos;
        this.Amigos = Amigos;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGeneroFavorito() {
        return GeneroFavorito;
    }

    public void setGeneroFavorito(String GeneroFavorito) {
        this.GeneroFavorito = GeneroFavorito;
    }

    public ArrayList<Libro> getLibrosLeidos() {
        return LibrosLeidos;
    }

    public void setLibrosLeidos(ArrayList LibrosLeidos) {
        this.LibrosLeidos = LibrosLeidos;
    }

    public ArrayList<Usuario> getAmigos() {
        return Amigos;
    }

    public void setAmigos(ArrayList Amigos) {
        this.Amigos = Amigos;
    }

    @Override
    public String toString() {
        return "{" + "Username=" + Username + ", Nombre=" + Nombre + '}';
    }
    
    
}
