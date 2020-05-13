public int findComplement(int num) {
        int binary = (int) (Math.log(num)/Math.log(2)) +1;
        
        for(int i=0; i< binary; i++){
            num = (num ^ (1<<i));
        }
        
        return num;
    }
