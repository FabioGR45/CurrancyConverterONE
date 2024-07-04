import com.google.gson.Gson;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CurrencyConverter converter = new CurrencyConverter();

        while (true) {

            for (int i = 0; i < 100; i++) {
                System.out.println();
            }

            System.out.println("*********************************************************************");
            System.out.println("Seja bem-vindo/a ao Conversor de Moeda =]" +
                               "\n\n0) Sair" +
                               "\n1) Converter Dólar Americano (USD) para Peso Argentino (ARS)" +
                               "\n2) Converter Peso Argentino (ARS) para Dólar Americano (USD)" +
                               "\n3) Converter Dólar Americano (USD) para Real (BRL)" +
                               "\n4) Converter Real (BRL) para Dólar Americano (USD)" +
                               "\n5) Converter Dólar Americano (USD) para Peso Colombiano (COP)" +
                               "\n6) Converter Peso Colombiano (COP) para Dólar Americano (USD)" +
                               "\n7) Converter Dólar Americano (USD) para Iene Japonês (JPY)" +
                               "\n8) Converter Iene Japonês (JPY) para Dólar Americano (USD)" +
                               "\n9) Converter Dólar Americano (USD) para Euro (EUR)" +
                               "\n10) Converter Euro (Eur) para Dólar Americano (USD)" +
                               "\n11) Ver Histórico de Conversões" +
                               "\n\nEscolha uma opção: ");
            System.out.println("*********************************************************************");
            int choice = scanner.nextInt();

            if(choice == 0) {
                System.out.println("Adeus! :)");
                System.exit(0);
            } else if(choice == 11){
                converter.printHistory();
                break;
            }

            System.out.print("Digite o valor: ");
            double amount = scanner.nextDouble();

            switch (choice) {
                case 1:
                    converter.convert("USD", "ARS", amount);
                    break;
                case 2:
                    converter.convert("ARS", "USD", amount);
                    break;
                case 3:
                    converter.convert("USD", "BRL", amount);
                    break;
                case 4:
                    converter.convert("BRL", "USD", amount);
                    break;
                case 5:
                    converter.convert("USD", "COP", amount);
                    break;
                case 6:
                    converter.convert("COP", "USD", amount);
                    break;
                case 7:
                    converter.convert("USD", "JPY", amount);
                    break;
                case 8:
                    converter.convert("JPY", "USD", amount);
                    break;
                case 9:
                    converter.convert("USD", "EUR", amount);
                    break;
                case 10:
                    converter.convert("EUR", "USD", amount);
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente.");
            }

            try {
                Thread.sleep(3000); // Dorme por 2000 milissegundos (2 segundos)
            } catch (InterruptedException e) {
                // Trata a exceção se a thread for interrompida
                e.printStackTrace();
            }
        }

    }
}