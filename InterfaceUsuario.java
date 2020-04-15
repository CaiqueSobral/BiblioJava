package biblioteca;

import java.util.Scanner;

public class InterfaceUsuario {
    public static void main(String[] args) {
        boolean controleLoop = true;
        int escolha = 0;
        Estoque minhaBiblioteca = new Estoque();
        
        Scanner entrada = new Scanner(System.in);
        
        while(controleLoop){
            System.out.println("===== Menu =====");
            System.out.println("1 - Adicionar um novo livro");
            System.out.println("2 - Pesquisar um livro");
            System.out.println("3 - Listar livros");
            System.out.println("4 - Remover um livro");
            System.out.println("5 - Sair");
            System.out.println("=================");
            System.out.print("Escolha uma opção: ");
            escolha = Integer.parseInt(entrada.nextLine());
            
            System.out.println(escolha);
            
            switch(escolha){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    controleLoop = false;
                    break;
            }
        }
    }
}
