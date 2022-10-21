class person{
    String name;
    int course;
    boolean hungry;
    int how_many_lessons_have_today;
    boolean window;
    person(String name, int course, boolean hungry, int how_many_lessons_have_today, boolean window){
        this.name = name;
        this.course = course;
        this.hungry = hungry;
        this.how_many_lessons_have_today =  how_many_lessons_have_today;
        this.window = window;

    }
    void dialog(){
        if (how_many_lessons_have_today >= 4){
            System.out.print("I have a lot of lessons today. Its really hard day. ");
        }
        if (hungry){
            System.out.print("btw Im so hungry. ");
        } else {
            System.out.print("But Im not hungry today. ");
        }
        if (window && hungry){
            System.out.print("so Im going to eat at the window. ");
        }
        if (hungry && (window = false)){
            System.out.print("but I have no time for this. ");
        }
    }
}