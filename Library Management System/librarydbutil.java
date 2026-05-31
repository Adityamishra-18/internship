package com.dao;

import com.entity.Book;

import java.sql.*;

public class librarydbutil {
    private static String url="jdbc:mysql://127.0.0.1:3306/librarydb";
    private static String user="root";
    private static String password="aditya@2005";
    private static Connection connection =null;

    public static void connectToDb(){
        try {
            connection= DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public int insert(Book book){
        String sql="insert into bookdata values(?,?,?,?)";
        try {
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setInt(1,book.getId());
            ps.setString(2,book.getTitle());
            ps.setString(3,book.getAuthor());
            ps.setString(4, book.getStatus());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void displayAll(){
        String sql="select * from bookdata";
        try {
            Statement st= connection.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while (rs.next()){
                System.out.println(rs.getInt(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getString(4));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void getById(int id){
        try {
            PreparedStatement ps=connection.prepareStatement("select * from bookdata where id=?");
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getInt(1)+"|"+rs.getString(2)+"|"+rs.getString(3)+"|"+rs.getString(4));
            }else{
                System.out.println("Book not Exist");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public int issuebook(int id){
        try {
            PreparedStatement ps=connection.prepareStatement("update bookdata set status=? where id=?");
            ps.setString(1,"issued");
            ps.setInt(2,id);
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public int returnbook(int id){
        try {
            PreparedStatement ps=connection.prepareStatement("update bookdata set status=? where id=?");
            ps.setString(1,"Available");
            ps.setInt(2,id);
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean deleteById(int id){
        try {
            PreparedStatement ps=connection.prepareStatement("delete from bookdata where id=?");
            ps.setInt(1,id);
            if(ps.executeUpdate()>0){
                return true;
            }else{
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
