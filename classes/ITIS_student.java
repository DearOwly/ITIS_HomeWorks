class ITIS_student extends person{
    String language;
    public ITIS_student(String name, int course, String language, boolean hungry, int how_many_lessons_have_today, boolean window){
        super(name,course,hungry, how_many_lessons_have_today, window);
        this.language = language;
    }
    public void say_info(){
        System.out.println("Im from ITIS I learn " + language);
    }
}