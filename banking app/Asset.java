public class Asset {
    private String type; // Stocks, Real Estate, Crypto, Gold
    private String name; // e.g., Stock symbol, property name, etc.
    private float amount; // e.g., number of shares, value, etc.

    public Asset(String type, String name, float amount) {
        this.type = type;
        this.name = name;
        this.amount = amount;
    }

    // Getters and setters...
}