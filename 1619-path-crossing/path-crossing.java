class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> visited = new HashSet<>();
        visited.add("0,0");

        int x = 0;
        int y = 0;

        for (char move : path.toCharArray()) {
            switch (move) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }

            String currentPos = x + "," + y;

            if (visited.contains(currentPos)) {
                return true;
            }

            // Mark the current position as visited
            visited.add(currentPos);
        }

        return false;
    }
}
