package com.example.jsfdemo.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Watch {
        private String model;
        private String producer;
        private double price;
        private String serialNumber;
        private int strapLength;

        public Watch(String model, String producer, double price, String serialNumber, int strapLength) {
                super();
                this.model = model;
                this.producer = producer;
                this.price = price;
                this.serialNumber = serialNumber;
                this.strapLength = strapLength;
        }

        public Watch() {
        }

      
        public String getModel() {
                return model;
        }

        public void setModel(String model) {
                this.model = model;
        }

        @Size(min = 2, max = 20)
        public String getProducer() {
                return producer;
        }

        public void setProducer(String producer) {
                this.producer = producer;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public String getSerialNumber() {
                return serialNumber;
        }

        public void setSerialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
        }

        @Min(0)
        public int getStrapLength() {
                return strapLength;
        }

        public void setStrapLength(int strapLength) {
                this.strapLength = strapLength;
        }
}