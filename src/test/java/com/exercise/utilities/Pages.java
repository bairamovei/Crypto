package com.exercise.utilities;

import com.exercise.pages.Codes;

public class Pages {
    private Codes codes;

    public Codes codes(){
        if(codes == null){
            codes = new Codes();
        }
        return codes;
    }
}
