import com.example.sdp.DrinkFactory;
import com.example.sdp.model.DrinkModel;

public class Cafe {

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("   WELCOME TO FACTORY PATTERN CAFE");
        System.out.println("========================================");
        System.out.println();

        DrinkFactory factory = new DrinkFactory();

        System.out.println(">>> Customer orders Coffee");
        DrinkModel coffee = factory.createDrink("coffee");
        if (coffee != null) {
            coffee.prepare();
            coffee.serve();
        }
        System.out.println();

        System.out.println(">>> Customer orders Tea");
        DrinkModel tea = factory.createDrink("tea");
        if (tea != null) {
            tea.prepare();
            tea.serve();
        }
        System.out.println();

        System.out.println(">>> Customer orders Chocolate");
        DrinkModel chocolate = factory.createDrink("chocolate");
        if (chocolate != null) {
            chocolate.prepare();
            chocolate.serve();
        }
        System.out.println();

        System.out.println(">>> Customer orders Juice");
        DrinkModel juice = factory.createDrink("juice");
        if (juice != null) {
            juice.prepare();
            juice.serve();
        }
        System.out.println();

        System.out.println("========================================");
        System.out.println("   THANK YOU FOR VISITING!");
        System.out.println("========================================");
    }
}