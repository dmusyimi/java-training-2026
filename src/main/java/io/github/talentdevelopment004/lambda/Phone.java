package io.github.talentdevelopment004.lambda;

public class Phone {
    private String name;
    private String model;
    private int year;

    public Phone(String name, String model, int year) {
        setName(name);
        setModel(model);
        setYear(year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
