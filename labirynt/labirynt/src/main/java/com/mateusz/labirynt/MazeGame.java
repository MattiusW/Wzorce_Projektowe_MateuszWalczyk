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
        //licznik pokoi
        int roomNr = 1;
        maze = new Maze();
        //Tworzenie obiektow pokoi
        Room room1 = new Room(roomNr++, x, y);
        Room room2 = new Room(roomNr++, x, y + MapSite.LENGTH);
        Door door1 = new Door(room1, room2);
        Room room3 = new Room(roomNr++, x , y + MapSite.LENGTH * 2);
        Door door2 = new Door(room2, room3);
        Room room4 = new Room(roomNr++, x , y + MapSite.LENGTH * 3);
        Door door3 = new Door(room3, room4);
        Room room5 = new Room(roomNr++, x + MapSite.LENGTH , y);
        Door door4 = new Door(room1, room5);
        Room room6 = new Room(roomNr++, x + MapSite.LENGTH , y + MapSite.LENGTH);
        Room room7 = new Room(roomNr++, x + MapSite.LENGTH, y + MapSite.LENGTH * 2);
        Room room8 = new Room(roomNr++, x + MapSite.LENGTH * 2, y);
        Room room9 = new Room(roomNr++, x + MapSite.LENGTH * 2, y + MapSite.LENGTH);
        Room room10 = new Room(roomNr++, x + MapSite.LENGTH * 2, y + MapSite.LENGTH * 2);
        Room room11 = new Room(roomNr++, x + MapSite.LENGTH * 3, y);
        Room room12 = new Room(roomNr++, x + MapSite.LENGTH * 3, y + MapSite.LENGTH);
        Room room13 = new Room(roomNr++, x + MapSite.LENGTH * 3, y + MapSite.LENGTH * 2);
        Room room14 = new Room(roomNr++, x + MapSite.LENGTH * 4, y);
        Room room15 = new Room(roomNr++, x + MapSite.LENGTH * 4, y + MapSite.LENGTH);
        Room room16 = new Room(roomNr++, x + MapSite.LENGTH * 4, y + MapSite.LENGTH * 2);
        Room room17 = new Room(roomNr++, x + MapSite.LENGTH * 5, y);
        Room room18 = new Room(roomNr++, x + MapSite.LENGTH * 5, y + MapSite.LENGTH);
        Room room19 = new Room(roomNr++, x + MapSite.LENGTH * 5, y + MapSite.LENGTH * 2);
        Room room20 = new Room(roomNr++, x + MapSite.LENGTH * 5, y + MapSite.LENGTH * 3);
      
        //Tworzenie nowych scian w pokojach
        room1.setSide(Direction.North, new Wall(Direction.North));
        room1.setSide(Direction.East, door4);
        room1.setSide(Direction.South, door1);
        room1.setSide(Direction.West, new Wall(Direction.West));
        
        room2.setSide(Direction.North, door1);
        room2.setSide(Direction.East, new Wall(Direction.East));
        room2.setSide(Direction.South, door2);
        room2.setSide(Direction.West, new Wall(Direction.West));
        
        room3.setSide(Direction.North, door2);
        room3.setSide(Direction.East, new Wall(Direction.East));
        room3.setSide(Direction.South, door3);
        room3.setSide(Direction.West, new Wall(Direction.West));
        
        room4.setSide(Direction.North, door3);
        room4.setSide(Direction.East, new Wall(Direction.East));
        room4.setSide(Direction.South, door3);
        room4.setSide(Direction.West, new Wall(Direction.West));
        
        room5.setSide(Direction.North, new Wall(Direction.North));
        room5.setSide(Direction.East, new Wall(Direction.East));
        room5.setSide(Direction.South, new Wall(Direction.South));
        room5.setSide(Direction.West, door4);
        
        room6.setSide(Direction.North, new Wall(Direction.North));
        room6.setSide(Direction.East, new Wall(Direction.East));
        room6.setSide(Direction.South, new Wall(Direction.South));
        room6.setSide(Direction.West, new Wall(Direction.West));

        room7.setSide(Direction.North, new Wall(Direction.North));
        room7.setSide(Direction.East, new Wall(Direction.East));
        room7.setSide(Direction.South, new Wall(Direction.South));
        room7.setSide(Direction.West, new Wall(Direction.West));
        
        room8.setSide(Direction.North, new Wall(Direction.North));
        room8.setSide(Direction.East, new Wall(Direction.East));
        room8.setSide(Direction.South, new Wall(Direction.South));
        room8.setSide(Direction.West, new Wall(Direction.West));
        
        room9.setSide(Direction.North, new Wall(Direction.North));
        room9.setSide(Direction.East, new Wall(Direction.East));
        room9.setSide(Direction.South, new Wall(Direction.South));
        room9.setSide(Direction.West, new Wall(Direction.West));
        
        room10.setSide(Direction.North, new Wall(Direction.North));
        room10.setSide(Direction.East, new Wall(Direction.East));
        room10.setSide(Direction.South, new Wall(Direction.South));
        room10.setSide(Direction.West, new Wall(Direction.West));
        
        room11.setSide(Direction.North, new Wall(Direction.North));
        room11.setSide(Direction.East, new Wall(Direction.East));
        room11.setSide(Direction.South, new Wall(Direction.South));
        room11.setSide(Direction.West, new Wall(Direction.West));
        
        room12.setSide(Direction.North, new Wall(Direction.North));
        room12.setSide(Direction.East, new Wall(Direction.East));
        room12.setSide(Direction.South, new Wall(Direction.South));
        room12.setSide(Direction.West, new Wall(Direction.West));
        
        room13.setSide(Direction.North, new Wall(Direction.North));
        room13.setSide(Direction.East, new Wall(Direction.East));
        room13.setSide(Direction.South, new Wall(Direction.South));
        room13.setSide(Direction.West, new Wall(Direction.West));
        
        room14.setSide(Direction.North, new Wall(Direction.North));
        room14.setSide(Direction.East, new Wall(Direction.East));
        room14.setSide(Direction.South, new Wall(Direction.South));
        room14.setSide(Direction.West, new Wall(Direction.West));
        
        room15.setSide(Direction.North, new Wall(Direction.North));
        room15.setSide(Direction.East, new Wall(Direction.East));
        room15.setSide(Direction.South, new Wall(Direction.South));
        room15.setSide(Direction.West, new Wall(Direction.West));
        
        room16.setSide(Direction.North, new Wall(Direction.North));
        room16.setSide(Direction.East, new Wall(Direction.East));
        room16.setSide(Direction.South, new Wall(Direction.South));
        room16.setSide(Direction.West, new Wall(Direction.West));
        
        room17.setSide(Direction.North, new Wall(Direction.North));
        room17.setSide(Direction.East, new Wall(Direction.East));
        room17.setSide(Direction.South, new Wall(Direction.South));
        room17.setSide(Direction.West, new Wall(Direction.West));
        
        room18.setSide(Direction.North, new Wall(Direction.North));
        room18.setSide(Direction.East, new Wall(Direction.East));
        room18.setSide(Direction.South, new Wall(Direction.South));
        room18.setSide(Direction.West, new Wall(Direction.West));
        
        room19.setSide(Direction.North, new Wall(Direction.North));
        room19.setSide(Direction.East, new Wall(Direction.East));
        room19.setSide(Direction.South, new Wall(Direction.South));
        room19.setSide(Direction.West, new Wall(Direction.West));
        
        room20.setSide(Direction.North, new Wall(Direction.North));
        room20.setSide(Direction.East, new Wall(Direction.East));
        room20.setSide(Direction.South, new Wall(Direction.South));
        room20.setSide(Direction.West, new Wall(Direction.West));
        
        
        
        //dodawanie scian do pokoi aby wyswietlic na ekranie
        maze.addRoom(room1);
        maze.addRoom(room2);
        maze.addRoom(room3);
        maze.addRoom(room4);
        maze.addRoom(room5);
        maze.addRoom(room6);
        maze.addRoom(room7);
        maze.addRoom(room8);
        maze.addRoom(room9);
        maze.addRoom(room10);
        maze.addRoom(room11);
        maze.addRoom(room12);
        maze.addRoom(room13);
        maze.addRoom(room14);
        maze.addRoom(room15);
        maze.addRoom(room16);
        maze.addRoom(room17);
        maze.addRoom(room18);
        maze.addRoom(room19);
        maze.addRoom(room20);
        
        
        return maze;
    } 
    
}
