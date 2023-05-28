package br.fatecrl.mvcdemo.models;

public class Produto {
    private String codigo;
    private String nome;
    private float preco;
    private float preco_desconto;

    public Produto(String codigo, String nome, float preco, float preco_desconto) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.preco_desconto = preco_desconto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getPreco_desconto() {
        return preco_desconto;
    }

    public void setPreco_desconto(float preco_desconto) {
        this.preco_desconto = preco_desconto;
    }
}
