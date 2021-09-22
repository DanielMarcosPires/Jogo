import java.util.Scanner;

public class Sistema {

    private String nome;
    public Sistema(int p,String n) {
        Scanner scan = new Scanner(System.in);
        p = 0;
        System.out.printf("Bem vindo: <%s> \nvoçê acabou de entrar no jogo de pergunta e respostas deseja começar\n------\n Jogador(a) %s\n Pontos Restantes <%d> \n Pressione S para continuar ",n,n,p);
        
        String s = scan.nextLine();
        if(s.equals("S")|| s.equals("s")){
            System.out.println("----------------------------");
            System.out.println(n+" Qual a capital do Brasil?");
            System.out.print("> ");
            s = scan.nextLine();
            if(s.equals("Brasilia")||s.equals("brasilia")){
                p++;
                System.out.println("Você pontuou! 1+");
                System.out.println("----------------------------");
                System.out.printf("parabéns <%s> agora você possuí: <%d> pontos\n",n,p);
                System.out.println("----------------------------");
                System.out.printf("<%s> voçê deseja Continuar? (Sim) ou Desistir?(D)\n>",n);
                s = scan.nextLine();
               if(s.equals("Sim")||s.equals("sim")){
                   //proxima pergunta
                   System.out.printf("\n<%s> Você está indo muito bem! \n Ótimo. bora para próxima pergunta:\n",n);
                System.out.println();
                System.out.println("Agora é uma pergunta de Matemática");
                System.out.println("Quantos é 200/5");
                int i = scan.nextInt();
                if(i == 40){
                    p++;
                    System.out.println("Meus parabéns você pontuou +1");
                    System.out.printf("<%s> agora voçê possuí: <%d>",n,p);
                }else{
                    p--;
                    System.out.println("Que pena. Voçê errou! e perdeu -1 pontos");
                    System.out.printf("Pontos total de <%s> são <%d>.\n",n,p);
                }

               }else{
                   System.out.printf("<%s> Saiu do jogo\n pontos obtido <%d>",n,p);
               }
            }else{
                System.out.printf("Acabou o jogo...\n Você pontuou <%d>",p);
            }
        }else{
            System.out.printf("Acabou o jogo...\n Você pontuou <%d>",p);
        }
    }
}
