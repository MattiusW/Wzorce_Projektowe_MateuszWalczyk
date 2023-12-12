/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mateusz.maze;

import java.awt.Image;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author student
 */
public class Maze {
    private ArrayList<Room>rooms = new ArrayList<>();
    
    public void addRoom(Room room)
    {
        rooms.add(room);
    }
    public Image drawMaze(Image image)
    {
        Iterator<Room> it = rooms.iterator();
        Room r;
        while(it.hasNext())
        {
            r = it.next();
            r.draw(image);
        }
        return image;
    }
}
