class Solution {
    public List<Integer> getRow(int rowIndex) {
	//Returns a specified row of Pascal's Triangle
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(rowIndex < 0) {
            return list;
        } 
        list.add(1);
        for(int i = 0; i < rowIndex; i++) {
            for(int j = 0; j < i; j++) {
                list.set(j, list.get(j) + list.get(j + 1));
            }
            list.add(0, 1);
        }
        return list;
        
    }
}