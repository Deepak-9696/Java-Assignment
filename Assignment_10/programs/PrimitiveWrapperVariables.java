public class PrimitiveWrapperVariables {
    public static void main(String[] args) {
        byte primitiveByte = 10;
        short primitiveShort = 200;
        int primitiveInt = 1000;
        long primitiveLong = 100000L;
        float primitiveFloat = 12.5f;
        double primitiveDouble = 99.99;
        char primitiveChar = 'D';
        boolean primitiveBoolean = true;

        Byte wrapperByte = 10;
        Short wrapperShort = 200;
        Integer wrapperInt = 1000;
        Long wrapperLong = 100000L;
        Float wrapperFloat = 12.5f;
        Double wrapperDouble = 99.99;
        Character wrapperChar = 'D';
        Boolean wrapperBoolean = true;

        System.out.println("PRIMITIVE AND WRAPPER VARIABLES");
        System.out.println("===============================");
        System.out.println("byte    : " + primitiveByte + " | Byte      : " + wrapperByte);
        System.out.println("short   : " + primitiveShort + " | Short     : " + wrapperShort);
        System.out.println("int     : " + primitiveInt + " | Integer   : " + wrapperInt);
        System.out.println("long    : " + primitiveLong + " | Long      : " + wrapperLong);
        System.out.println("float   : " + primitiveFloat + " | Float     : " + wrapperFloat);
        System.out.println("double  : " + primitiveDouble + " | Double    : " + wrapperDouble);
        System.out.println("char    : " + primitiveChar + " | Character : " + wrapperChar);
        System.out.println("boolean : " + primitiveBoolean + " | Boolean   : " + wrapperBoolean);
    }
}
