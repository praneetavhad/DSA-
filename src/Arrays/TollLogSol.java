package Arrays;




// Phase 3 · Multipart · "Highway Toll Log" (Past Interview — Citi Karat workbook)
// Run: javac TollLog.java && java TollLog   → tests FAIL until you implement.

import java.util.*;
        import java.util.function.Consumer;

public class TollLogSol {

    static class LogEntry {
        double timestamp;
        String licensePlate;
        String boothType;
        int location;
        String direction;

        // Part 1 — provided parser. Understand it; list its failure modes.
        public LogEntry(String logLine) {
            String[] tok = logLine.split(" ");
            this.timestamp = Double.parseDouble(tok[0]);
            this.licensePlate = tok[1];
            String locTok = tok[2];
            this.location = Integer.parseInt(locTok.substring(0, locTok.length() - 1));
            char dir = locTok.charAt(locTok.length() - 1);
            if (dir == 'E')
            {
                this.direction = "EAST";
            }
            else if (dir == 'W'){
                this.direction = "WEST";
            } else{
                throw new IllegalArgumentException("Invalid direction " +dir);
            }
            this.boothType = tok[3];
        }
    }

    static class LogFile {
        List<LogEntry> entries = new ArrayList<>();
        public void addEntry(LogEntry e) {
            entries.add(e); }

        // Part 2 — TODO: count valid complete journeys across all plates; ignore orphan EXITs.
        public int countJourneys() {
            Set<String> active = new HashSet<>();
            int journey = 0;

            for(LogEntry e : entries) {
                String plate = e.licensePlate;

                if ("ENTRY".equals(e.boothType)) {
                    active.add(plate);
                } else if ("EXIT".equals(e.boothType)) {
                    journey++;
                    active.remove(plate);

                }
            }
            return journey;
        }

        // Part 3a — TODO
        public Map<String, Integer> countJourneysByPlate() {
            Set<String> active = new HashSet<>();
            Map<String, Integer> result = new HashMap<>();

            for(LogEntry e : entries) {
                String plate = e.licensePlate;

                if ("ENTRY".equals(e.boothType)) {
                    active.add(plate);
                } else if ("EXIT".equals(e.boothType) && active.contains(plate)) {
                    result.merge(plate,1,Integer::sum);
                    active.remove(plate);

                }
            }
            return result;
        }

        // Part 3b — TODO
        public double averageJourneyDuration() { return 0.0; }

        // Part 3c — TODO: return a Consumer that increments counterRef[0] on each completed journey.
        public Consumer<LogEntry> streamingCounter(int[] counterRef) { return e -> { }; }
    }

    public static void main(String[] args) {
        String[] sampleLog = {
                "90750.191 JOX304 250E ENTRY",
                "91081.684 JOX304 260E MAINROAD",
                "91082.101 THX138 110E ENTRY",
                "91483.251 JOX304 270E MAINROAD",
                "91873.920 THX138 120E MAINROAD",
                "91874.493 JOX304 280E EXIT",
                "91982.102 THX138 290E EXIT",
                "92301.302 THX138 300W ENTRY",
                "92371.302 THX138 310W EXIT"
        };



        LogFile log = new LogFile();
        for (String line : sampleLog) log.addEntry(new LogEntry(line));

        // Part 1 — parser sanity (provided; should pass)
        LogEntry first = log.entries.get(0);
        expect(90750.191, first.timestamp, "Part 1: timestamp parsed");
        expect("JOX304",  first.licensePlate, "Part 1: plate parsed");
        expect(250,       first.location, "Part 1: location parsed");
        expect("EAST",    first.direction, "Part 1: direction parsed");


//        /* Part 2 */
         expect(3, log.countJourneys(), "Part 2: 3 total journeys");



        /* Part 3 */
        Map<String, Integer> per = log.countJourneysByPlate();
        expect(1, per.get("JOX304"), "Part 3a: JOX304 = 1 journey");
        expect(2, per.get("THX138"), "Part 3a: THX138 = 2 journeys");



//       /*  Part 3b — average duration (JOX: 91874.493-90750.191 ≈ 1124.302
//                                    THX1: 91982.102-91082.101 ≈ 900.001
//                                    THX2: 92371.302-92301.302 = 70.000
//                                    avg ≈ (1124.302 + 900.001 + 70.000) / 3 ≈ 698.101)*/
////        double avgDur = log.averageJourneyDuration();
////        System.out.printf("Part 3b: averageJourneyDuration = %.3f (expect ~698.101)%n", avgDur);
////        if (Math.abs(avgDur - 698.101) > 0.01)
////            throw new AssertionError("avg duration off: " + avgDur);


        /*Par 3c: Create a streaming Consumer<LogEntry> that increments a counter whenever a journey is completed.*/
//        int[] counter = {0};
//        Consumer<LogEntry> sc = new LogFile().streamingCounter(counter);
//        for (LogEntry e : log.entries) sc.accept(e);
//        expect(3, counter[0], "Part 3c: streaming counter reaches 3");


        System.out.println("\nAll Toll Log tests passed ✓");
    }

    private static void expect(Object expected, Object actual, String label) {
        if (!Objects.equals(expected, actual)) throw new AssertionError(label + ": expected " + expected + ", got " + actual);
        System.out.println("✓ " + label + " → " + actual);
    }
}

