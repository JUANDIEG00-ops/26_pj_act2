package com.example;

public class Libro{
    private String titulo, autor;
    private int paginas;

public Libro(){
    this.titulo = "Desconocido";
    this.autor = "Anonimo";
    this.paginas = 0; 
}

public Libro(String libro, String autor){
this.titulo = "Harry Potter";
this.autor = "J.K. Rowling";
this.paginas = 0;
}

public Libro(String libro, String autor, int pagina){
this.titulo = "El señor de los Anillo";
this.autor = "J.R.R. Tolkien";
this.paginas = 1200;
}

public void mostrarDetalles(){
    System.out.println("Libro: [" + titulo + "] | Autor: [" + autor + "] | Páginas: [" + paginas + "]");
}
}   
