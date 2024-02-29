
public class _21010310010_Decoder3x8 {

    public String[] decode(String input) {
        String[] output = new String[1];

        switch (input) {
            case "000":
                output[0] = "0";
                break;
            case "001":
                output[0] = "1";
                break;
            case "010":
                output[0] = "2";

                break;
            case "011":
                output[0] = "3";

                break;
            case "100":
                output[0] = "4";

                break;
            case "101":
                output[0] = "5";

                break;
            case "110":
                output[0] = "6";

                break;
            case "111":
                output[0] = "7";

                break;
            default:
                System.out.println("Hata: Decoder8.java");
                break;
        }

        return output;
    }

}
