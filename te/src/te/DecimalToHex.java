package te;

public class DecimalToHex {
	
	
	
    public static void main(String[] args) {
        int decimal = 255; // 변환할 십진수 값

        String hex = decimalToHex(decimal);
        System.out.println("십진수 " + decimal + "은(는) 16진수로 " + hex + "입니다.");
    }
    
    

    public static String decimalToHex(int decimal) {
        StringBuilder hexBuilder = new StringBuilder();

        while (decimal != 0) {
            int remainder = decimal % 16;
            char hexDigit = getHexDigit(remainder);
            hexBuilder.insert(0, hexDigit);
            decimal /= 16;
        }

        return hexBuilder.toString();
    }
    
    

    public static char getHexDigit(int value) {
        if (value >= 0 && value <= 9) {
            return (char) (value + '0');
        } else {
            return (char) (value - 10 + 'A');
        }
    }
}
