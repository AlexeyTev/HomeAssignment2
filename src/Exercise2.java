
public class Exercise2 {
    public static void main(String[] args) {
        String phone = "0526265823";
        System.out.println(returnValidPhoneNumber(phone));
    }

    public static String returnValidPhoneNumber(String phoneNumber) {
        String validPhoneNumber = "";
        String phoneNumberPt1;
        String phoneNumberPt2;
        if (phoneNumber.contains("-")) {
            phoneNumberPt1 = phoneNumber.substring(0, 2);
            phoneNumberPt2 = phoneNumber.substring(4);
        } else {
            phoneNumberPt1 = phoneNumber;
            phoneNumberPt2 = phoneNumber;
        }
        if (phoneNumberPt1.matches("[0-9]+") && phoneNumberPt2.matches("[0-9]+")) {
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
        return validPhoneNumber;    }

    }
