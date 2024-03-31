import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            mostrarMenu();
            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    somar();
                    break;
                case 2:
                    substrair();
                    break;
                case 3:
                    multiplicar();
                    break;
                case 4:
                    dividir();
                    break;
                case 5:
                    raizQuadrada();
                    break;
                case 6:
                    potencia();
                    break;
                case 7:
                    logaritmo();
                    break;
                case 8:
                    sair();
                    break;
                default:
                    System.out.println("Opção invalida!");
            }
        }
    }
    private static void mostrarMenu() {
        System.out.println("Iniciando Calculadora");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Raiz quadrada");
        System.out.println("6. Potenciação");
        System.out.println("7. Logaritmo");
        System.out.println("8. Fechar calculadora");
        System.out.print("Digite a opção desejada: ");
    }

    private static void somar(){
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.println("Resultado: "+ resultado);
    }

    private static void substrair(){
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 - num2;
        System.out.println("Resultado: "+ resultado);
    }

    private static void multiplicar(){
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 * num2;
        System.out.println("Resultado: "+ resultado);
    }

    private static void dividir(){
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 / num2;
        System.out.println("Resultado: "+ resultado);
    }

    private static void raizQuadrada(){
        System.out.println("Digite o número: ");
        double numero = scanner.nextDouble();
        double raizQuadrada = Math.sqrt(numero);
        System.out.println("Raiz quadrada de "+numero+" é: "+ raizQuadrada );
    }

    private static void potencia(){
        System.out.println("Digita a base: ");
        double base = scanner.nextDouble();
        System.out.println("Digite o expoente: ");
        double expoente = scanner.nextDouble();
        double potencia = Math.pow(base, expoente);
        System.out.println("Potencia: "+ potencia);
    }

    private static void logaritmo(){
        System.out.print("Digite o número: ");
        double numero = scanner.nextDouble();
        System.out.println("Logaritmo natural (base e): "+ Math.log(numero));
        System.out.println("Logaritmo de base 10: "+ Math.log10(numero));
    }

    private static void sair(){
        System.out.println("Finalizando Calculadora! Até logo");
        System.exit(0);
    }
}
