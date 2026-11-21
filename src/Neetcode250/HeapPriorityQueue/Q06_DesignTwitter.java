package Neetcode250.HeapPriorityQueue;

import Neetcode250.common.*;
import java.util.*;

/*
 * 355. Design Twitter   [Medium]
 * LeetCode: https://leetcode.com/problems/design-twitter/
 * NeetCode: https://neetcode.io/problems/design-twitter-feed
 *
 * Design a simplified version of Twitter where users can post tweets, follow/unfollow another user,
 * and is able to see the 10 most recent tweets in the user's news feed.
 *
 * Implement the Twitter class:
 *   - Twitter() Initializes your twitter object.
 *   - void postTweet(int userId, int tweetId) Composes a new tweet with ID tweetId by the user userId.
 *     Each call to this function will be made with a unique tweetId.
 *   - List<Integer> getNewsFeed(int userId) Retrieves the 10 most recent tweet IDs in the user's news
 *     feed. Each item in the news feed must be posted by users who the user followed or by the user
 *     themself. Tweets must be ordered from most recent to least recent.
 *   - void follow(int followerId, int followeeId) The user with ID followerId started following the
 *     user with ID followeeId.
 *   - void unfollow(int followerId, int followeeId) The user with ID followerId started unfollowing
 *     the user with ID followeeId.
 *
 * Example 1:
 * Input
 * ["Twitter", "postTweet", "getNewsFeed", "follow", "postTweet", "getNewsFeed", "unfollow",
 * "getNewsFeed"]
 * [[], [1, 5], [1], [1, 2], [2, 6], [1], [1, 2], [1]]
 * Output
 * [null, null, [5], null, null, [6, 5], null, [5]]
 * Explanation
 * Twitter twitter = new Twitter();
 * twitter.postTweet(1, 5); // User 1 posts a new tweet (id = 5).
 * twitter.getNewsFeed(1);  // User 1's news feed should return a list with 1 tweet id -> [5]. return
 * [5]
 * twitter.follow(1, 2);    // User 1 follows user 2.
 * twitter.postTweet(2, 6); // User 2 posts a new tweet (id = 6).
 * twitter.getNewsFeed(1);  // User 1's news feed should return a list with 2 tweet ids -> [6, 5].
 * Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
 * twitter.unfollow(1, 2);  // User 1 unfollows user 2.
 * twitter.getNewsFeed(1);  // User 1's news feed should return a list with 1 tweet id -> [5], since
 * user 1 is no longer following user 2.
 *
 * Constraints:
 *   - 1 <= userId, followerId, followeeId <= 500
 *   - 0 <= tweetId <= 10^4
 *   - All the tweets have unique IDs.
 *   - At most 3 * 10^4 calls will be made to postTweet, getNewsFeed, follow, and unfollow.
 *   - A user cannot follow himself.
 */
public class Q06_DesignTwitter {

    // Write your solution here - same code you would submit on LeetCode.
    static class Twitter {

        public Twitter() {
            // TODO: initialize your data structure here
        }

        public void postTweet(int userId, int tweetId) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public List<Integer> getNewsFeed(int userId) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public void follow(int followerId, int followeeId) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }

        public void unfollow(int followerId, int followeeId) {
            // TODO: write your solution here
            throw new UnsupportedOperationException("TODO");
        }
    }

    // Run this file to check your solution against the LeetCode examples.
    // Add your own cases the same way: tester.check(label, expectedOutput, () -> { ... });
    public static void main(String[] args) {
        Tester tester = new Tester("355. Design Twitter");

        tester.check("[\"Twitter\",\"postTweet\",\"getNewsFeed\",\"follow\",\"postTweet\",\"getNewsFeed\",\"unfollow\",\"getNewsFeed\"] [[],[1,5],[1],[1,2],[2,6],[1],[1,2],[1]]", "[null, null, [5], null, null, [6, 5], null, [5]]", () -> {
            List<Object> out = new ArrayList<>();
            Twitter obj = new Twitter();
            out.add(null);
            obj.postTweet(1, 5); out.add(null);
            out.add(obj.getNewsFeed(1));
            obj.follow(1, 2); out.add(null);
            obj.postTweet(2, 6); out.add(null);
            out.add(obj.getNewsFeed(1));
            obj.unfollow(1, 2); out.add(null);
            out.add(obj.getNewsFeed(1));
            return out;
        });

        tester.done();
    }
}
