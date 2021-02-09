package com.company;

public class nomer {
    char peremennaia;
    public nomer (char hood){
        this.peremennaia = hood;
    }

    public char getPeremennaia() {
        if( peremennaia == 'z')
        {
            peremennaia = (char)'a';
            peremennaia--;
        }
        return ++peremennaia;
    }

    public void setPeremennaia(char peremennaia) {
        this.peremennaia = peremennaia;

    }
}
