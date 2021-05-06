import java.util.ArrayList;
import java.util.Collections;

public class TesterClass {
    public static void main(String[] args) {
        //Part A copy paste from question
        Stack raw = new Stack("Raw list");
        raw.push("ali",32,"m","doctor");
        raw.push("lisa",29,"f","nurse");
        raw.push("tanaka",41);
        raw.push("ahmad",18,"m","developer");
        raw.push("maria",20,"f","accountant");
        raw.push("chong",70,"m","lawyer");
        raw.push("raju",55,"m","police");
        raw.push("alex",16,"f","business man ");
        Person katie = new Person("katie",36,"f","teacher");
        raw.push(katie);
        raw.displayStack();
        System.out.println();

        //Part B
        Stack frontliners = new Stack("Frontliners");
        Stack others = new Stack("Others");
        //determine whether person in raw is frontliner or not
        // YES : go frontliner stack
        // NO : go others stack
        while(!raw.isEmpty()){
            Person p = raw.pop();
            if (p.isFrontliner())
                frontliners.push(p);
            else
                others.push(p);
        }
        System.out.println("~~~~~~~Sort into frontliners and others~~~~~");
        raw.displayStack();
        System.out.println("-------------------");
        frontliners.displayStack();
        System.out.println("-------------------");
        others.displayStack();
        System.out.println("-------------------");
        System.out.println();

        //Part C
        Stack priority = new Stack("Vaccine Priority List");
        initializePriority( priority, frontliners, others);
        others.displayStack();
        System.out.println("-------------------");
        frontliners.displayStack();
        System.out.println("-------------------");
        priority.displayStack();

    }

    private static void initializePriority(Stack priority, Stack frontliners, Stack others) {
        ArrayList<Person> all = new ArrayList<>();
        while (!frontliners.isEmpty())
            all.add(frontliners.pop());
        while (!others.isEmpty())
            all.add(others.pop());

        Collections.sort(all);

        for (int i = 0; i < all.size(); i++)
            priority.push(all.get(i));
    }
}
