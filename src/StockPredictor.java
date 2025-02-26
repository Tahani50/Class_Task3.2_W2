// Predicts when stock will run out based on average daily sales.
public class StockPredictor {

    public static void predictStock(Product product, int avgSales) {
        int days = 0;
        if (avgSales == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }else{
            days = product.getStockLevel() / avgSales;
        }

        String restockSuggestion = restockingSuggestion(days, product.getReorderThreshold());

        System.out.println("Stock Prediction for " + product.getName() + ":");
        System.out.println("Days until stock out: " + days);
        System.out.println("Restock Suggestion: " + restockSuggestion);
    }

    // Suggests a restocking strategy.
    public static String restockingSuggestion(int days, int reorderThreshold) {
        if (days <= reorderThreshold) {
            return "Critical: Stock is insufficient.";
        } else if (days <= reorderThreshold * 2) {
            return "Moderate: Consider restocking soon.";
        } else {
            return "Stable: Stock is sufficient.";
        }
    }
}

