/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.martyna.labirynt;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author student
 */
public class Wall extends MapSite {
    
    private Direction direction;
    
    public Wall(Direction d){
        
        direction = d;
    }
     
    public void enter() {  
    }
    
    public void draw(Image image) {
        int x = 30;
        int y = 50;
        Graphics g = image.getGraphics();
        
        g.drawLine(x, y, x + MapSite.LENGTH, y); //górna poziom
     
        g.drawLine(x, y, x, y+MapSite.LENGTH); 
        
        g.drawLine(x + MapSite.LENGTH, y, x + MapSite.LENGTH, y + MapSite.LENGTH); 
        g.drawLine(x, y + MapSite.LENGTH, x + MapSite.LENGTH, y + MapSite.LENGTH);
  
    }
    
}

