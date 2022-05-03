package br.sistema.model;

public class Home {
     private double valor;
     private String material;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Home{" +
                "valor=" + valor +
                ", material='" + material + '\'' +
                '}';
    }
}
