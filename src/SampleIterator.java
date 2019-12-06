
import java.util.ArrayList;
import java.util.ListIterator;

public class SampleIterator {

    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList();
        ListIterator it = x.listIterator();
        it.add("a");
        it.add("b");
        it.add("c");
        it.previous();
        it.previous();
        it.previous();
        showList(x, it);
        System.out.println("\nMove 1 - travelling next over " + it.next());
        showList(x, it);
        System.out.println("\nMove 2 - travelling next over " + it.next());
        showList(x, it);
        System.out.println("\nMove 3 - removing last thing travelled over");
        it.remove();
        showList(x, it);
        System.out.println("\nMove 4 - adding b to left of iterator ");
        it.add("b");
        showList(x, it);
        System.out.println("\nMove 5 - travelling next over " + it.next());
        showList(x, it);
        System.out.println("\nMove 6 - travelling backwards over " + it.previous());
        showList(x, it);
        System.out.println("\nMove 7 - removing last thing travelled over");
        it.remove();
        showList(x, it);
        System.out.println("\nMove 8 - travelling backwards over " + it.previous());
        showList(x, it);

        System.out.println("Move 9 - modifying last thing: b to e");
        it.set("e");
        showList(x, it);

        System.out.println("Move 10 & 11 - adding b and c to LEFT of iterator");
        it.add("b");
        it.add("c");
        showList(x, it);

        System.out.println("\nMove 12 will cause error - can't remove unless next or previous first");
        try {
            it.remove();
            showList(x, it);
        } catch (Exception e) 
            {
                System.out.println(e);
            }
        
        System.out.println("\nMove 13 - travelling next over " + it.next());
        showList(x, it);
        
        System.out.println("\nMove 14 will cause error - can't go next if at the end of list");
        try {
            it.next();
            showList(x, it);
        } catch (Exception e) 
            {
                System.out.println(e);
            }
        
        System.out.println("\nBonus move - travel with iterator to front of the list");
        
        while(it.hasPrevious())it.previous();
        showList(x, it);
        }
    
    

    public static void showList(ArrayList list, ListIterator it) {
        for (int i = 0; i < list.size(); i++) {
            if (it.hasPrevious() == false && i == 0) {
                System.out.print("*|");
            }
            System.out.print(list.get(i) + "|");
            if (i == it.previousIndex()) {
                System.out.print("*|");
            }

        }
        System.out.println("\n----------------------");
    }

}
