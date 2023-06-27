package org.danylo.singleton;

import java.util.HashSet;
import java.util.Set;

public class VirtualProductCodeManager {
    private static VirtualProductCodeManager INSTANCE;

    private VirtualProductCodeManager(){}

    public static VirtualProductCodeManager getInstance(){
        if(INSTANCE == null){
            INSTANCE = new VirtualProductCodeManager();
        }
        return INSTANCE;
    }

    private Set<String> codeList = new HashSet<>();

    public void useCode(String code){
        if(isCodeUsed(code)) {
            System.out.println("Code already used!");
            return;
        }
        codeList.add(code);
    }

    public boolean isCodeUsed(String code) {
        return codeList.contains(code);
    }
}
