public class person {
    String name;
    int age;
    String university;
    int course;
    boolean is_active;
    String hobby;

    public person(String name, int age, String university, int course, boolean is_active, String hobby){
        this.name = name;
        this.age = age;
        this.university = university;
        this.course = course;
        this.is_active = is_active;
        this.hobby = hobby;
    }
    void said(){
        System.out.print("My name is " + name);
        if (is_active){
            System.out.println("Im active kid. ");
        } else {
            System.out.print(". Im only studying guy. ");
        }
        System.out.println("So Im from " + university + " " + course + " course. My hobby is " + hobby );
    }
}
