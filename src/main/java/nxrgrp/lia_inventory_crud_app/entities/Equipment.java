package nxrgrp.lia_inventory_crud_app.entities;

import javax.persistence.*;

@Entity
@Table(name = "equipment")
public class Equipment {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

        @Column(name = "id", unique = true, nullable = false)   // employee_id should be null as default.
        private Long id;

        @Column(name = "unique_id_serial", unique = true, nullable = false)
        private String unique_id_serial;

        @Column(name = "model_name", unique = true, nullable = false)
        private String model_name;

        @Column(name = "date_of_purchase", unique = true, nullable = false)
        private String date_of_purchase;

        //@OneToOne(mappedBy = "equipment") OneToOne?????   ((employee_id (FK)))
        //@JsonIgnoreProperties("equipment")
        //private Set<Employee> employee;

    //organization_id (FK)

    //equipment_type_id (FK)

        public Equipment(String unique_id_serial, String model_name, String date_of_purchase) {
            this.unique_id_serial = unique_id_serial;
            this.model_name = model_name;
            this.date_of_purchase = date_of_purchase;
        }

        public Equipment() {
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getUnique_id_serial() {
                return unique_id_serial;
        }

        public void setUnique_id_serial(String unique_id_serial) {
                this.unique_id_serial = unique_id_serial;
        }

        public String getModel_name() {
                return model_name;
        }

        public void setModel_name(String model_name) {
                this.model_name = model_name;
        }

        public String getDate_of_purchase() {
                return date_of_purchase;
        }

        public void setDate_of_purchase(String date_of_purchase) {
                this.date_of_purchase = date_of_purchase;
        }
}
