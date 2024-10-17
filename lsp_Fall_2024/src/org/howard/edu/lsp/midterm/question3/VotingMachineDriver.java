public class VotingMachineDriver {
    public static void main(String[] args) {
        VotingMachine vm = new VotingMachine();
        
        // Add candidates
        vm.addCandidate("Alsobrooks");
        vm.addCandidate("Hogan");

        // Cast votes
        vm.castVote("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.castVote("Hogan");

        // Print out the vote counts
        System.out.println(vm.toString());
    }
}
