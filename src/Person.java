public class Person implements Comparable<Person>{
    //name, age, gender, occupation, occupation_list and frontliner
    private String name;
    private int age;
    private String gender;
    private String occupation;
    //frontliners which are doctocar, nurses, teacher and police.
    private String[] occupation_list = {"doctor", "nurse", "teacher", "police"};
    private boolean frontliner;


    //initialised with at least name and age
    /**multiple constructors*/
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String gender, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        for (int i = 0; i < occupation_list.length; i++) {
            if(occupation_list[i].equals(occupation))
                setFrontliner(true);
        }
    }
    /**getter n setter*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String[] getOccupation_list() {
        return occupation_list;
    }

    public void setOccupation_list(String[] occupation_list) {
        this.occupation_list = occupation_list;
    }


    /** Determine is it frontliner for the occupation*/
    public boolean isFrontliner() {
        return frontliner;
    }

    public void setFrontliner(boolean smtg) {
        frontliner = smtg;
    }

    @Override
    public int compareTo(Person o) {
        if (frontliner == o.frontliner)
            return age - o.age;
        else if (frontliner)
            return +1;
        else
            return -1;
    }
}
