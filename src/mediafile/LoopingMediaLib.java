package mediafile;

public class LoopingMediaLib {
    public static void main()
    {
        String s = MediaFile.readString();
        while (s != null){
            System.out.println( "From File " + s);
            s = MediaFile.readString();
        }
        while (s !=null)
        {
         String title = s.substring(0, s.indexOf("1"));

            String rating = s.substring(s.indexOf("1") +2);
            System.out.println("Rating " + rating);
            System.out.println();
            s = MediaFile.readString();
        }
        while (s !=null)
        {
         int rating = Integer.parseInt(s.substring(s.indexOf("1") +2));
         if()
         {
          System.out.println("Rating " + rating);
          s = MediaFile.readString();
         }
        }





    }


}
