package com.goit.popov.ee09.model;

import java.math.BigDecimal;

/**
 * Dish class
 * @Author: Andrey P.
 * @version 1.0
 */
public class Dish {

        private int id;

        private String name;

        private String category;

        private BigDecimal price;

        private double weight;

        public int getId() {
                return id;
        }

        public String getName() {
                return name;
        }

        public String getCategory() {
                return category;
        }

        public BigDecimal getPrice() {
                return price;
        }

        public double getWeight() {
                return weight;
        }

        public void setId(int id) {
                this.id = id;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void setCategory(String category) {
                this.category = category;
        }

        public void setPrice(BigDecimal price) {
                this.price = price;
        }

        public void setWeight(double weight) {
                this.weight = weight;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                Dish dish = (Dish) o;

                if (id != dish.id) return false;
                if (Double.compare(dish.weight, weight) != 0) return false;
                if (!name.equals(dish.name)) return false;
                if (!category.equals(dish.category)) return false;
                return price.equals(dish.price);

        }

        @Override
        public int hashCode() {
                int result;
                long temp;
                result = id;
                result = 31 * result + name.hashCode();
                result = 31 * result + category.hashCode();
                result = 31 * result + price.hashCode();
                temp = Double.doubleToLongBits(weight);
                result = 31 * result + (int) (temp ^ (temp >>> 32));
                return result;
        }

        @Override
        public String toString() {
                return "Dish{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", category='" + category + '\'' +
                        ", price=" + price +
                        ", weight=" + weight +
                        '}';
        }
}
