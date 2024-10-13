package org.filmes;


public class Main {
    public static void main(String[] args) {
        HomeTheaterFachada homeTheater = new HomeTheaterFachada();
        homeTheater.assistirFilme("Meu Malvado Favorito 1");
        System.out.println();
        System.out.println("===========");
        System.out.println();
        homeTheater.fimDoFilme();
        }
}
