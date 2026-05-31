package com.driver;

import com.dao.librarydbutil;
import com.entity.Book;

import java.util.Scanner;

public class librarydriver {
    private static int choice=0;
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
        librarydbutil dbutil=new librarydbutil();
        librarydbutil.connectToDb();
        do{
            System.out.println("1.Add Book\n2.View Book\n3.Search Book\n4.Issue Book\n5.Return Book\n6.Delete Book");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    Book b=new Book();
                    System.out.println("Enter id");
                    b.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Enter Title");
                    b.setTitle(sc.nextLine());
                    System.out.println("Enter Author");
                    b.setAuthor(sc.nextLine());
                    b.setStatus("Available");
                    int rws=dbutil.insert(b);
                    if(rws>0){
                        System.out.println(b.getTitle()+"Book added successfully");
                    }else{
                        System.out.println("Issue in adding book");
                    }
                    break;
                case 2:
                    dbutil.displayAll();;
                    break;
                case 3:
                    System.out.println("Enter book id");
                    dbutil.getById(sc.nextInt());
                    break;
                case 4:
                    System.out.println("Enter book id");
                    if(dbutil.issuebook(sc.nextInt())>0){
                        System.out.println("Book issued successfully");
                    }else{
                        System.out.println("Issue in issuing book");
                    }
                    break;
                case 5:
                    System.out.println("Enter book id");
                    if(dbutil.returnbook(sc.nextInt())>0){
                        System.out.println("Book returned Successfully");
                    }else{
                        System.out.println("Issue in returning book");
                    }
                    break;
                case 6:
                    System.out.println("Enter Book id");
                    if(dbutil.deleteById(sc.nextInt())){
                        System.out.println("Book deleted successfully");
                    }else{
                        System.out.println("Issue in deleting book");
                    }
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }
        }while(choice!=0);
    }
}
