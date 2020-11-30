package pattern.proxy;

public class TimetableElectricTrainsProxy implements TimetableTrains {
// Ссылка на оригинальный объект
    private TimetableTrains timetableTrains = new TimetableElectricTrains();
    private String[] timetableCache = null;

    @Override
    public String[] getTimetable() {
        if (timetableCache == null) {
            timetableCache = timetableTrains.getTimetable();
        } else {
            System.out.println("Using Cache");
        }
        return timetableCache;
    }
}