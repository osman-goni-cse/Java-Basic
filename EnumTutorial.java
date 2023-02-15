
enum DAY {
    SATURDAY, SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}

enum Level {
    HIGH(1),
    MEDIUM(2),
    LOW(3);
    private  final int levelCode;
    Level(int levelCode) {
        this.levelCode = levelCode;
    }
    public int getLevelCode() {
        return this.levelCode;
    }
}
public class EnumTutorial {

    public static void display(DAY day) {
        switch(day) {
            case FRIDAY:
            case SATURDAY:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Weekday");
        }
    }
    public static void main(String[] args) {
        DAY day = DAY.SUNDAY;
        System.out.println(day);
        EnumTutorial.display(day);
        DAY[] values = DAY.values();

        for(DAY X: values) {
            System.out.println(X);
        }

        Level lvl = Level.LOW;
        System.out.println(lvl.getLevelCode());

    
    }

    
}
