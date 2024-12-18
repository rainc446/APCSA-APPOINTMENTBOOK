public class Main {
    public static void main(String[] args){
//        boolean [][] schedule = new boolean[8][60];
//        for (int i = 10; i < 15; i++) {schedule[0][i] = true;}
//        for (int i = 0; i < 15; i ++) {schedule[1][i] = true;}
//        for (int i = 41; i < 60; i++) schedule[1][i] = true;
//        for (int i = 5; i < 30; i++) schedule[2][i] = true;
//        for (int i = 44; i < 60; i++) schedule[2][i] = true;
//        AppointmentBook a = new AppointmentBook(schedule);
//        a.printPeriod(2);
//        a.findFreeBlock(2,15);

        boolean [][] schedule1 = new boolean[8][60];
        for (int i = 0; i < 25; i ++) {schedule1[0][i] = true;}
        for (int i = 3; i < 15; i++) {schedule1[1][i] = true;}
        for (int i = 41; i < 60; i++) {schedule1[1][i] = true;}
        for (int i = 27; i < 30; i++) {schedule1[2][i] = true;}
        for (int i = 44; i < 60; i ++) {schedule1[2][i] = true;}

        AppointmentBook b = new AppointmentBook(schedule1);
//        b.printPeriod(2);
//        b.printPeriod(3);
//        b.printPeriod(4);


        boolean appointmentOne = b.makeAppointment(0, 7, 40);
        System.out.println(appointmentOne);
    }
}
