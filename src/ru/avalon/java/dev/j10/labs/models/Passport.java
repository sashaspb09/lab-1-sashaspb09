package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {
    private String id;
    private String name;//имена и дата рождния всё таки из класа персон?
    private String lastName;
    private String middleName;
    private String secondMiddleName;
    private String birthDate;
    private String releaseDate;
    private String organ;

    
    
    
    

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
    
     public Passport(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
      
    
        
        
    }

    public Passport(String name, String lastName, String middleName) {
        this(name,lastName);
//this.name = name;
       // this.lastName = lastName;
        this.middleName = middleName; //if no secondMiddleName and lover 14
       // this.birthDate = birthDate;
        
        
    }

    public Passport(String name, String lastName, String middleName, String secondMiddleName) {
        this(name,lastName,middleName);
       // this.name = name;
       // this.lastName = lastName; 
       // this.middleName = middleName;
        this.secondMiddleName = secondMiddleName;  //if have secondMiddleName and lover 14
        //this.birthDate = birthDate;
    }

    public Passport(String id, String name, String lastName, String middleName, String birthDate, String releaseDate, String organ) {
        this(name,lastName,middleName,birthDate);
        this.id = id;
      //  this.name = name;
      //  this.lastName = lastName;  
      //  this.middleName = middleName;
      //  this.birthDate = birthDate;
        this.releaseDate = releaseDate; //if more 14 and no secondMiddleName
        this.organ = organ;
    }

    public Passport(String id, String name, String lastName, String middleName, String secondMiddleName, String birthDate, String releaseDate, String organ) {
        this(name,lastName,middleName,birthDate,id,releaseDate,organ);
      //this.id = id;
      //  this.name = name;
      // this.lastName = lastName;
      //  this.middleName = middleName;
         this.secondMiddleName = secondMiddleName;  //if more 14 and have secondMiddleName
      //  this.birthDate = birthDate;
      // this.releaseDate = releaseDate;
      //  this.organ = organ;
    }
  



    public String getId() {
        return id;
    }
  

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSecondMiddleName() {
        return secondMiddleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getOrgan() {
        return organ;
    }

    public void setId(String id) {
        this.id = id;
    }
    //---------------
 public void setPassport(String name,String lastName,String middleName) {
        this.name = name;
        this.lastName = lastName;
        this.middleName = middleName;
        
    }
 //------------
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastNmae) {
        this.lastName = lastNmae;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setSecondMiddleName(String secondMiddleName) {
        this.secondMiddleName = secondMiddleName;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }
    
}
