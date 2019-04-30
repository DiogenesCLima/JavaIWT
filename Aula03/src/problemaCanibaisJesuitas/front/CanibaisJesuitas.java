package problemaCanibaisJesuitas.front;

public class CanibaisJesuitas {
	int Lado1Canibais = 3;
	int Lado1Jesuitas = 3;
	
	int Lado2Canibais = 3;
	int Lado2Jesuitas = 3;
	
	public static void main(String args[]) {
		CanibaisJesuitas obj = new CanibaisJesuitas();
		
		while (obj.Lado1Canibais + obj.Lado1Jesuitas > 0) {
			//Logica de Movimentacao IA
			
			//Escolher viajantes
			String v1 = ""; String v2 = ""; String v3 = "";
			
			if (obj.Trasnferir("J", "C", "J") == "Ferrou") System.out.println("Game Over");
		}
	}
	
	public String Trasnferir(String viajante1, String viajante2, String viajanteRetorno) {
		String resultado = "Todo Mundo Vivo!";
		//Logica
		if (viajante1 == "J") {
			Lado1Jesuitas--;
			Lado2Jesuitas++;
		} else {
			Lado1Canibais--;
			Lado2Canibais++;
		}
		
		if (viajante2 == "J") {
			Lado1Jesuitas--;
			Lado2Jesuitas++;
		} else {
			Lado1Canibais--;
			Lado2Canibais++;
		}
		
		if (Lado1Canibais + Lado1Jesuitas == 0) {
			resultado = "Voce Venceu!";
		} else {
			if (viajanteRetorno == "J") {
				Lado1Jesuitas++;
				Lado2Jesuitas--;
			} else {
				Lado1Canibais++;
				Lado2Canibais--;
			}
			
			//controle
			if (Lado1Canibais > Lado1Jesuitas)
				resultado = "Ferrou";
			
			if (Lado2Canibais > Lado2Jesuitas)
				resultado = "Ferrou";
		}
		
		return resultado; 
	}
}