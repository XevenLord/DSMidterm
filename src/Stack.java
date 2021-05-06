import java.util.EmptyStackException;

public class Stack {
    private java.util.ArrayList<Person> list = new java.util.ArrayList<>();
    private String stack_name;

    public Stack(String stack_name) {
        this.stack_name = stack_name;
    }

    // push method should be when parameters such as name and age are passed to the methods,
    // the method automatically create an object person which stores such information. See Input for visualization
    /**All push methods*/
    public void push(String name, int age){
        Person obj = new Person(name, age);
        list.add(obj);
    }

    public void push(String name, int age, String gender){
        Person obj = new Person(name, age,gender);
        list.add(obj);
    }

    public void push(String name, int age, String gender,String occupation){
        Person obj = new Person(name, age, gender, occupation);
        list.add(obj);
    }

    public void push(Person obj){
        list.add(obj);
    }

    /**displayStack method*/
    public void displayStack(){
        System.out.println("----" + stack_name + "----");

        if(list.isEmpty())
            System.out.println("Empty stack");
        for(int i= list.size()-1; i>=0; i--){
            Person temp = list.get(i);
            if(temp == null){
                System.out.println("Empty stack");
            }
            else{
                System.out.print(i + " ");
                System.out.print(temp.getName() + " ");
                System.out.print(temp.getAge() + " ");
                System.out.print(temp.getGender() + " ");
                if(temp.isFrontliner()){
                    System.out.print("Frontliner");
                }
                else{
                    System.out.print("Not frontliner");
                }
                System.out.println();
            }
        }
    }

    /** Pop method*/
    public Person pop(){
        Person elements = list.get(list.size()-1);
        list.remove(list.size()-1);
        return elements;
    }

    public Person peek(){
        if (isEmpty())
            throw new EmptyStackException();
        return list.get( list.size()-1 );
    }

    /** getSize */
    public int getSize(){
        return list.size();
    }

    /** isEmpty */
    public boolean isEmpty(){
        return list.isEmpty();
    }
}
