package com.amcor.amcorapp;

import android.os.Bundle;

import com.amcor.amcorapp.data.model.Modulo;
import com.amcor.amcorapp.data.model.OpcionModulo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by johel on 5/08/2017.
 */

public class Constant {
    public static String[] name = {"Android", "iOS"};
    public static String[] subName = {"google", "Motorola", "Samsung", "Lenevo"};

    public List<Modulo> moduloList = new ArrayList<>();
    public List<OpcionModulo> opcionModuloList = new ArrayList<>();
//godita a ver en primer lulgar  estas tratado de crear un array de String
    //y tu tienes un objeto modulo
    //public String [] moduloArray = new String[moduloList.size()];
    //moduloList.toArray(moduloArray);

    public Modulo[] moduloArray = new Modulo[moduloList.size()];
    //public String[] moduloName = moduloList.forEach();
// a ver primero dime que es que lo que deseas hacer
    //keio listar el moduloName de cada Modulo y eso ponerlo en un array de String para ponerlo en esa variable name.
    // ya mira


    void listModuloName() {

        String names[] = new String[moduloList.size()];
        int i = 0;
        for (Modulo moduloName : moduloList
                ) {
            names[i] = moduloName.getNombreModulo();
            i++;
        }
//godi primero tienes que ordenar paso a paso lo que vas haceslo tenias

        //public String [] opcionModuloArray = new String[opcionModuloList.size()];


    }
}
