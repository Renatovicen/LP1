// Crie uma classe Anima (id, nome, sexo, raça, cor) e duas subclasses Mamifero (quantidadePatas, peso) e 
//Aves (tipoPenas)
// Crie uma classe que contenha o método main e receba o cadastramento de uma quantidade indeterminada de 
//animais (Mamíferos e Aves). Ao final, calcule e mostre:
// - Quantos mamíferos são do sexo masculino
// - Quantas aves são do sexo feminino
// - A quantidade total de animais cadastrados
// - Quantos animais são pretos e os nomes deles

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Mamifero> Mamifero = new ArrayList<>();
        ArrayList<animais> animais = new ArrayList<>();
        ArrayList<aves> aves = new ArrayList<>();

        Scanner leia = new Scanner(System.in);

        int cadastro;
        int opcao;
        int classe;

        do {
            System.out.println("Você deseja cadastrar um novo animal? [1] Sim [2] Não");
            opcao = leia.nextInt();

            System.out.println("Esse animal é \n [3] Mamifero \n [4] Ave");
            classe = leia.nextInt();

            animais objAnimais = new animais();

            System.out.println("Digite o id para esse animal: ");
            objAnimais.setId(leia.nextInt());

            System.out.println("Digite o nome deste animal: ");
            objAnimais.setNome(leia.next());

            System.out.println("Digite o sexo: ");
            objAnimais.setSexo(leia.next());

            System.out.println("Digite a raça: ");
            objAnimais.setRaca(leia.next());

            System.out.println("Digite a cor: ");
            objAnimais.setCor(leia.next());

            if (classe == 3) {
                Mamifero objMamifero = new Mamifero();

                System.out.println("Digite o N° de patas:  ");
                objMamifero.setPatas(leia.nextInt());

                System.out.println("Digite o peso dele: ");
                objMamifero.setPeso(leia.nextDouble());

                // AQUI EU PRECISO COLOCAR O .ADD COMO FAÇO ISSO??

            } else {
                aves objAves = new aves();

                System.out.println("Digite o tamanho médio das penas: ");
                objAves.setTamanhoPenas(leia.nextInt());
                // AQUI EU PRECISO COLOCAR O .ADD COMO FAÇO ISSO??
            }

            // COMO FAÇO A CONTAGEM DE:

            // - Quantos mamíferos são do sexo masculino
            // - Quantas aves são do sexo feminino
            // - A quantidade total de animais cadastrados
            // - Quantos animais são pretos e os nomes deles

        } while (opcao == 2);

        System.out.println("Digite os dados do animal que você deseja cadastrar:");

    }
}
