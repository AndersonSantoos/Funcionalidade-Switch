

public class SwitchSemBreak {

	public static void main(String[] args) {

		String faixa = "preta"; // Aqui eu escolho qual eu quero acionar.
								// Sem o break ele a IDE vai executar todos os códigos.
		switch (faixa.toLowerCase()) { // toLowerCase é para ignorar letras maiúsculas e minúsculas.
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan...");
		case "roxa":
			System.out.println("Sei o Heain Godan...");
		case "verde":
			System.out.println("Sei o Heian Yodan...");
		case "laranja":
			System.out.println("Sei o Heian Sandan...");
		case "vermlha":
			System.out.println("Sei o Heian Nidani...");
		case "amarela":
			System.out.println("Sei o Heain Shodan...");
			break;
		default:
			System.out.println("Não sei nada");
		}
		System.out.println("Fim");

		int opcoesDeRefeicao = 3;
		switch (opcoesDeRefeicao) {
		case 3:
			System.out.println("Feijão, arroz, salada, batata fria e susco");
			break;
		case 2:
			System.out.println("Feijão, arroz, salada e batata frita");
			break;
		case 1:
			System.out.println("Feijão, arroz e salada");
			break;
		case 0:
			System.out.println("Feijão e arroz");
			break;

		}

	}

}
