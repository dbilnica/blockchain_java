public class Miner {
    private int difficulty;
    private String target;

    Miner(int difficulty, String target) {
        this.difficulty = difficulty;

        // create a string of '0' difficulty size
        this.target = new String(new char[difficulty]).replace('\0', '0');
    }
    Block mineBlock(String transaction, String previousHash) {
        System.out.println("I'm mining a block!");

        long nonce = 0;

        String hash = Hasher.calculateHash(previousHash, transaction, nonce);
        while(!hash.substring(0, difficulty).equals(target)) {
            nonce++;
            hash = Hasher.calculateHash(previousHash, transaction, nonce);
        }
        System.out.println("The Block has been mined at " + nonce + " attemp! Whoohoo");
        System.out.println();

        return new Block(hash, previousHash, transaction, nonce);
    }
}
