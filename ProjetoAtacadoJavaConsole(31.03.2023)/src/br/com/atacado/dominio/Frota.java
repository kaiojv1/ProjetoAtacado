package br.com.atacado.dominio;

import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Veiculo> veiculos;

    public Frota() {
        this.veiculos = new ArrayList<Veiculo>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
    }

    public int quantidadeVeiculos() {
        return this.veiculos.size();
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }
}
