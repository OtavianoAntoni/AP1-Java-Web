package Pacote1;

public class Carro { 
	// Variáveis de instância
    private String modelo;
    private String marca;
    private Integer anoFabricacao;

    // Construtor
    public Carro(String modelo, String marca, Integer anoFabricacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }

    // Getter para o modelo
    public String getModelo() {
        return modelo;
    }

    // Setter para o modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter para a marca
    public String getMarca() {
        return marca;
    }

    // Setter para a marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter para o ano de fabricação
    public Integer getanoFabricacao() {
        return anoFabricacao;
    }

    // Setter para o ano de fabricação
    public void setanoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}


