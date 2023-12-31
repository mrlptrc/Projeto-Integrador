package model;
public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String celular;
    private int idNivel;
    private String endereco;
    private String senha;

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getIdNivel() {
        
        return idNivel;
    }
    public String getNivel() {
        if (idNivel == 0) {
            return "Gerente";
        } else if (idNivel == 1) {
            return "Operador";
        } else {
            return "Unknown"; // or throw an exception or handle it based on your requirements
        }
    }   

    public void setIdNivel(int idNivel) {
        this.idNivel = idNivel;
    }

  
    
}
