import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Person> persons = new ArrayList<>();
    static ArrayList<Project> projects = new ArrayList<>();
    static ArrayList<Team> teams = new ArrayList<>();


    public static void main(String[] args) {


        int counter = 1; // Variável utilizada para ajudar a contar e exibir informações para o usuário
        int userInput = 0; // Variável que é reutilizada em vários momentos para armazenar o input do usuário

        String tempName = ""; // Variável temporaria para quando for instanciar um objeto que precisa de um nome
        String tempCPF = "";
        String tempEmail = "";
        String tempLogin = "";
        String tempPassword = "";
        String tempDescription = "";
        String tempStartDate = "";
        String tempEndDate = "";
        String tempStatus = "";


        System.out.println("Bem vindo ao gerenciador de projetos");
        System.out.println("O primeiro passo é cadastrar todos os funcionários envolvidos nos projetos");
        System.out.println("quantas pessoas você gostaria de cadastrar?");
        Scanner scanner = new Scanner(System.in); //Objeto que permite ler entrada de dados
        userInput = scanner.nextInt(); //Leitura de um int inserido pelo usuário
        scanner.nextLine(); // Serve para ler a próxima linha, mas nesse caso foi incluido para evitar um bug conhecido quando utilizado Scanner para ler um int e em seguida uma string

        for (int i = 0; i < userInput; i++) {
            System.out.println("Por favor, informe alguns dados do " + counter + "º funcionário");
            counter++; //aumentando o contador após um iteração do laço for

            System.out.println("Nome Completo: ");
            tempName = scanner.nextLine(); //alocando o nome na variavel auxiliar

            System.out.println("CPF: ");
            tempCPF = scanner.nextLine();

            System.out.println("Email: ");
            tempEmail = scanner.nextLine();

            System.out.println("Login: ");
            tempLogin = scanner.nextLine();

            System.out.println("Password: ");
            tempPassword = scanner.nextLine();


            Administrator administrator = new Administrator(tempName, tempCPF, tempEmail, tempLogin, tempPassword); // Instanciando um objeto da classe administador e incluindo a varivel auxiliar de nome como parametro para o objeto
            persons.add(administrator); //adicionando o objeto recem criado a uma arraylist que será utilizada posteriormente

        }

        counter = 1; // retornando o contador de volta ao 1 para ser reutilizado depois
        System.out.println("Agora vamos cadastrar os projetos, quantos projetos você quer cadastrar?");
        userInput = scanner.nextInt();
        scanner.nextLine(); // relembrando que esse leitor é apenas para evitar um bug

        for (int i = 0; i < userInput; i++) {
            System.out.println("Por favor, informe alguns dados do " + counter + "º projeto");
            counter++;

            System.out.println("Nome do projeto: ");
            tempName = scanner.nextLine();

            System.out.println("Descrição do projeto: ");
            tempDescription = scanner.nextLine();

            System.out.println("Data de inicio: ");
            tempStartDate = scanner.nextLine();

            System.out.println("Data de termino prevista : ");
            tempEndDate = scanner.nextLine();

            System.out.println("Status do projeto: ");
            tempStatus = scanner.nextLine();

            Project project = new Project(tempName, tempDescription, tempStartDate, tempEndDate, tempStatus); //similar ao que foi feito para o objeto administrador, utilizando a variável auxiliar de nova como parâmetro instanciamos um novo objeto de projeto
            projects.add(project);

        }

        counter = 1;

        System.out.println("Agora vamos criar novas equipes, quantas equipes você deseja criar?");
        userInput = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < userInput; i++) {
            System.out.println("Por favor, informe o nome da " + counter + "ª equipe");
            counter++;
            tempName = scanner.nextLine();

            Team team = new Team(tempName);
            teams.add(team);

            System.out.println("Agora vamos adicionar pessoas as equipes, veja a lista abaixo");


            for (int j = 0; j < persons.size(); j++){
                int moreReadableCounter = 0; // novamente uma variavel apenas para tornar as coisas mais legiveis
                moreReadableCounter += j + 1; // aqui aumentamos a variavel em 1, já que o Java sempre começa a contar do 0 podendo causar algumas confusões
                System.out.println(moreReadableCounter + ": " + persons.get(j).getCompleteName());
            }

            System.out.println("Digite o numero do funcionario que você deseja adicionar a equipe");
            userInput = scanner.nextInt();
            userInput -=1; // considerando que alteriormente aumentados o valor em 1 para tornar mais legivel, agora reduzimos esse valor para o código ser coerente
            teams.get(i).AddMember(persons.get(userInput));
            scanner.nextLine();

        }

        scanner.close(); // Fechando o scanner, não é algo necessário, mas é um bom habito para evitar consumir recursos desnecessários em programas mais complexos
        System.out.println("Programa terminado");
    }

}