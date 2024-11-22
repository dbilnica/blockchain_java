import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Block> blockchain = new ArrayList<>();
    private final static int difficulty = 5;

//    private static Boolean isBlockchainValid(){
//        //need to verify the validity of the blockchain
//    }
    public static void main(String[] args) {
        Miner miner = new Miner(difficulty);
        // 1. Flow: Create transaction
        String firstTransaction = "David pays Jaroslav 5 BTC";
        // 2. Flow: Miners listens to this transaction and mines a block
        Block firstBlock = miner.mineBlock(firstTransaction, "0"); //zero is a genesis block
        // 3. Flow: Add a block to a blockchain
        blockchain.add(firstBlock);

        // 1. Flow: Create transaction
        String secondTransaction = "Karel pays to Lucia 1 BTC";
        // 2. Flow: Miners listens to this transaction and mines a block
        Block secondBlock = miner.mineBlock(secondTransaction, firstBlock.getHash());
        // 3. Flow: Add a block to a blockchain
        blockchain.add(secondBlock);

        // 1. Flow: Create transaction
        String thirdTransaction = "Lui pays Mario 2 BTC";
        // 2. Flow: Miners listens to this transaction and mines a block
        Block thirdBlock = miner.mineBlock(thirdTransaction, secondBlock.getHash());
        // 2. Flow: Miners listens to this transaction and mines a block
        blockchain.add(thirdBlock);

        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println("Blockchain");
        System.out.println(blockchainJson);



    }
}