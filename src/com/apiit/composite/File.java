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
public class File implements FileComponent{
    int fileSize;

    public File(int fileSize) {
        this.fileSize = fileSize;
    }     

    public int getFileSize() {
        return fileSize;
    }
    
    @Override
    public void showSize() {
        System.out.println("showing file of size "+fileSize);
    }
    
}
