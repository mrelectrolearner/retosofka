/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author FELIPE RIVAS
 */
public class Player {
    private Integer id;
    private String name;
    private Integer level;

    public Player(String name, Integer level) {
        this.name = name;
        this.level = level;
    }
        public Player(String name) {
        this.name = name;
        this.level = 0;
    }


    public Player() {
      this.name=" ";
        this.level=0;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
    
    public double prize(){
        return Math.pow(200, level);
    }
    
}
