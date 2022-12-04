import com.sun.jdi.IntegerValue;

public class Exercise2 {
    public static void main(String[] args) {
        String phone = "972-526265823";
        System.out.println(returnValidPhoneNumber(phone));
    }

    public static String returnValidPhoneNumber(String phoneNumber) {
        String validPhoneNumber = "";
        char[] toCharPhoneNum = phoneNumber.toCharArray();
        for (int i = 0; i < toCharPhoneNum.length; i++) {
            if (toCharPhoneNum[i] != '9' && toCharPhoneNum[i] != '8' && toCharPhoneNum[i] != '7' && toCharPhoneNum[i] != '6' && toCharPhoneNum[i] != '5' && toCharPhoneNum[i] != '4' && toCharPhoneNum[i] != '3' && toCharPhoneNum[i] != '2' && toCharPhoneNum[i] != '1' && toCharPhoneNum[i] != '0' && toCharPhoneNum[i] != '-') {
                break;

            } else {
                String areaCode = phoneNumber.substring(0, 3);
                String startingNumber = phoneNumber.substring(0, 2);
                if (areaCode.equals("972") && phoneNumber.length() == 12)
                    validPhoneNumber = "0" + phoneNumber.substring(3, 5) + "-" + phoneNumber.substring(5, 12);
                else if (startingNumber.equals("05") && phoneNumber.indexOf("-") == 3 && phoneNumber.length() == 11) {
                    validPhoneNumber = phoneNumber;
                } else if (startingNumber.equals("05") && phoneNumber.length() == 10) {
                    validPhoneNumber = phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3, 10);
                }

            }
        } return validPhoneNumber;
    }
}