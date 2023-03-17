package HomeWork_Account;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainAccounts {

//  Допишите программу из классной работы
//  (см. файлы HomeWork_Account.Account.java и HomeWork_AccOunt.MainAccounts.java).
//  Необходимо создать собственное исключение HomeWork_AccOunt.InvalidEmail.
//  При попытке создать HomeWork_AccOunt.Account нужно выбрасывать собственное исключение,
//  если в переданном адресе электронной почты нет символа '@'.

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    List<Account> list1 = readAccountList(br);
    for (Account account : list1) {
      account.increaseReputation(10);
    }
    List<Account> list2 = readAccountList(br);
    for (Account account : list2) {
      account.decreaseReputation(10);
    }

    Set<Account> accounts = new HashSet<>();
    accounts.addAll(list1);
    accounts.addAll(list2);

    System.out.println("Найдено всего " + accounts.size() + " уникальных записей:");
    for (Account account : accounts) {
      System.out.println("- " + account);
    }
  }

  public static List<Account> readAccountList(BufferedReader br) throws IOException {
    System.out.print("Введите количество учётных записей в списке: ");
    int n = Integer.parseInt(br.readLine());
    List<Account> result = new ArrayList<>(n);
    for (int k = 1; k <= n; ++k) {
      System.out.println("Введите данные учётной записи №" + k + ":");
      result.add(readAccount(br));
    }
    return result;
  }

  public static Account readAccount(BufferedReader br) throws IOException {
    System.out.print("Введите имя: ");
    String name = br.readLine();
    System.out.print("Введите e-mail: ");

    // Перехватываем ошибку не корректного ввода "email"
    String email = br.readLine();
    if(!email.contains("@")){
      throw new InvalidEmail(email);
    }

    return new Account(name, email);
  }
}
