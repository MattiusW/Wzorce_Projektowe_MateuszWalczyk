/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mateusz.labirynt;

/**
 *
 * @author student
 */
public interface MazeBuilder {
    void buildMaze();
    void buildRoom(int nr, int x, int y);
    void buildDoor(int roomFrom, int roomTo);
    Maze getMaze();
}
