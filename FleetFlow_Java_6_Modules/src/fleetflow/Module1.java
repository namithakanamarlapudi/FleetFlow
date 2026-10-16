package fleetflow;
import java.util.*;
public class Module1 {
    public static void menu(Scanner sc, DataRepository data) {
        while(true){ System.out.println("\n--- MODULE 1: FLEETFLOW DATA & INTEGRATION ---\n1. Search shipment by ID\n2. Search dataset field\n3. Dataset summary\n4. Show first 10 records\n0. Back"); int c=Util.readInt(sc,"Choice: ");
            if(c==0)return;
            switch(c){case 1: search(sc,data,"delivery_id"); break; case 2: System.out.println("Fields: "+String.join(", ",data.header())); String f=Util.readLine(sc,"Field name: "); String q=Util.readLine(sc,"Contains text: "); List<Shipment> rs=data.search(f,q); System.out.println("Matches: "+rs.size()); rs.stream().limit(20).forEach(System.out::println); break; case 3:data.summary();break;case 4:data.all().stream().limit(10).forEach(System.out::println);break;default:System.out.println("Invalid choice.");}}
    }
    private static void search(Scanner sc,DataRepository data,String field){String id=Util.readLine(sc,"Enter delivery ID: "); List<Shipment> r=data.search(field,id); if(r.isEmpty())System.out.println("No matching shipment. Note: included sample IDs may be demo IDs."); else r.forEach(System.out::println);}
}
