package com.example;

public class Libro{
    private String titulo, autor;
    private int paginas;

public Libro(){
    this.titulo = "Desconocido";
    this.autor = "Anonimo";
    this.paginas = 0; 
}

public Libro(String titulo, String autor){
this.titulo = titulo;
this.autor = autor;
this.paginas = 0;
}

public Libro(String titulo, String autor, int pagina){
this.titulo = titulo;
this.autor = autor;
this.paginas = pagina;
}

public void mostrarDetalles(){
    System.out.println("Libro: [" + titulo + "] | Autor: [" + autor + "] | Páginas: [" + paginas + "]");
}
}   
