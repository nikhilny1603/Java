public class Strings{
    public static void main(String[] args){
        String a = "Nikhil";
        String b = "Yadav";
        String c = "nikhil";
        if(a.equalsIgnoreCase(c)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
        String foo = null;
        //Objects obj;
        System.out.println("baz".equals(foo));
        //System.out.println(Obj.equals(foo,"baz"));
        System.out.println(a.toUpperCase());
        String code = "code";
System.out.println(code);
 StringBuilder sb = new StringBuilder(code);
 code = sb.reverse().toString();
System.out.println(code);
    String str = "study";
 String str2  = str.concat("tonight");
 System.out.println(str2); // Output: study
 StringBuffer strB = new StringBuffer("study");
 strB.append("tonight");
 System.out.println(strB); // Output: studytonight
    }
}