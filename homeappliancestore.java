import java.util.*;
public class homeappliancestore {

    static String fname, address;
    static Integer num;

        public static void main (String[] args) {

            homeappliancestore a = new homeappliancestore();

            a.setName("HomeApp");
            a.setAddress("Polytexneioy");
            a.setNum(10);

                System.out.println(a.getfName());
                System.out.println(a.getAdress());
                System.out.println(a.getNum());

                AirCondition Tycoon = new AirCondition(400, 150, 100, "TC3B", "Tycoon", "TR/TRG - 3209ZR",
                        "A+++", "A+", false, "A++", "A++", "R32");

            Tycoon.printAll();

            System.out.println();
            System.out.println();

            WashineMachine United = new WashineMachine(84, 59, 52, "UniUWM", "United",
                        "Washer", "A++", 53, true, true, false, true );

            United.printAll();

            System.out.println();
            System.out.println();

                Fridge Morris = new Fridge(88, 49, 55, "MorB72222SP", "Morris", "Fridge",
                        "A++", 120, "Conventional", true, 2, 2);

            Morris.printAll();

            System.out.println();
            System.out.println();

                Oven Pitsos = new Oven(85, 60, 60, "PHC009G20", "Pitsos", "Oven",
                        "sxara-tapsi-emagie ba8i", "A", true, 7, 4, true);

            Pitsos.printAll();

            System.out.println();
            System.out.println();

        }

        private void periodicMaintenance(){

        }



        public void setName(String fname){
            this.fname = fname;
        }

        public void setAddress(String address){
            this.address = address;
        }

        public void setNum(Integer num){
            this.num = num;
        }

        public String getfName(){
            return this.fname;
        }

        public String getAdress(){
            return this.address;
        }

        public Integer getNum(){
            return this.num;
        }



}
