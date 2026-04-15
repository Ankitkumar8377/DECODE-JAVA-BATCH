public class Marks {
    public static class StudentData {
        String name;
        int rno;
        int[] marks;

        StudentData(int[] s) {
            //marks = new int[s];
            marks = s;
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        //StudentData s1 = new StudentData(4);
        StudentData s2 = new StudentData(arr);
        // s1.marks[0] = 89;
        // s1.marks[1] = 95;
        // s1.marks[2] = 56;
        // s1.marks[3] = 78;

        s2.marks[0]=40;
        System.out.println(arr[0]);
    }
}
