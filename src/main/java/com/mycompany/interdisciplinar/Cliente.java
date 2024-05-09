package com.mycompany.interdisciplinar;

public class Cliente {
    String nome;
    String turno;
    String nascimento;
    String cpf;
    String celular;
    float treino;
    int qtdTreinos;
    boolean devedor;
    float mensalidade;
    
    public Cliente(String nome, String turno, String nascimento, String cpf, 
            String celular, int qtdTreinos, float treino){
        this.nome = nome;
        this.turno = turno;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.celular = celular;
        this.qtdTreinos = qtdTreinos;
        this.treino = treino;
    }
    
    //método listar
    public String listar() {
        return "Nome: " + this.nome+
                "\nNascimento: " +this.nascimento+
                "\nTurno: " + this.turno+
                "\nCPF: " + this.cpf+
                "\nCelular: " + this.celular+
                "\nTreinos: " + this.treino+
                "\nMensalidade: " + valorMensalidade()+
                "\n";
    }
    
    float valorMensalidade(){
        float valor;
        valor = this.treino * this.qtdTreinos;
        return valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setTreino(float treino) {
        this.treino = treino;
    }

    public void setDevedor(boolean devedor) {
        this.devedor = devedor;
    }

    public void setMensalidade(float mensalidade) {
        this.mensalidade = mensalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getTurno() {
        return turno;
    }

    public String getNascimento() {
        return nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCelular() {
        return celular;
    }

    public float getTreino() {
        return treino;
    }

    public float getMensalidade() {
        return mensalidade;
    }        
}
