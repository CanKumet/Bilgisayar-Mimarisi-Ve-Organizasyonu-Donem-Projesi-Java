

public class _21010310010_Decoder4x16 {

    public String[] decoder(String input) {
        String[] output = new String[1];

        switch (input) {
            case "0000":
                output[0] = "0";
                break;
            case "0001":
                output[0] = "1";

                break;
            case "0010":
                output[0] = "2";

                break;
            case "0011":
                output[0] = "3";

                break;
            case "0100":
                output[0] = "4";

                break;
            case "0101":
                output[0] = "5";

                break;
            case "0110":
                output[0] = "6";

                break;
            case "0111":
                output[0] = "7";

                break;
            case "1000":
                output[0] = "8";
                break;
            case "1001":
                output[0] = "9";
                break;
            case "1010":
                output[0] = "10";
                break;
            case "1011":
                output[0] = "11";
                break;
            case "1100":
                output[0] = "12";
                break;
            case "1101":
                output[0] = "13";
                break;
            case "1110":
                output[0] = "14";
                break;
            case "1111":
                output[0] = "15";
                break;

            default:
                System.out.println("Hata: Decoder16.java");
                break;
        }

        return output;
    }

}
