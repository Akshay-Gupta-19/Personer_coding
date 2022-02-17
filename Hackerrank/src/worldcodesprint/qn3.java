package worldcodesprint;
import java.util.Scanner;
public class qn3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
           
        for (int i = 0; i < q; i++) {
            int k=sc.nextInt();
            String a=sc.next(),b=sc.next(),c=sc.next();
//            while(a.length()!=b.length() || c.length()!=a.length()){
//            while(a.length()>b.length())b="0"+b;
//            while(a.length()<b.length())a="0"+a;
//            while(a.length()>c.length())c="0"+c;
//            while(a.length()<c.length())a="0"+a;
//            while(b.length()>c.length())c="0"+c;
//            while(b.length()<c.length())b="0"+b;
//            }
             a=tobin(a);
             b=tobin(b);
             c=tobin(c);
            StringBuffer ansa=new StringBuffer(a),ansb=new StringBuffer(b);
             int l;
                for ( l = 0; l <a.length() && k>-1; l++) {
                    if(a.charAt(l)-'0'==0 && b.charAt(l)-'0'==0 && c.charAt(l)-'0'==1){
                        ansb.replace(l, l+1, "1");
                        k--;
                    }
                    else if(a.charAt(l)-'0'==0 && b.charAt(l)-'0'==1 && c.charAt(l)-'0'==0){
                        ansb.replace(l,l+1,"0");
                        k--;
                    }
                    else if(a.charAt(l)-'0'==1 && b.charAt(l)-'0'==0 && c.charAt(l)-'0'==0){
                        ansa.replace(l, l+1, "0");
                        k--;
                    }else if(a.charAt(l)-'0'==1 && b.charAt(l)-'0'==1 && c.charAt(l)-'0'==0){
                        ansa.replace(l, l+1, "0");
                        ansb.replace(l, l+1, "0");
                        k--;
                        k--;
                    }
                }
                if(k<=-1)
                {System.out.println(-1);continue;}
                for ( l = 0; l <a.length() && k>1; l++) {
                    if(a.charAt(l)-'0'==1 && b.charAt(l)-'0'==1 && c.charAt(l)-'0'==1){
                        ansa.replace(l,l+1,"0");
                        k--;
                    }
                    if(a.charAt(l)-'0'==1 && b.charAt(l)-'0'==0 && c.charAt(l)-'0'==1){
                        ansa.replace(l,l+1,"0");
                        ansb.replace(l, l+1,"1");
                        k-=2;
                    }
                }
                    for(;l<a.length() && k==1;l++)
                    if(a.charAt(l)-'0'==1 && b.charAt(l)-'0'==1 && c.charAt(l)-'0'==1)
                    {ansa.replace(l,l+1,"0"); break;}
                
                
                System.out.println(toHex(ansa.toString()));
                System.out.println(toHex(ansb.toString()));
        }
    }
        static String toHex(String x){
            String ans="";
            for (int i = 0; i < x.length(); i+=4) {
                switch (x.substring(i,i+4)){
                    case "0000":
                        ans+="0";
                        break;
                    case "0001":
                        ans+="1";
                        break;
                    case "0010":
                        ans+="2";
                        break;
                    case "0011":
                        ans+="3";
                        break;
                    case "0100":
                        ans+="4";
                        break;
                    case "0101":
                        ans+="5";
                        break;
                    case "0110":
                        ans+="6";
                        break;
                    case "0111":
                        ans+="7";
                        break;
                    case "1000":
                        ans+="8";
                        break;
                    case "1001":
                        ans+="9";
                        break;
                    case "1010":
                        ans+="A";
                        break;
                    case "1011":
                        ans+="B";
                        break;
                    case "1100":
                        ans+="C";
                        break;
                    case "1101":
                        ans+="D";
                        break;
                    case "1110":
                        ans+="E";
                        break;
                    case "1111":
                        ans+="F";
                        break;
                }
            }
            
            while(ans.charAt(0)=='0'){
                if(ans.length()==1) return "0";
                ans=ans.substring(1,ans.length());
            }
            return ans;
        }
            static String tobin(String x){
                String ans="";
                for (int i = 0; i <x.length(); i++) {
                  switch (x.charAt(i)){
                      case '0':
                        ans+="0000";
                        break;
                      case '1':
                        ans+="0001";
                        break;
                      case '2':
                        ans+="0010";
                        break;
                      case '3':
                        ans+="0011";
                        break;
                      case '4':
                        ans+="0100";
                        break;
                      case '5':
                        ans+="0101";
                        break;
                      case '6':
                        ans+="0110";
                        break;
                      case '7':
                        ans+="0111";
                        break;
                      case '8':
                        ans+="1000";
                        break;
                      case '9':
                        ans+="1001";
                        break;
                      case 'A':
                        ans+="1010";
                        break;
                      case 'B':
                        ans+="1011";
                        break;
                      case 'C':
                        ans+="1100";
                        break;
                      case 'D':
                        ans+="1101";
                        break;
                      case 'E':
                        ans+="1110";
                        break;
                      case 'F':
                        ans+="1111";
                        break;
                  }
                }
                return ans;
            }
}


/*1
12
CAF7028FD
59B5AC1CE
CAF1B7B7F
*/
/*
3
25
B631EB5AE
601C227E1
707AC8792
12
CAF7028FD
59B5AC1CE
CAF1B7B7F
3
81B9BB94E
8AB3CA95E
8BBBFB95E
*/