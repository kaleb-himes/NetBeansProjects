/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package huffman_outlab;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 *
 * @author Kaleb
 */
public class Methods {
    public static PriorityQueue<Node> getQ() {
        return Huffman_Outlab.q;
    }

    public static void setQ(PriorityQueue<Node> aQ) {
        Huffman_Outlab.q = aQ;
    }

    public static HashMap<Character, String> getConvChar() {
        return Huffman_Outlab.convChar;
    }

    public static void setConvChar(HashMap<Character, String> aConvChar) {
        Huffman_Outlab.convChar = aConvChar;
    }

    public static HashMap<String, Character> getConvCode() {
        return Huffman_Outlab.convCode;
    }

    public static void setConvCode(HashMap<String, Character> aConvCode) {
        Huffman_Outlab.convCode = aConvCode;
    }
}
