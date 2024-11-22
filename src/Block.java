class Block {
    private String hash;
    private String previousHash;
    private String transaction;
    private long nonce;

    Block(String hash, String previousHash, String transaction, long nonce){
        this.hash = hash;
        this.previousHash = previousHash;
        this.transaction = transaction;
        this.nonce = nonce;
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

    public long getNonce() {
        return nonce;
    }
}
