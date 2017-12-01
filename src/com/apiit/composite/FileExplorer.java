/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apiit.composite;

/**
 *
 * @author Chathura
 */
public class FileExplorer {
    public static void main(String[] args) {
        Directory dirX = new Directory();
        Directory dirY = new Directory();
        File fileA = new File(200);
        File fileB = new File(150);
        File fileC = new File(100);
        
        
        dirX.addFile(fileA);
        dirX.addFile(fileB);
        dirY.addFile(fileC);
        
        dirX.showSize();
        dirY.showSize();
        
        fileA.showSize();
        
    }
}
