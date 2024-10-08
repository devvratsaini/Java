public class EnhancedSwitch_Intro {

    public static void main(String[] args) {

        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was a 3, a 4 or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Value was not 1, 2, 3, 4 or 5");
        }

        String month = "April";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }

    public static String getQuarter (String month) {
        return switch (month) {
            case "Januray", "Februraru", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> "bad";
        };
    }
}
