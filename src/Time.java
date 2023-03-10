
public class Time {
    private int min;
    private static int MAX_TIME = 24 * 60;

    // Constructors
    public Time(int hours, int minutes) throws IllegalArgumentException{
        if (hours > 23 || minutes > 59 || hours < 0 || minutes < 0) {
            throw new IllegalArgumentException("Nem lehet 23:59-nél nagyobb vagy negatív");
        }
        min = hours * 60 + minutes;
    }

    public Time(){
        min = 0;
    }

    public Time(int hours) throws IllegalArgumentException{
        if (hours > 23 || hours < 0) {
            throw new IllegalArgumentException("Nem lehet 23:59-nél nagyobb");
        }
        min = hours * 60;
    }
    
    // Getter, Setter
    public int getMins() {
        return min % 60;
    }

    public int getHours(){
        return min / 60;
    }

    public int getMinsOnly(){
        return min;
    }

    // Methods
    public String toString(){
        if (getHours() < 10 && getMins() < 10) {
            return "0" + getHours() + ":0" + getMins();
        } 
        else if (getMins() < 10) {
            return getHours() + ":0" + getMins();
        }
        else if (getHours() < 10) {
            return "0" + getHours() + ":" + getMins();
        } 
        else {
            return getHours() + ":" + getMins();
        }
    }

    public Time add(Time time){
        int newHours = getHours() + time.getHours();
        int newMinutes = getMins() + time.getMins();
        if (newHours > 23) {
            newHours -= 24;
        }
        if (newMinutes > 59) {
            newMinutes -= 60;
            newHours++;
        }
        return new Time(newHours, newMinutes);
    }

    public Time subtract(Time time){
        int newHours = getHours() - time.getHours();
        int newMinutes = getMins() - time.getMins();
        if (newHours < 0){
            newHours = 24 + newHours;
        }
        if (newMinutes < 0) {
            newMinutes = 60 + newMinutes;
            newHours--;
        }
        return new Time(newHours, newMinutes);
    }

    public void addMins(int minutes){
         min = (min + minutes) % MAX_TIME;
    }
    
    public void addHours(int hours){
         min = (min + 60 * hours) % MAX_TIME;
    }

    public boolean greaterThan(Time time){
        return (time.getMinsOnly() < getMinsOnly()) ? true: false;
    }

    public boolean lessThan(Time time){
        return (time.getMinsOnly() > getMinsOnly()) ? true: false;
    }

    public int compareTo(Time time){
        if (greaterThan(time)) {
            return 1;
        } 
        else if (lessThan(time)){
            return -1;
        }
        return 0;
    }
    public static void main(String[] args) {
        Time a = new Time(12, 5);
        a = a.subtract(new Time(1, 0));
        System.out.println(a.toString());
    }
}
