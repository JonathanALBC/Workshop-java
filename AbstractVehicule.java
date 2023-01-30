package com.github.username.workshop.autre;

public abstract class AbstractVehicule {
        private final String name;

        protected AbstractVehicule(String name) {
            this.name = name;
        }

        public abstract void move();

        public abstract double getSpeed();

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "AbstractVehicule: {name: " + name + ", speed: " + getSpeed() + "}";
        }
}

