package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Mebel;


@ApplicationScoped
public class MebelManager {
	List<Mebel> db = new ArrayList<Mebel>();

	public List<Mebel> writeAllMebels() {
		return db;
	}

	public void addMebel(Mebel mebel) {
		Mebel tmp = new Mebel();

		tmp.setModel(mebel.getModel());
		tmp.setRodzaj(mebel.getRodzaj());
		tmp.setCena(mebel.getCena());
		tmp.setDlugosc(mebel.getDlugosc());
		tmp.setSzerokosc(mebel.getSzerokosc());
		tmp.setNr_seryjny(mebel.getNr_seryjny());
		db.add(tmp);
	}

    public void delMebel(Mebel mebel) {
            int i = 0;
            for (Mebel e : db) {
                    if (e.getNr_seryjny().equals(mebel.getNr_seryjny())) {
                            db.remove(i);
                            break;
                    }
                    i++;
            }
    }

    public ArrayList<Mebel> searchMebel(Mebel mebel) {
            ArrayList<Mebel> tmp = new ArrayList<Mebel>();
            for (Mebel e : db) {
                    if (e.getRodzaj().equals(mebel.getRodzaj())) {
                            tmp.add(e);
                    }
            }

            return tmp;
    }
}