
public class _21010310010_Buyruklar {

    public String BuyruklarıAlma (String buyrukTablosu) {

        if(buyrukTablosu.startsWith("0000")) return "AND";
        else if(buyrukTablosu.startsWith("0001")) return "ADD";
        else if(buyrukTablosu.startsWith("0010")) return "LDA";
        else if(buyrukTablosu.startsWith("0011")) return "STA";
        else if(buyrukTablosu.startsWith("0100")) return "BUN";
        else if(buyrukTablosu.startsWith("0101")) return "BSA";
        else if(buyrukTablosu.startsWith("0110")) return "ISZ";
        else if(buyrukTablosu.startsWith("1000")) return "AND";
        else if(buyrukTablosu.startsWith("1001")) return "ADD";
        else if(buyrukTablosu.startsWith("1010")) return "LDA";
        else if(buyrukTablosu.startsWith("1011")) return "STA";
        else if(buyrukTablosu.startsWith("1100")) return "BUN";
        else if(buyrukTablosu.startsWith("1101")) return "BSA";
        else if(buyrukTablosu.startsWith("1110")) return "ISZ";
        else if(buyrukTablosu.startsWith("0111100000000000")) return "CLA";
        else if(buyrukTablosu.startsWith("0111010000000000")) return "CLE";
        else if(buyrukTablosu.startsWith("0111001000000000")) return "CMA";
        else if(buyrukTablosu.startsWith("0111000100000000")) return "CME";
        else if(buyrukTablosu.startsWith("0111000010000000")) return "CIR";
        else if(buyrukTablosu.startsWith("0111000001000000")) return "CIL";
        else if(buyrukTablosu.startsWith("0111000000100000")) return "INC";
        else if(buyrukTablosu.startsWith("0111000000010000")) return "SPA";
        else if(buyrukTablosu.startsWith("0111000000001000")) return "SNA";
        else if(buyrukTablosu.startsWith("0111000000000100")) return "SZA";
        else if(buyrukTablosu.startsWith("0111000000000010")) return "SZE";
        else if(buyrukTablosu.startsWith("0111000000000001")) return "HLT";
        else if(buyrukTablosu.startsWith("1111100000000000")) return "INP";
        else if(buyrukTablosu.startsWith("1111010000000000")) return "OUT";
        else if(buyrukTablosu.startsWith("1111001000000000")) return "SKI";
        else if(buyrukTablosu.startsWith("1111000100000000")) return "SKO";
        else if(buyrukTablosu.startsWith("1111000010000000")) return "ION";
        else if(buyrukTablosu.startsWith("1111000001000000")) return "IOF";

        else return "HATA";

    }
}
