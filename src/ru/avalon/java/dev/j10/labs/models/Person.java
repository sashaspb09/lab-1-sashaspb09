package ru.avalon.java.dev.j10.labs.models;
import ru.avalon.java.dev.j10.labs.commons.Address;



/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;+
 *     <li>паспортными данными;+
 *     <li>пропиской по месту жительства.+
 * </ol>
 */
public class Person {
    

 

  private Passport passport;
  private Address address;
    

   
    
    
    /*
     * TODO(Студент): Создайте класс Address.+
     *
     * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.+
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

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * 
     * @return имя человека в виде строки.
     */
    public String getFullName() {
        if (passport != null) {
            if (!passport.getName().isEmpty() && !passport.getLastName().isEmpty()) {
                if (passport.getMiddleName().isEmpty() && !passport.getSecondMiddleName().isEmpty()) {
                    return passport.getName() + " " + passport.getSecondMiddleName().substring(0, 1) + ". " + passport.getLastName();
                } else if (passport.getMiddleName().isEmpty() && passport.getSecondMiddleName().isEmpty()) {
                    return passport.getName() + " " + passport.getLastName();
                } else {
                    return passport.getName() + " " + passport.getLastName()+ " " + passport.getMiddleName();
                }
            }
            return null;
        } else {
            return null;
        }
    }
        public String getPassportData() {
            return passport.getBirthDate() + passport.getOrgan() +passport.getReleaseDate();
            
        }
        
        
        /*
         * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
         */
        
   

    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @return адрес регистрации в виде строки.
     */
    public String getAddress() {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
         if (address != null) {
            return address.toString();
        }
        return null;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
}
