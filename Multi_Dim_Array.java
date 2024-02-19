public class Multi_Dim_Array {
    public static void main(String[] args) {
        int[][] marks = new int[2][2]; // This is know as 2-dimensional array (2-rows and 2-columns)
        marks[0][0] = 10;
        marks[0][1] = 20;
        marks[1][0] = 30;
        marks[1][1] = 40;

        System.out.print(marks[0][0] + "\t");
        System.out.println(marks[0][1]);
        System.out.print(marks[1][0] + "\t");
        System.out.println(marks[1][1]);
    }
}
