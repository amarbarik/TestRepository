package com.reverside.springtest.main;

import com.reverside.springtest.model.Denomination;

/**
 * Created by IntelliJ IDEA.
 * User: Anusree
 * Date: 2012/07/18
 * Time: 3:03 PM
 * To change this template use File | Settings | File Templates.
 *
 */
public class Main {

    public static void main(String[] args) {
        Denomination denom = new Denomination() ;
        denom.setId(20);
        denom.setValue(100);
        System.out.println("Amount :"+denom.getId()*denom.getValue());
    }
}
