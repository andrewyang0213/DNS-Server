package dns;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;

public class DNSCache {
    
    // arraylist to store DNSRecord objects
    private ArrayList<DNSRecord> cache;

    // variables used in calculating TTL in record removal
    private Instant currentTime;
    private Duration timeElapsed;
    private long secondsElapsed;

    /**
     * initialize the cache
     */
    public DNSCache() {
        initializeCache();
    }

    private void initializeCache() {
        cache = new ArrayList<DNSRecord>();
    }

    /**
     * add a record to the cache
     * 
     * @param record the record to be added
     */
    public void addRecord(DNSRecord record) {
        if ((record.getTypeStr()).equals("A")) {
            cache.add(record);
        }
    }

    /**
     * find all records that match given the name, type, and class in the cache
     *
     * @param name   the hostname to lookup
     * @param type   the record type to lookup
     * @param rclass the record class to lookup
     * @return list of all matching records (empty if no matches)
     */
    public ArrayList<DNSRecord> getMatches(String name, String type, String rclass) {
        ArrayList<DNSRecord> matches = new ArrayList<DNSRecord>();
        for (var record : cache) {
            if (record.getName().equals(name) &&
                    record.getClassStr().equals(rclass) &&
                    record.getTypeStr().equals(type)) {
                matches.add(record);
            }
        }
        return matches;
    }

    /**
     * remove expired records from the cache if TTL is exceeded
     */
    public void removeExpiredRecords() {
        getCurrentTime();
        for (Iterator<DNSRecord> itr = cache.iterator(); itr.hasNext();) {
            DNSRecord record = itr.next();
            timeElapsed = Duration.between(record.getTimeConstructed(), currentTime);
            secondsElapsed = timeElapsed.getSeconds();
            if (secondsElapsed >= record.getTTL()) {
                itr.remove();
            }
        }
    }

    private void getCurrentTime() {
        currentTime = Instant.now();
    }
}
