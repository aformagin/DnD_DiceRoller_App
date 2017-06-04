package com.thirdspare.android.androidsheetsandroller;


public class ExportChar {

    //Fields of the character
    protected int CON;
    protected int CHA;
    protected int DEX;
    protected int INT;
    protected int STR;
    protected int WIS;
  //  protected int HP;
    protected int level;
   // protected String skillProf;
    protected String race;
    protected String name;


    //RECORD SIZE
    //Character name size is 31 characters = 62 Bytes
    //Race is 8 characters = 16
    //Each ability score is 4 bytes, 6*4 + 4(This is the level) = 28
    public static final int RECORD_SIZE = 133;

    public ExportChar(String name, String race, int STR, int CON, int DEX, int INT, int WIS, int CHA, int level) {
        StringBuffer tempString = new StringBuffer (name);
        tempString.setLength(31);
        this.name = tempString.toString();
        tempString = new StringBuffer(race);
        tempString.setLength(8);
        this.race = tempString.toString();
        this.CHA = CHA;
        this.CON = CON;
        this.DEX = DEX;
        this.INT = INT;
        this.STR = STR;
        this.WIS = WIS;
        this.level = level;
        this.name = name;
        this.race = race;
    }

    //Accessors and Mutators
    public int getCHA(){
        return this.CHA;
    }
    public int getCON(){
        return this.CON;
    }
    public int getDEX(){
        return this.DEX;
    }
    public int getINT(){
        return this.INT;
    }
    public int getSTR(){
        return this.STR;
    }
    public int getWIS(){
        return this.WIS;
    }

    public int getLevel(){
        return this.level;
    }


    //toString for the object
}
