void main() {

    /*
    Tipos Primitivos do Java:
        byte = -128 ~ 127
        short = -32768 ~ 32768
        int = -2147483648 ~ 2147483648
        long = maior que o int e tem "L" no final

        float = -1,4024E-37f ~ 3,4028E+38f
        double = -4,94E-307 ~ 1,79E+308

        char = '\u0000' ~ '\uFFFF'

        boolean = {false, true}
    */
    /*
    Identificador de tipagem do printf:
        %f = float
        %d = int
        %s = String
        %n = \n
     */

    // Localização do programa
    Locale.setDefault(Locale.US);

    byte age = 21;
    String name = "Eduardo";
    float salario = 3500f;

    IO.println("Welcome: " + name +
                "\nThis is your age: " + age);


    System.out.printf("Seu salário é de: R$ " + "%.2f%n", salario);
    System.out.printf("Seu salário é de: %.2f Reais%n", salario);
    }
