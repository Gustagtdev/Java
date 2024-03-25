package dominio;

public class aluno_media{
	private String nome;
	
	private float nota1;
	
	private float nota2;
	
	public aluno_media(String nome,float nota1,float nota2){
		super();
		this.nome= nome;
		this.nota1= nota1;
		this.nota2= nota2;
		
		
	}
	public String getNome() {
		return nome;
	}
	public float getNota1() {
		return nota1;
	}
	public float getNota2() {
		return nota2;
		
	}
	public float media() {
		float media= (nota1+nota2)/2;
		return media;
	}

}
