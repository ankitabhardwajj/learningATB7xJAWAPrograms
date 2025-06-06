package ex_06062025;

public class lab112 {
    public static void main(String[] args) {
        // string - immutable in nature
        // string builder and string buffer
        // the only difference in string and string buffer is
        // string buffer are mutable

        String s1 = "ankita";
        s1 = "bhardwaj";
        // two strings are here now

        StringBuffer stringBuffer = new StringBuffer("ankita");
        // if we change the value it remains only 1
        stringBuffer.append("bhardwaj"); // ankita bhardwaj

        StringBuilder stringBuilder = new StringBuilder("babita");
        stringBuilder.append("bhardwaj"); // babita bhardwaj

        // string buffer and string builder difference based on only Thread safety
        // Thread safety?
        // builder is not synchronised
        // buffer is synchronised
        // builder is not thread safe - people love it :)





    }
}
