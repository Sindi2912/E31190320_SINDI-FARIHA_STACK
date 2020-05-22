import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author sindi
 */
public class stack_E31190320 {
    //menambahkan keyword static agar dapat dipanggil dalam program utama
    static Stack z = new Stack();
    static Scanner in = new Scanner(System.in);
    static String a;
    static String arr;
    static int max_st;
    static int i=0;
    static int top =-1;
    static void pushh(Stack z, String a){//membuat method pushh
        z.push((a).toString());//memanggil pada keyword static
        System.out.println("Stack: " + z);//menampilkan kata"Stack : "+z
    }
   public int find(){
        return (int) (top=top+1);
    }
   
    static void popp(Stack z, String a ){
        a = (String) z.pop();//memanggil pada keyword static
        System.out.println("stack: " + z);//menampilkan kata "stack: "+z
    }
   
    public static void main(String[] args) {
        System.out.print("Masukkan Max_Stack : ");//menmapilkan kata "masukkan max_stack"
    max_st=in.nextInt();
        for (int i = 0; i < max_st; i++) {
            //menggunakan perulangan for, jika int i=0; i<max_st; i++
            System.out.print("PUSH -> ");
            a=in.next();//menginputkan data yang disimpan
            pushh(z, a); //menyimpan data di tumpukan (z,a)  
        }
        System.out.println("POP = y / anykeys=stop");//menampilkan kata"pop=y / anykeys=stop
      while(!a.equals("n")){//mengunakan perulangan while jika kondisi(!a.equals(N)
            System.out.print("POP ->  ");//menampilkan kata "pop->"
               a=in.next();//menginputkan data yang akan disimpan 
               if (a.equals("y") && !z.isEmpty()){//
                  popp(z, a);//menginputkan data ditumpukan (z,a)
                 
            }else{
                   System.out.println("apa stack kosong?  "+z.isEmpty());
                   //menampilkan kata "apa stack kosong?  "+z.isEmpty()
                   break;//perintah untuk mengakhiri
               }
         
            System.out.println("apa stack kosong?  "+z.isEmpty());
             if (z.isEmpty()) {
                       System.out.println("stop");//menampilkan kata "stop"
                       break;//perintah untuk mengakhiri
                 }
        }
    }
}