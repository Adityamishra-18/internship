package com.Dao;

import com.Entity.employee;

import java.sql.*;

public class employeedbutil {
    private static String url="jdbc:mysql://127.0.0.1:3306/employeedb";
    private static String user="root";
    private static String password="aditya@2005";
    private static Connection connection=null;
    public static void connectToDb(){
        try {
            connection=DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public int insert(employee emp){
        String sql="insert into employeedata values(?,?,?,?)";
        try {
            PreparedStatement ps=connection.prepareStatement(sql);
            ps.setInt(1,emp.getId());
            ps.setString(2,emp.getName());
            ps.setString(3,emp.getDepartment());
            ps.setDouble(4,emp.getSalary());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void displayAll(){
        String sql="select * from employeedata";
        try {
            Statement st=connection.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                System.out.println(
                        rs.getInt(1)+"|"+ rs.getString(2)+"|"+ rs.getString(3)+"|"+ rs.getDouble(4));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void getById(int id){
        try {
            PreparedStatement ps= connection.prepareStatement("select * from employeedata where id=?");
            ps.setInt(1,id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                System.out.println(rs.getInt(1)+"|"+ rs.getString(2)+"|"+ rs.getString(3)+"|"+ rs.getDouble(4));
            }else{
                System.out.println("Employee Not Exist");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public int update(employee emp){
        try {
            PreparedStatement ps= connection.prepareStatement("update employeedata set name=?,department=?,salary=? where id=?");
            ps.setString(1,emp.getName());
            ps.setString(2,emp.getDepartment());
            ps.setDouble(3,emp.getSalary());
            ps.setInt(4,emp.getId());
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean deleteById(int id){
        try {
            PreparedStatement ps= connection.prepareStatement("delete from employeedata where id=?");
            ps.setInt(1,id);
            if(ps.executeUpdate()>0){
                return true;
            }
            else{
                return false;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


