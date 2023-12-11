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
        Room room4 = new Room(roomNr++, x , y + MapSite.LENGTH * 3);
        Room room5 = new Room(roomNr++, x + MapSite.LENGTH , y);
        Room room6 = new Room(roomNr++, x + MapSite.LENGTH , y + MapSite.LENGTH);
        Room room7 = new Room(roomNr++, x + MapSite.LENGTH, y + MapSite.LENGTH * 2);
        Room room8 = new Room(roomNr++, x + MapSite.LENGTH * 2, y);
        Room room9 = new Room(roomNr++, x + MapSite.LENGTH * 2, y + MapSite.LENGTH);
        Room room10 = new Room(roomNr++, x + MapSite.LENGTH * 2, y + MapSite.LENGTH * 2);
        
        //Tworzenie nowych scian w pokojach
        room1.setSide(Direction.North, new Wall(Direction.North));
        room1.setSide(Direction.East, new Wall(Direction.East));
        room1.setSide(Direction.South, door1);
        room1.setSide(Direction.West, new Wall(Direction.West));
        
        room2.setSide(Direction.North, door1);
        room2.setSide(Direction.East, new Wall(Direction.East));
        room2.setSide(Direction.South, new Wall(Direction.South));
        room2.setSide(Direction.West, new Wall(Direction.West));
        
        room3.setSide(Direction.North, door1);
        room3.setSide(Direction.East, new Wall(Direction.East));
        room3.setSide(Direction.South, new Wall(Direction.South));
        room3.setSide(Direction.West, new Wall(Direction.West));
        
        room4.setSide(Direction.North, door1);
        room4.setSide(Direction.East, new Wall(Direction.East));
        room4.setSide(Direction.South, new Wall(Direction.South));
        room4.setSide(Direction.West, new Wall(Direction.West));
        
        room5.setSide(Direction.North, new Wall(Direction.North));
        room5.setSide(Direction.East, new Wall(Direction.East));
        room5.setSide(Direction.South, new Wall(Direction.South));
        room5.setSide(Direction.West, new Wall(Direction.West));
        
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
        
        return maze;
    } 
    
}
