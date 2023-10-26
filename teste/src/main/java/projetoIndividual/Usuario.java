package projetoIndividual;

import java.util.ArrayList;

public class Usuario {

    private String email;
    private String senha;

    private ArrayList<String> tarefasPendentes;

    public ArrayList getTarefasPendentes() {
        return tarefasPendentes;
    }

    public void setTarefasPendentes(ArrayList<String> tarefasPendentes) {
        this.tarefasPendentes = tarefasPendentes;
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }




}
