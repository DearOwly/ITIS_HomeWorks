class p{
    public static void main(String[] args) {
        person student  = new person("noname", 17, "ITIS", 1, false, "Write codes");
        student.said();
        timetable students = new timetable(18, "Algem", "Programming", "Programming", 5, false);
        students.check_students_study();
    }
}