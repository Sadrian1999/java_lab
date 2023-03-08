
public class Time {
    private int min;

    // Constructors
    public Time(int hours, int minutes) {
        if (hours > 23 || minutes > 59 || hours < 0 || minutes < 0) {
            throw new IllegalArgumentException("Nem lehet 23:59-nél nagyobb vagy negatív");
        }
        this.min = hours * 60 + minutes;
    }

    public Time(){
        this.min = 0;
    }

    public Time(int hours){
        if (hours > 23 || hours < 0) {
            throw new IllegalArgumentException("Nem lehet 23:59-nél nagyobb");
        }
        this.min = hours * 60;
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
        if (this.getHours() < 10 && this.getMins() < 10) {
            return "0" + this.getHours() + ":0" + this.getMins();
        } 
        else if (this.getMins() < 10) {
            return this.getHours() + ":0" + this.getMins();
        }
        else if (this.getHours() < 10) {
            return "0" + this.getHours() + ":" + this.getMins();
        } 
        else {
            return this.getHours() + ":" + this.getMins();
        }
    }

    public Time add(Time time){
        int newHours = this.getHours() + time.getHours();
        int newMinutes = this.getMins() + time.getMins();
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
        int newHours = this.getHours() - time.getHours();
        int newMinutes = this.getMins() - time.getMins();
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
        this.min += minutes;
    }
    
    public void addHours(int hours){
        this.min += hours * 60;
    }

    public boolean greaterThan(Time time){
        return (time.getMinsOnly() < this.getMinsOnly()) ? true: false;
    }

    public boolean lessThan(Time time){
        return (time.getMinsOnly() > this.getMinsOnly()) ? true: false;
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
        Time a = new Time(12, 32);
        Time b = new Time(12, 30);
        System.out.println(a.compareTo(b));
    }
}
