package com.fjsdxy.j093a7;
import java.io.Serializable;
public class ItemInfo implements Serializable {
    private String name;
    private int acctack;
    private int life;
    private int speed;
    private int mz;
    private int fy;
    private int bj;

    public ItemInfo(String name, int acctack, int life, int speed,int mz,int fy,int bj) {
        this.name = name;
        this.acctack = acctack;
        this.life = life;
        this.speed = speed;
        this.mz=mz;
        this.fy=fy;
        this.bj=bj;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAcctack() {
        return acctack;
    }
    public void setAcctack(int acctack) {
        this.acctack = acctack;
    }
    public int getLife() {
        return life;
    }
    public void setLife(int life) {
        this.life = life;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMz() {
        return mz;
    }

    public void setMz(int mz) {
        this.mz = mz;
    }

    public int getFy() {
        return fy;
    }

    public void setFy(int fy) {
        this.fy = fy;
    }
    public int getBj() {
        return bj;
    }

    public void setBj(int bj) {
        this.bj = bj;
    }

}

