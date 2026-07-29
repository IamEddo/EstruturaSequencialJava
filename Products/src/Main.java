void main() {
    Locale.setDefault(Locale.US);

    String product1 = "Coffee";
    String product2 = "Milk";
    byte age = 21;
    short code = 7215;
    char gender = 'M';
    float price1 = 2300.0f;
    float price2 = 574.50f;
    double measure = 61.12596357;
    float total = price1 + price2;

    IO.println("Products:\n");
    System.out.printf(product1 + ", which price is $%.2f%n", price1);
    IO.println(product2 + ", which price is $" + price2 + "\n");
    IO.println("Total: $" + price1 + " + $" + price2 + " = $" + total + "!\n");

    IO.println("Record: " + age + " years old, code " + code + " and gender: " + gender + "\n");

    System.out.printf("Measure with five decimal places: %.5f", measure);
}
