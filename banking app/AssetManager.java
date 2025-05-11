import java.util.*;

public class AssetManager {
    private List<Asset> assets = new ArrayList<>();

    public void addAsset() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Asset Type:");
        System.out.println("1. Stocks");
        System.out.println("2. Real Estate");
        System.out.println("3. Crypto");
        System.out.println("4. Gold");
        System.out.print("Enter choice: ");
        String choiceStr = scanner.nextLine();

        String assetType = "";
        switch (choiceStr) {
            case "1": assetType = "Stocks"; break;
            case "2": assetType = "Real Estate"; break;
            case "3": assetType = "Crypto"; break;
            case "4": assetType = "Gold"; break;
            default: System.out.println("Invalid choice."); return;
        }

        // Display fields to input asset details
        System.out.print("Enter asset name (required): ");
        String name = scanner.nextLine();
        System.out.print("Enter asset amount/value (required): ");
        String amountStr = scanner.nextLine();

        // Validation: Check if required fields are empty
        if (name.isEmpty() || amountStr.isEmpty()) {
            System.out.println("Please fill in all required fields.");
            return;
        }

        float amount;
        try {
            amount = Float.parseFloat(amountStr);
        } catch (NumberFormatException e) {
            System.out.println("Invalid amount. Please enter a number.");
            return;
        }

        // Add asset
        Asset asset = new Asset(assetType, name, amount);
        assets.add(asset);
        System.out.println("Asset added successfully!");
    }
}