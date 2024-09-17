# Calculador de Impostos em Java 🧮💰

Olá, pessoal! 👋 Se você sempre quis saber quanto realmente vai levar pra casa depois dos impostos e benefícios, este código em Java vai te ajudar! Ele faz todo o trabalho pesado para você. Vamos conferir como funciona essa belezura?

## O Que Este Código Faz?

Este código Java é como um assistente pessoal digital que calcula o quanto você vai receber após o imposto e adicionar seus benefícios. 🚀

### O Que Acontece Passo a Passo:

1. **Pede Seu Salário**:
   - Primeiro, o programa pede para você informar o valor do seu salário. Sim, aquele valor que faz o seu trabalho valer a pena!

2. **Pede Seus Benefícios**:
   - Depois, ele solicita o valor dos seus benefícios. Pode ser um bônus, vale-alimentação ou qualquer outra coisa boa que você recebe.

3. **Calcula o Imposto**:
   - O código calcula o imposto com base no seu salário:
     - **0 a 1100**: Você paga 5% de imposto.
     - **1101 a 2500**: O imposto é 10%.
     - **Acima de 2500**: O imposto é de 15%.
   - Assim, ele calcula quanto você vai pagar de imposto sem dor de cabeça!

4. **Calcula o Valor Final**:
   - Por fim, o programa calcula o valor final que você vai receber depois de descontar o imposto e adicionar os benefícios.

5. **Exibe o Resultado**:
   - Ele exibe o valor final formatado com duas casas decimais. Porque todo centavo conta! 💵

## Como Usar

1. **Compilação**:
   - Abra o terminal ou prompt de comando e compile o código usando o comando:
     ```bash
     javac CalcularImposto.java
     ```

2. **Execução**:
   - Após compilar, execute o programa com o comando:
     ```bash
     java CalcularImposto
     ```

3. **Digite os Valores**:
   - Siga as instruções e insira seu salário e benefícios quando solicitado. O programa faz o resto!

## Exemplo de Execução

Aqui está como pode ser a sua experiência:

```plaintext
Digite o valor do salário: 2000
Digite o valor dos benefícios: 300
O valor final após impostos e benefícios é: 1900.00
