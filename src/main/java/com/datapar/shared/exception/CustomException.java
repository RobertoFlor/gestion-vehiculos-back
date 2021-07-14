//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.datapar.shared.exception;

import java.io.Serializable;

public class CustomException extends Exception implements Serializable {
    private static final long serialVersionUID = 1L;

    public CustomException() {
    }

    public CustomException(String msg) {
        super(msg);
    }

    public CustomException(String msg, Exception e) {
        super(msg, e);
    }
}
