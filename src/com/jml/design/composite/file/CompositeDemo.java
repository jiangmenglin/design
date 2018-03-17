package com.jml.design.composite.file;

import java.util.ArrayList;

class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
    }
}

class Directory {
    private String name;
    private ArrayList<Object> includeFiles = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object obj) {
        includeFiles.add(obj);
    }

    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
        CompositeDemo.compositeBuilder.append("   ");
        for (Object obj : includeFiles) {
            String name = obj.getClass().getSimpleName();
            if (name.equals("Directory")) {
                ((Directory)obj).ls();
            } else {
                ((File)obj).ls();
            }
        }
        CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length() - 3);
    }
}

public class CompositeDemo {
    public static StringBuilder compositeBuilder = new StringBuilder();

    public static void main(String[] args) {
        Directory music = new Directory("Music");
        Directory scorpions = new Directory("Scorpions");
        Directory dio = new Directory("Dio");
        File track1 = new File("Don't worry, be happy.mp3");
        File track2 = new File("Hello.m3u");
        File track3 = new File("Wing of change.mp3");
        File track4 = new File("Big city night.mp3");
        File track5 = new File("Rainbow over sky.mp3");
        music.add(track1);
        music.add(scorpions);
        music.add(track2);
        scorpions.add(track3);
        scorpions.add(track4);
        scorpions.add(dio);
        dio.add(track5);
        music.ls();
    }
}
