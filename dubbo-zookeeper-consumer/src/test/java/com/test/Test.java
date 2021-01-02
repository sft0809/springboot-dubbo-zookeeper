package com.test;

public class Test {

    public static void main(String[] args) {
        Test t=new Test();
     //   t.ys();
        t.dxInt();
//        t.dxStr();
    }


    public void ys(){
        int i=2+2;
        int x=2+i/2+2*2;
        System.out.printf("x="+x);
    }

    public void dxInt(){
        int i=-123;
        while(i!=0){
            int s=i%10;
            System.out.print(s);
            if(i!=0){
                i=Math.abs(i)/10;
            }
        }
    }

    public void dxStr(){
        String str="-12345";
        StringBuffer sb=new StringBuffer();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.printf("str="+sb.toString());
    }





}
