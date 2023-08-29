package com.megajava.youcando.user;

import org.springframework.stereotype.Component;

@Component
public class UserDTO {

    private static final UserDTO instance = new UserDTO();

    private UserDTO() {
    }

    public static UserDTO getInstance() {
        return instance;
    }
    private int eCount = 0;
    private int iCount = 0;

    private int sCount = 0;
    private int nCount = 0;
    private int tCount = 0;
    private int fCount = 0;
    private int pCount = 0;
    private int jCount = 0;

    public int geteCount() {
        return eCount;
    }

    public int getiCount() {
        return iCount;
    }

    public int getsCount() {
        return sCount;
    }

    public int getnCount() {
        return nCount;
    }

    public int gettCount() {
        return tCount;
    }

    public int getfCount() {
        return fCount;
    }

    public int getpCount() {
        return pCount;
    }

    public int getjCount() {
        return jCount;
    }

    public void addECount() {
        eCount += 1;
    }

    public void addICount() {
        iCount += 1;
    }

    public void addNCount() {
        nCount += 1;
    }

    public void addSCount() {
        sCount += 1;
    }

    public void addTCount() {
        tCount += 1;
    }

    public void addFCount() {
        fCount += 1;
    }

    public void addPCount() {
        pCount += 1;
    }

    public void addJCount() {
        jCount += 1;
    }
}
