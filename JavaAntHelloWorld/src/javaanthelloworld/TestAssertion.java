package javaanthelloworld;
//assertion is disables by default
//set in the property -> run -> -em option in VM option
public class TestAssertion {
    public static void main(String[] args) {
        assert(add(10,5)==15):"add method test failed";
    }
    static int add(int a,int b){return a*b;}
    
}
