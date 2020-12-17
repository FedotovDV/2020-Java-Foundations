package core.lesson1;

import java.security.MessageDigest;

public class Test {


    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);
        }
    }



//    public abstract class Bank {
//        protected Office office = buildOffice();
//        protected List<Employee> staff = Staff.hireEmployees();
//
//        public void transfer(Client a, Client b, double amount, String currency) {
//            a.documents.passport.seriesAndNumber.validate();
//
//            if (a.type == "type1") {
//                // do something
//            } else if (a.type == "type2") {
//                // do another thing
//            } else if (a.type == "type3") {
//                // do other thing
//            }
//
//            // ...
//        }
//
//        public abstract Office buildOffice();
//
//        // invoked on every frame update on UI
//        public UIBankInfo render() {
//            UIBankInfo bankInfoFrame = new UIBankInfo();
//            bankInfoFrame.setBankInfo(generateBankInfo());
//            // ...
//
//            return bankInfoFrame;
//        }
//
//        public BankInfo generateBankInfo() {
//            BankInfo bankInfo = new BankInfo();
//            // ...
//
//            return bankInfo;
//        }
//    }
//
//    public class SberBank extends Bank {
//        public Office buildOffice() {
//            OfficeBuilder builder = new SomeBuildingCompany();
//            return builder.use(staff).buildOffice();
//        }
//
//        public BankInfo generateBankInfo() {
//            BankInfo bankInfo = super.generateBankInfo();
//            notifyEmail(Config.getAdminEmail());
//            return bankInfo;
//        }
//    }
}
