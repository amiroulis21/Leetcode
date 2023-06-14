class Solution {
    public List<List<Integer>> generate(int numRows) {
	//Generates a given number of rows of Pascal's Triangle
        ArrayList<List<Integer>> tri = new ArrayList<List<Integer>>();
        tri.add(new ArrayList<Integer>());
        tri.get(0).add(1);
        for(int i = 1; i < numRows; i++) {
            tri.add(new ArrayList<Integer>());
            tri.get(i).add(1);
            for(int j = 1; j < i; j++) {
                tri.get(i).add(tri.get(i - 1).get(j - 1) + tri.get(i - 1).get(j));
            }
            tri.get(i).add(1);

        }
        return tri;

    }
}