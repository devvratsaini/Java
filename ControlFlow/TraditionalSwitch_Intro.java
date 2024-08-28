public class TraditionalSwitch_Intro {

    public static void main(String[] args) {

        // Valid Switch Value Types:
        // - byte, short, int, char
        // - Byte, Short, Integer, Character
        // - String, enum
        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was a 3, a 4 or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value was not 1, 2, 3, 4 or 5");
        }
    }
}
