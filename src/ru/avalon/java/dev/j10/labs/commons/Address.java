/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
package ru.avalon.java.dev.j10.labs.commons;


public class Address {   //пакетный уровень доступа. В этом случае перед словом class ничего не ставится.
     private String  country;
     private String  city;   
     private String  street;
     private String house;
     private String flat;
    

    public Address(String street, String house, String flat) {
        this.street = street;
        this.house = house;
        this.flat = flat;
    }
     
  
public Address(String country,String city,String street,String house,String flat){
    this.country=country;
    this.city=city;
    this.street=street;     
    this.house = house;
    this.flat = flat;
 
    
}

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getFlat() {
        return flat;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

//43


     @Override
    public String toString() {
  
        return street +" " +house+" " + flat;
    }
}
   
