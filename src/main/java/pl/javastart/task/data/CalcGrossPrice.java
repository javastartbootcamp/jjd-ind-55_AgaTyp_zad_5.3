package pl.javastart.task.data;

public class CalcGrossPrice {

    public double calculate(Product product) {

        double price;

        if (product.getCategory() == null) {
            price = product.getNetPrice() + product.getNetPrice() * 0.23;
        } else {
            price = switch (product.getCategory()) {
                case "Nabiał", "Warzywa" -> product.getNetPrice() + product.getNetPrice() * 0.00;
                case "Woda" -> product.getNetPrice() + product.getNetPrice() * 0.05;
                default -> product.getNetPrice() + product.getNetPrice() * 0.23;
            };
        }

        return price;
    }
}
