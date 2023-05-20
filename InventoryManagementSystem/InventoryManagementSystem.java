import java.io.*;
import java.util.*;

public class InventoryManagementSystem {
    private static final String INVENTORY_FILE = "inventory.txt";

    private Map<String, Integer> inventory;

    public InventoryManagementSystem() {
        inventory = new HashMap<>();
        loadInventory();
    }

    public void addItem(String itemName, int quantity) {
        if (inventory.containsKey(itemName)) {
            int currentQuantity = inventory.get(itemName);
            inventory.put(itemName, currentQuantity + quantity);
        } else {
            inventory.put(itemName, quantity);
        }
        saveInventory();
        System.out.println("Item added successfully.");
    }

    public void removeItem(String itemName, int quantity) {
        if (inventory.containsKey(itemName)) {
            int currentQuantity = inventory.get(itemName);
            if (currentQuantity >= quantity) {
                inventory.put(itemName, currentQuantity - quantity);
                saveInventory();
                System.out.println("Item removed successfully.");
            } else {
                System.out.println("Insufficient quantity. Cannot remove item.");
            }
        } else {
            System.out.println("Item does not exist in inventory.");
        }
    }

    public void displayInventory() {
        System.out.println("Inventory:");
        System.out.println("----------");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("----------");
    }

    private void loadInventory() {
        try (BufferedReader reader = new BufferedReader(new FileReader(INVENTORY_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                String itemName = parts[0].trim();
                int quantity = Integer.parseInt(parts[1].trim());
                inventory.put(itemName, quantity);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Inventory file not found. Starting with empty inventory.");
        } catch (IOException e) {
            System.out.println("Error reading inventory file. Starting with empty inventory.");
        }
    }

    private void saveInventory() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(INVENTORY_FILE))) {
            for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving inventory file.");
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem system = new InventoryManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Inventory Management System");
            System.out.println("---------------------------");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. Display inventory");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String addItemName = scanner.next();
                    System.out.print("Enter quantity: ");
                    int addQuantity = scanner.nextInt();
                    system.addItem(addItemName, addQuantity);
                    break;
                case 2:
                    System.out.print("Enter item name: ");
                    String removeItemName = scanner.next();
                    System.out.print("Enter quantity: ");
                    int removeQuantity = scanner.nextInt();
                    system.removeItem(removeItemName, removeQuantity);
                    break;
                case 3:
                    system.displayInventory();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
