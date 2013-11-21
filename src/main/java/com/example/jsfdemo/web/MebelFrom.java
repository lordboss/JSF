package com.example.jsfdemo.web;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;

import com.example.jsfdemo.domain.Mebel;
import com.example.jsfdemo.service.MebelManager;


@SessionScoped
@Named("mebelF")
public class MebelFrom implements Serializable {
        private Mebel mebel = new Mebel();
        private ArrayList<Mebel> searchMebel = new ArrayList<Mebel>();

        @Inject
        private MebelManager mebelMenager;

        public Mebel getMebel() {
                return mebel;
        }

        public void setMebel(Mebel mebel) {
                this.mebel = mebel;
        }

        // Akcja - dodawanie zegarka
        public String addMebelA() {
                mebelMenager.addMebel(mebel);
                return "mebelList";
        }
        
        // Akcja - usuniecie zegarka
        public String dellMebelA() {
                mebelMenager.delMebel(mebel);
                return "mebelList";
        }
        
        // Akcja - szukanie zegarka
        public String searchMebelA() {
                searchMebel = mebelMenager.searchMebel(mebel);
                return "searchMebelResult";
        }

        public List<Mebel> getAllMebel() {
                return mebelMenager.writeAllMebels();
        }
        
        public List<Mebel> getsearchMebel() {
                return searchMebel;
        }

        // Validators

        // sprawdzanie czy sn jest juz w bazie
        public void nr_seryjny(FacesContext context, UIComponent component, Object value) {

                String nr_seryjny = (String) value;

                for (Mebel mebel : mebelMenager.writeAllMebels()) {
                        if (mebel.getNr_seryjny().equalsIgnoreCase(nr_seryjny)) {
                                FacesMessage message = new FacesMessage("Mebel with this serial number exists in database");
                                message.setSeverity(FacesMessage.SEVERITY_ERROR);
                                throw new ValidatorException(message);
                        }
                }
        }
}