import java.util.stringtokenizer;
class mystringtokenizer
{
  public static void main(String[] args)
   {
    String s= "I am*going to *learning java.";
    Stringtokenizer string = newStringtokenizer(s"*");  
    while(st.hasMoreToken())
    System.out.print(st.nextToken(s)+"");
  }
}