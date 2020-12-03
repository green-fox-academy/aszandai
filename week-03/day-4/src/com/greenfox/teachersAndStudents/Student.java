package com.greenfox.teachersAndStudents;

public class Student {
        //- Create `Student` and `Teacher` classes
        //- `Student`
        //  - `learn()` -> prints the student is learning something new
        //  - `question(teacher)` -> calls the teachers answer method
        //- `Teacher`
        //  - `teach(student)` -> calls the students learn method
        //  - `answer()` -> prints the teacher is answering a question
        //- Instantiate a `Student` and `Teacher` object
        //- Call the student's `question()` method and the teacher's `teach()` method

    public void learn(){
        System.out.println("Ooookay, we'll study...");
    }

    public void question(Teacher teacher) {
        System.out.println("Can you help me?");
        teacher.answer();
    }

    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        student.question(teacher);
        System.out.println();
        teacher.teach(student);

    }
}
