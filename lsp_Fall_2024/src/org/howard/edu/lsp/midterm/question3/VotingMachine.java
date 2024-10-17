import java.util.HashMap;
import java.util.Map;

/**
 * A class representing a simplified electronic voting machine.
 */
public class VotingMachine {
    // HashMap to store candidates' names and their corresponding votes
    private Map<String, Integer> candidates;

    // Constructor
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    /**
     * Adds a candidate to the list.
     *
     * @param name The name of the candidate to be added.
     */
    public void addCandidate(String name) {
        // If candidate doesn't exist, add them with 0 votes
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0);
        } else {
            System.out.println(name + " is already a candidate.");
        }
    }

    /**
     * Casts a vote for the specified candidate.
     *
     * @param name The name of the candidate who receives the vote.
     */
    public void castVote(String name) {
        // If the candidate exists, increment their vote count
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1);
        } else {
            System.out.println(name + " is not a valid candidate.");
        }
    }

    /**
     * Returns a string representation of all candidates and their vote counts.
     *
     * @return A string listing all candidates and their vote counts.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(" votes\n");
        }
        return result.toString();
    }
}
