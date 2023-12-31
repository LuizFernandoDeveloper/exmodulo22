import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        List<Pessoa> listPessoa = new ArrayList<>();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Você vai digitar quantos nomes: ");
        int quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite um nome e um sexo, logo abixo!");
        while(quantity > 0){
            System.out.print("Digite um nome: ");
            String name = sc.nextLine();
            System.out.print("Digite o sexo desta pessoa. M para macho e F para femea: ");
            String sexo = sc.nextLine().toUpperCase();
            Pessoa pessoa = new Pessoa(name, sexo);
            listPessoa.add(pessoa);
            quantity --;
        }

        System.out.println("_____Lista de mulheres_______");
        List<Pessoa>listPessoa2 = Pessoa.getListSexo(listPessoa, "M");
        listPessoa2.forEach(x -> System.out.println(x));
        System.out.println();
        System.out.println("_____Lista de homens_______");
        List<Pessoa> listPessoas3 = Pessoa.getListSexo(listPessoa, "F");
        listPessoas3.forEach(x -> System.out.println(x));
        sc.close();
    }
}
