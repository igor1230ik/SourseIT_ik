// import javax.xml.bind.DatatypeConverter;

public class Test {

    public static void main(String[] args) {


/*
        String text="ACDC";
        int lang= text.length();
        System.out.println(text);
        System.out.println(lang);
        for (int i=0; i<lang;i++){
            System.out.println("0x" + Integer.toHexString(text.charAt(i)));

        }
*/
// Перевод в 16-ти ричную систему тип String вручную.
     String Num="ACDC";
     String a=Integer.toHexString(Num.charAt(0));
     String b=Integer.toHexString(Num.charAt(1));
     String c=Integer.toHexString(Num.charAt(2));
     String d=Integer.toHexString(Num.charAt(3));
        System.out.print(a);
        System.out.print(b);
        System.out.print(c);
        System.out.println(d);




// Перевод в 16-ти ричную систему тип String через цикл "for"
       String l="ACDC";
for (int i=0;i<l.length();i++) {
    System.out.print(Integer.toHexString(l.charAt(i)));
}
        System.out.println();


char chA='A';
char chB='C';
char chC='D';
char chD='C';

             System.out.print(Integer.toHexString(chA));
             System.out.print(Integer.toHexString(chB));
             System.out.print(Integer.toHexString(chC));
             System.out.println(Integer.toHexString(chD));
    }
}

