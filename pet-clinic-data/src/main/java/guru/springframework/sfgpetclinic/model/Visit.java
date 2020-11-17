package guru.springframework.sfgpetclinic.model;

import jdk.vm.ci.meta.Local;

public class Visit extends BaseEntity {

    private Local date;
    private String description;
    private Pet pet;

    public Local getDate() {
        return date;
    }

    public void setDate(Local date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
