public class  Beer {
    public static void main (String[] args){
    //"99 bottles of beer"
    int BeerNum = 99;
    String name = "bottles";

    while(BeerNum > 0){
        if(BeerNum == 1){
            name = "bottle";
        }

        System.out.println(BeerNum +" " + name + " of beer is on the wall");
        System.out.println(BeerNum +" " + name + " of beer");
        System.out.println("Take it down");
        System.out.println("Pass it around");
        BeerNum = BeerNum - 1;
        
        if(BeerNum > 0){
            System.out.println(BeerNum +" " + name + " of beer");
        }else{
            System.out.println("No more bottles of beer on the wall");
        }

        }
    }
}
