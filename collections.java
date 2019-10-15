public class collections {
    public static void main (String [] args){
        double [] mylist = {1.9,2.9,3.4,3.5};
        for (int i=0; i< mylist.length; i++){
            System.out.println(mylist[i] + " ");
        }
        double total=0;
            for(int i=0; i<mylist.length;i++){
                total=total+mylist[i];
            }
            System.out.println("total is " + total);
    }

}

// ÖDEV: Liste yap max, min, avarage , diziyi tersten, büyükten küçüğe, küçükten büyüğe  yazdırmak