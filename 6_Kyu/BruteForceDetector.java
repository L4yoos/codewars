// https://www.codewars.com/kata/695688e9858d531c29a9d748

// You're analyzing authentication logs. Each log entry is a string like:
//
// 192.168.1.1 LOGIN_FAIL user=admin
// 192.168.1.1 LOGIN_SUCCESS user=admin
// 10.0.0.5 LOGIN_FAIL user=root
// An IP is suspicious if it has 3 or more consecutive failures without a success in between. Return a list of suspicious IPs, sorted alphabetically.
//
// logs = [
//    "192.168.1.1 LOGIN_FAIL user=admin",
//    "192.168.1.1 LOGIN_FAIL user=admin",
//    "192.168.1.1 LOGIN_FAIL user=root",
//    "10.0.0.5 LOGIN_FAIL user=test",
//    "10.0.0.5 LOGIN_SUCCESS user=test"
// ]
// detect_brute_force(logs)  # ["192.168.1.1"]
// The 10.0.0.5 IP had a failure then a success, so its streak reset. The 192.168.1.1 IP hit 3 failures in a row - busted. Only respond with a list of the suspicious IPs.
//
// A success resets that IP's failure count to zero. Empty list returns empty list.
//
// PS. You do not need to validate the IP addresses.

public class BruteForceDetector {
    public static List<String> detectBruteForce(String[] logs) {
        Map<String, Integer> failCounters = new HashMap<>();
        List<String> list = new ArrayList<>();

        for (String log : logs) {
            String[] parts = log.split(" ");

            String ip = parts[0];
            String status = parts[1];

            if (status.equals("LOGIN_FAIL")) {
                int fails = failCounters.getOrDefault(ip, 0) + 1;
                failCounters.put(ip, fails);

                if (fails == 3) {
                    if (!list.contains(ip)) {
                        list.add(ip);
                    }
                }
            } else {
                failCounters.put(ip, 0);
            }
        }

        Collections.sort(list);
        return list;
    }
}