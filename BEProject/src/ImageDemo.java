/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Magic_rec;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import javax.imageio.ImageIO;

/**
 *
 * @author owner
 */
public class ImageDemo {
        char[] a=new char[1000];//ascii value
        int j;
        int[] x1=new int[96];//Magic rectangle value
        
      File f;
       int[] in=new int[1000];
    int[][] s=new int[1000][1000];
    String n1,final1;
      // int flag1=0;
             int[][] s1=new int[1000][1000];
       
       public int[] ImageDemo1(String p1,String l1,int[] p2)
   {
       
       n1=l1;
         x1=p2;
             a[0]=(char)0;
             j=1;
        for(int i=32;i<127;i++)
        {
           
            a[j]=(char)i;//ascii value
           System.out.print(a[j]+" ");
            j++;
            
        }
   
       File f3;
          try{
       
File f1=new File(p1);
BufferedImage img1=ImageIO.read(f1);
              
          
            /*for(int x = 0; x <img1.getHeight(); x++){
                for(int y = 0; y < img1.getWidth(); y++){
                    int r = img1.getRGB(x, y);
                      img.setRGB(x, y, r);
                }
            }
            ImageIO.write(img, "PNG", f);*/
            float t=(float) 0.5;
           
           
       int i=1;
      //http://www.internationaljournalssrg.org/IJCSE/2015/Volume2-Issue1/IJCSE-V2I1P102.pdf
          int N=i;
          RenderedImage i1;
           
        
          int  y=0;
         
       int j=0;
       int k=img1.getWidth()/2;
      
       System.out.println(n1);
       
        BufferedImage img = new BufferedImage(n1.length()*2,img1.getHeight(), BufferedImage.TYPE_INT_RGB ); 
        f3=new File(p1);
        for(i=0;i<n1.length();i++)
        {
            j=0;
            while(j<96)
            {
                //System.out.println((int)n1.charAt(i));
                if(a[j]==(n1.charAt(i))){
                    in[i]=x1[j];
               System.out.println("djfgjdsgfhsd"+x1[j]+" "+a[j]);
                }
                j++;
            }   
        }
        
        f = new File("MyFile3.png");
         final1="MyFile3.png"; 
       int[][] s=new int[n1.length()*2][img1.getHeight()];
       int flag1=0;
             int[][] s1=new int[n1.length()*2][img1.getHeight()];
       int flag2=0;
       int l;
       try{
       k=-1;
       l=-1;
            for(i=0;i<n1.length()*2;i++)
       {
           if(i%2==0) l++;
           else k++;
           for(j=0;j<img1.getHeight();j++)
           {    
           

           if(i%2==0)
               {
                  //  flag1=1;
                //   Color l1=new Color(img1.getRGB(i, j));
                   s[l][j]=img1.getRGB(i, j);
              //       System.out.println("nmn"+s[l][j]);
                
               }
               else 
               {
                   flag2=1;
            //       Color l2=new Color(img1.getRGB(i, j));
                   s1[k][j]=img1.getRGB(i, j);
               //    System.out.println("mnvnmnmn"+s1[k][j]);
                   
               }
       }
       }
       int[] a1=new int[1000];
            int n=0;
       int m=0;
        
       
       k=-1;
            int q=0;
            l=-1;
                   int p=0; 
       for(i=0;i<n1.length()*2;i++)
       {
           if(i%2==0) l++;
           else k++;
          
           for(j=0;j<img1.getHeight();j++)
           {
               
               if(i%2==0)
               {
               //   int x=s1[l][j].getRGB();
               // System.out.println(s1[l][j]);    
               if(j==0){
                   p=(int) (Math.random()*in[i/2]);
                   q=in[i/2]-p;
                   System.out.println(p+" "+q);
                   //Color c1=new Color(s1[l][j]);
                      Color c=new Color(s1[l][j]+p);
         int nn=Math.abs(s1[l][j])+p;
                       img.setRGB(i, j,s1[l][j]+p);
           System.out.println(p+"sssfi->"+s1[l][j]+" sssec->"+nn);
   
               }
               else
                   
                    img.setRGB(i, j, s1[l][j]);
               }
               else
               {
                   //int x=s1[k][j].getRGB();
                  if(j==img1.getHeight()-1){
                      
                                int gd=s[k][j]+q;
                                       img.setRGB(i, j,s[k][j]+q);
                        System.out.println(q+"sssssfi->"+s[k][j]+" sec->"+gd);
                 
                  }
                  else
                     img.setRGB(i, j,s[k][j]);
                   //System.out.println(s[k][j]);
               }
           }
   
               }
       RenderedImage i2=img;
      
            ImageIO.write(i2, "png", f); 
            

}
       
       
       catch(Exception e){e.printStackTrace();}
       
       // I 
        }
        catch(Exception e){}
     return(in);
   }
    public static void main(String a[])
    {
        ImageDemo i1=new ImageDemo();
                    
    }
 }
