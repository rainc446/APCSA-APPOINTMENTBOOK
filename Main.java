public class Main {
    public static void main(String[] args){

        // Test cases for a)
        boolean[][] scheduleOne = new boolean[7][60];
        for (int i = 10; i < 15; i ++) {scheduleOne[1][i] = true;}
        for (int i = 30; i < 45; i ++) {scheduleOne[1][i] = true;}
        for (int i = 50; i < 60; i ++) {scheduleOne[1][i] = true;}
        AppointmentBook a = new AppointmentBook(scheduleOne);
        System.out.println(a.findFreeBlock(2, 15));
        System.out.println(a.findFreeBlock(2, 9));
        System.out.println(a.findFreeBlock(2, 20));

        //test cases for b)
        boolean[][] scheduleTwo = new boolean[7][60];
        for (int i = 25; i < 30; i++) {scheduleTwo[1][i] = true;}
        for (int i = 0; i < 15; i++) {scheduleTwo[2][i] = true;}
        for (int i = 41; i < 60; i++) {scheduleTwo[2][i] = true;}
        for (int i = 5; i < 29; i++) {scheduleTwo[3][i] = true;}
        for (int i = 44; i < 60; i++) {scheduleTwo[3][i] = true;}
        AppointmentBook b = new AppointmentBook(scheduleTwo);
        System.out.println(a.makeAppointment(2,4,22));
        b.printBlock(2,4,22);
    }
}
