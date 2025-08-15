class quadrant{
    public static void main(String[] args){
        int x=10;
        int y=9;
        if(x>0 &&y>0){
            System.out.println("quadrant 1");
        }else if(x<0 &&y>0){
            System.out.println("quadrant 2"); 
        }else if(x<0 &&y<0){
            System.out.println("quadrant 3");
        }else{
            System.out.println("quadrant 4");
        }
    }
}
