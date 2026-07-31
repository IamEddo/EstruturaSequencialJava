void main() {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    String product1;
    String product2;
    String name;
    byte age;
    short code;
    char gender;
    float price1;
    float price2;
    double measure;
    byte decPlaces;


    System.out.println("Products:\n");

    System.out.println("Product 1:");
        product1 = sc.nextLine();

    System.out.println("Price 1:");
        price1 = sc.nextFloat();

    sc.nextLine();

    System.out.println("Product 2:");
        product2 = sc.nextLine();

    System.out.println("Price 2:");
        price2 = sc.nextFloat();

    IO.println("\n" + product1 + ", which price is $" + price1);
    IO.println(product2 + ", which price is $" + price2 + "\n");

    float total = price1 + price2;
    IO.println("Total: $" + price1 + " + $" + price2 + " = $" + total + "\n");

    sc.nextLine();

    IO.println("Your name: ");
    name = sc.nextLine();

    IO.println("Your age: ");
    age = sc.nextByte();

    IO.println("Your code: ");
    code = sc.nextShort();

    IO.println("Your gender (M / F): ");
    gender = sc.next().charAt(0);

    IO.println("\nWelcome " + name +
            "! You have " + age +
            " years old, and you are the " + gender +
            " gender. There is your code: " + code);

    IO.println("\nPut the measure: ");
        measure = sc.nextDouble();
    IO.println("\nNow, put how much decimal places you want: ");
        decPlaces = sc.nextByte();

    System.out.printf("\nMeasure with %d decimal places: %." + decPlaces + "f\n", decPlaces, measure);
    sc.close();
}
