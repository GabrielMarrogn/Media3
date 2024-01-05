import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float nota = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3= sc.nextFloat();
        float nota4 = sc.nextFloat();
        

        float media = ((nota * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1))/10;

        if(media >= 7){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno aprovado.");
        }else if(media < 5){
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno reprovado.");
        }else{
            System.out.printf("Media: %.1f\n", media);
            System.out.println("Aluno em exame.");
            float nota5 = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", nota5);
            float media2 = (media + nota5) / 2;
            if(media2 > 5){
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f\n", media2);
            }else if(media2 < 5){
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f\n", media2);
            }

        }

        sc.close();
    }
}
