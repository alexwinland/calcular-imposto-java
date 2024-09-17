import java.util.Scanner;

public class CalcularImposto {

    public static void main(String[] args) {
        // Cria um Scanner para ler a entrada do usuário
        Scanner leitorDeEntradas = new Scanner(System.in);

        try {
            // Solicita ao usuário para inserir o salário
            System.out.print("Digite o valor do salário: ");
            float valorSalario = leitorDeEntradas.nextFloat();

            // Solicita ao usuário para inserir o valor dos benefícios
            System.out.print("Digite o valor dos benefícios: ");
            float valorBeneficios = leitorDeEntradas.nextFloat();

            // Calcula o valor do imposto com base no salário
            float valorImposto;
            if (valorSalario >= 0 && valorSalario <= 1100) {
                valorImposto = 0.05f * valorSalario;
            } else if (valorSalario >= 1101 && valorSalario <= 2500) {
                valorImposto = 0.10f * valorSalario;
            } else {
                valorImposto = 0.15f * valorSalario;
            }

            // Calcula o valor final após o imposto e adiciona os benefícios
            float saida = valorSalario - valorImposto + valorBeneficios;

            // Exibe o resultado formatado com 2 casas decimais
            System.out.println(String.format("O valor final após impostos e benefícios é: %.2f", saida));
            
        } finally {
            // Fecha o Scanner para liberar recursos
            leitorDeEntradas.close();
        }
    }
}
