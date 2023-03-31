package br.com.atacado.dominio;

public class BaseTransporte {
    private String nome;
    private String endereco;
    private int capacidadeCarga;

    public BaseTransporte(String nome, String endereco, int capacidadeCarga) {
        this.nome = nome;
        this.endereco = endereco;
        this.capacidadeCarga = capacidadeCarga;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
