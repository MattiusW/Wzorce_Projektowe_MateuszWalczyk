/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mateusz.labirynt;

import java.awt.Graphics;
import java.awt.Image;

public class Door extends MapSite{

    private Room room1;
    private Room room2;
    private boolean isOpen;
    
    public Room otherSideFrom(Room room)
    {
        if (room == room1)
            return room2;
        if (room == room2)
            return room1;
        return null;
    }
    
    public Door(Room room1, Room room2)
    {
        this.room1 = room1;
        this.room2 = room2;        
    }
    public Room getRoom1()
    {
        return room1;
    }
    public Room getRoom2()
    {
        return room2;
    }
    @Override
    public void draw(Image image)
    {
        Graphics g = image.getGraphics();
        int x = room1.getx();
        int y = room2.gety();
        g.drawLine(x, y, x + LENGTH/3, y);
        g.drawLine(x + 2 * LENGTH / 3, y, x + LENGTH, y);
    }
}
