import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Votingsystem {
    private List<Candidate> candidates;
    private int totalVotes;

    public Votingsystem() {
        candidates = new ArrayList<>();
        totalVotes = 0;
    }

    public void addCandidate(String name) {
        candidates.add(new Candidate(name));
    }

    public void castVote(int candidateIndex) {
        if (candidateIndex >= 0 && candidateIndex < candidates.size()) {
            candidates.get(candidateIndex).addVote();
            totalVotes++;
            System.out.println("Vote casted for " + candidates.get(candidateIndex).getName());
        } else {
            System.out.println("Invalid candidate index.");
        }
    }

    public void displayResults() {
        System.out.println("Voting Results:");
        for (Candidate candidate : candidates) {
            System.out.println(candidate.getName() + ": " + candidate.getVotes() + " votes");
        }
        System.out.println("Total votes: " + totalVotes);
    }

    public void displayCandidates() {
        System.out.println("Candidates:");
        for (int i = 0; i < candidates.size(); i++) {
            System.out.println(i + ": " + candidates.get(i).getName());
        }
    }

    public static void main(String[] args) {
        Votingsystem votingSystem = new Votingsystem();
        Scanner scanner = new Scanner(System.in);

        // Adding candidates
        votingSystem.addCandidate("Alice");
        votingSystem.addCandidate("Bob");
        votingSystem.addCandidate("Charlie");

        while (true) {
            System.out.println("\nWelcome to the Online Voting System");
            votingSystem.displayCandidates();
            System.out.print("Enter the candidate index to vote (or -1 to exit): ");
            int candidateIndex = scanner.nextInt();

            if (candidateIndex == -1) {
                break;
            }

            votingSystem.castVote(candidateIndex);
        }

        votingSystem.displayResults();
        scanner.close();
    }
}
    

