package controle;
import dominio.aluno_media;
import java.util.Scanner;

public class aluno_media_controle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner leia= new Scanner(System.in);
	

	System.out.println("Digite o nome:"); 
	String nome= leia.nextLine();
	System.out.println("Olá "+nome);
	
	System.out.println("Digite o valor da 1° nota:");
	float nota1= leia.nextFloat();
	System.out.println("O valor é:" +nota1);
	
	System.out.println("Digite o valor da 2° nota:");
	float nota2= leia.nextFloat();
	System.out.println("O valor é:" +nota2);
	
	leia.close();
	
	aluno_media aluno_media= new aluno_media(nome,nota1,nota2);
	System.out.println("O resultado é:"+aluno_media.media());

	}
		
}
