package br.com.projeto.model;

public class Livro {
    private String titulo;
    private  String autor;

    public Livro (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes (){
        System.out.println("----- Livro ------");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: "+ autor + "\n");
    }
}
