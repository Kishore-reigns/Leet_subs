class DetectSquares {

    HashMap<List<Integer>,Integer> map ; 
    public DetectSquares() {
        map = new HashMap<>();
    }
    
    public void add(int[] point) {
        List<Integer> p = Arrays.asList(point[0], point[1]);
        map.put(p,map.getOrDefault(p,0)+1);
    }
    
    public int count(int[] point) {
        int px = point[0] , py = point[1] ; 
        int count = 0 , dx = -1 , dy = -1 , total = 0 ; 
        for(List<Integer> p : map.keySet()){
            int x = p.get(0) , y = p.get(1);

            if( Math.abs(px -x) != Math.abs(py-y) || px == x || py == y )continue ; 

            int a = map.getOrDefault(Arrays.asList(x,py),0);
            int b = map.getOrDefault(Arrays.asList(px,y),0);
            int d = map.get(p);
            total += a*b*d ; 
        }
       

        return total ; 
    }

    
}

/**
 * Your DetectSquares object will be instantiated and called as such:
 * DetectSquares obj = new DetectSquares();
 * obj.add(point);
 * int param_2 = obj.count(point);
 */