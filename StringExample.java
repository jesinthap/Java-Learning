public class StringExample {

    public static void main(String[] args) {

        //toUpperCase() and toLowerCase()
        String text="Jesintha Java";
        String text1="LAXMI";
        String text2="Jesintha";
        String text3="";
        String text5="Jesintha";
        String text4="    Meiyanathan";

        System.out.println(text+" Converted to UpperCase: "+text.toUpperCase());
        System.out.println(text1+" Converted to Lowercase: "+text1.toLowerCase());

        //length--->1 to infinity
        System.out.println(text2+" is the Length is: "+text1.length());

        //indexOf()--->Start from 0 to infinity
        System.out.println(text+" is this index of character of n: "+text.indexOf('n'));//--->value are given in single quotes or double quotes

        //CharAt()----->Start from 0 to infinity

        System.out.println(text+" is this text what is 4th letter: "+text.charAt(4));

        //equals

        System.out.println(text+" is equal to "+text1+" "+text.equals(text1));
        System.out.println(text2+" is equal to "+text5+" "+text2.equals(text5));

        //trim()---->removes starting and ending space

        System.out.println(text4+"is give to "+text4.trim());


       // compareTo()
        System.out.println("COMPARE "+text+" with " +text1+" "+text.compareTo(text1));

        //CompareToIgnoreCase()

        System.out.println(text+" compare to ignore "+text.compareToIgnoreCase(text1));

        //concat

        System.out.println((text+" add "+text1+" "+text+" ").concat(text1));

        //contains

        System.out.println(text+" is this sentence java is given or not "+(text + " ").contains("Java"));


        //start with and end with

        System.out.println(text+" is startwith "+text.startsWith("Jesintha"));
        System.out.println(text+" is endwith "+text.endsWith("Java"));

        //is Empty

        System.out.println(text1+" is this empty "+text1.isEmpty());
        System.out.println(text3+"is this empty "+text3.isEmpty());


        //replace--->full select aagum

        System.out.println(text1+" is replace to "+text1.replace("Laxmi","Pavithra"));

        //replace First--->first la mattum select aagum

        System.out.println(text2+" is replace first only is "+text2.replaceFirst("J", "L"));

        //toString--->DOUT

        // System.out.println(text.toString());

        //Extra first repeat

        String text7="Sadhana ";
        System.out.println(text7+" is repeated n time is "+text7.repeat(3));

        // Join

        String text8 = String.join("-", "Java", "Python", "C++");
        System.out.println(" All elements are join is "+text8);


        
    }
}
