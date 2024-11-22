class Block {
    private String hash;
    private String previousHash;
    private String transaction;

    Block(String hash, String previousHash, String transaction){
        this.hash = hash;
        this.previousHash = previousHash;
        this.transaction = transaction;
    }

    public String getHash() {
        return hash;
    }

    public String getTransaction() {
        return transaction;
    }

    public String getPreviousHash() {
        return previousHash;
    }
}
