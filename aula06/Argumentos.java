package aula06;

public class Argumentos {
    public static void main(String[] args) {//método main recebe argumentos do tipo array de String
        System.out.println("Você digitou " + args[0]);
    }
}
/*
javac Argumentos.java
java Argumentos Higo

vai imprimir
Você digitou Higo

java Argumentos "Higo Souza"

vai imprimir
Você digitou Higo Souza
*/