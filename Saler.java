public class Saler {
    public Mobile[] mobiles = new Mobile[100];
    public void playMobile(Mobile mobile){
        for(int i=0; i<mobiles.length; i++){
            if(mobiles[i] == null){
                mobiles[i] = mobile;
                break;
            }
        }
    }
}
