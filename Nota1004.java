package estruturaCondicional;
import java.util.Scanner;
public class Nota1004 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double Nota1;
		double Nota2;
		double Nota3;
		double Nota4;
		double media;
		
		System.out.println("Informe primeira nota");
        Nota1 = ler.nextDouble();  
        
        System.out.println("Informe segunda nota");
        Nota2 = ler.nextDouble();  
        
        System.out.println("Informe terceira nota");
        Nota3 = ler.nextDouble();  
        
        System.out.println("Informe quarta nota");
        Nota4 = ler.nextDouble();  
        
        media = (Nota1+ Nota2+ Nota3+ Nota4) /4;
        
        String msg = media >=7 ? "aprovado" : "reprovado";
        System.out.println(msg);
        
	}

}
