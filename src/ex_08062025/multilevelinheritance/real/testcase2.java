package ex_08062025.multilevelinheritance.real;

public class testcase2 extends basetest {


        void testcase2 () {
            startingbrowser();
            getdatafromSQL();// can use obviously
            System.out.println(gold);
            closingbroswer();
        }
        // will be same for every testcase
        public static void main(String[] args) {
            new testcase2().testcase2();
        }
    }

