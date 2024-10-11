import java.util.*;

class Pair {
    int friend, time;
    char eventType; // 'A' for arrival, 'D' for departure
    
    public Pair(int time, int friend, char eventType) {
        this.time = time;
        this.friend = friend;
        this.eventType = eventType;
    }
}

class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        // Step 1: Create a list of events (arrivals and departures)
        List<Pair> events = new ArrayList<>();
        Map<Integer, Integer> friendToChair = new HashMap<>();
        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        
        // Step 2: Add both arrival and departure events to the event list
        for (int i = 0; i < times.length; i++) {
            events.add(new Pair(times[i][0], i, 'A')); // Arrival event
            events.add(new Pair(times[i][1], i, 'D')); // Departure event
            availableChairs.offer(i); // Initially all friends are seated in order
        }
        
        // Step 3: Sort the events by time. If two events have the same time, prioritize departures before arrivals
        Collections.sort(events, (a, b) -> {
            if (a.time == b.time) {
                return a.eventType == 'D' ? -1 : 1; // 'D' (departure) comes before 'A' (arrival)
            } else {
                return a.time - b.time; // Sort by time
            }
        });
        
        // Step 4: Process the events in sorted order
        for (Pair event : events) {
            if (event.eventType == 'A') { // Arrival
                // Allocate the smallest available chair
                int chair = availableChairs.poll();
                friendToChair.put(event.friend, chair);
                
                // If this is the target friend, return their chair
                if (event.friend == targetFriend) {
                    return chair;
                }
            } else { // Departure
                // Free the chair occupied by this friend
                availableChairs.offer(friendToChair.get(event.friend));
            }
        }
        
        return -1; // Should not be reached if input is valid
    }
}
