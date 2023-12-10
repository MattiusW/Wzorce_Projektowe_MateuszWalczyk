/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mateusz.labirynt;

import java.awt.Image;

/**
 *
 * @author student
 */
public class MazeGame {
    
    private Maze maze;
    private int x, y;
    
    public Maze createMaze(int x, int y, Image image)
    {
        int roomNr = 1;
        maze = new Maze();
        Room room1 = new Room(roomNr++, x, y);
        Room room2 = new Room(roomNr++, x, y + MapSite.LENGTH);
        Door door1 = new Door(room1, room2);
        
        room1.setSide(Direction.North, new Wall(Direction.North));
        room1.setSide(Direction.East, new Wall(Direction.East));
        room1.setSide(Direction.South, door1);
        room1.setSide(Direction.West, new Wall(Direction.West));
        
        room2.setSide(Direction.North, door1);
        room2.setSide(Direction.East, new Wall(Direction.East));
        room2.setSide(Direction.South, new Wall(Direction.South));
        room2.setSide(Direction.West, new Wall(Direction.West));
        
        maze.addRoom(room1);
        maze.addRoom(room2);
        
        return maze;
    } 
    
}
