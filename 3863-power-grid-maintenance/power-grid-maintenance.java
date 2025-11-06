import java.util.*;

class Solution {
    void dfs(int id, int node, List<List<Integer>> adj, boolean[] vis, Map<Integer, TreeSet<Integer>> mp, Map<Integer, Integer> mpp) {
        vis[node] = true;
        mp.get(id).add(node);
        mpp.put(node, id);
        for (int it : adj.get(node)) {
            if (!vis[it]) {
                dfs(id, it, adj, vis, mp, mpp);
            }
        }
    }

    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < c; i++) adj.add(new ArrayList<>());

        for (int[] it : connections) {
            adj.get(it[0] - 1).add(it[1] - 1);
            adj.get(it[1] - 1).add(it[0] - 1);
        }

        boolean[] vis = new boolean[c];
        boolean[] online = new boolean[c];
        Arrays.fill(online, true);

        int id = 0;
        Map<Integer, TreeSet<Integer>> mp = new HashMap<>();
        Map<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < c; i++) {
            if (!vis[i]) {
                mp.put(id, new TreeSet<>());
                dfs(id, i, adj, vis, mp, mpp);
                id++;
            }
        }

        List<Integer> ansList = new ArrayList<>();
        for (int[] q : queries) {
            int type = q[0];
            int node = q[1] - 1;
            int compId = mpp.get(node);

            if (type == 2) {
                mp.get(compId).remove(node);
                online[node] = false;
                continue;
            }

            if (online[node]) {
                ansList.add(node + 1);
            } else if (!mp.get(compId).isEmpty()) {
                ansList.add(mp.get(compId).first() + 1);
            } else {
                ansList.add(-1);
            }
        }

        int[] ans = new int[ansList.size()];
        for (int i = 0; i < ansList.size(); i++) ans[i] = ansList.get(i);
        return ans;
    }
}