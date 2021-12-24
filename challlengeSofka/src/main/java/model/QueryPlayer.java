/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FELIPE RIVAS
 */
public class QueryPlayer extends ConnectionDB {

    public boolean register(Player player) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        String query = "INSERT INTO players (name,level) VALUES(?,?)";
        try {
            ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, player.getName());
            ps.setInt(2, player.getLevel());
            ps.execute();
            try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
            if (generatedKeys.next()) {
                player.setId((int) generatedKeys.getLong(1));
            }
            else {
                throw new SQLException("Creating user failed, no ID obtained.");
            }}
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

    public boolean update(Player player) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        String query = "UPDATE players SET name=?, level=? WHERE id=?";
        try {
            ps = con.prepareStatement(query);
            ps.setString(1, player.getName());
            ps.setInt(2, player.getLevel());
            ps.setInt(3, player.getId());
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

    }

    public boolean delete(Player player) {
        PreparedStatement ps = null;
        Connection con = getConnection();
        String query = "DELETE FROM players WHERE id=?";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1,player.getId());
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

    }

    public ArrayList<Player> findPlayers()  {
        
        PreparedStatement ps = null;
        Connection con = getConnection();
        ResultSet rs = null;
       
        String query = "SELECT * FROM players";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<Player> winnersList=new ArrayList<>();
             while (rs.next()) {
                //add code to print in jTable
                    Player winner=new Player();
                    winner.setId((Integer) rs.getObject(1));
                    winner.setName(String.valueOf(rs.getObject(2)));
                    winner.setLevel((Integer) rs.getObject(3));
                   winnersList.add(winner);     //create the list of the winners
             }
                
            return winnersList;

        } catch (SQLException e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                con.close();

            } catch (SQLException e) {
                System.err.println(e);

            }
        }
        
    }

}
