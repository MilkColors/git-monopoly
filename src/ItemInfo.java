import java.util.*;
public class ItemInfo {
    private String itemName;




    public String getName() {
        return  itemName;
    }

    public double getCost(){
    return 0.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the item: ");
        String item = input.nextLine();
    }
}