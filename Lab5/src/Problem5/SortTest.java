package Problem5;

public class Test {
    public static void main(String[] args){
        Chocolate[] chocolates = {
                new Chocolate("Twix", 50.5),
                new Chocolate("Snickers",45.0),
                new Chocolate("Bounty", 55.2)
        };

        System.out.println("---- Before the Sorting ---");
        for(Chocolate c:chocolates){
            System.out.println(c.toString());
        }

        Sort.bubbleSort(chocolates);

        System.out.println("--- After the Sorting ---");
        for(Chocolate c:chocolates){
            System.out.println(c.toString());
        }
    }
}
