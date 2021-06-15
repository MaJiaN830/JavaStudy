package cn.duanchangs.Poly.PolyArray;

public class PolyArr {

    public static void main(String[] args) {
//        Person person = new Person();
//        Student studentOne = new Student();
//        Student studentTwo = new Student();
//        Teacher teacherOne = new Teacher();
//        Teacher teacherTwo = new Teacher();
//
//        Person arr[] = {person, studentOne, studentTwo, teacherOne, teacherTwo};

        Person[] arr = new Person[5];

        arr[0] = new Person();
        arr[1] = new Student();
        arr[2] = new Student();
        arr[3] = new Teacher();
        arr[4] = new Teacher();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Student) {
//                Student(arr[i]).study();
                Student s = (Student) arr[i];
                s.study();
            } else if (arr[i] instanceof Teacher) {
                Teacher t = (Teacher) arr[i];
                t.teach();
            } else {
                System.out.println("无特有方法");
            }
        }



    }

}
