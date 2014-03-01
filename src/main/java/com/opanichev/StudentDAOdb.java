package com.opanichev;

import java.net.URI;
import java.sql.*;

/**
 * Created by Oleg on 01.03.14.
 */
public class StudentDAOdb implements StudentDAO {
    private Connection con;
    private String addStudent="INSERT INTO students (id,sname,grade) VALUES (?,?,?)";
    private String findStudent="SELECT id,sname,grade FROM student WHERE id=?";
    public StudentDAOdb(String uri) {
        try {
            this.con = DriverManager.getConnection(uri);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addStudent(Student s) {
        try {
            PreparedStatement stmt=con.prepareStatement(addStudent);
            stmt.setInt(1,s.getId());
            stmt.setString(2,s.getName());
            stmt.setFloat(3,s.getGrade());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Student findStudent(int id) {
        Student s=null;
        try {
            PreparedStatement stmt=con.prepareStatement(findStudent);
            stmt.setInt(1,id);
            ResultSet rs=stmt.executeQuery();
            if(rs.next()) {
                s=new Student(rs.getInt("id"),rs.getString("sname"),rs.getFloat("grade"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s;
    }

}
