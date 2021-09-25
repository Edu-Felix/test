package eduardofelix;

public class Hablitacao {

	public static void main(String[] args) {
	String nome =" Lorenzo ";	
	int idade = 18;	
	int idadePermitida =  33 ;
	boolean emancipado =true;

	// valida a primeira ou a segunda condicao
	if(idade >= idadePermitida || emancipado ) {
		
		System.out.println("voce pode tirar habilitacao " +nome);
		
		
		
	}else {
		 System.out.println("voce nao pode tirar habilitaçao " + nome); 
	}
			

	
	}

}
