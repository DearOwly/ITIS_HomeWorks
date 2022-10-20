public class timetable {
    int count;
    String hard_lesson;
    String easy_lesson;
    String most_favourite;
    int count_days;
    boolean count_dop_lesson;

    public timetable(int count, String hard_lesson, String easy_lesson, String most_favourite, int count_days, boolean count_dop_lesson){
        this.count = count;
        this.hard_lesson = hard_lesson;
        this.easy_lesson = easy_lesson;
        this.most_favourite = most_favourite;
        this.count_days= count_days;
        this.count_dop_lesson = count_dop_lesson;
    }
    void check_students_study(){
        System.out.print("Student has " + count + " lessons by the week. Most hard for him: " + hard_lesson);
        System.out.print(". Most easy: " + easy_lesson + ". Most favourite for him " + most_favourite);
        System.out.print(". He study " + count_days + " days at the week.");
        if (count_dop_lesson){
            System.out.print("  Student has dop exams");
        } else {
            System.out.print("  Student hasnt dop exams");
        }
    }


}
