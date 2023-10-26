package projetoIndividual;

import com.github.britooo.looca.api.core.Looca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    ArrayList<Usuario> listaUsuarios = new ArrayList<>();


    Looca looca = new Looca();




    public static void main(String[] args) {

        Scanner leitorScanner = new Scanner(System.in);

        // Select funcionario;

        usuarioCadastrado = select;

        boolean usuarioValidacao = false;
        int posicaoUsuario = -1;

        do {
            System.out.println("""
            ====================
            Informe seu email:""");
            String respostaEmail = leitorScanner.nextLine();
            System.out.println("Informe sua senha:");
            String respostaSenha = leitorScanner.nextLine();

            for (int i = 0; i < usuarioCadastrado.size(); i++) {

                if (respostaEmail.equals(usuarioCadastrado.get(i).getEmail())
                        && respostaSenha.equals(usuarioCadastrado.get(i).getSenha())) {

                    System.out.println("\nlogin realizado com sucesso!\n");
                    usuarioValidacao = true;
                    posicaoUsuario = i;

                } else if (!usuarioValidacao && i == (usuarioCadastrado.size() - 1)) {

                    System.out.println("\nE-mail e/ou senha incorretos!\n");
                }
            }
        }
        while (!usuarioValidacao);


        boolean mostrarMenu = true;

        while (mostrarMenu) {
            Scanner leitorNumero = new Scanner(System.in);
            System.out.println(
                    """
                    
                    Bem-vindo a captura de dados da Memory-Analytics, o que deseja fazer?
                    Aperte:
            
                    1 - Capturar dados
                    2 - Visualizar dados
                    3 - sair
                    
                    """
            );

            int respostaUsuario = leitorNumero.nextInt();

            ArrayList<String> listaTarefasPendentes = usuarioCadastrado.get(posicaoUsuario).getTarefasPendentes();
            if (respostaUsuario == 1) {

                        System.out.println(
                                """
                                
                                Pressione para coletar dados de:
                                1 - CPU
                                2 - DISCO
                                3 - Voltar ao menu                                                             
                                """
                        );
                        respostaUsuario = leitorNumero.nextInt();

                        if ( respostaUsuario == 1){
                            System.out.println("Informe a tarefa para adicionar:");
                            String novaTarefa = leitorScanner.nextLine();
                            usuarioCadastrado.get(posicaoUsuario).getTarefasPendentes().add(novaTarefa);
                            System.out.println("Tafera adicionada com sucesso!");

                        } else if (respostaUsuario == 2){
                            System.out.println("Informe a posição da terefa para remover:");
                            respostaUsuario = leitorNumero.nextInt();
                            usuarioCadastrado.get(posicaoUsuario).getTarefasPendentes().remove((respostaUsuario -1));
                            System.out.println("Tafera removida com sucesso!");
                        } else if (respostaUsuario == 3){
                            System.out.println("voltando ao menu");
                        } else {
                            System.out.println("Resposta inválida!");
                        }

            } else if (respostaUsuario == 2){
                System.out.println(
                """
                Pressione para selecionar os dados de:
                1 - CPU
                2 - DISCO
                3 - Voltar ao menu                                
                                
                """
                );

                respostaUsuario = leitorNumero.nextInt();

                if ( respostaUsuario == 1){
                    System.out.println("Informe a tarefa para adicionar:");
                    String novaTarefa = leitorScanner.nextLine();
                    usuarioCadastrado.get(posicaoUsuario).getTarefasPendentes().add(novaTarefa);
                    System.out.println("Tafera adicionada com sucesso!");

                } else if (respostaUsuario == 2){
                    System.out.println("Informe a posição da terefa para remover:");
                    respostaUsuario = leitorNumero.nextInt();
                    usuarioCadastrado.get(posicaoUsuario).getTarefasPendentes().remove((respostaUsuario -1));
                    System.out.println("Tafera removida com sucesso!");
                } else if (respostaUsuario == 3){
                    System.out.println("voltando ao menu");
                } else {
                    System.out.println("Resposta inválida!");
                }




            } else if (respostaUsuario == 3) {
                System.out.println("Programa encerrado.");
                mostrarMenu = false;
                leitorScanner.close();
                leitorNumero.close();

            } else {
                System.out.println("Resposta inválida!");
            }

        }

    }

    public void setListaUsuarios(ArrayList<Usuario> usuarioCadastrado) {
        this.listaUsuarios = usuarioCadastrado;
    }

}



