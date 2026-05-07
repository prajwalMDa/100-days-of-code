public class BestRoute {
    public static float shortestdestance(String dir){
        float x = 0;
        float y = 0;
        for(int i=0; i<dir.length(); i++){
            if(dir.charAt(i) == 'N'){
                y++;
            }else if(dir.charAt(i) == 'S'){
                y--;
            }else if(dir.charAt(i) == 'E'){
                x++;
            }else if(dir.charAt(i) == 'W'){
                x--;
            }
        }

        float SD = (float)Math.sqrt((y*y)+(x*x));
        return SD;
    }

    public static void main(String[] args){
        String direction = "WNEENESENNN";
        System.out.println(shortestdestance(direction));
    }
}
