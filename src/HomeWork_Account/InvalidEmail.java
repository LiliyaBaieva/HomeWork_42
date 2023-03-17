package HomeWork_Account;

public class InvalidEmail extends IllegalArgumentException{
  public InvalidEmail (String email){
    super("Не корректный ввод электронной почты: " + email);
  }

}
