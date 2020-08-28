import java.util.ArrayList;
import java.util.List;

public class testing {


    public static void main(String[] args) {
        List<String> links = new ArrayList<>();
        String SI = String.valueOf(1);

        for (int i = 0; i < 10; i++) {
            int j = i + 1;
            links.add(i + " " + j);
            System.out.println(links);
            if (links.get(i).contains(SI)) {
                System.out.println("YES");
            }
        }
    }


}
