package com.example.exerciciocompragame;

import com.example.exerciciocompragame.entities.Comprador;
import com.example.exerciciocompragame.entities.Game;
import com.example.exerciciocompragame.entities.Games;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa que simule uma loja de compra de video game, onde contenha um menu com as seguintes opções:
1 - Comprar.
2 - ver carrinho.
3 - excluir do carrinho
4 - olhar lista de disponíveis
5 - Abastecer estoque (somente pessoal que trabalha, pode abastastecer;
6 -Imprimir lista (em csv ou txt).
A partir disso implementar cada uma das funções, lembrando que Obrigatório controlar estoque e
lembre-se que não se deve trabalhar como estoque negativo.*/

@SpringBootApplication
public class ExercicioCompraGameApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Bem-Vindo a loja de games");
        System.out.print("Por favor, digite seu nome: ");
        String name = sc.nextLine();
        System.out.print("Certo, seja bem-vindo: " + name + "\nAgora digite CPF:" );
        String cpf = sc.nextLine();

        while(cpf.length() != 11 ) {
            if (cpf.length() != 11) {
                System.out.println("CPF invalido, favor digitar novamente");
                cpf = sc.nextLine();
            }
        }

        Comprador comprador = new Comprador(name, cpf);

        List<Game> games = new ArrayList<>();
        games.add(new Game(15478, "Horizon Forbeddin", 32, 6, 250.00));
        games.add(new Game(16879, "Lego batman", 31, 8, 25));
        games.add(new Game(11548, "Clash 4", 36, 12,350.00));
        games.add(new Game(14896, "Persona 3", 30, 21, 215.00));

        System.out.println("Escolha a rotina que deseja entrar");
        System.out.println("1 - Comprar.\n2 - ver carrinho\n3 - excluir do carrinho\n4 - olhar lista de disponíveis\n5 -Imprimir lista (em csv ou txt).");
        int opc = sc.nextInt();

        while (opc < 1 || opc > 6) {
            switch (opc) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    for (Games l : games) {
                        System.out.println(l);
                    }
                    break;

                case 5:

                    break;


                default:
                    System.out.println("Opção selecionada invalida");
                    break;
            }
        }
    }

}