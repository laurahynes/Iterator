
import java.util.ArrayList;

public class Sample {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        
        list.add("a");//go to end
        list.add("b");//to end
        list.add(1, "c");//go to loc 1
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.set(1, "e");
        
        for (String lett : list) {
            System.out.println(lett);
        }
        
        list.add("f");//go to end
        list.remove(2);//get rid of b
        for (String string : list) {
            System.out.println(string);
        }
    }
    
}
