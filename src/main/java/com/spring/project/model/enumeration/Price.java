package com.spring.project.model.enumeration;

public enum Price{
        normal(15000),family(20000),vip(25000);

        private int numVal;

        Price(int numVal) {
                this.numVal = numVal;
        }

        public int getNumVal(){
                return numVal;
        }
}