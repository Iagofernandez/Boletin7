/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7;

import java.util.Scanner;

/**
 *
 * @author ifernandezblanco
 */
public class Libro {

    private String titulo;
    private String autor;
    private int Exemplares;
    private int numeroPrestados;

    public Libro(){
}
Scanner sc=new Scanner(System.in);
public void getLibros(){
    String libro;
    System.out.println("Título del libro");
    libro=sc.next();
    titulo=libro;
}
public String setLibro(){
    return titulo;
}
public void getAutor(){
    String autor;
    System.out.println("Nombre autor");
    autor=sc.nextLine();
    this.autor=autor;
}
public String setAutor(){
    return autor;
}
public void  getEXemplares(){
    int nExemplares;
    System.out.println("Número de exemplares");
    nExemplares=sc.nextInt();
    Exemplares=nExemplares;
}
public int setExemplares(){
    return Exemplares;
}
public void getNumeroPrestados(){
    int prestados;
    System.out.println("Numero de prestados");
    prestados=sc.nextInt();
    numeroPrestados=prestados;
}
public int setNumeroPrestados(){
    return numeroPrestados;
}
public void prestamo(){
    int prestamo;
    System.out.println("Libros que se prestan");
    prestamo=sc.nextInt();
    Exemplares=Exemplares-prestamo;
    if(Exemplares<=0){
        System.out.println("False");
        Exemplares=Exemplares+prestamo;
    }
    else 
        System.out.println("True");
    numeroPrestados=numeroPrestados+prestamo;
}
public void devolucion(){
    int devolucion;
    System.out.println("Libros a devolver");
    devolucion=sc.nextInt();
    numeroPrestados=numeroPrestados-devolucion;
    if(numeroPrestados<=0){
        System.out.println("false");
        numeroPrestados=numeroPrestados+devolucion;
    }
else
        System.out.println("true");
    numeroPrestados=numeroPrestados+devolucion;
}
}
