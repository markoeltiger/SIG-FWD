package com.company.Marksaif;

public class Book {

    public String name;
    public String author;
    public int pubdate;
    public int pages;
    public int current_page;
    public boolean Is_Open;

    //دا الكونستركتور الي نستدعيه وقت انشاء اي كائن
 public Book(String n,String a ,int p){
     this.name=n;
     this.author=a;
     this.pages=p;
     this.Is_Open=false;
     this.current_page=0;
 }


 
 public void Openbook(){
if (Is_Open)
    System.out.println("الكتاب مفتوح");
else
   Is_Open = true;
 }
   public void Closebook(){
     if (Is_Open)
         this.Is_Open=false;
     else
         System.out.println("االكتاب مقفول");

   }
   //boolean دي يعني الدالة دي لما ترجع هترجع بقيمة بوليان
   public boolean Movetopage (int page)
   { if(!Is_Open)
return false;
   if ((page>this.pages)||(page<1))
return false;
   this.current_page=page ;
   return true;

   }


}
