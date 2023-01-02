
public class BookTracker
{ public static void main(String [] args )
    { // see readme.md for usage instructions
        int wpm = (int) 336 ; // Input how many words you read per minute here. See readme.md for a tutorial on how to get this number
        int wpp = (int) 250 ; //
        int hr = (int) 60 ; 
        int annual = (int) 365 ;
        int biannual = (int) 365 / 2;
        int quarterly = (int) 365 / 4 ;
        int monthly = (int) 365 / 12 ;
        int TimeFrame = (int) annual ; // input your timeframe here , options are annual,biannual,quarterly or monthly
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

        // input the number of pages in each book here , the first 12 have being filled in with the first 12 of Lex's list
        double B1P=  288 * wpp ;
        double B2P =  123 * wpp  ; 
        double B3P =  176 * wpp ;
        double B4P =  307 * wpp ; 
        double B5P =  360 * wpp ;
        double B6P =  200 * wpp ; 
        double B7P =  128 * wpp ;
        double B8P =  300 * wpp ; 
        double B9P =  122 * wpp ;
        double B10P = 192 * wpp ; 
        double B11P =  824 * wpp ;
        double B12P =  122 * wpp ; 
        double B13P=  0 * wpp ; // All values set to zero from here , mannually fill in the page count of each book you want to read this year
        double B14P =  0 * wpp  ; 
        double B15P =  0 * wpp ;
        double B16P =  0 * wpp ; 
        double B17P =  0 * wpp ;
        double B18P =  0 * wpp ; 
        double B19P =  0 * wpp ;
        double B20P =  0 * wpp ; 
        double B21P =  0 * wpp ;
        double B22P = 0 * wpp ; 
        double B23P =  0 * wpp ;
        double B24P =  0 * wpp ; 
        double B25P =  0 * wpp  ; 
        double B26P =  0 * wpp ;
        double B27P =  0 * wpp ; 
        double B28P =  0 * wpp ;
        double B29P =  0 * wpp ; 
        double B30P =  0 * wpp ;
        double B31P =  0 * wpp ; 
        double B32P =  0 * wpp ;
        double B33P = 0 * wpp ; 
        double B34P =  0 * wpp ;
        double B35P =  0 * wpp ; 
        double B36P =  0 * wpp  ; 
        double B37P =  0 * wpp ;
        double B38P =  0 * wpp ; 
        double B39P =  0 * wpp ;
        double B40P =  0 * wpp ; 
        double B41P =  0 * wpp ;
        double B42P =  0 * wpp ; 
        double B43P =  0 * wpp ;
        double B44P = 0 * wpp ; 
        double B45P =  0 * wpp ;
        double B46P =  0 * wpp ; 
        double B47P =  0 * wpp ; 
        double B48P =  0 * wpp ;
        double B49P =  0 * wpp ; 
        double B50P =  0 * wpp ;
        double B51P = 0 * wpp ; 
        double B52P =  0 * wpp ;

        double TotalWC1 =  (B1P + B2P + B3P + B4P + B5P + B6P + B7P + B8P + B9P + B10P + B11P + B12P + B13P + B14P + B15P + B16P + B17P + B18P + B19P + B20P + B21P + B22P + B23P + B24P + B25P + B26P)/wpm ;
        double TotalWC2 =  (B27P + B28P + B29P + B30P + B31P + B32P + B33P + B34P + B35P + B36P + B37P + B38P + B39P + B40P + B41P + B42P + B43P + B44P + B45P + B46P + B47P + B48P + B49P + B50P + B51P + B52P)/wpm ;
        double TotalWC = TotalWC1 + TotalWC2 ;
        double Length = TotalWC / hr ;
        double roundedLength = Math.round(Length * 100.0) / 100.0;
        double Daily =  Length / TimeFrame ; 
        double roundedDaily = Math.round(Daily * 100.0) / 100.0;
        double roundedDaily1 = roundedDaily * 60 ; 
        
       


        System.out.println("These books will take " + roundedLength + " hours to read ");
        if (Daily >= 1) {System.out.println ("Assuming these books are read over the course of "+ TimeFrame1 + "\n" + "It will take "+ roundedDaily + " hours of reading per day" );
        } else  {System.out.println ("Assuming these books are read over the course of "+ TimeFrame1 + "\n" + "It will take "+ roundedDaily1 + " minutes of reading per day" );
            }
        
        
    
    }
}
