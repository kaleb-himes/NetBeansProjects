package huffman_outlab;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;
/**
 *
 * @author Kaleb
 */
public class Huffman_Outlab extends Methods{
    public static PriorityQueue<Node> q;
    public static HashMap<Character, String> convChar = new HashMap<>();
    public static HashMap<String, Character> convCode = new HashMap<>();
    public static String messageSent;
    public static String compressedSentMessage;
    public static String messageArrived;
    public static String occurances;
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //get current working directory
        Path currentRelativePath = Paths.get("");
        //convert directory path to string
        String curPath = currentRelativePath.toAbsolutePath().toString();
        //prepend string curPath to the file location within the directory
        messageSent = curPath + "\\src\\huffman_outlab\\messageBeingSent.txt";
        String fileLine = new Scanner(new File(messageSent)).useDelimiter("\\A").next();
        
        //Count character occurances
        HashMap<Character, Integer> dictionary = new HashMap<>();
 
        for(int i = 0; i < fileLine.length(); i++) {
            char lookingAt = fileLine.charAt(i);
            if(dictionary.containsKey(lookingAt))
                dictionary.put(lookingAt, dictionary.get(lookingAt)+1);
            else
                dictionary.put(lookingAt, 1);
        }
 
        // Add all nodes to a priority queue
        setQ(new PriorityQueue<>(100, new FrequencyComparator()));
        int n = 0;
 
        for(Character c : dictionary.keySet()) {
            getQ().add(new Node(c, dictionary.get(c)));
            n++;
        }
        // reset occurances file to blank file each run
        resetOccurances();
        
        // Set the root Node
        Node root = theRoot(n);
 
        // Build the table for the variable length codes
        constructTable(root);
        
        //write the file containing the compressed code
        writeCompressedFile();
        
        //read back in the compressed file and send to method for delivering message
        scanCompressed();
        
        //for the TA
        System.out.println("Please note all files:\n\"messageBeingSent.txt\" should be the file that needs compressed"
                + "\n\"compressedMessage.txt\" will contain the huffman code that will be decompressed upon message arrival"
                + "\n\"messageArriving.txt\" contains the final message after being compressed then decompressed"
                + "\nfinally to see the number of occurances of each character in the file please refer to\"occurances.txt\" file\n");
    }
    //Build tree based on occurance within file
    public static Node theRoot(int in) {
        Node x, y;
        for(int i = 1; i <= in-1; i++) {
            Node n = new Node();
            n.left = x = getQ().poll();
            n.right = y = getQ().poll();
            n.occurances = x.occurances + y.occurances;
            getQ().add(n);
        }
        return getQ().poll();
    }
    //Construct table for compress/decompress
    public static void constructTable(Node root) throws IOException {
        setConvChar(new HashMap<Character, String>());
        setConvCode(new HashMap<String, Character>());
 
        postOrderTraversal(root, new String());
    }
    //Traverse the tree in post order fasion
    public static void resetOccurances() throws IOException{
        //get current working directory
        Path currentRelativePath = Paths.get("");
        //convert directory path to string
        String curPath = currentRelativePath.toAbsolutePath().toString();
        //prepend string curPath to the file location within the directory
        occurances = curPath + "\\src\\huffman_outlab\\occurances.txt";
        FileWriter fw = new FileWriter(occurances, false);
        fw.write("");
        fw.close();
        // Visit key nodes only
    }
    public static void postOrderTraversal(Node in, String s) throws IOException {
        if(in == null)
            return;
        postOrderTraversal(in.left, s+"0");
        postOrderTraversal(in.right, s+"1");
        //get current working directory
        Path currentRelativePath = Paths.get("");
        //convert directory path to string
        String curPath = currentRelativePath.toAbsolutePath().toString();
        //prepend string curPath to the file location within the directory
        occurances = curPath + "\\src\\huffman_outlab\\occurances.txt";
        FileWriter fw = new FileWriter(occurances, true);
        // Visit key nodes only
        if(in.key == ' '){
            fw.write("spaces -> " + s +"\n");
            getConvChar().put(in.key, s);
            getConvCode().put(s, in.key);
            fw.close();
        }
        else if(in.key == '\n'){
            fw.write("return lines -> " + s +"\n");
            getConvChar().put(in.key, s);
            getConvCode().put(s, in.key);
            fw.close();
        }
        else if(in.key != '\0') {  
            fw.write(in.key + " -> " + s +"\n");
            getConvChar().put(in.key, s);
            getConvCode().put(s, in.key);
            fw.close();
        } 
    }
    public static void writeCompressedFile() throws FileNotFoundException, IOException{
        //get current working directory
        Path currentRelativePath = Paths.get("");
        //convert directory path to string
        String curPath = currentRelativePath.toAbsolutePath().toString();
        //prepend string curPath to the file location within the directory
        messageSent = curPath + "\\src\\huffman_outlab\\messageBeingSent.txt";
        String fileLine = new Scanner(new File(messageSent)).useDelimiter("\\A").next();
        String compressed = compress(fileLine);
        compressedSentMessage = curPath + "\\src\\huffman_outlab\\compressedMessage.txt";
        FileWriter fw = new FileWriter(compressedSentMessage, false);
        fw.write(compressed);
        fw.close();
    }
    public static String compress(String s) {
        String c = new String();
        for(int i = 0; i < s.length(); i++)
            c += getConvChar().get(s.charAt(i));
        return c;
    }
    public static void scanCompressed() throws FileNotFoundException, IOException{
        String incomeingMessage = new Scanner(new File(compressedSentMessage)).useDelimiter("\\A").next();
        String decompressed = decompress(incomeingMessage);       
        //write the file containing the message after arriving at destination
        deliverMessage(decompressed);
    }
    public static String decompress(String s) {
        String temp = new String();
        String result = new String();
        for(int i = 0; i < s.length(); i++) {
            temp += s.charAt(i);
            if(getConvCode().containsKey(temp)) {
                result += getConvCode().get(temp);
                temp = new String();
            }
        }
        return result;
    }
    public static void deliverMessage(String decomp) throws IOException{
        //get current working directory
        Path currentRelativePath = Paths.get("");
        //convert directory path to string
        String curPath = currentRelativePath.toAbsolutePath().toString();
        //prepend string curPath to the file location within the directory
        messageSent = curPath + "\\src\\huffman_outlab\\messageBeingSent.txt";
        
        messageArrived = curPath + "\\src\\huffman_outlab\\messageArriving.txt";
        FileWriter fw = new FileWriter(messageArrived, false);
        fw.write(decomp);
        fw.close();
    }
}