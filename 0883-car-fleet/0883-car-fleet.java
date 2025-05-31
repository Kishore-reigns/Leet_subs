class Car{
    int pos , speed ; 
    public Car(int pos , int speed){
        this.pos = pos ; 
        this.speed = speed ; 
    }
    public String toString(){
        return "(" +pos + "," + speed +")";
    }
}

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length ; 
        PriorityQueue<Car> queue = new PriorityQueue<>((x,y)->{
            if(x.pos == y.pos) return x.speed-y.speed ; 
            return y.pos-x.pos ; 
            

        });
        for(int i = 0 ; i < n ; i++)queue.add(new Car(position[i],speed[i]));

        Stack<Car>stack = new Stack<>() ; 
        stack.push(queue.poll());

        while(!queue.isEmpty()){
            Car car = queue.poll() ;
            Car top = stack.peek() ; 
            double time2 = (target-car.pos)*1.0/car.speed ; 
            double time1 = (target-top.pos)*1.0/top.speed ;
             if( time2 > time1 ) stack.push(car);
        }
        return stack.size() ; 
    }
}