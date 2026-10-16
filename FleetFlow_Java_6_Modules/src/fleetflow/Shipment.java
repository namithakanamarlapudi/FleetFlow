package fleetflow;

public class Shipment {
    public final String[] fields;
    public Shipment(String[] fields) { this.fields = fields; }
    public String get(int index) { return index >= 0 && index < fields.length ? fields[index] : ""; }
    public String toString() {
        return String.format("ID=%s | Partner=%s | Mode=%s | Region=%s | Distance=%s km | Status=%s | Delayed=%s | Cost=%s",
            get(0), get(1), get(4), get(5), get(7), get(12), get(11), get(14));
    }
}
