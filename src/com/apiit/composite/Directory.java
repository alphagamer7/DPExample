/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.apiit.composite;

import java.util.ArrayList;

/**
 *
 * @author Chathura
 */
public class Directory implements FileComponent{
    ArrayList<File> DirectoryFiles = new ArrayList<>();
    
    public void addFile(File f){
        DirectoryFiles.add(f);
    }
    
    public void removeFile(File f){
        DirectoryFiles.remove(f);
    }

    @Override
    public void showSize() {
        int fileSize = 0;
        for (File file : DirectoryFiles) {
            fileSize += file.getFileSize();           
        }
        System.out.println("showing directory file size "+fileSize);                
    }    
}
