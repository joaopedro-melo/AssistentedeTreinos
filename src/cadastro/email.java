
package cadastro;
import java.util.Scanner;

/**
 *
 * @author jpvol
 */
public class email {
    
    private String nome;
    private String login;
    private double peso;
    private double altura;
    private double sexo;
    private String escolhaObjetivo;
    
    
  //Construtor para Iniciar a Ficha do Atleta
    
    public email(String nome, String login, double peso){
        this.nome = nome;
        this.login = login;
        this.peso = peso;
        System.out.println("LOGIN CREATED "+ this.nome);
        
        this.escolhaObjetivo = gerarPlanilha();
    }
    //Método para apresentar as planilhas
    
    private String gerarPlanilha(){
        Scanner scn = new Scanner(System.in);
       System.out.println("Qual o seu objetivo? 1-Ganhar Peso 2-Manter Peso 3-Perder Peso");
       int objetivo = scn.nextInt();
       if(objetivo == 1){
        System.out.println("Sua sugestão de calorias diárias são "+ peso *40);
       }
       else if(objetivo == 2){
        System.out.println("Sua sugestão de calorias diárias são "+ peso *30);
       }
       else if (objetivo == 3){
        System.out.println("Sua sugestão de calorias diárias são "+ peso *25);
    } else { return "Não encontramos seu objetivo";
    }
 
    //Planilha de Treinos   
       
      System.out.println("Quantos dias por semana você treina?");
       int diasTreino = scn.nextInt();
       if(diasTreino <2){
           System.out.println("Você precisa ir mais para a academia");
       }else if(diasTreino == 3){
         System.out.println("Dividimos seus dias como A B C, A para Ombros e Braços, B para Pernas, C para Peito");           
        } else if(diasTreino <3) {
         System.out.println("Dividimos seus dias como A B C D, A para Ombros, B para Costas, C para Peito e triceps, D para Pernas");
        } else { return "Está indo muito bem";}
         
        return "Bom Treino";
          }
   
}