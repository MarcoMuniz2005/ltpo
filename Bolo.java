package main.java.com.fabricadebolo.model;

public class Bolo {
    String sabor;
    int tamanho;

    //Construtor(forno)
    public Bolo(String sabor, int tamanho){
        this.sabor = sabor;
        this.tamanho = tamanho;
    }

    //Método para exibir bolo pronto
    public void exibirDetalhes(){
        System.out.println("main.java.com.fabricadebolo.model.Bolo de " + sabor+ "de tamanho" + tamanho + "cm.");
    }
}