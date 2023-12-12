/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mateusz.maze;

import java.awt.Image;

/**
 *
 * @author student
 */
public class MazeGame {
    
    private Maze maze;
    private int x;
    private int y;
    
    public Maze createMaze(int x, int y, Image image)
    {   
        //Count rooms
        int roomNr = 1;
        maze = new Maze();
        //Create room
        Room room1 = new Room(roomNr++, x, y);
        Room room2 = new Room(roomNr++, x, y + MapSite.LENGTH);
        Room room3 = new Room(roomNr++, x + MapSite.LENGTH, y);
        Room room4 = new Room(roomNr++, x, y + MapSite.LENGTH * 2);
        Room room5 = new Room(roomNr++, x - MapSite.LENGTH, y + MapSite.LENGTH * 2);
       
        //Doors
        Door enter = new Door(room2, room1);
        Door door1 = new Door(room1, room2);
        DoorVertical door2 = new DoorVertical(room3, room1);
        Door door3 = new Door(room2, room4);
        DoorVertical door4 = new DoorVertical(room4, room5);
        
        //Tworzenie nowych scian w pokojach
        room1.setSide(Direction.North, enter);
        room1.setSide(Direction.East, door2);
        room1.setSide(Direction.South, door1);
        room1.setSide(Direction.West, new Wall(Direction.West));
        
        room2.setSide(Direction.North, door1);
        room2.setSide(Direction.East, new Wall(Direction.East));
        room2.setSide(Direction.South, door3);
        room2.setSide(Direction.West, new Wall(Direction.West));
        
        room3.setSide(Direction.North, new Wall(Direction.North));
        room3.setSide(Direction.East, new Wall(Direction.East));
        room3.setSide(Direction.South, new Wall(Direction.South));
        room3.setSide(Direction.West, door2);
        
        room4.setSide(Direction.North, door3);
        room4.setSide(Direction.East, new Wall(Direction.East));
        room4.setSide(Direction.South, new Wall(Direction.South));
        room4.setSide(Direction.West, door4);
        
        room5.setSide(Direction.North, new Wall(Direction.North));
        room5.setSide(Direction.East, door4);
        room5.setSide(Direction.South, new Wall(Direction.South));
        room5.setSide(Direction.West, new Wall(Direction.West));
        
        
        //Add wall to room and view rooms
        maze.addRoom(room1);
        maze.addRoom(room2);
        maze.addRoom(room3);
        maze.addRoom(room4);
        maze.addRoom(room5);
    
        
        
        return maze;
    } 
    
}
