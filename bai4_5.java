/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4_buitruongminhtuan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import jdk.nashorn.internal.ir.BreakNode;

/**
 *
 * @author hocvien
 */
public class bai4_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        int ngay;
        int thang = 0;
        int nam=0;
        int ktraNgay=0;
        
        
        System.out.println("nhap so ngay:");
        ngay=Integer.parseInt(input.readLine());
        System.out.println("nhap so thang");
        thang=Integer.parseInt(input.readLine());
        System.out.println("nhap so nam");
        nam=Integer.parseInt(input.readLine());
        switch(thang)
        {
            case 1:
            case 3:
            case 5:
            case 7:    
            case 8:
            case 10: 
            case 12:
                ktraNgay=31;
                break;
            case 4:    
            case 6:
            case 9: 
            case 11:
                ktraNgay=30;
                break; 
            case 2:
                if(((nam % 4==0) &&
                   !(nam % 100==0)) ||
                    (nam % 400==0))
                {
                    ktraNgay=29;
                   
                }
                else
                {
                    ktraNgay=28;
                   
                }
                break;
                    
        }
        if(ngay>ktraNgay)
        {
            System.out.println("Ngay ban nhap khong hop le");
            System.out.println("Thang ban nhap co:"+ktraNgay);
        }
        else
        {
            System.out.println("Ngay ban nhap hop le");
            System.out.println("Thang ban nhap co:"+ktraNgay);
            System.out.println("ban da nhap ngay:"+ngay+"/"+thang+"/"+nam);
            
            if(ngay==ktraNgay&&thang==12)
            {
                int ngayTruoc=ngay-1;
                int namsau=nam+1;
                System.out.println("ngay truoc cua ngay ban nhap:"+ngayTruoc+"/"+"12"+"/"+nam);
                 
                System.out.println("ngay sau cua ngay ban nhap:"+"1"+"/"+"1"+"/"+namsau);
            }
            else if(ngay==1) 
            {
                int ngaySau=ngay+1;
                int thangTruoc=thang-1;
                if(thang==2||
                   thang==4||
                   thang==6||
                   thang==8||
                   thang==9||
                   thang==11)
                {
                
                int ngayTruoc=31;
                System.out.println("ngay truoc cua ngay ban nhap:"+ngayTruoc+"/"+thangTruoc+"/"+nam);
                
                System.out.println("ngay sau cua ngay ban nhap:"+ngaySau+"/"+thang+"/"+nam);
                
                }
                if(thang==5||
                   thang==7||
                   thang==10)
                {
                
                int ngayTruoc=30;
                System.out.println("ngay truoc cua ngay ban nhap:"+ngayTruoc+"/"+thangTruoc+"/"+nam);
                
                System.out.println("ngay sau cua ngay ban nhap:"+ngaySau+"/"+thang+"/"+nam);
                
                }
                
                if(thang==1)
                {
                    int namSau=nam-1;
                    System.out.println("ngay truoc cua ngay ban nhap:"+"31"+"/"+"12"+"/"+namSau);
                
                    System.out.println("ngay sau cua ngay ban nhap:"+ngaySau+"/"+thang+"/"+nam);
                }
                if(thang==3)
                {
                    if(((nam % 4==0) &&
                       !(nam % 100==0)) ||
                        (nam % 400==0))
                    {
                        System.out.println("ngay truoc cua ngay ban nhap:"+"29"+"/"+"2"+"/"+nam);
                
                        System.out.println("ngay sau cua ngay ban nhap:"+ngaySau+"/"+thang+"/"+nam);
                    }
                    else
                    {
                        System.out.println("ngay truoc cua ngay ban nhap:"+"28"+"/"+"2"+"/"+nam);
                
                        System.out.println("ngay sau cua ngay ban nhap:"+ngaySau+"/"+thang+"/"+nam);
                    }
                }
             
            }
            else if(ngay==ktraNgay)
            {
                int ngayTruoc=ngay-1;
                int thangSau=thang+1;
                System.out.println("ngay truoc cua ngay ban nhap:"+ngayTruoc+"/"+thang+"/"+nam);
                
                System.out.println("ngay sau cua ngay ban nhap:"+"1"+"/"+thangSau+"/"+nam);
            }
            else
            {
                int ngayTruoc=ngay-1;
                int ngaySau=ngay+1;
                System.out.println("ngay truoc cua ngay ban nhap:"+ngayTruoc+"/"+thang+"/"+nam);
                
                System.out.println("ngay sau cua ngay ban nhap:"+ngaySau+"/"+thang+"/"+nam);
            }
            
        }
    }
    
}
