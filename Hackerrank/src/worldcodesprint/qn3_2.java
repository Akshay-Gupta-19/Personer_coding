import java.util.ArrayList;
import java.util.Scanner;
public class qn3_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        for (int i = 0; i < q; i++) {
            int k=sc.nextInt();
            String a=sc.next(),b=sc.next(),c=sc.next();
            ArrayList<Boolean> ala,alb,alc;
             ala=tobin(a);
             alb=tobin(b);
             alc=tobin(c);
             int l;
                for ( l = 0; l <ala.size() && k>-1; l++) {
                    if(!ala.get(l) && !alb.get(l) && alc.get(l)){
                        alb.set(l,true);
                        k--;
                    }
                    else if(!ala.get(l) && alb.get(l) && !alc.get(l)){
                        alb.set(l,false);
                        k--;
                    }
                    else if(ala.get(l) && !alb.get(l) && !alc.get(l)){
                        ala.set(l,false);
                        k--;
                    }else if(ala.get(l) && alb.get(l) && !alc.get(l)){
                        ala.set(l,false);
                        alb.set(l,false);
                        k--;
                        k--;
                    }
                }
                if(k<=-1)
                {System.out.println(-1);continue;}
                for ( l = 0; l <ala.size() && k>1; l++) {
                    if(ala.get(l) && alb.get(l) && alc.get(l)){
                        ala.set(l,false);
                        k--;
                    }
                   else if(ala.get(l) && !alb.get(l) && alc.get(l)){
                        ala.set(l,false);
                        alb.set(l,true);
                        k-=2;
                    }
                }
                    for(;l<ala.size() && k==1;l++)
                    if(ala.get(l) && alb.get(l) && alc.get(l))
                    {   ala.set(l,false);
                         break;}
                
                System.out.println(toHex(ala));
                System.out.println(toHex(alb));
        }
    }
        static String toHex(ArrayList<Boolean> x){
            String ans="";
            for (int i = 0; i < x.size(); i+=4) {
                if(!x.get(i)&&!x.get(i+1)&&!x.get(i+2)&&!x.get(i+3)){
                    ans+="0";
                }else if(!x.get(i)&&!x.get(i+1)&&!x.get(i+2)&&x.get(i+3)){
                    ans+="1";
                }else if(!x.get(i)&&!x.get(i+1)&&x.get(i+2)&&!x.get(i+3)){
                    ans+="2";
                }else if(!x.get(i)&&!x.get(i+1)&&x.get(i+2)&&x.get(i+3)){
                    ans+="3";
                }else if(!x.get(i)&&x.get(i+1)&&!x.get(i+2)&&!x.get(i+3)){
                    ans+="4";
                }else if(!x.get(i)&&x.get(i+1)&&!x.get(i+2)&&x.get(i+3)){
                    ans+="5";
                }else if(!x.get(i)&&x.get(i+1)&&x.get(i+2)&&!x.get(i+3)){
                    ans+="6";
                }else if(!x.get(i)&&x.get(i+1)&&x.get(i+2)&&x.get(i+3)){
                    ans+="7";
                }else if(x.get(i)&&!x.get(i+1)&&!x.get(i+2)&&!x.get(i+3)){
                    ans+="8";
                }else if(x.get(i)&&!x.get(i+1)&&!x.get(i+2)&&x.get(i+3)){
                    ans+="9";
                }else if(x.get(i)&&!x.get(i+1)&&x.get(i+2)&&!x.get(i+3)){
                    ans+="A";
                }else if(x.get(i)&&!x.get(i+1)&&x.get(i+2)&&x.get(i+3)){
                    ans+="B";
                }else if(x.get(i)&&x.get(i+1)&&!x.get(i+2)&&!x.get(i+3)){
                    ans+="C";
                }else if(x.get(i)&&x.get(i+1)&&!x.get(i+2)&&x.get(i+3)){
                    ans+="D";
                }else if(x.get(i)&&x.get(i+1)&&x.get(i+2)&&!x.get(i+3)){
                    ans+="E";
                }else if(x.get(i)&&x.get(i+1)&&x.get(i+2)&&x.get(i+3)){
                    ans+="F";
                }
            }
            
            while(ans.charAt(0)=='0'){
                if(ans.length()==1) return "0";
                ans=ans.substring(1,ans.length());
            }
            return ans;
        }
       static ArrayList tobin(String x){
                ArrayList<Boolean> ans=new ArrayList<>();
                for (int i = 0; i <x.length(); i++) {
                  switch (x.charAt(i)){
                      case '0':
                        ans.add(false);ans.add(false);ans.add(false);ans.add(false);
                        break;
                      case '1':
                        ans.add(false);ans.add(false);ans.add(false);ans.add(true);
                        break;
                      case '2':
                        ans.add(false);ans.add(false);ans.add(true);ans.add(false);
                        break;
                      case '3':
                        ans.add(false);ans.add(false);ans.add(true);ans.add(true);
                        break;
                      case '4':
                        ans.add(false);ans.add(true);ans.add(false);ans.add(false);
                        break;
                      case '5':
                        ans.add(false);ans.add(true);ans.add(false);ans.add(true);
                        break;
                      case '6':
                       ans.add(false);ans.add(true);ans.add(true);ans.add(false);
                        break;
                      case '7':
                        ans.add(false);ans.add(true);ans.add(true);ans.add(true);
                        break;
                      case '8':
                        ans.add(true);ans.add(false);ans.add(false);ans.add(false);
                        break;
                      case '9':
                        ans.add(true);ans.add(false);ans.add(false);ans.add(true);
                        break;
                      case 'A':
                        ans.add(true);ans.add(false);ans.add(true);ans.add(false);
                        break;
                      case 'B':
                        ans.add(true);ans.add(false);ans.add(true);ans.add(true);
                        break;
                      case 'C':
                        ans.add(true);ans.add(true);ans.add(false);ans.add(false);
                        break;
                      case 'D':
                        ans.add(true);ans.add(true);ans.add(false);ans.add(true);
                        break;
                      case 'E':
                        ans.add(true);ans.add(true);ans.add(true);ans.add(false);
                        break;
                      case 'F':
                        ans.add(true);ans.add(true);ans.add(true);ans.add(true);
                        break;
                  }
                }
                return ans;
            }
}