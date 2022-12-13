package pl.javastart.task;

import pl.javastart.task.data.CalcGrossPrice;
import pl.javastart.task.data.Product;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Mleko Łaciate", "mleko w kartonie 1L", 3.20, "Nabiał");
        Product product2 = new Product("Ser morski", "ser żółty 250g", 4.35, "Nabiał");
        Product product3 = new Product("Coca-cola", "butelka 1L", 3.20, "Napoje gazowane");
        Product product4 = new Product("Woda gazowana", "butelka 1L", 1.20, "Woda");
        Product product5 = new Product("Czekolada gorzka", "czekolada Wedel 200g", 2.80);

        CalcGrossPrice calcGrossPrice = new CalcGrossPrice();
        
        System.out.printf("%s cena brutto: %.2f zł\n", product1.getName(), calcGrossPrice.calculate(product1));
        System.out.printf("%s cena brutto: %.2f zł\n", product2.getName(), calcGrossPrice.calculate(product2));
        System.out.printf("%s cena brutto: %.2f zł\n", product3.getName(), calcGrossPrice.calculate(product3));
        System.out.printf("%s cena brutto: %.2f zł\n", product4.getName(), calcGrossPrice.calculate(product4));
        System.out.printf("%s cena brutto: %.2f zł\n", product5.getName(), calcGrossPrice.calculate(product5));

    }
}
