/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author FELIPE RIVAS
 */
public class QueryQuestion extends ConnectionDB {

   /* public boolean register(Question qu) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        String query = "INSERT INTO qyas (question,answerl,answer2,answer3,answer4,rightAnswer,level) VALUES(?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, qu.getQuestion());
            ps.setString(2, qu.getAnswer1());
            ps.setString(3, qu.getAnswer2());
            ps.setString(4, qu.getAnswer3());
            ps.setString(5, qu.getAnswer4());
            ps.setString(6, qu.getRightAnswer());
            ps.setInt(7, qu.getLevel());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
                
            } catch (SQLException e) {
                System.err.println(e);
                
            }
        }
        
    }*/
    
    public boolean findQuestion(Integer level, Question qu) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        String query = "SELECT * FROM qyas WHERE qyas.level=? ORDER BY RAND() LIMIT 1";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, level);
            rs = ps.executeQuery();
            if (rs.next()) {
                qu.setQuestion(rs.getString("question"));
                qu.setAnswer1(rs.getString("answer1"));
                qu.setAnswer2(rs.getString("answer2"));
                qu.setAnswer3(rs.getString("answer3"));
                qu.setAnswer4(rs.getString("answer4"));
                qu.setRightAnswer(rs.getString("rightAnswer"));
                qu.setLevel(level);
            }
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
                
            } catch (SQLException e) {
                System.err.println(e);
                
            }
        }
        
    }
    
}
