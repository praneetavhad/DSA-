package Neetcode250.AdvancedGraphs;

import Neetcode250.common.*;
import java.util.*;

/*
 * 332. Reconstruct Itinerary   [Hard]
 * LeetCode: https://leetcode.com/problems/reconstruct-itinerary/
 * NeetCode: https://neetcode.io/problems/reconstruct-flight-path
 *
 * You are given a list of airline tickets where tickets[i] = [from_i, to_i] represent the departure
 * and the arrival airports of one flight. Reconstruct the itinerary in order and return it.
 *
 * All of the tickets belong to a man who departs from "JFK", thus, the itinerary must begin with
 * "JFK". If there are multiple valid itineraries, you should return the itinerary that has the
 * smallest lexical order when read as a single string.
 *   - For example, the itinerary ["JFK", "LGA"] has a smaller lexical order than ["JFK", "LGB"].
 *
 * You may assume all tickets form at least one valid itinerary. You must use all the tickets once and
 * only once.
 *
 * Example 1:
 * [image: https://assets.leetcode.com/uploads/2021/03/14/itinerary1-graph.jpg]
 * Input: tickets = [["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]
 * Output: ["JFK","MUC","LHR","SFO","SJC"]
 *
 * Example 2:
 * [image: https://assets.leetcode.com/uploads/2021/03/14/itinerary2-graph.jpg]
 * Input: tickets = [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
 * Output: ["JFK","ATL","JFK","SFO","ATL","SFO"]
 * Explanation: Another possible reconstruction is ["JFK","SFO","ATL","JFK","ATL","SFO"] but it is
 * larger in lexical order.
 *
 * Constraints:
 *   - 1 <= tickets.length <= 300
 *   - tickets[i].length == 2
 *   - from_i.length == 3
 *   - to_i.length == 3
 *   - from_i and to_i consist of uppercase English letters.
 *   - from_i != to_i
 */
public class Q03_ReconstructItinerary {

    // Write your solution here - same code you would submit on LeetCode.
    static class Solution {
        public List<String> findItinerary(List<List<String>> tickets) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("332. Reconstruct Itinerary");
        // Answers are compared ignoring the order of the outer list (problem allows any order).

        tester.check("tickets = [[\"MUC\",\"LHR\"],[\"JFK\",\"MUC\"],[\"SFO\",\"SJC\"],[\"LHR\",\"SFO\"]]", "[\"JFK\",\"MUC\",\"LHR\",\"SFO\",\"SJC\"]", Tester.Order.ANY, () -> {
            List<List<String>> tickets = P.lls("[[\"MUC\",\"LHR\"],[\"JFK\",\"MUC\"],[\"SFO\",\"SJC\"],[\"LHR\",\"SFO\"]]");
            return new Solution().findItinerary(tickets);
        });
        tester.check("tickets = [[\"JFK\",\"SFO\"],[\"JFK\",\"ATL\"],[\"SFO\",\"ATL\"],[\"ATL\",\"JFK\"],[\"ATL\",\"SFO\"]]", "[\"JFK\",\"ATL\",\"JFK\",\"SFO\",\"ATL\",\"SFO\"]", Tester.Order.ANY, () -> {
            List<List<String>> tickets = P.lls("[[\"JFK\",\"SFO\"],[\"JFK\",\"ATL\"],[\"SFO\",\"ATL\"],[\"ATL\",\"JFK\"],[\"ATL\",\"SFO\"]]");
            return new Solution().findItinerary(tickets);
        });

        tester.done();
    }
}
