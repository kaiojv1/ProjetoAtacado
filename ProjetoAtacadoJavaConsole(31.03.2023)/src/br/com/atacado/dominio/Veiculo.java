package br.com.atacado.dominio;

public class Veiculo extends BaseTransporte {
    private String placa;
    private int anoFabricacao;
    private int capacidadePassageiros;

    public Veiculo(String nome, String endereco, int capacidadeCarga, String placa, int anoFabricacao, int capacidadePassageiros) {
        super(nome, endereco, capacidadeCarga);
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.capacidadePassageiros = capacidadePassageiros;
    }

    // Getters e setters
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }
}
