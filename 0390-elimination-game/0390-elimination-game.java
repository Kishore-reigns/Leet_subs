class Solution {
    public int lastRemaining(int n) {
        // if (n == 1)
        // return 1;
        // if (n == 2)
        // return 2;
        // if (n == 3)
        // return 2;
        // List<Integer> list = new ArrayList<>();
        // for (int i = 1; i <= n; i++)
        // list.add(i);
        // return find(list, 'l');

        int rem = n  , step = 1  , head = 1 ;
        boolean leftToRight = true ; 

        while (rem > 1) {

            if(leftToRight || rem%2 == 1){
                head = head + step ; 
            } 
           
            leftToRight = !leftToRight ; 
            step *= 2 ;
            rem = rem/2 ; 
        }

        return head;
    }

    public int find(List<Integer> list, char dir) {

        if (list.size() == 1)
            return list.get(0);

        if (dir == 'l') {
            int n = list.size();
            if (n % 2 != 0)
                n++;
            for (int i = 0; i < n / 2; i++) {
                list.remove(i);
            }
            Collections.reverse(list);
            dir = 'r';
        } else {
            int n = list.size();
            if (n % 2 != 0)
                n++;
            for (int i = 0; i < n / 2; i++) {
                list.remove(i);
            }
            Collections.reverse(list);
            dir = 'l';
        }

        return find(list, dir);
    }
}