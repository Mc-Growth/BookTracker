
public class BookTracker
{ public static void main(String [] args )
    {
        int wpm = (int) 336 ;
        int wpp = (int) 250 ; 
        int hr = (int) 60 ; 
        int annual = (int) 365 ;
        int biannual = (int) 365 / 2;
        int quarterly = (int) 365 / 4 ;
        int monthly = (int) 365 / 12 ;
        int TimeFrame = (int) annual ;
        String TimeFrame1;

        if (TimeFrame == annual) {
            TimeFrame1 = "a year";
        } else if (TimeFrame == biannual) {
            TimeFrame1 = "half a year";
        }else if (TimeFrame == quarterly) {
            TimeFrame1 = "3 months";
        }else  {
            TimeFrame1 = "a month ";
        }

 
        int B1P= (int) 288 * wpp ;
        int B2P = (int) 123 * wpp  ; 
        int B3P = (int) 176 * wpp ;
        int B4P = (int) 307 * wpp ; 
        int B5P = (int) 360 * wpp ;
        int B6P = (int) 200 * wpp ; 
        int B7P = (int) 128 * wpp ;
        int B8P = (int) 300 * wpp ; 
        int B9P = (int) 122 * wpp ;
        int B10P = (int) 192 * wpp ; 
        int B11P = (int) 824 * wpp ;
        int B12P = (int) 122 * wpp ; 
        int TotalWC =  (B1P + B2P + B3P + B4P + B5P + B6P + B7P + B8P + B9P + B10P + B11P + B12P)/wpm ;
        int length = TotalWC / hr ;
        int daily = (int) length / TimeFrame ; 
        System.out.print("These books will take " + length + " hours to read ");
        System.out.println ("Assuming these books are read over the course of "+ TimeFrame1 + "\n" + "It will take "+ daily + "hours of reading per day" );
    }
}