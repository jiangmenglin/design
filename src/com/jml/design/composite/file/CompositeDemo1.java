package com.jml.design.composite.file;

import java.util.ArrayList;

interface IFile {
    void ls();
}

class File1 implements IFile {
    private String name;

    public File1(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println(CompositeDemo1.compositeBuilder + name);
    }
}

class Directory1 implements IFile {
    private String name;

    private ArrayList<IFile> includeFiles = null;

    public Directory1(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println(CompositeDemo1.compositeBuilder + name);
        if (includeFiles != null) {
            CompositeDemo1.compositeBuilder.append("   ");
            for (IFile obj : includeFiles) {
                obj.ls();
            }
            CompositeDemo1.compositeBuilder.setLength(CompositeDemo1.compositeBuilder.length() - 3);
        }
    }

    public void add(IFile file) {
       if (includeFiles == null) {
           synchronized (this) {
               while (includeFiles == null) {
                   includeFiles = new ArrayList<>();
               }
           }
       }
       includeFiles.add(file);
    }
}

public class CompositeDemo1 {

    protected static StringBuilder compositeBuilder = new StringBuilder();

    public static void main(String[] args) {
        IFile root = new Directory1("root");
        IFile bin = new Directory1("bin");
        IFile usr = new Directory1("usr");
        IFile etc = new Directory1("etc");
        IFile temp = new Directory1("temp");
        ((Directory1)root).add(bin);
        ((Directory1)root).add(usr);
        ((Directory1)root).add(etc);
        ((Directory1)root).add(temp);
        IFile chmod = new File1("chmod");
        IFile ln = new File1("ln");
        ((Directory1)bin).add(chmod);
        ((Directory1)bin).add(ln);
        IFile games = new File1("games");
        IFile lib = new File1("lib");
        IFile sbin = new File1("sbin");
        ((Directory1)usr).add(games);
        ((Directory1)usr).add(lib);
        ((Directory1)usr).add(sbin);
        IFile nginx = new File1("nginx");
        IFile gbd = new File1("gbd");
        IFile vim = new Directory1("vim");
        ((Directory1)etc).add(nginx);
        ((Directory1)etc).add(gbd);
        ((Directory1)etc).add(vim);
        IFile sheet = new File1("sheet");
        IFile book = new File1("book");
        IFile clock = new File1("clock");
        ((Directory1)vim).add(sheet);
        ((Directory1)vim).add(book);
        ((Directory1)vim).add(clock);


        root.ls();
    }
}
