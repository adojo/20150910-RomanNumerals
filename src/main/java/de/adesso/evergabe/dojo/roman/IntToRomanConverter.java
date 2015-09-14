package de.adesso.evergabe.dojo.roman;

public class IntToRomanConverter   {

    public String toRoman(int value) {
        if (value < 1 || value > 2999) {
            throw new IllegalArgumentException();
        }
        int one =value %10;
        value /= 10;

        int ten = value%10;
        value /= 10;

        int hundred = value%10;
        value /= 10;

        int thousand = value%10;

        return calcPart(thousand,"M", null , null) + calcPart(hundred, "C", "D", "M") + calcPart(ten, "X", "L", "C") + calcPart(one, "I", "V", "X");
    }

    private String calcPart(int number, String one, String five, String ten){
        switch (number){
            case 0:
                return "";
            case 1:
                return one;
            case 2:
                return one + one;
            case 3:
                return one + one + one;
            case 4:
                return one + five;
            case 5:
                return five;
            case 6:
                return five + one;
            case 7:
                return five + one + one;
            case 8:
                return five + one + one + one;
            case 9:
                return one + ten;
            case 10:
                return ten;
            default:
                return null;
        }
    }
}
