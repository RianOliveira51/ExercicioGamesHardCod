package com.example.exerciciocompragame;

import com.example.exerciciocompragame.entities.Carrinho;
import com.example.exerciciocompragame.entities.Comprador;
import com.example.exerciciocompragame.entities.Game;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.exit;
/*Fazer um programa que simule uma loja de compra de video game, onde contenha um menu com as seguintes opções:
1 - Comprar.
2 - ver carrinho.
3 - excluir do carrinho
4 - olhar lista de disponíveis
5 - Abastecer estoque (somente pessoal que trabalha, pode abastastecer;
6 - Imprimir lista (em csv ou txt) - NFE
A partir disso implementar cada uma das funções, lembrando que Obrigatório controlar estoque e
lembre-se que não se deve trabalhar como estoque negativo.*/

@SpringBootApplication
public class ExercicioCompraGameApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //Variveais
        char escolhaContinuar;
        int opcMenu;

        System.out.println("Bem-Vindo a loja de games");
        System.out.print("Por favor, digite seu nome: ");
        String name = sc.nextLine();
        System.out.print("Certo, seja bem-vindo: " + name + "\nAgora digite CPF: ");
        String cpf = sc.nextLine();

        //tratamento de exeção manual, será criado uma classe para esse tratamento.
        while (cpf.length() != 11 || name.isEmpty()) {
            if (cpf.length() != 11) {
                System.out.println("CPF invalido, favor digitar novamente");
                System.out.print("CPF: ");
                cpf = sc.nextLine();
            } else if (name.isEmpty()) {
                System.out.println("Nome não digitado, favor, digite novamente.");
                System.out.print("Nome: ");
                name = sc.nextLine();
            }
        }

        Comprador comprador = new Comprador(name, cpf);

        //criando lista de games e carrinho
        List<Game> games = new ArrayList<>();
        List<Carrinho> carrinho = new ArrayList<>();

        //Instanciando uma lista de games
        games.add(new Game(15478, "Horizon Forbeddin", 32, 2, 250.00));
        games.add(new Game(16879, "Lego batman", 31, 2, 25.00));
        games.add(new Game(11548, "Clash 4", 36, 2, 350.00));
        games.add(new Game(14896, "Persona 3", 30, 2, 215.00));

        do {
            System.out.println("Escolha a rotina que deseja entrar");
            System.out.println("1 - Comprar.\n2 - excluir do carrinho\n3 - ver carrinho\n4 - olhar lista de disponíveis\n5 -Imprimir lista (em csv ou txt)\n6 - Sair.");
            opcMenu = sc.nextInt();

            //Loop do menu das rotinas
            switch (opcMenu) {
                //Comprar item
                case 1:
                    do {
                        System.out.println("Você selecionou comprar, escolha qual games quer levar\nDigite o id do jogo e a quantidade");
                        for (Game l : games) {
                            System.out.println(l);
                        }

                        System.out.println("Escolha o Jogo pelo o ID");
                        int IdJogo = sc.nextInt();
                        boolean encontro = false;
                        for (Game l : games) {
                            if (IdJogo == l.getCodigo()) {
                                carrinho.add(new Carrinho(l.getCodigo(), l.getNome(), l.getArmazem(), l.getQuant(), l.getPrice()));
                                encontro = true;
                            }
                        }
                        if (!encontro){
                            System.out.println("Codigo invalido");
                        }
                        //consumir espaço do int
                        sc.nextLine();

                        System.out.println("Deseja comprar outro jogo: S ou N");
                        escolhaContinuar = sc.nextLine().charAt(0);
                    } while (escolhaContinuar == 'S');

                    break;
                //Excluir item
                case 2:
                    System.out.println("Dentro carrinho");
                    for (Carrinho c : carrinho) {
                        System.out.println(c);
                    }

                    System.out.println("Qual item do carrinho, deseja remover, favor, digitar o ID");
                    int IdJogo = sc.nextInt();

                    System.out.println("Dentro carrinho");
                    for(int i=0; i<carrinho.size(); i++) {
                        Carrinho c = carrinho.get(i);
                        if (IdJogo == c.getCodigo()) {
                            carrinho.remove(c);
                            i--;
                        }
                    }

                    break;
                 //Ver lista do carrinho
                case 3:
                    System.out.println("Dentro carrinho");
                    for (Carrinho c : carrinho) {
                        System.out.println(c);
                    }
                    break;
                //ver games disponiveis
                case 4:
                    for (Game l : games) {
                        System.out.println(l);
                    }

                    break;
                //imprimir cvs
                case 5:

                    break;
                //sair da loja
                case 6:
                    System.out.println("Saindo da loja");
                    exit(0);
                    break;
                //Caso não exista a opção selecioanda
                default:
                    System.out.println("Opção selecionada invalida, escolha novamente.");
                    opcMenu = sc.nextInt();
                    break;
            }
        }while (opcMenu >= 1 || opcMenu <= 6 );

    }

}
